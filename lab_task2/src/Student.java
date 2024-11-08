public class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;

    private static String university = "University of Liberal Arts Bangladesh";
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

    public static void displayStudentCount() {
        System.out.println("Total number of students: " + studentCount);
    }

    public static void main(String[] args) {
        Student s1 = new Student(233014014, "Asif Mahmud Taif", "CSE", 3.6);
        Student s2 = new Student(233014078, "Ruhul Amin", "CSE", 3.7);
        Student s3 = new Student(233014186, "Rahat Talukder", "CSE", 3.8);

        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();

        Student.displayStudentCount();
    }
}
