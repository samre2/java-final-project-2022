package packageforall;

import java.util.*;

class Student{

    private int roll_no;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String standard;
    private ArrayList<SubjectMarks> subjectMarks;
    private int totalMarks;

    public Student(){

    }

    public Student(int roll_no, String firstName, String lastName, String dob, String gender, ArrayList<SubjectMarks> subjectMarks, int totalMarks){

        this.roll_no = roll_no;

        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender=gender;
        this.standard = standard;
        this.subjectMarks = subjectMarks;
        this.totalMarks = totalMarks;
    }

    public Student(int roll_num, String fname1, String lname1, String dob1, String standard1) {
        this.roll_no = roll_num;
        this.firstName = fname1;
        this.lastName = lname1;
        this.dob = dob1;
        this.standard = standard1;

    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getfName() {
        return firstName;
    }

    public void setfName(String fName) {
        this.firstName = fName;
    }

    public String getlName() {
        return lastName;
    }

    public void setlName(String lName) {
        this.lastName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getGender(){
        return gender;

    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getStandard(){
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ArrayList<SubjectMarks> getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(ArrayList<SubjectMarks> subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}

