public class HospitalDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patientt p=new Patientt("Brian",25,123456,"Best city","Odhisa","Neurology");
		Hospital hosp=new Hospital("NH hospital", "Near West school","Best city","Karnatka",50789,"Cardoiol");
	}
}

class Hospital {
	String hname;
	String haddress;
	String hcity; 
	String hstate;
	int zip;
	String hdepart;
	
Hospital(String hname, String haddress, String hcity, String hstate, int zip, String hdepart)
{
	this.hname=hname;
	this.haddress=haddress;
	this.hcity=hcity;
	this.hstate=hstate;
	this.zip=zip;
	this.hdepart=hdepart;
}		
void hospitalDetails() {
	System.out.println(this.hname);
	System.out.println(this.haddress);
	System.out.println(this.hcity);
	System.out.println(this.hstate);
	System.out.println(this.zip);
	System.out.println(this.hdepart);
	}
}


class Patientt{
	String pname;
	int age;
	int phone;
	String pcity;
	String pstate;
	String pdepartment;	

Patientt(String pname,int age,int phone,String pcity,String pstate,String pdepartment)
{
	this.pname=pname;
	this.age=age;
	this.phone=phone;
	this.pcity=pcity;
	this.pstate=pstate;
	this.pdepartment=pdepartment;
}
	
void patientDetails() {
	System.out.println(this.pname);
	System.out.println(this.age);
	System.out.println(this.phone);
	System.out.println(this.pcity);
	System.out.println(this.pstate);
	System.out.println(this.pdepartment);
}
}
