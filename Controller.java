package HospitalManagement;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
		Operation op = new Operation();
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		int type = 0;
		do {
			System.out.println("enter 1 for admit\n2 for display\n3for discharge");
			n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.println("enter ur name");
					String name = sc.next();
					System.out.println("enter ur age");
					int age = sc.nextInt();
					System.out.print("Enter ur type(inPatient(1)/outPatient(0)");
					type = sc.nextInt();
					System.out.println("enter ur disease");
					String disease = sc.next();
					op.admitPatient(name,age,type,disease);
					break;
				case 2:
					System.out.println("enter ur name");
					name = sc.next();
					op.display(name,type);
					break;
				case 3:
					System.out.println("enter ur name");
					name = sc.next();
					op.discharge(name,type);
					break;
			}
			System.out.println();
		}while(n!=4);
	}

}
