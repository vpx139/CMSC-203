package Patient;

import java.util.Scanner;

public class PatientDriverApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inputs
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter street address: ");
        String streetAddress = scanner.nextLine();
        
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        
        System.out.print("Enter state: ");
        String state = scanner.nextLine();
        
        System.out.print("Enter ZIP code: ");
        String zipCode = scanner.nextLine();
        
        System.out.print("Enter phone number (example 301-123-4567): ");
        String phoneNumber = scanner.nextLine();
        
        System.out.print("Enter emergency contact name: ");
        String emergencyContactName = scanner.nextLine();
        
        System.out.print("Enter emergency contact phone: ");
        String emergencyContactPhone = scanner.nextLine();

        // Patient
        Patient patient = new Patient(firstName, middleName, lastName, 
                                       streetAddress, city, state, 
                                       zipCode, phoneNumber, 
                                       emergencyContactName, emergencyContactPhone);

        //  objects
        Procedure procedure1 = new Procedure("Blood Test", "06/12/2023");
        procedure1.setPractitionerName("Dr. Smith");
        procedure1.setCharges(150.00);

        Procedure procedure2 = new Procedure("X-Ray", "06/15/2023", 
                                              "Dr. Jones", 200.00);
        
        Procedure procedure3 = new Procedure("CAT ", "06/20/2023");
        procedure3.setPractitionerName("Dr. Brown");
        procedure3.setCharges(1200.00);

        // display
        displayPatient(patient);
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);
        
        //  display charge
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%.2f\n \n Vivan perera \n McID 20835391 \n due date 10/8/2024", totalCharges);
        
        scanner.close();
    }

    //methods to display information 
    public static void displayPatient(Patient patient) {
        System.out.println("\nPatient Info:");
        System.out.println(patient);
    }

        public static void displayProcedure(Procedure procedure) {
        System.out.println("");
        System.out.println(procedure);
    }

    
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
    	
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
}
