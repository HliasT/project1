
package project;

import java.util.ArrayList;


public class StudentsPerCourse {

    static ArrayList<Student> createListPerCoure(ArrayList<Student> allStudents, Course course1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private ArrayList<Student>students;
    private Course course;

    public StudentsPerCourse(ArrayList<Student> students, Course course) {
        this.students = students;
        this.course = course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}
