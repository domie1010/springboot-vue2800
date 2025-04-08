package com.dao;

import com.entity.DiaochabaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiaochabaogaoVO;
import com.entity.view.DiaochabaogaoView;


/**
 * 调查报告
 * 
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
public interface DiaochabaogaoDao extends BaseMapper<DiaochabaogaoEntity> {
	
	List<DiaochabaogaoVO> selectListVO(@Param("ew") Wrapper<DiaochabaogaoEntity> wrapper);
	
	DiaochabaogaoVO selectVO(@Param("ew") Wrapper<DiaochabaogaoEntity> wrapper);
	
	List<DiaochabaogaoView> selectListView(@Param("ew") Wrapper<DiaochabaogaoEntity> wrapper);

	List<DiaochabaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiaochabaogaoEntity> wrapper);
	
	DiaochabaogaoView selectView(@Param("ew") Wrapper<DiaochabaogaoEntity> wrapper);
	
}
