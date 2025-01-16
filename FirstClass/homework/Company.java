class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateTax() {
        if (salary <= 150) {
            return 0;
        } else if (salary > 150 && salary <= 500) {
            return salary * 0.10;
        } else if (salary > 500 && salary <= 1400) {
            return salary * 0.15;
        } else if (salary > 1400 && salary <= 2350) {
            return salary * 0.20;
        } else if (salary > 2350 && salary <= 3350) {
            return salary * 0.25;
        } else if (salary > 3350 && salary <= 5000) {
            return salary * 0.30;
        } else {
            return salary * 0.35;
        }
    }

    public double calculatePension() {
        return salary * 0.06;
    }

    public double calculateNetSalary() {
        return salary - (calculateTax() + calculatePension());
    }

    public String generatePerformanceReport() {
        return "Employee Performance Report\n" +
                "Name: " + name + "\n" +
                "Job Title: " + jobTitle + "\n" +
                "Net Salary: " + calculateNetSalary();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    public double calculateBonus() {
        return getSalary() * 0.20;
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    public double calculateBonus() {
        return getSalary() * 0.15;
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "123 Manager Lane", 3500);
        Developer developer = new Developer("Bob", "456 Developer Ave", 2500);
        Programmer programmer = new Programmer("Charlie", "789 Programmer St", 1500);

        System.out.println(manager.generatePerformanceReport());
        System.out.println("Bonus: " + manager.calculateBonus());

        System.out.println(developer.generatePerformanceReport());
        System.out.println("Bonus: " + developer.calculateBonus());

        System.out.println(programmer.generatePerformanceReport());
        System.out.println("Bonus: " + programmer.calculateBonus());
    }
}
