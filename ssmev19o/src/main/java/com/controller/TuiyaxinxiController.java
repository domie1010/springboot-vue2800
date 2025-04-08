package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TuiyaxinxiEntity;
import com.entity.view.TuiyaxinxiView;

import com.service.TuiyaxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 退押信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
@RestController
@RequestMapping("/tuiyaxinxi")
public class TuiyaxinxiController {
    @Autowired
    private TuiyaxinxiService tuiyaxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TuiyaxinxiEntity tuiyaxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			tuiyaxinxi.setShangjiabianhao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			tuiyaxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuiyaxinxiEntity> ew = new EntityWrapper<TuiyaxinxiEntity>();
		PageUtils page = tuiyaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuiyaxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TuiyaxinxiEntity tuiyaxinxi, 
		HttpServletRequest request){
        EntityWrapper<TuiyaxinxiEntity> ew = new EntityWrapper<TuiyaxinxiEntity>();
		PageUtils page = tuiyaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuiyaxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TuiyaxinxiEntity tuiyaxinxi){
       	EntityWrapper<TuiyaxinxiEntity> ew = new EntityWrapper<TuiyaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tuiyaxinxi, "tuiyaxinxi")); 
        return R.ok().put("data", tuiyaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TuiyaxinxiEntity tuiyaxinxi){
        EntityWrapper< TuiyaxinxiEntity> ew = new EntityWrapper< TuiyaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tuiyaxinxi, "tuiyaxinxi")); 
		TuiyaxinxiView tuiyaxinxiView =  tuiyaxinxiService.selectView(ew);
		return R.ok("查询退押信息成功").put("data", tuiyaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TuiyaxinxiEntity tuiyaxinxi = tuiyaxinxiService.selectById(id);
        return R.ok().put("data", tuiyaxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TuiyaxinxiEntity tuiyaxinxi = tuiyaxinxiService.selectById(id);
        return R.ok().put("data", tuiyaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TuiyaxinxiEntity tuiyaxinxi, HttpServletRequest request){
    	tuiyaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuiyaxinxi);

        tuiyaxinxiService.insert(tuiyaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TuiyaxinxiEntity tuiyaxinxi, HttpServletRequest request){
    	tuiyaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuiyaxinxi);

        tuiyaxinxiService.insert(tuiyaxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TuiyaxinxiEntity tuiyaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tuiyaxinxi);
        tuiyaxinxiService.updateById(tuiyaxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tuiyaxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TuiyaxinxiEntity> wrapper = new EntityWrapper<TuiyaxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiabianhao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = tuiyaxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
