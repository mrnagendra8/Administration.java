package com.gl.service;
import java.util.Scanner;
import java.util.scanner;
import com.gl.model.Employee;
public class DriverClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Keshav", "yadav");
        CredentialService cs = new CredentialServices();
        String generatedEmail;
        char[] generatedPassword;
        System.out.println("please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1) {
            generatedEmail = cs.generatedEmailAddress(employee.getFirstName().toLowercase().employee.getLastName().toLowercase(). "tech");
            generatedPassword = cs.generatePassword();
            cs.showCredentials(employee, generatedEmail, generatedPassword);
        }
        else if (option == 2) {
             generatedEmail = cs.generatedEmailAddress(employee.getFirstName().toLowercase().employee.getLastName().toLowercase(). "adm");
            generatedPassword = cs.generatePassword();
            cs.showCredentials(employee, generatedEmail, generatedPassword);
        }
        else if(option == 3) {
             generatedEmail = cs.generatedEmailAddress(employee.getFirstName().toLowercase().employee.getLastName().toLowercase(). "hr");
            generatedPassword = cs.generatePassword();
            cs.showCredentials(employee, generatedEmail, generatedPassword);
        }
        else if(option == 4) {
             generatedEmail = cs.generatedEmailAddress(employee.getFirstName().toLowercase().employee.getLastName().toLowercase(). "lg");
            generatedPassword = cs.generatePassword();
            cs.showCredentials(employee, generatedEmail, generatedPassword);
        }

        else
        System.out.println("Enter a valid option");

        sc.close();
    }
}
