package OverridingFurniture;

public class Furniture {
	
	private int 	m_width;
	private int 	m_height;
	private String	m_color;
	private int	m_price;
	
	public Furniture(String color){
		m_color = color;
	}
	
	public String getColor() {
		return m_color;
	}
	public void setColor(String color) {
		this.m_color = color;
	}
	public int getHeight() {
		return m_height;
	}
	public void setHeight(int height) {
		this.m_height = height;
	}
	public int getPrice() {
		return m_price;
	}
	public void setPrice(int price) {
		this.m_price = price;
	}
	// overloaded version of setPrice
	public void setPrice(int price,int discount)
	 {
	    m_price = price-(price * discount)/100;
	 }

	public int getWidth() {
		return m_width;
	}
	public void setWidth(int width) {
		this.m_width = width;
	}
	


}
