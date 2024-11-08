public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    private static String companyName = "TechTuk";
    private static String companyAddress = "9no Farmview Super Market, Farmgate , DHaka-1215";
    private static int employeeCount = 0;

    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        employeeCount++;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary+"TK");
        System.out.println("Company: " + companyName);
        System.out.println("Company Address: " + companyAddress);
        System.out.println();
    }

    // Static method to display the total number of employees
    public static void displayEmployeeCount() {
        System.out.println("Total number of employees: " + employeeCount);
    }

    // Main method to demonstrate the class functionality
    public static void main(String[] args) {
        // Creating 3 Employee objects
        Employee e1 = new Employee("Asif Mahmud", 23, "CEO", 80000);
        Employee e2 = new Employee("Rahat Talukder", 23, "CTO", 75000);
        Employee e3 = new Employee("Alfa Sany ", 21, "Product Manager", 60000);

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();

        Employee.displayEmployeeCount();
    }
}
