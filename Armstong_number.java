package pradeep;

import java.util.Scanner;

public class Armstong_number{
    public static void main (String[] args) {
        int n,c,rem,arm=0;
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.println("The given number is Armstrong");
        }
        else{
            System.out.println("the give number is not armstrong");
        }
    }
}