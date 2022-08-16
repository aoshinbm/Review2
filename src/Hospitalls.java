class Hospitalls {
	String name;
	String address;
	String city; 
	String state;
	int zip;

Hospitalls(String name, String address, String city, String state, int zip)
{
	this.name=name;
	this.address=address;
	this.city=city;
	this.state=state;
	this.zip=zip;
}		
void hospitalDetails() {
	System.out.println(this.name);
	System.out.println(this.address);
	System.out.println(this.city);
	System.out.println(this.state);
	System.out.println(this.zip);
	}
}
