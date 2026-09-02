/*
Question
1. You are given the marks of a student as input.
2. Display an appropriate message based on the following rules:
* If marks are above 90, print excellent.a
* If marks are above 80 and less than or equal to 90, print good.
* If marks are above 70 and less than or equal to 80, print fair.
* If marks are above 60 and less than or equal to 70, print meets expectations.
* If marks are less than or equal to 60, print below par.
Input Format
The input is handled for you and provided as the variable marks.
Output Format
Print the appropriate message according to the student's marks.
Constraints
No constraints.
Sample Input
83
Sample Output
good
Explanation
The student's marks are 83.
Since 83 is above 80 and less than or equal to 90, the appropriate message is:
good
*/


import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int marks = scn.nextInt();

       if(marks > 90){
        System.out.println("Excellent");
       }
       else if(marks > 80){
        System.out.println("Good");
       }
       else if(marks > 70){
        System.out.println("Fair");
       }
       else if(marks > 60){
        System.out.println("Meets Expecttions");
       }
       else{
        System.out.println("Below");
       }

    }      
} 
