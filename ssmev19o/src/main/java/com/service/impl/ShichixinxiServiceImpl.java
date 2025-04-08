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


import com.dao.ShichixinxiDao;
import com.entity.ShichixinxiEntity;
import com.service.ShichixinxiService;
import com.entity.vo.ShichixinxiVO;
import com.entity.view.ShichixinxiView;

@Service("shichixinxiService")
public class ShichixinxiServiceImpl extends ServiceImpl<ShichixinxiDao, ShichixinxiEntity> implements ShichixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShichixinxiEntity> page = this.selectPage(
                new Query<ShichixinxiEntity>(params).getPage(),
                new EntityWrapper<ShichixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShichixinxiEntity> wrapper) {
		  Page<ShichixinxiView> page =new Query<ShichixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShichixinxiVO> selectListVO(Wrapper<ShichixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShichixinxiVO selectVO(Wrapper<ShichixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShichixinxiView> selectListView(Wrapper<ShichixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShichixinxiView selectView(Wrapper<ShichixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
