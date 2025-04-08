package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TuiyaxinxiDao;
import com.entity.TuiyaxinxiEntity;
import com.service.TuiyaxinxiService;
import com.entity.vo.TuiyaxinxiVO;
import com.entity.view.TuiyaxinxiView;

@Service("tuiyaxinxiService")
public class TuiyaxinxiServiceImpl extends ServiceImpl<TuiyaxinxiDao, TuiyaxinxiEntity> implements TuiyaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuiyaxinxiEntity> page = this.selectPage(
                new Query<TuiyaxinxiEntity>(params).getPage(),
                new EntityWrapper<TuiyaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuiyaxinxiEntity> wrapper) {
		  Page<TuiyaxinxiView> page =new Query<TuiyaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuiyaxinxiVO> selectListVO(Wrapper<TuiyaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuiyaxinxiVO selectVO(Wrapper<TuiyaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuiyaxinxiView> selectListView(Wrapper<TuiyaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuiyaxinxiView selectView(Wrapper<TuiyaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
