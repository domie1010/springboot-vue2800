package com.entity.vo;

import com.entity.DiaochabaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 调查报告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-06-05 11:09:12
 */
public class DiaochabaogaoVO  implements Serializable {
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
	 * 答卷时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dajuanshijian;
		
	/**
	 * 产品外观和颜色
	 */
	
	private String chanpinwaiguanheyanse;
		
	/**
	 * 闻到的香味浓度
	 */
	
	private String wendaodexiangweinongdu;
		
	/**
	 * 口感
	 */
	
	private String kougan;
		
	/**
	 * 吃后余香味
	 */
	
	private String chihouyuxiangwei;
		
	/**
	 * 综合评价
	 */
	
	private String zonghepingjia;
		
	/**
	 * 卖相建议
	 */
	
	private String maixiangjianyi;
		
	/**
	 * 请留下你宝贵的建议
	 */
	
	private String qingliuxianibaoguidejianyi;
				
	
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
	 * 设置：答卷时间
	 */
	 
	public void setDajuanshijian(Date dajuanshijian) {
		this.dajuanshijian = dajuanshijian;
	}
	
	/**
	 * 获取：答卷时间
	 */
	public Date getDajuanshijian() {
		return dajuanshijian;
	}
				
	
	/**
	 * 设置：产品外观和颜色
	 */
	 
	public void setChanpinwaiguanheyanse(String chanpinwaiguanheyanse) {
		this.chanpinwaiguanheyanse = chanpinwaiguanheyanse;
	}
	
	/**
	 * 获取：产品外观和颜色
	 */
	public String getChanpinwaiguanheyanse() {
		return chanpinwaiguanheyanse;
	}
				
	
	/**
	 * 设置：闻到的香味浓度
	 */
	 
	public void setWendaodexiangweinongdu(String wendaodexiangweinongdu) {
		this.wendaodexiangweinongdu = wendaodexiangweinongdu;
	}
	
	/**
	 * 获取：闻到的香味浓度
	 */
	public String getWendaodexiangweinongdu() {
		return wendaodexiangweinongdu;
	}
				
	
	/**
	 * 设置：口感
	 */
	 
	public void setKougan(String kougan) {
		this.kougan = kougan;
	}
	
	/**
	 * 获取：口感
	 */
	public String getKougan() {
		return kougan;
	}
				
	
	/**
	 * 设置：吃后余香味
	 */
	 
	public void setChihouyuxiangwei(String chihouyuxiangwei) {
		this.chihouyuxiangwei = chihouyuxiangwei;
	}
	
	/**
	 * 获取：吃后余香味
	 */
	public String getChihouyuxiangwei() {
		return chihouyuxiangwei;
	}
				
	
	/**
	 * 设置：综合评价
	 */
	 
	public void setZonghepingjia(String zonghepingjia) {
		this.zonghepingjia = zonghepingjia;
	}
	
	/**
	 * 获取：综合评价
	 */
	public String getZonghepingjia() {
		return zonghepingjia;
	}
				
	
	/**
	 * 设置：卖相建议
	 */
	 
	public void setMaixiangjianyi(String maixiangjianyi) {
		this.maixiangjianyi = maixiangjianyi;
	}
	
	/**
	 * 获取：卖相建议
	 */
	public String getMaixiangjianyi() {
		return maixiangjianyi;
	}
				
	
	/**
	 * 设置：请留下你宝贵的建议
	 */
	 
	public void setQingliuxianibaoguidejianyi(String qingliuxianibaoguidejianyi) {
		this.qingliuxianibaoguidejianyi = qingliuxianibaoguidejianyi;
	}
	
	/**
	 * 获取：请留下你宝贵的建议
	 */
	public String getQingliuxianibaoguidejianyi() {
		return qingliuxianibaoguidejianyi;
	}
			
}
