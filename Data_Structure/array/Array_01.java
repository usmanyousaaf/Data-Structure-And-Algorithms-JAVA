package array;

import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] data=new  int[size];
        for (int i=0;i<data.length;i++){
            System.out.println("enter the number you want to store at index "+i +":");
            data[i]=sc.nextInt();
        }
        for (int i=0;i<data.length;i++){
            int z=i+1;
            System.out.println("the "+z+" number is : "+data[i]);
        }
    }
}
