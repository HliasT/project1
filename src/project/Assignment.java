
package project;

import java.util.Date;


public class Assignment {
    private String title;
    private String description;
    private int oralMark;
    private int totalMark;
    private Date subDateTime;

    public Assignment(String title, String description, int oralMark, int totalMark, Date subDateTime) {
        this.title = title;
        this.description = description;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
        this.subDateTime = subDateTime;
    }

    public Assignment() {
    }

   
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public Date getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(Date subDateTime) {
        this.subDateTime = subDateTime;
    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description + ", oralMark=" + oralMark + ", totalMark=" + totalMark + ", subDateTime=" + subDateTime + '}'+"\n";
    }
    
    
}
