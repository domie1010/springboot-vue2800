package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiaochabaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiaochabaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiaochabaogaoView;


/**
 * 调查报告
 *
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
public interface DiaochabaogaoService extends IService<DiaochabaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiaochabaogaoVO> selectListVO(Wrapper<DiaochabaogaoEntity> wrapper);
   	
   	DiaochabaogaoVO selectVO(@Param("ew") Wrapper<DiaochabaogaoEntity> wrapper);
   	
   	List<DiaochabaogaoView> selectListView(Wrapper<DiaochabaogaoEntity> wrapper);
   	
   	DiaochabaogaoView selectView(@Param("ew") Wrapper<DiaochabaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiaochabaogaoEntity> wrapper);
   	
}

