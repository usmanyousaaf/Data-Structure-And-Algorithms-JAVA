package array;

import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [][] data=new  int[size][size];
        for (int i=0;i<data.length;i++){
            for (int j=0;j<data.length;j++){
                System.out.println("enter the number you enter at index  : {"+i+"}{"+j+"}");
            data[i][j]=sc.nextInt();

        }}
        for (int i=0;i<data.length;i++){
            for (int j=0;j<data.length;j++){
            System.out.print(data[i][j]+" ");
        }}
    }
}
