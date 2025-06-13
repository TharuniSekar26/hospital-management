package HospitalManagement;
import java.util.*;
public class Operation {
	List<OutPatient> out = new ArrayList<>();
	List<InPatient> in = new ArrayList<>();
	public void admitPatient(String name, int age, int type, String disease) {
		if(type==0) {
			OutPatient p = new OutPatient(name,age,disease);
			out.add(p);
		}else {
			InPatient p = new InPatient(name,age,disease);
			in.add(p);
		}
		
	}

	public void display(String name, int type) {
		if(type==0) {
			for(OutPatient p : out) {
				if(name.equals(p.getName())) {
					System.out.println(p);
				}
			}
		}else {
			for(InPatient p : in) {
				if(name.equals(p.getName())) {
					System.out.println(p);
				}
			}
		}
	}

	public void discharge(String name, int type) {
		if(type==0) {
			for(OutPatient p : out) {
				if(name.equals(p.getName())) {
					out.remove(p);
				}
			}
		}else {
			for(InPatient p : in) {
				if(name.equals(p.getName())) {
					in.remove(p);
				}
			}
		}
	}

	

}
