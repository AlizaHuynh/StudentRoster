/*
 * Aliza Huynh
 * StudentRoster.java
 * This program displays the names of students
 */

package studentroster;
import java.util.Scanner;
/**
 *
 * @author alhuy9821
 */
public class StudentRoster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] studentNames;
               int numNames;
               Scanner input = new Scanner(System.in);

               System.out.print("How many students? ");
               numNames = input.nextInt();
               studentNames = new String[numNames];

               /* get student names */
               for (int i = 0; i < numNames; i++) {
                       System.out.print("Enter student name: ");
                       studentNames[i] = input.next();
               }

               /* display roster */
               System.out.println("\nStudent Roster");
               for (int i = 0; i < numNames; i++) {
                       System.out.println(studentNames[i]);
               }
               
//               String [] students;
//               students = new String [4];
//               String [] studentNames = {"student1", "student2", "student3", "student4", "student5"};
////               for(int i = 0; i < studentNames.length; i++) {
////                   System.out.println(studentNames[i]);
//               for(String element: studentNames) { // another way to create this for loop
//                   System.out.println(element);
//               
//               }
                   
//       String [] test;
//       test = new String[5];
//       String [] testName = {"test1", "test2", "test3"};
//       testName[2] = "newTestName";
//       for(int i = 0; i<testName.length; i++) {
//            System.out.println(testName[i]);        
//               
       
        }
    }

