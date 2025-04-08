package com.dao;

import com.entity.ChanpinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinxinxiVO;
import com.entity.view.ChanpinxinxiView;


/**
 * 产品信息
 * 
 * @author 
 * @email 
 * @date 2021-06-05 11:09:11
 */
public interface ChanpinxinxiDao extends BaseMapper<ChanpinxinxiEntity> {
	
	List<ChanpinxinxiVO> selectListVO(@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);
	
	ChanpinxinxiVO selectVO(@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);
	
	List<ChanpinxinxiView> selectListView(@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);

	List<ChanpinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);
	
	ChanpinxinxiView selectView(@Param("ew") Wrapper<ChanpinxinxiEntity> wrapper);
	
}
