package practice_set_8;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String newname){
        name = newname;
    }

}

public class q1 {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.salary = 5000;
        emp1.setName("Rakshit Pandey");
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());

    }
}
