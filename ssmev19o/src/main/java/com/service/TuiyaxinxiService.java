package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuiyaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuiyaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuiyaxinxiView;


/**
 * 退押信息
 *
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
public interface TuiyaxinxiService extends IService<TuiyaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuiyaxinxiVO> selectListVO(Wrapper<TuiyaxinxiEntity> wrapper);
   	
   	TuiyaxinxiVO selectVO(@Param("ew") Wrapper<TuiyaxinxiEntity> wrapper);
   	
   	List<TuiyaxinxiView> selectListView(Wrapper<TuiyaxinxiEntity> wrapper);
   	
   	TuiyaxinxiView selectView(@Param("ew") Wrapper<TuiyaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuiyaxinxiEntity> wrapper);
   	
}

