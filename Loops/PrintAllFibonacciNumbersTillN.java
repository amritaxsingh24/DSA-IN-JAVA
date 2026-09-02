/*
Question
1. You have to print the first n Fibonacci numbers.
2. Take as input n, the count of Fibonacci numbers to print.
3. Print the first n Fibonacci numbers.
Input Format
A number n
Output Format
Print the first n Fibonacci numbers, each on a new line.
Constraints
* 1 <= n < 40
Sample Input
7
Sample Output
0
1
1
2
3
5
8
Explanation
The Fibonacci sequence starts with 0 and 1.
Each next number is obtained by adding the previous two numbers:
0, 1, 1, 2, 3, 5, 8, ...
For n = 7, the first 7 Fibonacci numbers are:
0, 1, 1, 2, 3, 5, 8
*/


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        for(int i = 0; i< n; i++){
            System.out.println(a);
            int c = a + b;
            a = b ;
            b = c;

        }

    }      
}
