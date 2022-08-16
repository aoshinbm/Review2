class Patient{
	String pname;
	int age;
	int phone;
	String pcity;
	String pstate;
	String pdepartment;	

Patient(String pname,int age,int phone,String pcity,String pstate,String pdepartment )
{
	this.pname=pname;
	this.age=age;
	this.phone=phone;
	this.pcity=pcity;
	this.pstate=pstate;
	this.pdepartment=pdepartment;
}
	
void patientDetails() {
	System.out.println(pname);
	System.out.println(age);
	System.out.println(phone);
	System.out.println(pcity);
	System.out.println(pstate);
	System.out.println(pdepartment);
}
}
