package Model;

//购物车实体类 对应表 shop_cart
public class CartEntity {
	
	private String cartId;
	private String userId;
	private String goodId;
	private String cartGoodNum;

	
	
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
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
	public String getCartGoodNum() {
		return cartGoodNum;
	}
	public void setCartGoodNum(String cartGoodNum) {
		this.cartGoodNum = cartGoodNum;
	}
	
	

}
