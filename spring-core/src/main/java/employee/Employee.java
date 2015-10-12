package employee;

/**
 * Created by krishan on 9/8/15.
 */
public class Employee {
    String name;
    int age;
    String company;

    public Employee(){

    }
    public Employee(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                '}';
    }
}
