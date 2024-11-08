import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;

    private static String university;
    private static int studentCount = 0;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println();
    }

    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + studentCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the university name: ");
        university = scanner.nextLine();

        Student student1 = createStudent(scanner, 1);
        Student student2 = createStudent(scanner, 2);
        Student student3 = createStudent(scanner, 3);

        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

        Student.displayTotalStudents();

        scanner.close();
    }

    public static Student createStudent(Scanner scanner, int studentNumber) {
        System.out.println("Enter details for Student " + studentNumber + ":");
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();

        return new Student(id, name, department, cgpa);
    }
}
