class Patient{
	String patient_name;
	int age;
	int phone;
	String city;
	String department;	
Patient(String patient_name,int age,int phone,String city,String department )
{
	this.patient_name=patient_name;
	this.age=age;
	this.phone=phone;
	this.city=city;
	this.department=department;
}	
void patientDetails() {
	System.out.println(this.patient_name);
	System.out.println(this.age);
	System.out.println(this.phone);
	System.out.println(this.city);
	System.out.println(this.department);
}
}
