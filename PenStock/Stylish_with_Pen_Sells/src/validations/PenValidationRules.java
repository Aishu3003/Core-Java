package validations;
import java.time.LocalDate;

//import java.util.Map;
//import java.util.HashMap;
import customException.PenCustomException;
import java.time.format.*;
import java.util.*;
import java.time.Period;


import core.app.*;

public class PenValidationRules {
	
	
	public static void checkExistPen(String brand,Map<Integer,Pen> pen) throws PenCustomException
	{
		if(pen.containsKey(brand))
			throw new PenCustomException("This Brand "+ brand +" has already Registered!!");
		
		System.out.println("Congrats! your company "+brand+" has Registered!");
	}
	
	
	public static void checkStockQuantity(int quantity) throws PenCustomException
	{
		if(quantity<100)
			throw new PenCustomException("Quantity should be more than 100 pieces");
		
	}
	
	public static LocalDate parseAndValidateDate(String stockListingDate) throws DateTimeParseException
	{
		return LocalDate.parse(stockListingDate);
	}
	
	
	public static void validPenPrice(double price) throws PenCustomException
	{
		if(price<0 && price>50)
			throw new PenCustomException("Pen Price should be between 10-50 rs.");
		
	}
	
	public static Pen validateAllInputs(String brand, String color, String inkColor, String material, int stockQuantity,
		 String stockListingDate, double price, Map<Integer,Pen> pen)
				 throws PenCustomException, DateTimeParseException
	{
		checkExistPen( brand,pen);
		checkStockQuantity(stockQuantity);
		LocalDate listDate = parseAndValidateDate(stockListingDate);
		validPenPrice(price);
		
		return new Pen(brand, color, inkColor, material, stockQuantity, listDate, price);	
	
		
	}
	
	
	public static void updatePenStock(int id, Map<Integer,Pen> pen ) throws PenCustomException
	{
		if(!pen.containsKey(id))
			throw new PenCustomException("Invalid Registeration Id ....");
		
		for(Map.Entry<Integer,Pen> penn : pen.entrySet())
		{
			if(penn.getKey() == id)
			{
				Pen p = penn.getValue();
				checkStockQuantity(p.getStockQuantity());
				p.setStockQuantity(p.getStockQuantity()-10);
			}
		}
		
		System.out.println("Stock Quantity updated!!");
	}
	
	
	
	public static void appliedDiscount(Map<Integer,Pen> pen) throws DateTimeParseException
	{
		
		for(Map.Entry<Integer, Pen> penn : pen.entrySet())
		{
			Pen p = penn.getValue();
			Period diffMonth = Period.between(p.getStockListingDate(),p.getUpdateDate());
			int months = diffMonth.getMonths();
			if( months >= 3 )
				discountOnAllPen(p);
				
		}
		
		
	}
	
	public static void removePen(Map<Integer,Pen> pen) throws DateTimeParseException
	{
		
		for(Map.Entry<Integer, Pen> penn : pen.entrySet())
		{
			Pen p = penn.getValue();
			Period diffMonth = Period.between(p.getStockListingDate(),p.getUpdateDate());
			int months = diffMonth.getMonths();
			if( months >= 9)
				pen.remove(p);		
		}	
		
	}
	
	
	public static void discountOnAllPen(Pen p)

	{
		p.setPrice(p.getPrice()*p.getDiscount());
		
	}
	
	
	public static void displayAllPenDetails(Map<Integer,Pen> pen)
	{
		for(Map.Entry<Integer,Pen> penn : pen.entrySet())
		{
			System.out.println("Company Registration Id : "+ penn.getKey()+" "+penn.getValue());
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
