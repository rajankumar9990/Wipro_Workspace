package inheritance;


class Employee {
    String name;
    double salary;

    void setDetails(String n, double s) {
        name = n;
        salary = s;
    }

    void work() {
        System.out.println(name + " is working in the company.");
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {
    String department;

    void setDepartment(String dept) {
        department = dept;
    }

 
    void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}


class Developer extends Employee {
    String programmingLanguage;

    void setProgrammingLanguage(String lang) {
        programmingLanguage = lang;
    }

  
    void work() {
        System.out.println(name + " is developing software using " + programmingLanguage + ".");
    }
}


public class Inh_Emp {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setDetails("Akash", 75000);
        m.setDepartment("Tech");

        Developer d = new Developer();
        d.setDetails("Akul", 80000);
        d.setProgrammingLanguage("Java");

        m.showDetails();
        m.work();

        System.out.println();

        d.showDetails();
        d.work();
    }
}
