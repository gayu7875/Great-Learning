package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.interfaces.Credentials;
import com.greatlearning.modal.Employee;
import com.greatlearning.service.CredentialService;


public class Driver {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstName;
		String lastName;
		
		Employee employee = new Employee("Harshit", "Choudary");
		
		Credentials service = new CredentialService();
		
			int option;
				System.out.println("Enter the operation number for the department");
				
				System.out.println("1. Technical");
				System.out.println("2. Admin");
				System.out.println("3. Human Resource");
				System.out.println("4. Legal");
				option = scanner.nextInt();
				String generatedEmail = null;
				String generatedPassword =null;
				switch (option)
				{
				case 1:
				{
					generatedEmail = service.generateEmailAddress(employee.getfirstName().toLowerCase(),employee.getlastName().toLowerCase(),"tech");
					generatedPassword = service.generatePassword();
					break;
				}
				case 2:
				{
					generatedEmail = service.generateEmailAddress(employee.getfirstName().toLowerCase(),employee.getlastName().toLowerCase(),"ad");
					generatedPassword = service.generatePassword();
					break;
				}
				case 3:
				{
					generatedEmail = service.generateEmailAddress(employee.getfirstName().toLowerCase(),employee.getlastName().toLowerCase(),"hr");
					generatedPassword = service.generatePassword();
					break;
				}
				case 4:
				{
					generatedEmail = service.generateEmailAddress(employee.getfirstName().toLowerCase(),employee.getlastName().toLowerCase(),"legal");
					generatedPassword = service.generatePassword();
					break;
				}
				default:
				{
					System.out.println("Enter a valid option");
				}
				}
				employee.setemail(generatedEmail);
				employee.setPassword(generatedPassword);
				service.showCredentials(employee);
				scanner.close();
		}
	
		

	}


