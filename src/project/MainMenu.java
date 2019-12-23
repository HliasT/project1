
package project;

import java.util.Scanner;


public class MainMenu {
    public static void createMenu(){
    
    Lists l = new Lists();
    MainRepo repo = new MainRepo();
    l.getAll();
    Boolean menu = true;
    Boolean app = true;
    while(app){
        while(menu){
         System.out.println("");
                System.out.println("");
                System.out.println("*************************************************************8*|");
                System.out.println("|                    WELCOME TO AFDEmp                         |");
                System.out.println("***************************************************************|");
                System.out.println("|                 PRESS  NUMBER FOR ACTION                     |");
                System.out.println("_____________________________________________________________  |");
                System.out.println("| 1 - DISPLAY ALL STUDENTS   || 2 - DISPLAY ALL COURSES        |");
                System.out.println("| 3 - DISPLAY ALL TRAINERS   || 4 - DISPLAY STUDENTS PER COURSE|");
                System.out.println("| 5 - DISPLAY THE ASSIGNMENTS|| 6 - DISPLAY TRAINERS PER COURSE|");
                System.out.println("| 7 - DISPLAY ALL THE ASSIGNMENTS PER COURSE                   |");
                System.out.println("| 8 - DISPLAY ALL THE ASSIGNMENTS PER STUDENT                  |");
                System.out.println("| 9 - DISPLAY STUDENTS ON MULTIPLE COURSES                     |");
                System.out.println("|10 - ADD YOUR OWN DATA      || 11 - EXIT                      |");
                System.out.println("|______________________________________________________________|");
                System.out.println("");
                System.out.println("");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println(repo.allStudents());
                System.out.println("Press 1 to returnt o menu, if you want to exit press 0");
                if(sc.hasNextInt()){
                   if(sc.nextLine() == "1"){
                    menu = true;
                 }else if(sc.nextLine() == "0"){
                     app = false;
                 }
                }else{
                    System.out.println("wrong input try again");
                    menu = false;
                }
                        
                break;
            case 2:
                System.out.println(repo.allCourses());
                break;
            case 3:
                System.out.println(repo.allTrainers());
                break;
            case 4:
                repo.allStudentsPerCourse();
                break;
            case 5:
                System.out.println(repo.allAssignments());
                break;
            case 6:
                repo.allTrainersPerCourse();
                break;
            case 7:
                repo.allAssignmentsPerCourse();
                break;
            case 8:
                repo.getAllAssignmentsPerStudent();
                break;
            case 9:
                repo.studentsMultCourses();
                break;
            case 10:
                
                break;
            case 11:
                app = false;
                menu = false;
                break;
    }
        }
    }
}
}