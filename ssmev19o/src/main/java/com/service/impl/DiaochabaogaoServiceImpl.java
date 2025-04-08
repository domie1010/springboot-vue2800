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


import com.dao.DiaochabaogaoDao;
import com.entity.DiaochabaogaoEntity;
import com.service.DiaochabaogaoService;
import com.entity.vo.DiaochabaogaoVO;
import com.entity.view.DiaochabaogaoView;

@Service("diaochabaogaoService")
public class DiaochabaogaoServiceImpl extends ServiceImpl<DiaochabaogaoDao, DiaochabaogaoEntity> implements DiaochabaogaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiaochabaogaoEntity> page = this.selectPage(
                new Query<DiaochabaogaoEntity>(params).getPage(),
                new EntityWrapper<DiaochabaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiaochabaogaoEntity> wrapper) {
		  Page<DiaochabaogaoView> page =new Query<DiaochabaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiaochabaogaoVO> selectListVO(Wrapper<DiaochabaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiaochabaogaoVO selectVO(Wrapper<DiaochabaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiaochabaogaoView> selectListView(Wrapper<DiaochabaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiaochabaogaoView selectView(Wrapper<DiaochabaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
