package com.entity.view;

import com.entity.DiaochabaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 调查报告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
@TableName("diaochabaogao")
public class DiaochabaogaoView  extends DiaochabaogaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiaochabaogaoView(){
	}
 
 	public DiaochabaogaoView(DiaochabaogaoEntity diaochabaogaoEntity){
 	try {
			BeanUtils.copyProperties(this, diaochabaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
