package project;

import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static void createMenu() {
        Lists l = new Lists();
        MainRepo repo = new MainRepo();
        l.getAll();
        boolean quitTrigger = false;
        int option = printMenu();
        while (!quitTrigger) {
            switch (option) {
                case 1:
                    System.out.println(repo.allStudents());
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 2:
                    System.out.println(repo.allCourses());
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 3:
                    System.out.println(repo.allTrainers());
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 4:
                    repo.allStudentsPerCourse();
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 5:
                    System.out.println(repo.allAssignments());
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 6:
                    repo.allTrainersPerCourse();
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 7:
                    repo.allAssignmentsPerCourse();
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 8:
                    repo.getAllAssignmentsPerStudent();
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 9:
                    repo.studentsMultCourses();
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 10:
                    System.out.println("UNDER CONSTRUCTION");
                    waitBeforeMovingOn();
                    option = printMenu();
                    break;
                case 11:
                    System.out.println("THE PROGRAM HAS STOPED");
                    quitTrigger = true;
            }
        }
    }

    public static int printMenu() {
        boolean notValid = true;
        String userInput;
        int option = 1;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("***************************************************************|");
            System.out.println("|                    WELCOME TO AFDEmp                         |");
            System.out.println("***************************************************************|");
            System.out.println("|                 PRESS  NUMBER FOR ACTION                     |");
            System.out.println("_______________________________________________________________|");
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
            System.out.println("Make a choice: ");
            userInput = sc.nextLine();
            if (isValid(userInput)) {
                option = Integer.parseInt(userInput);
                notValid = false;
            }
        } while (notValid == true);
        return option;
    }

    public static boolean isValid(String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Please type an integer");
            return false;
        }
        int userChoice = Integer.parseInt(userInput);
        if (userChoice < 1 || userChoice > 11) {
            System.out.println("Choice is out of limits");
            return false;
        }
        return true;
    }

    public static void waitBeforeMovingOn() {
        System.out.println("Press something to move on");
        String justForShow = sc.nextLine();
    }
}
