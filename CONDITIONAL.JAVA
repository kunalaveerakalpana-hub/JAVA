CONDITIONAL:

Alice buys a toy with a selling price of 
100
100 rupees. There is a discount of 
x
x percent on the toy. Find the amount Alice needs to pay for it.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
The first and only line of each test case contains a single integer, 
x
x — the discount on the toy.
Output Format
For each test case, output on a new line the price that Alice needs to pay.

Constraints
1≤T≤100
1≤T≤1000≤x<100
0≤x<100
Sample 1
Inputcopy	Outputcopy
4
5                 95
9                 91 
11                89
21                79

PROGRAM:

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();   
        for(int i = 0; i< T; i++){
            int x=sc.nextInt();   
            int price=100 - x;    
            System.out.println(price);
        }
      }
}