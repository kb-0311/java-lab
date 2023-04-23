import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter details of the Employee");
        String E_name = ob.next();
        int E_age  = ob.nextInt();
        String E_phone = ob.next();
        String E_Address = ob.next();
        double E_salary = ob.nextDouble();
        String E_specialization = ob.next();
        
        Employee employee = new Employee(E_name, E_age, E_phone, E_Address, E_salary, E_specialization);
        
        System.out.println("Enter details of the Manager");
        String M_name = ob.next();
        int M_age  = ob.nextInt();
        String M_phone = ob.next();
        String M_Address = ob.next();
        double M_salary = ob.nextDouble();
        String M_specialization = ob.next();
        Manager manager = new Manager(M_name, M_age, M_phone, M_Address, M_salary, M_specialization);
        employee.printSalary();
        manager.printSalary();
    }
}

class Member {
    public static int countMembers = 0;
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        countMembers++;
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}

class Employee extends Member {
    public static int countEmployees = 0;
    private String specialization;

    Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        countEmployees++;
    }

    public void getSpecialization() {
        System.out.println("Specialization : " + specialization);
    }
}

class Manager extends Member{
    public static int countManagers = 0;
    private String department;

    Manager(String name, int age, String phoneNumber,
                    String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
        countManagers++;
    }

    public void getSpecialization() {
        System.out.println("Department : " + this.department);
    }
}
