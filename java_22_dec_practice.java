// CREATING OUR OWN CLASS IN JAVA 

class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("employee id is " + id);
        System.out.println("employee name is " + name);

    }

    public int getSalary() {

        return salary;

    }

}

public class java_22_dec_practice {

    public static void main(String[] args) {
        Employee omkar = new Employee();
        Employee pavan = new Employee();
        omkar.id = 66;
        omkar.name = "omkar";
        omkar.salary = 804000;

        pavan.id = 88;
        pavan.name = "pavan";
        pavan.salary = 5555;
        // System.out.println("id is " + omkar.id);
        // System.out.println("name is " + omkar.name);

        omkar.printDetails();

        int salary = omkar.getSalary();
        int salary2 = pavan.getSalary();

        System.out.println(salary);
        System.out.println(salary2);

    }
}
