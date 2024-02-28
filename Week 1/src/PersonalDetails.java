//4.Create a second project called “PersonalDetails” and 
//write a program that outputs some personal details to the
//screen, e.g. Name, Address, Age, Phone number etc.

import java.util.Scanner;

public class PersonalDetails{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their personal details
        System.out.println("Please enter your personal details:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        

        // Output the personal details
        System.out.print("--------------------");
        System.out.println("\nPersonal Details:");
        System.out.print("--------------------");
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        
        scanner.close();
    }
}
