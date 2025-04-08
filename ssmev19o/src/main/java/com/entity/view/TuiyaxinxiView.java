package com.entity.view;

import com.entity.TuiyaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退押信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
@TableName("tuiyaxinxi")
public class TuiyaxinxiView  extends TuiyaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuiyaxinxiView(){
	}
 
 	public TuiyaxinxiView(TuiyaxinxiEntity tuiyaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tuiyaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
