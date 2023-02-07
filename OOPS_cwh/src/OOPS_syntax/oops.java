package OOPS_syntax;

class Employee{

    int id;
    String name;
    int salary;

    public void printDetail(){
        System.out.println("OOPS_syntax.Employee ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }

    public int getSalary(){
        return salary;
    }

}

public class oops {
    public static void main(String[] args) {

        //Instantiating a new OOPS_syntax.Employee Object
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        //Setting Attributes for emp1
        emp1.id = 1;
        emp1.name = "Rakshit Pandey";
        emp1.salary = 5000;

        //Setting Attributes for emp2
        emp2.id = 2;
        emp2.name = "Krishna Pandey";
        emp2.salary = 10000;

        emp1.printDetail();
        System.out.println("");
        emp2.printDetail();

        System.out.println("");
        System.out.println(emp1.getSalary());

    }
}
