Given a string, reverse the given string in-place and then print it.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format
Input contains a string S, consisting of ascii characters.

Constraints
1 <= len(s) <= 100

Output Format
Print the reversed string.

Inputcopy	
fdsrd

Outputcopy
drsdf

PROGRAM

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<ch.length;k++){
            System.out.print(ch[k]);
        }
    }
}