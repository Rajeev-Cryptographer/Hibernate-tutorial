package io.telusko.teluscolearning;
@Embeddable
public class AlienName {
          private String fname;
          private String lname;
          private String mname;
          // Getter and Setter for fname
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    // Getter and Setter for lname
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    // Getter and Setter for mname
    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", mname='" + mname + '\'' +
                '}';
    }
  
  
  
}
