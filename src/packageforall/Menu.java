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
        Scanner sc =new Scanner(System.in);
        Student student1 = new Student();
        //do{


        System.out.println("Enter a roll num:");
        int roll_num = sc.nextInt();

        System.out.println("Enter a first name:");
        String fname1 =  sc.nextLine();

        System.out.println("Enter a last name:");
        String lname1 =  sc.nextLine();

        System.out.println("Enter a birth date:");
        String dob1=  sc.nextLine();

        System.out.println("Enter your gender:");
        String gender1 =  sc.nextLine();

        System.out.println("Enter a school name:");
        String school_name = sc.nextLine();

        System.out.println("In which standard this student read:");
        String standard1 = sc.nextLine();

        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student(roll_num, fname1, lname1, dob1, standard1));






        System.out.println("Do You Want to Add Student ?:");

        //add=s.nextChar();




        //String data = "new record";
        BufferedOutputStream out = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("record"));
            out = new BufferedOutputStream(fileOutputStream);

            out.write(fname1.getBytes());
            out.write(lname1.getBytes());
            out.write(dob1.getBytes());
            out.write(gender1.getBytes());
            out.write(standard1.getBytes());


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
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a roll num:");
        int roll_num = sc.nextInt();

        System.out.println("Enter a first name:");
        String fname1 =  sc.nextLine();

        System.out.println("Enter a last name:");
        String lname1 =  sc.nextLine();

        System.out.println("Enter a birth date:");
        String dob1=  sc.nextLine();

        System.out.println("Enter your gender:");
        String gender1 =  sc.nextLine();

        System.out.println("Enter a school name:");
        String school_name = sc.nextLine();

        System.out.println("In which standard this student read:");
        String standard1 = sc.nextLine();
        //-------------------------------------------------------------------------------------------------------
        // Marks user input

        System.out.println("Enter Math marks:");
        int math = sc.nextInt();

        System.out.println("Enter Science marks:");
        int science = sc.nextInt();

        System.out.println("Enter English marks");
        int english = sc.nextInt();

        System.out.println("Enter Nepali marks");
        int nepali = sc.nextInt();


        student1.setRoll_no(roll_num);
        student1.setfName(fname1);
        student1.setlName(lname1);
        student1.setDob(dob1);
        student1.setGender(gender1);
        student1.setStandard(standard1);

        // Insert marks
        ArrayList<SubjectMarks> subjectMarks = new ArrayList<SubjectMarks>();
        subjectMarks.add(new SubjectMarks("Maths  ", math));
        subjectMarks.add(new SubjectMarks("Science", science));
        subjectMarks.add(new SubjectMarks("English", english));
        subjectMarks.add(new SubjectMarks("Nepali ", nepali));
        student1.setSubjectMarks(subjectMarks);

        // Calculate total marks
        int totalMarks = 0;
        for(SubjectMarks studentMarks : subjectMarks){
            totalMarks += studentMarks.getMarks();
        }
        student1.setTotalMarks(totalMarks);

        // array list of students details in student model
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student(roll_num, fname1, lname1, dob1, standard1, subjectMarks, totalMarks));




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


        for(SubjectMarks marksOfSub : student1.getSubjectMarks()){
            System.out.println(marksOfSub.getSubjectName() + "                       "+marksOfSub.getMarks());

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


