package core.app;

import java.time.LocalDate;

public class Pen 
{
	private int id;
	private String brand;
	private String color;
	private String inkColor;
	private String material;
	private int stockQuantity;
	private LocalDate updateDate;
	private LocalDate stockListingDate;
	private double price;
	private double discount = 20;
	private static int idGenerator;
	
	static
	{
		idGenerator = 30;
	}
	
	
	public Pen( String brand, String color, String inkColor, String material, int stockQuantity,
				LocalDate stockListingDate, double price )
	{
		super();
		
		this.id = ++idGenerator;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stockQuantity = stockQuantity;
		this.stockListingDate = stockListingDate;
		this.price = price;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getInkColor() {
		return inkColor;
	}


	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public int getStockQuantity() {
		return stockQuantity;
	}


	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}


	public LocalDate getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}


	public LocalDate getStockListingDate() {
		return stockListingDate;
	}


	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public static int getIdGenerator() {
		return idGenerator;
	}


	public static void setIdGenerator(int idGenerator) {
		Pen.idGenerator = idGenerator;
	}


	
	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stockQuantity=" + stockQuantity + ", updateDate=" + updateDate + ", stockListingDate="
				+ stockListingDate + ", price=" + price + ", discount=" + discount + "]";
	}


	public boolean soldInMonths(int i) {
   
      
		return false;
	}
	
	
	

	
}
