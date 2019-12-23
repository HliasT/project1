
package project;

import java.util.ArrayList;


public class Trainer {
    private String fiName;
    private String LaName;
    private String subject;

    public Trainer(String fiName, String LaName) {
        this.fiName = fiName;
        this.LaName = LaName;
    }


    public Trainer() {
    }
    
   

    public String getFiName() {
        return fiName;
    }

    public void setFiName(String fiName) {
        this.fiName = fiName;
    }

    public String getLaName() {
        return LaName;
    }

    public void setLaName(String LaName) {
        this.LaName = LaName;
    }

    @Override
    public String toString() {
        return "Trainer{" + "fiName=" + fiName + ", LaName=" + LaName + '}'+"\n";
    }

   
    
    
    
}
