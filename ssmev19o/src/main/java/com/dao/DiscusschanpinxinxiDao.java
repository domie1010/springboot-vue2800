package com.dao;

import com.entity.DiscusschanpinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschanpinxinxiVO;
import com.entity.view.DiscusschanpinxinxiView;


/**
 * 产品信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
public interface DiscusschanpinxinxiDao extends BaseMapper<DiscusschanpinxinxiEntity> {
	
	List<DiscusschanpinxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
	
	DiscusschanpinxinxiVO selectVO(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
	
	List<DiscusschanpinxinxiView> selectListView(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);

	List<DiscusschanpinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
	
	DiscusschanpinxinxiView selectView(@Param("ew") Wrapper<DiscusschanpinxinxiEntity> wrapper);
	
}
