package entity;

//订单实体类 对应表 shop_order
public class OrderEntity {
	
	private String orderId;
	private String userId;
	private String goodId;
	private String orderGoodNum;
	private String orderDate;
	private String orderPrice;
	private String tel;
	private String realName;
	private String add;
	private String orderIsOver;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGoodId() {
		return goodId;
	}
	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}
	public String getOrderGoodNum() {
		return orderGoodNum;
	}
	public void setOrderGoodNum(String orderGoodNum) {
		this.orderGoodNum = orderGoodNum;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getOrderIsOver() {
		return orderIsOver;
	}
	public void setOrderIsOver(String orderIsOver) {
		this.orderIsOver = orderIsOver;
	}
	
	
	

}
