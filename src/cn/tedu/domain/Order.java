package cn.tedu.domain;

import java.util.Date;

// Order实体类 -> 订单信息
public class Order {
	private Integer id;
	private Integer doorId;
	private String orderNo;
	private String orderType;
	private Integer pnum;
	private String cashier;
	private Date orderTime;
	private Date payTime;
	private String payType;
	private double price;
	
	// getter和setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDoorId() {
		return doorId;
	}
	public void setDoorId(Integer doorId) {
		this.doorId = doorId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Integer getPnum() {
		return pnum;
	}
	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}
	public String getCashier() {
		return cashier;
	}
	public void setCashier(String cashier) {
		this.cashier = cashier;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// toString
	@Override
	public String toString() {
		return "Order [id=" + id + ", doorId=" + doorId + ", orderNo=" + orderNo + ", orderType=" + orderType
				+ ", pnum=" + pnum + ", cashier=" + cashier + ", orderTime=" + orderTime + ", payTime=" + payTime
				+ ", payType=" + payType + ", price=" + price + "]";
	}
}
