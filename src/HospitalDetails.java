public class HospitalDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Patient patient=new Patient("Brian",25,123456,"Best city","Neurology");
	Hospitalls hospital=new Hospitalls("NH hospital", "Near West school","Best city","Karnatka",50789);

	Department department= Department.Cardiology;
	System.out.println(department);
	}
}

enum Department{
	Oncology,
	Cardiology,
	Gynocology,
	Neurology;
}
