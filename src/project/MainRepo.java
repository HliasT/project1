package project;

import java.util.ArrayList;
import java.util.Arrays;

public class MainRepo {

    Lists l = new Lists();

    public ArrayList<Student> allStudents() {
        return l.getAllStudents();
    }

    public ArrayList<Course> allCourses() {
        return l.getAllCourses();
    }

    public ArrayList<Trainer> allTrainers() {
        return l.getAllTr();
    }

    public ArrayList<Assignment> allAssignments() {
        return l.getAla();
    }

    public void allStudentsPerCourse() {
        System.out.println("------CB10a------");
        for (int i = 0; i < l.getAllStudents().size(); i++) {
            for (int j = 0; j < l.getAllStudents().get(i).getCourses().size(); j++) {
                if (l.getAllStudents().get(i).getCourses().get(j).getTitle().equals("CB10a")) {
                    System.out.println(l.getAllStudents().get(i).getlName());
                }
            }
        }
        System.out.println(" ");
        System.out.println("------CB10b------");
        for (int i = 0; i < l.getAllStudents().size(); i++) {
            for (int j = 0; j < l.getAllStudents().get(i).getCourses().size(); j++) {
                if (l.getAllStudents().get(i).getCourses().get(j).getTitle().equals("CB10b")) {
                    System.out.println(l.getAllStudents().get(i).getlName());
                }
            }
        }
        System.out.println(" ");
        System.out.println("------CB10c------");
        for (int i = 0; i < l.getAllStudents().size(); i++) {
            for (int j = 0; j < l.getAllStudents().get(i).getCourses().size(); j++) {
                if (l.getAllStudents().get(i).getCourses().get(j).getTitle().equals("CB10c")) {
                    System.out.println(l.getAllStudents().get(i).getlName());
                }
            }
        }
        System.out.println(" ");
        System.out.println("------CB10d------");
        for (int i = 0; i < l.getAllStudents().size(); i++) {
            for (int j = 0; j < l.getAllStudents().get(i).getCourses().size(); j++) {
                if (l.getAllStudents().get(i).getCourses().get(j).getTitle().equals("CB10d")) {
                    System.out.println(l.getAllStudents().get(i).getlName());
                }
            }
        }
    }

    public void allTrainersPerCourse() {

        System.out.println("------CB10a------");
        for (int i = 0; i < l.getAllCourses().size(); i++) {
            if (l.getAllCourses().get(i).getTitle().equals("CB10a")) {
                System.out.println(l.getAllCourses().get(i).getTrainers());
            }
        }
        System.out.println(" ");
        System.out.println("------CB10b------");
        for (int i = 0; i < l.getAllCourses().size(); i++) {
            if (l.getAllCourses().get(i).getTitle().equals("CB10b")) {
                System.out.println(l.getAllCourses().get(i).getTrainers());
            }
        }
        System.out.println(" ");
        System.out.println("------CB10c------");
        for (int i = 0; i < l.getAllCourses().size(); i++) {
            if (l.getAllCourses().get(i).getTitle().equals("CB10c")) {
                System.out.println(l.getAllCourses().get(i).getTrainers());
            }
        }
        System.out.println(" ");
        System.out.println("------CB10d------");
        for (int i = 0; i < l.getAllCourses().size(); i++) {
            if (l.getAllCourses().get(i).getTitle().equals("CB10d")) {
                System.out.println(l.getAllCourses().get(i).getTrainers());
            }
        }
    }

    public void allAssignmentsPerCourse() {
        System.out.println("------CB10a------");
        for (int i = 0; i < l.getAllCourses().size(); i++) {
            if (l.getAllCourses().get(i).getTitle().equals("CB10a")) {
                System.out.println(l.getAllCourses().get(i).getAssignments());
            }
        }
        System.out.println(" ");
        System.out.println("------CB10b------");
        for (int i = 0; i < l.getAllCourses().size(); i++) {
            if (l.getAllCourses().get(i).getTitle().equals("CB10b")) {
                System.out.println(l.getAllCourses().get(i).getAssignments());
            }
        }
        System.out.println(" ");
        System.out.println("------CB10c------");
        for (int i = 0; i < l.getAllCourses().size(); i++) {
            if (l.getAllCourses().get(i).getTitle().equals("CB10c")) {
                System.out.println(l.getAllCourses().get(i).getAssignments());
            }
        }
        System.out.println("------CB10d------");
        for (int i = 0; i < l.getAllCourses().size(); i++) {
            if (l.getAllCourses().get(i).getTitle().equals("CB10d")) {
                System.out.println(l.getAllCourses().get(i).getAssignments());
            }
        }
    }

    public void getAllAssignmentsPerStudent() {
        System.out.println("------project1------");
        for (int i = 0; i < l.getAllStudents().size(); i++) {
            for (int j = 0; j < l.getAllStudents().get(i).getAssignments().size(); j++) {
                if (l.getAllStudents().get(i).getAssignments().get(j).getTitle().equals("project1")) {
                    System.out.println(l.getAllStudents().get(i).getfName() + " " + l.getAllStudents().get(i).getlName());
                }
            }
        }
        System.out.println(" ");
        System.out.println("------project2------");
        for (int i = 0; i < l.getAllStudents().size(); i++) {
            for (int j = 0; j < l.getAllStudents().get(i).getAssignments().size(); j++) {
                if (l.getAllStudents().get(i).getAssignments().get(j).getTitle().equals("project2")) {
                    System.out.println(l.getAllStudents().get(i).getfName() + " " + l.getAllStudents().get(i).getlName());
                }
            }
        }
        System.out.println(" ");
        System.out.println("------assignment1------");
        for (int i = 0; i < l.getAllStudents().size(); i++) {
            for (int j = 0; j < l.getAllStudents().get(i).getAssignments().size(); j++) {
                if (l.getAllStudents().get(i).getAssignments().get(j).getTitle().equals("assignment1")) {
                    System.out.println(l.getAllStudents().get(i).getfName() + " " + l.getAllStudents().get(i).getlName());
                }
            }
        }
        System.out.println("");
        System.out.println("------assignment2------");
        for (int i = 0; i < l.getAllStudents().size(); i++) {
            for (int j = 0; j < l.getAllStudents().get(i).getAssignments().size(); j++) {
                if (l.getAllStudents().get(i).getAssignments().get(j).getTitle().equals("assignment2")) {
                    System.out.println(l.getAllStudents().get(i).getfName() + " " + l.getAllStudents().get(i).getlName());
                }
            }
        }
        System.out.println("");
        System.out.println("------assignment3------");
        for (int i = 0; i < l.getAllStudents().size(); i++) {
            for (int j = 0; j < l.getAllStudents().get(i).getAssignments().size(); j++) {
                if (l.getAllStudents().get(i).getAssignments().get(j).getTitle().equals("assignment3")) {
                    System.out.println(l.getAllStudents().get(i).getfName() + " " + l.getAllStudents().get(i).getlName());
                }
            }
        }
    }
    
    public void studentsMultCourses(){
        for (int i = 0; i < l.getAllStudents().size(); i++) {
                if (l.getAllStudents().get(i).getCourses().size() > 1) {
                    System.out.println(l.getAllStudents().get(i).getfName() + " " + l.getAllStudents().get(i).getlName());
                    for (int j = 0; j < l.getAllStudents().get(i).getCourses().size(); j++) {
                        System.out.println(l.getAllStudents().get(i).getCourses().get(j).getTitle());
                    }
                    System.out.println("");
                }
        }
    }
}
