package pradeep;

import java.util.*;

public class Febonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int x= sc.nextInt();
        int a=0;
        int b=1;
        for(int i=2; i<=x; i++){
            System.out.print(a + " ");
            int c= a+b;
            a=b;
            b=c;
        }
    }
}