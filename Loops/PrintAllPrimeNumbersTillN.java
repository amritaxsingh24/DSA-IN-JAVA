/*
Question
1. You have to print all prime numbers between a range.
2. Take as input low, the lower limit of the range.
3. Take as input high, the higher limit of the range.
4. For the given range, print all the prime numbers between low and high, both included.
Input Format
* A number low
* A number high
Output Format
Print all prime numbers between low and high, both included.
Constraints
* 2 <= low < high < 10^6
Sample Input
6
24
Sample Output
7
11
13
17
19
23
Explanation
The numbers between 6 and 24 that are prime are:
7, 11, 13, 17, 19, 23
Therefore, these numbers are printed as the output.
*/



import java.util.*;
class Main {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int low = scn.nextInt();
     int high = scn.nextInt(); 

     for(int n = low; n <= high; n++){
        int c = 0;

        for(int i =  2; i*i <= n; i++){
            if(n % i == 0 ){
                c++;
                break; 
            }
        }

        if(c == 0 ){
        System.out.println(n);  
        }

     }

    }
}
