
package project;

import java.util.ArrayList;




public class Student {

   
    private String fName;
    private String lName;
    private int age;
    private double tuitionFees;
    private ArrayList<Course> courses;
    private ArrayList<Assignment> assignments;
    private ArrayList<Trainer> trainers;

    public Student(String fName, String lName, int age, double tuitionFees, ArrayList<Course> courses, ArrayList<Assignment> assignments, ArrayList<Trainer> trainers) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.tuitionFees = tuitionFees;
        this.courses = courses;
        this.assignments = assignments;
        this.trainers = trainers;
    }

    public Student() {
    }

   

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }
    
    
    

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" + "fName=" + fName + ", lName=" + lName + '}'+"\n";
    }

   

   

    
    
    
      
       
  
 

 
       
    
    
}
