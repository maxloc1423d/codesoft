import java.util.Scanner;

public class ConsoleStudentManagementSystem {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    sms.addStudent(new Student(name, rollNumber, grade));
                    System.out.println("Student added.");
                    break;
                case 2:
                    System.out.print("Enter roll number to remove: ");
                    int rollToRemove = scanner.nextInt();
                    sms.removeStudent(rollToRemove);
                    System.out.println("Student removed.");
                    break;
                case 3:
                    System.out.print("Enter roll number to search: ");
                    int rollToSearch = scanner.nextInt();
                    Student searchedStudent = sms.searchStudent(rollToSearch);
                    if (searchedStudent != null) {
                        System.out.println("Found Student: " + searchedStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    sms.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }
}

