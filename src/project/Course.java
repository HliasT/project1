package project;

import java.util.ArrayList;
import java.util.Date;

class Course {

    private String title;
    private String stream;
    private String type;
    private Date start_Date;
    private Date end_Date;
    private ArrayList<Assignment> assignments;
    private ArrayList<Trainer> trainers;

    public Course(String title, String stream, String type, Date start_Date, Date end_Date, ArrayList<Assignment> assignments, ArrayList<Trainer> trainers) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_Date = start_Date;
        this.end_Date = end_Date;
        this.assignments = assignments;
        this.trainers = trainers;
    }

   

    public Course() {
    }
        
   

    public Date getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(Date start_Date) {
        this.start_Date = start_Date;
    }

    public Date getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(Date end_Date) {
        this.end_Date = end_Date;
    }

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", start_Date=" + start_Date + ", end_Date=" + end_Date + ", assignments=" + assignments + ", trainers=" + trainers + '}'+"\n";
    }

    

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    

    
    }

