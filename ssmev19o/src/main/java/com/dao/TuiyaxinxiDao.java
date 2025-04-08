package com.dao;

import com.entity.TuiyaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuiyaxinxiVO;
import com.entity.view.TuiyaxinxiView;


/**
 * 退押信息
 * 
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
public interface TuiyaxinxiDao extends BaseMapper<TuiyaxinxiEntity> {
	
	List<TuiyaxinxiVO> selectListVO(@Param("ew") Wrapper<TuiyaxinxiEntity> wrapper);
	
	TuiyaxinxiVO selectVO(@Param("ew") Wrapper<TuiyaxinxiEntity> wrapper);
	
	List<TuiyaxinxiView> selectListView(@Param("ew") Wrapper<TuiyaxinxiEntity> wrapper);

	List<TuiyaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TuiyaxinxiEntity> wrapper);
	
	TuiyaxinxiView selectView(@Param("ew") Wrapper<TuiyaxinxiEntity> wrapper);
	
}
