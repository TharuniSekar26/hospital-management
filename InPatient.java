package HospitalManagement;

public class InPatient extends Patient{
	int a = 80;
	String doctor = "alen";
	int bedCharge = 1000;
	public InPatient(String name, int age, String disease) {
		super(name,age,disease);
	}
	@Override
	public String toString() {
		return "InPatient [doctor=" + doctor + ", bedCharge=" + bedCharge + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getDisease()=" + getDisease() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
