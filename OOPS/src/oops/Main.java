package oops;

public class Main {
    public static void main(String[] args) {

        Student Rakshit = new Student(10783, "Rakshit", 8);
//        Rakshit.rno = 10783;
//        Rakshit.name = "Rakshit";
//        Rakshit.gpa = 8;
        System.out.println("Name = " + Rakshit.name);
        System.out.println("Roll Number = 21BCE" + Rakshit.rno);
        System.out.println("GPA = " + Rakshit.gpa);

        Student Pandey = new Student(10789, "Pandey", 7);
        System.out.println("Name = " + Pandey.name);
        System.out.println("Roll Number = 21BCE" + Pandey.rno);
        System.out.println("GPA = " + Pandey.gpa);




    }
}
