package com.dao;

import com.entity.ShichixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShichixinxiVO;
import com.entity.view.ShichixinxiView;


/**
 * 试吃信息
 * 
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
public interface ShichixinxiDao extends BaseMapper<ShichixinxiEntity> {
	
	List<ShichixinxiVO> selectListVO(@Param("ew") Wrapper<ShichixinxiEntity> wrapper);
	
	ShichixinxiVO selectVO(@Param("ew") Wrapper<ShichixinxiEntity> wrapper);
	
	List<ShichixinxiView> selectListView(@Param("ew") Wrapper<ShichixinxiEntity> wrapper);

	List<ShichixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShichixinxiEntity> wrapper);
	
	ShichixinxiView selectView(@Param("ew") Wrapper<ShichixinxiEntity> wrapper);
	
}
