/*
Question-
1. You have to count the number of digits in a number.
2. Take an integer n as input, for which the digits have to be counted.
3. Print the number of digits in that number.
Input Format
n — where n is any integer.
Output Format
Print d, where d is the number of digits in the number n.
Constraints

1 <= n <= 10^9

Sample Input

65784383

Sample Output

8

Explanation
The number 65784383 contains 8 digits, so the output is:

8
*/


mport java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int c = 0;
        while(n != 0){
            n/= 10;
            c++;
        }
        System.out.println(c);  
    }      
}

