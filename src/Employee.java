public class Employee {
    private String name;
    private String surname;
    private String middleName;

    private String department;
    private int salary;

    private int id;
    static int counter = 1;

    public void displayId() {
        id = counter++;

    }

    public Employee(String surname, String name, String middleName, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;


    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMiddleSalary(int salary) {
        this.salary = salary;

    }


    @Override
    public String toString() {
        return id
                + surname + " "
                + name + " "
                + middleName + " "
                + department + " "
                + salary + " $";
    }
}
