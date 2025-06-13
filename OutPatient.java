package HospitalManagement;

public class OutPatient extends Patient{
	
	String doctor = "smith";
	public OutPatient(String name, int age, String disease) {
		super(name,age,disease);
	}
	@Override
	public String toString() {
		return "OutPatient [doctor=" + doctor + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getDisease()=" + getDisease() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
