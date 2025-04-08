package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShichixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShichixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShichixinxiView;


/**
 * 试吃信息
 *
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
public interface ShichixinxiService extends IService<ShichixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShichixinxiVO> selectListVO(Wrapper<ShichixinxiEntity> wrapper);
   	
   	ShichixinxiVO selectVO(@Param("ew") Wrapper<ShichixinxiEntity> wrapper);
   	
   	List<ShichixinxiView> selectListView(Wrapper<ShichixinxiEntity> wrapper);
   	
   	ShichixinxiView selectView(@Param("ew") Wrapper<ShichixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShichixinxiEntity> wrapper);
   	
}

