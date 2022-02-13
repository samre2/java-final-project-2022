package packageforall;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu
{
    public static void main(String[] args)
    {

        int ch;

        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************************");
        //System.out.println("=============================================");
        System.out.println("        "+"1: Add Student Detail");
        System.out.println("        "+"2: View Student Information");
        System.out.println("        "+"3: View Marksheet of Student");
        System.out.println("        "+"4: Delete Student Details");
        System.out.println("        "+"5: Result of Class(ranksheet)");
        //System.out.println("6: Program termination");
        System.out.println("        "+"6: EXIT");
        //System.out.println("=============================================");
        System.out.println("*********************************************");

        System.out.println(" ");
        lp : while(true)
        {
            System.out.print("Make your choice: ");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.print("Add Student Detail\n");

                    try

                    {
                        data();
                    }
                    catch(IOException e) {
                        e.printStackTrace();
                    }



                    //System.out.print("\u001b[2J");
                    //System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;

                case 2:
                    System.out.print("View Student Information\n");
                    view();

                    //System.out.print("\033[H\033[2J");
                    //System.out.flush();
                    break;
                case 3:
                    System.out.print("View Marksheet of Student\n");
                    //TestStudent();
                    //System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
                case 4:
                    System.out.print("Delete Student Details \n");




                    //System.out.print("\033[H\033[2J");
                    System.out.flush();
                    break;
                case 5:
                    System.out.print("Result of Class\n");

                    //System.out.print("\033[H\033[2J");
                    //System.out.flush();
                    break;
                case 6:
                    // exiting from the switch-case as well as from the while loop using its label lp

                    break lp;
                default:
                    System.out.println("Invalid choice! Please make a valid choice. \n\n");
            }
        }

    }

    public static void data() throws IOException {
        char add='y';
        //for(int i=0;i<5;i++){
        int i=1;
        //===================ONE==================================
        Scanner s=new Scanner(System.in);
        //do{


        ArrayList<Student> st= new ArrayList<Student>();
        Student std= new Student();
        Student student1 = new Student();
        st.add(student1);
        ArrayList<SubjectMarks> subjectmarks;
        System.out.print("Enter the roll no: ");
        int roll=s.nextInt();
        st.set(i).setRoll_no(roll);
        System.out.print("Enter the First Name: ");
        String Name=s.next();
        st.get(i).setfName(Name);
        System.out.print("Enter the Last Name: ");
        String lName=s.next();
        student1.setlName(lName);

        System.out.print("Enter the Date of Birth: ");
        String dob=s.next();
        student1.setDob(dob);
        System.out.print("Enter the Gender of student: ");
        String gender=s.next();
        student1.setGender(gender);
        System.out.print("Enter the Standard: ");
        String standard=s.next();
        System.out.print(" ");
        student1.setStandard(standard);
        System.out.println("Do You Want to Add Student ?:");

        //add=s.nextChar();




        //String data = "new record";
        BufferedOutputStream out = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("record"));
            out = new BufferedOutputStream(fileOutputStream);

            out.write(Name.getBytes());
            out.write(lName.getBytes());
            out.write(dob.getBytes());
            out.write(gender.getBytes());
            out.write(standard.getBytes());


            System.out.println("Writing data into a file is success!");

        }


        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            out.close();
        }
        //}
        //	while(true);
    }
    public static void view(){
        //public static void TestStudent(){
        // Insert Details for student 1
        Student student1 = new Student();

        student1.setRoll_no(1);
        student1.setfName("RamDev");
        student1.setlName("Baba");
        student1.setDob("1995/01/01");
        student1.setGender("Male");
        student1.setStandard("SEE fail");

        // Insert marks
        ArrayList<SubjectMarks> studentMarks = new ArrayList<SubjectMarks>();
        studentMarks.add(new SubjectMarks("Maths  ", 80));
        studentMarks.add(new SubjectMarks("Science", 90));
        studentMarks.add(new SubjectMarks("English", 70));
        studentMarks.add(new SubjectMarks("Nepali ", 60));
        student1.setSubjectMarks(studentMarks);

        // Calculate total marks
        int totalMarks = 0;
        for(SubjectMarks subjectMarks : studentMarks){
            totalMarks += subjectMarks.getMarks();
        }
        student1.setTotalMarks(totalMarks);

        // Displaying student 1 details
        System.out.println("============================================");
        System.out.println();
        System.out.println("--------------Student 1 Details-------------");
        System.out.println();
        System.out.println("============================================");

        System.out.print("First Name:" + student1.getfName());
        System.out.print(" Last Name:" + student1.getlName());
        System.out.println(" Gender:" + student1.getGender());
        System.out.print(" DOB:" + student1.getDob());
        System.out.print(" Roll No:" + student1.getRoll_no());
        System.out.println(" Standard:" + student1.getStandard());
        System.out.println("--------------------------------------------");
        System.out.println("Subject Name: "+"              "+ " Marks: " );


        for(SubjectMarks subjectMarks : student1.getSubjectMarks()){
            System.out.println(subjectMarks.getSubjectName() + "                       "+subjectMarks.getMarks());

        }
        System.out.println("--------------------------------------------");
        System.out.println("Total Marks:                  " + student1.getTotalMarks());

        System.out.println("--------------------------------------------");
        System.out.println("----Student 1 Total Marks and percentage----");
        System.out.println("Total Marks: " + student1.getTotalMarks()/4+"%");
        System.out.println("============================================");
        System.out.println(" ");
    }



}


