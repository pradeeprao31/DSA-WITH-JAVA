package pradeep;

import java.util.Scanner;
public class Bubbol{
    public static void main(String arg[]){
       
        
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

       
        int[] array = new int[size];

    
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        
        for(int i=0; i<array.length; i++){
            for(int j =i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    
                
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        System.out.print(array[i]+" ");
    }
    System.out.println();
}
}