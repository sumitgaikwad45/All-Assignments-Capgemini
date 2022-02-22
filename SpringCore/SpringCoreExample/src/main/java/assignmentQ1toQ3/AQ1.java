package assignmentQ1toQ3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Address{
	private String street;
	private String city;
	private int zip;
	private String country;
	
	
	public String getStreet() {
		return street;	
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	
	
	public Address(String street, String city, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.country = country;
	}
	public String toString(){  
	    return street+" "+city+" "+zip+" "+country;  
	}  
}
   

class Customer{
	private int customerID;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address address) {
		this.customerAddress = address;
	}
	
	public Customer(int customerID, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public void disaplyInfo() {
		System.out.println("Customer ID= " + getCustomerID() +" \n Customer Name = " + getCustomerName() + " \n Customer Contact= " + getCustomerContact() + "\n Customer Address = " +  getCustomerAddress()) ;
	}
	
	
	
	
	
}
public class AQ1 {

	public static void main(String[] args) {
          
		ApplicationContext context = new ClassPathXmlApplicationContext ("AssignmentQ1.xml");
		Customer customer = (Customer)context.getBean("customer");
		customer.disaplyInfo();
	}

}
