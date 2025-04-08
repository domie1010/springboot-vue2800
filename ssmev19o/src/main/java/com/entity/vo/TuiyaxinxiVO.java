package com.entity.vo;

import com.entity.TuiyaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 退押信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
public class TuiyaxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 产品编号
	 */
	
	private String chanpinbianhao;
		
	/**
	 * 产品名称
	 */
	
	private String chanpinmingcheng;
		
	/**
	 * 试吃押金
	 */
	
	private String shichiyajin;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 商家编号
	 */
	
	private String shangjiabianhao;
		
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 试吃地址
	 */
	
	private String shichidizhi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 退押时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuiyashijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：产品编号
	 */
	 
	public void setChanpinbianhao(String chanpinbianhao) {
		this.chanpinbianhao = chanpinbianhao;
	}
	
	/**
	 * 获取：产品编号
	 */
	public String getChanpinbianhao() {
		return chanpinbianhao;
	}
				
	
	/**
	 * 设置：产品名称
	 */
	 
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
				
	
	/**
	 * 设置：试吃押金
	 */
	 
	public void setShichiyajin(String shichiyajin) {
		this.shichiyajin = shichiyajin;
	}
	
	/**
	 * 获取：试吃押金
	 */
	public String getShichiyajin() {
		return shichiyajin;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：商家编号
	 */
	 
	public void setShangjiabianhao(String shangjiabianhao) {
		this.shangjiabianhao = shangjiabianhao;
	}
	
	/**
	 * 获取：商家编号
	 */
	public String getShangjiabianhao() {
		return shangjiabianhao;
	}
				
	
	/**
	 * 设置：商家名称
	 */
	 
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
				
	
	/**
	 * 设置：试吃地址
	 */
	 
	public void setShichidizhi(String shichidizhi) {
		this.shichidizhi = shichidizhi;
	}
	
	/**
	 * 获取：试吃地址
	 */
	public String getShichidizhi() {
		return shichidizhi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：退押时间
	 */
	 
	public void setTuiyashijian(Date tuiyashijian) {
		this.tuiyashijian = tuiyashijian;
	}
	
	/**
	 * 获取：退押时间
	 */
	public Date getTuiyashijian() {
		return tuiyashijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
