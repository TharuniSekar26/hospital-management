package HospitalManagement;

public class Patient {
	private String name;
	private int age;
	private String disease;
	public Patient(String name2, int age2, String disease2) {
		name = name2;
		age = age2;
		disease = disease2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
}
