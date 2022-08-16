class Hospitalls {
	String hname;
	String haddress;
	String hcity; 
	String hstate;
	int zip;
	String hdepart;
	String hpatient;

Hospitalls(String hname, String haddress, String hcity, String hstate, int zip, String hdepart, String hpatient)
{
	this.hname=hname;
	this.haddress=haddress;
	this.hcity=hcity;
	this.hstate=hstate;
	this.zip=zip;
	this.hdepart=hdepart;
	this.hpatient=hpatient;
}
		
void hospitalDetails() {
	System.out.println(hname);
	System.out.println(haddress);
	System.out.println(hcity);
	System.out.println(hstate);
	System.out.println(zip);
	System.out.println(hdepart);
	System.out.println(hpatient);
	}
}
