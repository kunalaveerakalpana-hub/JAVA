Churchill was a kindhearted man, and he wanted to give a cakewalk problem to the coders present, to warm them up.
 Given an array of N integers, print the product of the numbers present in the array.
Use appropriate variable types to avoid overflow errors

Input
The first line contains T, the number of test cases.
Each test cases consists of two lines, the first line containing N, the number of elements, and the second line containing N integers.
Output
 For each test case, print the required answer in a single line.

Constraints
1 <= T <= 100
1 <= N <= 10
0 <= A[i] <= 15
Example
Input:
1
2
2 2
Output:
4
 
PROGRAM:
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();   
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            long product=1; 
            for(int j=0;j<N;j++) {
                product*=sc.nextInt();
            }
            System.out.println(product);
        }
    }

}
