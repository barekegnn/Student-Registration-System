            //java project for Student Registration System
            //Name: Barekegn Assefa
            //ID: 2249/14
            //Section: A
             
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Student {
    private String FullName;
    private int age;
    private String sex;
    private int RegstrNumber;
    private String nationality;
    private String dateOfBirth;
    private String region;
    private String birthPlace;
    private String familyEconomicStatus;
    private int phoneNumber;
    

    public Student(String FullName, int age, String sex, int RegstrNumber, String nationality, String dateOfBirth,
                   String region, String birthPlace, String familyEconomicStatus, int phoneNumber) {
       
        this.FullName = FullName;
        this.age = age;
        this.sex = sex;
        this.RegstrNumber = RegstrNumber;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.region = region;
        this.birthPlace = birthPlace;
        this.familyEconomicStatus = familyEconomicStatus;
        this.phoneNumber = phoneNumber;
        
    }

    @Override
    public String toString() {
        // Return a string representation of the student object
        return "FullName: " + FullName +
                "\nAge: " + age +
                "\nsex: " + sex +
                "\nReg.Number: " + RegstrNumber +
                "\nNationality: " + nationality +
                "\nDate of Birth: " + dateOfBirth +
                "\nRegion: " + region +
                "\nBirth Place: " + birthPlace +
                "\nFamily Economic Status: " + familyEconomicStatus + 
                "\nphone Number: " + phoneNumber;
               

    }
}
 class StudentRegistrationSystem {
    private static List<Student> students = new ArrayList<>(); // Store registered students

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== Student Registration System ====");
            System.out.println("1. Register a new student");
            System.out.println("2. Display registered students' information");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    registerStudent(scanner); // Call method to register a new student
                    break;
                case 2:
                    displayStudents(); // Call method to display registered students' information
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0); // Terminate the program
                    break; // Not strictly necessary, but added for clarity
                default:
                     System.out.println("Invalid choice. Please try again.");
            }
        } 
    }
 
    private static void registerStudent(Scanner scanner) {
        try {System.out.print("Enter student FullName: ");
        String FullName = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
         System.out.print("Enter student sex: ");
         String sex = scanner.nextLine();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter student Registration Number: ");
        int RegstrNumber = scanner.nextInt();
        System.out.print("Enter student nationality: ");
        String nationality = scanner.nextLine();
        scanner.nextLine(); // Consume the newline character    
        System.out.print("Enter student date of birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter student region: ");
        String region = scanner.nextLine();
        System.out.print("Enter student birth place: ");
        String birthPlace = scanner.nextLine();
        System.out.print("Enter student family economic status: ");
        String familyEconomicStatus = scanner.nextLine();
        System.out.print("Enter student phoneNumber: ");
        int phoneNumber = scanner.nextInt();
     

        // Create a new Student object with the provided information
        Student student = new Student(FullName, age,sex,  RegstrNumber, nationality, dateOfBirth, region,
                birthPlace, familyEconomicStatus, phoneNumber );

        // Add the student to the list of registered students
        students.add(student);
        System.out.println("Student registered successfully!");
            
        } catch (InputMismatchException e) {
            System.out.println("please Enter a number!! Are you certified idiot!!");
            System.out.println(e.getMessage());
        }
         finally{
           System.exit(0);
         }
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered yet.");
        } else {
            System.out.println("Registered Students:");
            for (Student student : students) {
                System.out.println("\n" + student + "\n");
            }
        }
    }
}
