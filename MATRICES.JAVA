Given a matrix of size N x M, print row-wise sum, separated by a newline.
Note: Try to solve this without declaring/storing the matrix.

Input Format

First line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.

Constraints

1 <= N, M <= 100
-106 <= ar[i] <= 106

Output Format

Print row-wise sum of the matrix, separated by a newline.

INPUT	
2 3
5 -1 3
19 8 -5
OUTPUT
7
22

PROGRAM

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=0;j<M;j++){
                sum+=sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}