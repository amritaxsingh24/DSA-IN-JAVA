/*
Question - 

You are given t test cases. For each test case, you are given a number n.
Your task is to check whether each given number is prime or not.
A prime number is a number greater than 1 that has exactly two factors: 1 and itself.
For each input number:
* Print prime if the number is prime.
* Print not prime if the number is not prime.
Input Format
* The first line contains an integer t, representing the number of test cases.
* The next t lines contain one integer n each.
Output Format
For each test case, print:
* prime if the number is prime.
* not prime otherwise.
Constraints
* 1 < t < 10000
* 2 < n < 10^9
Sample Input
3
7
10
13
Sample Output
prime
not prime
prime
Explanation
* 7 has only two factors: 1 and 7, so it is prime.
* 10 has factors 1, 2, 5, 10, so it is not prime.
* 13 has only two factors: 1 and 13, so it is prime.

*/


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i = 0; i < t; i++){
            int n = scn.nextInt();

            int c = 0;
            for(int div = 2; div * div <= n; div++){
                if(n % div == 0){
                    c++;
                    break;
                }
            }
            if(c == 0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }

        }
    }
}
