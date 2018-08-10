import java.util.*;
class Address
{
String street;
String city;
int pincode;
String country;
Address(String street,String city,int pincode, String country)
{
this.street=street;
this.city=city;
this.pincode=pincode;
this.country=country;
}
void displayAddress()
{
System.out.printf("\nstreet: %s", street);
System.out.printf("\ncity: %s", city);
System.out.printf("\npincode: %d", pincode);
System.out.printf("\ncountry: %s", country);
}
}
class Customer
{
String name;
String email;
String type;
Address address;
Customer(String name, String email,String type, Address address)
{
this.name=name;
this.email=email;
this.type=type;
this.address=address;
}
void displayDetails()
{
System.out.printf("name: %s", name);
System.out.printf("\nemail: %s", email);
System.out.printf("\ntype: %s", type);
address.displayAddress();
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter customer details");
System.out.println("enter name");
String name=sc.next();
System.out.println("enter email");
String email=sc.next();
System.out.println("enter type");
String type=sc.next();
System.out.println("enter customer address");
System.out.println("enter street");
String street=sc.next();
System.out.println("enter city");
String city=sc.next();
System.out.println("enter pincode");
int pincode=sc.nextInt();
System.out.println("enter country");
String country=sc.next();
Address add=new Address(street,city,pincode,country);
Customer c=new Customer(name,email,type,add);
c.displayDetails();
}
}



