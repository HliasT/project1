
package project;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Lists {
      
  private static ArrayList<Assignment> ala = new ArrayList<>();
  private static ArrayList<Trainer> allTr = new ArrayList<>();
  private static ArrayList<Course> allCourses = new ArrayList<>();
  private static ArrayList<Student> allStudents = new ArrayList<>();

    public ArrayList<Student> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(ArrayList<Student> allStudents) {
        this.allStudents = allStudents;
    }

    public ArrayList<Assignment> getAla() {
        return ala;
    }

    public ArrayList<Course> getAllCourses() {
        return allCourses;
    }

    public void setAllCourses(ArrayList<Course> allCourses) {
        this.allCourses = allCourses;
    }

    public void setAla(ArrayList<Assignment> ala) {
        this.ala = ala;
    }

    public ArrayList<Trainer> getAllTr() {
        return allTr;
    }

    public void setAllTr(ArrayList<Trainer> allTr) {
        this.allTr = allTr;
    }
     
    public void getAll(){
        Assignment assignment1 = new Assignment("project1","desc",6,10,new Date("10/10/2020"));
        Assignment assignment2 = new Assignment("project2","desc",6,10,new Date("10/10/2020"));
        Assignment assignment3 = new Assignment("assignment1","desc",5,10,new Date("10/10/2020"));
        Assignment assignment4 = new Assignment("assignment2","desc",5,10,new Date("10/10/2020"));
        Assignment assignment5 = new Assignment("assignment3","desc",5,10,new Date("10/10/2020"));
        
        ala.add(assignment1);
        ala.add(assignment2);
        ala.add(assignment3);
        ala.add(assignment4);
        ala.add(assignment5);
        
        
       Trainer tr01 = new Trainer("Tasos","Xatzigiovanis");
       Trainer tr02 = new Trainer("Hlias","Xatzitheodoridis");
       Trainer tr03 = new Trainer("Fanis","Mavromatis");
       Trainer tr04 = new Trainer("Konstaninos","Kotsaris");
       Trainer tr05 = new Trainer("Argyris","Kampetsis");
       
       allTr.add(tr01);
       allTr.add(tr02);
       allTr.add(tr03);
       allTr.add(tr04);
       allTr.add(tr05);
        
       Course CB10a = new Course("CB10a","Java","fullTime",new Date("10/10/2020"),new Date("10/10/2020"),ala,new ArrayList<>(Arrays.asList(allTr.get(0))));
       Course CB10b = new Course("CB10b","Java","partTime",new Date("10/10/2020"),new Date("10/10/2020"),new ArrayList<>(Arrays.asList(ala.get(0),ala.get(1),ala.get(2))),new ArrayList<>(Arrays.asList(allTr.get(1),allTr.get(3))));
       Course CB10c = new Course("CB10c","C#","fullTime",new Date("10/10/2020"),new Date("10/10/2020"),ala,new ArrayList<>(Arrays.asList(allTr.get(2))));
       Course CB10d = new Course("CB10d","C#","partTime",new Date("10/10/2020"),new Date("10/10/2020"),new ArrayList<>(Arrays.asList(ala.get(0),ala.get(4),ala.get(1))),new ArrayList<>(Arrays.asList(allTr.get(3),allTr.get(1))));
       
       allCourses.add(CB10a);
       allCourses.add(CB10b);
       allCourses.add(CB10c);
       allCourses.add(CB10d);
       
       
       Student st01 = new Student("Georgios","Papagiannhs",19,2000,new ArrayList<>(Arrays.asList(allCourses.get(0),allCourses.get(1))),new ArrayList<>(Arrays.asList(ala.get(0))),new ArrayList<>(Arrays.asList(allTr.get(0))));
       Student st02 = new Student("Iwnnhs","Papapetrou",29,2500,new ArrayList<>(Arrays.asList(allCourses.get(0),allCourses.get(2))),new ArrayList<>(Arrays.asList(ala.get(0))),new ArrayList<>(Arrays.asList(allTr.get(0))));
       Student st03 = new Student("Nikos","Kalathis",39,2000,new ArrayList<>(Arrays.asList(allCourses.get(0))),new ArrayList<>(Arrays.asList(ala.get(0))),new ArrayList<>(Arrays.asList(allTr.get(0))));
      Student st04 = new Student("Deshaun","Tomas",22,2500,new ArrayList<>(Arrays.asList(allCourses.get(0))),new ArrayList<>(Arrays.asList(ala.get(0))),new ArrayList<>(Arrays.asList(allTr.get(0))));
      Student st05 = new Student("Jimmer","Fredette",32,2000,new ArrayList<>(Arrays.asList(allCourses.get(0))),new ArrayList<>(Arrays.asList(ala.get(0))),new ArrayList<>(Arrays.asList(allTr.get(0))));
       Student st06 = new Student("Jacob","Wiley",24,2500,new ArrayList<>(Arrays.asList(allCourses.get(1))),new ArrayList<>(Arrays.asList(ala.get(1))),new ArrayList<>(Arrays.asList(allTr.get(1))));
      Student st07 = new Student("Dinos","Mitoglou",34,2000,new ArrayList<>(Arrays.asList(allCourses.get(1))),new ArrayList<>(Arrays.asList(ala.get(1))),new ArrayList<>(Arrays.asList(allTr.get(1))));
      Student st08 = new Student("Wesley","Jhonson",25,2500,new ArrayList<>(Arrays.asList(allCourses.get(1))),new ArrayList<>(Arrays.asList(ala.get(1))),new ArrayList<>(Arrays.asList(allTr.get(1))));
       Student st09 = new Student("Nikos","Pappas",35,2000,new ArrayList<>(Arrays.asList(allCourses.get(1))),new ArrayList<>(Arrays.asList(ala.get(1))),new ArrayList<>(Arrays.asList(allTr.get(1))));
       Student st10 = new Student("Tyrese","Rice",26,2200,new ArrayList<>(Arrays.asList(allCourses.get(1))),new ArrayList<>(Arrays.asList(ala.get(1))),new ArrayList<>(Arrays.asList(allTr.get(1))));
       Student st11 = new Student("Ian","Vougioukas",36,2000,new ArrayList<>(Arrays.asList(allCourses.get(2))),new ArrayList<>(Arrays.asList(ala.get(2))),new ArrayList<>(Arrays.asList(allTr.get(1))));
       Student st12 = new Student("Ben","Bentil",37,2400,new ArrayList<>(Arrays.asList(allCourses.get(2))),new ArrayList<>(Arrays.asList(ala.get(2))),new ArrayList<>(Arrays.asList(allTr.get(2))));
       Student st13 = new Student("Rion","Brown",38,2000,new ArrayList<>(Arrays.asList(allCourses.get(2))),new ArrayList<>(Arrays.asList(ala.get(2))),new ArrayList<>(Arrays.asList(allTr.get(2))));
       Student st14 = new Student("Kwstas","Papadakis",28,2100,new ArrayList<>(Arrays.asList(allCourses.get(2))),new ArrayList<>(Arrays.asList(ala.get(2))),new ArrayList<>(Arrays.asList(allTr.get(2))));
       Student st15 = new Student("Iwannis","Athinaiou",48,2000,new ArrayList<>(Arrays.asList(allCourses.get(2))),new ArrayList<>(Arrays.asList(ala.get(3))),new ArrayList<>(Arrays.asList(allTr.get(2))));
       Student st16 = new Student("Sokraths","Dioudhs",29,2500,new ArrayList<>(Arrays.asList(allCourses.get(3))),new ArrayList<>(Arrays.asList(ala.get(3))),new ArrayList<>(Arrays.asList(allTr.get(3))));
       Student st17 = new Student("Dimitris","Kolovetsios",39,2200,new ArrayList<>(Arrays.asList(allCourses.get(3))),new ArrayList<>(Arrays.asList(ala.get(3))),new ArrayList<>(Arrays.asList(allTr.get(3))));
      Student st18 = new Student("Dimitris","Kolovos",49,2000,new ArrayList<>(Arrays.asList(allCourses.get(3),allCourses.get(2))),new ArrayList<>(Arrays.asList(ala.get(3))),new ArrayList<>(Arrays.asList(allTr.get(3))));
      Student st19 = new Student("Xristos","Donis",21,2500,new ArrayList<>(Arrays.asList(allCourses.get(3))),new ArrayList<>(Arrays.asList(ala.get(4))),new ArrayList<>(Arrays.asList(allTr.get(3))));
       Student st20 = new Student("Giannis","Mpouzoukis",19,2200,new ArrayList<>(Arrays.asList(allCourses.get(3))),new ArrayList<>(Arrays.asList(ala.get(4))),new ArrayList<>(Arrays.asList(allTr.get(3)))); 
        
       
         allStudents.add(st01);
       allStudents.add(st02);
       allStudents.add(st03);
       allStudents.add(st04);
       allStudents.add(st05);
       allStudents.add(st06);
       allStudents.add(st07);
       allStudents.add(st08);
       allStudents.add(st09);
       allStudents.add(st10);
       allStudents.add(st11);
       allStudents.add(st12);
       allStudents.add(st13);
       allStudents.add(st14);
       allStudents.add(st15);
       allStudents.add(st16);
       allStudents.add(st17);
       allStudents.add(st18);
       allStudents.add(st19);
       allStudents.add(st20);
    }

    @Override
    public String toString() {
        return "Lists{" + "ala=" + ala + ", allTr=" + allTr + ", allCourses=" + allCourses + '}';
    }
        
}
