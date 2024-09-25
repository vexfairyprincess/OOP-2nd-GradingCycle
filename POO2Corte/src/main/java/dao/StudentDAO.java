package dao;

import interfaces.Operation;
import models.Student;

import java.util.ArrayList;

public class StudentDAO implements Operation {

    ArrayList<Student> students;

    /**
     * Add a student
     * @param object
     */


    @Override
    public void create(Object object) {
        try{
            Student student = (Student) object;
            students.add(student);
        } catch (Exception e){
            System.out.println("There was an error adding a student ");
        }
    }

    @Override
    public ArrayList<Object> read() {
        return null;
    }

    @Override
    public void update(Object object) {
        //Update student
        Student student = (Student) object;

        for(Student std: students){
            if(std.getCif().equals(student.getCif())){
                std.setName(student.getName());
                std.setLastname(student.getLastname());
                std.setEmail(student.getEmail());
                std.setCif(student.getPhoneNumber());
            }
        }
    }

    @Override
    public void delete(String id) {
        for(Student std: students){
            if(std.getCif().equals(id)){
                students.remove(std);
                return;
            }
        }
    }

    @Override
    public Object search(int id) {
        return null;
    }

    @Override
    public Object search(String value) {
        for(Student std: students){
            if(std.getCif().equals(value) || std.getName().equals(value)){
                return std;
            }
        }
        return null;
    }
}