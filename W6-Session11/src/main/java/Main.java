import dao.StudentDAO;
import models.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println("Session September 24th, 2024");
        Student karen = new Student("23010471", "Karen", "Fonseca", "kmryfonseca@uamv.edu.ni", "86956877");
        Student cesar = new Student("22011275", "César", "Silva", "casilva@uamv.edu.ni", "85674932");

        StudentDAO listSt = new StudentDAO();
        System.out.println("Adding students...");
        listSt.create(karen);
        listSt.create(cesar);
        System.out.println("Show list of students");
        for (Student student : listSt.showList()) {
            System.out.println(student);
        }
        System.out.println("Adding other student...");
        Student silvio = new Student("18010053", "Silvio", "Mora", "samora@uamv.edu.ni", "76274237");
        listSt.create(silvio);
        System.out.println("Editing student...");
        karen.setNames("Johan");
        karen.setSurnames("Reyes");
        listSt.update(karen);

        System.out.println("Show list of students");
        for (Student student : listSt.showList()) {
            System.out.println(student);
        }
    }
}