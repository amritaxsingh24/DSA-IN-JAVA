/*
1. You've to display the digits of a number.
2. Take as input n, the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Input Format
n — where n is any integer.
Output Format
Print the digits of the number line-wise:

d1
d2
d3
...

where d1, d2, d3, ... are the digits of the number.
Constraints

1 <= n < 10^9

Sample Input

65784383

Sample Output

6
5
7
8
4
3
8
3

Explanation
The number is:

65784383

Its digits are:

6
5
7
8
4
3
8
3

Each digit is printed on a separate line.
*/



mport java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int c = 0;
        int temp = n;     
        while(temp  != 0){
            temp /= 10;
            c++;
        }

        int div = (int)Math.pow(10, c -1);
        while(div != 0){
            int q = n / div;
            System.out.println(q);
            n %= div;
            div /= 10;
        }
        
    }      
} 
