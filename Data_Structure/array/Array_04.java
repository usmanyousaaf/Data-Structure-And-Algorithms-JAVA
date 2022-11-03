package array;

import java.util.Scanner;

public class Array_04 {
    // SEARCH A NUMBER IN A ARRAY
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size= sc.nextInt();
        int [][] data=new int[size][size];
        for (int i=0;i<data.length;i++){
            for (int j=0;j<data.length;j++){
                System.out.println("enter the data at index {"+i+"}{"+j+"}");
                data[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<data.length;i++){
            System.out.println();
            for (int j=0;j<data.length;j++){
                System.out.print(data[i][j]);
            }
        }
        System.out.println();
        System.out.println("enter the number do you want to search: ");
        int search_number=sc.nextInt();
        for (int i=0;i<data.length;i++){
            for (int j=0;j<data.length;j++){
                if(data[i][j]==search_number){
                    System.out.println("the number  "+search_number+" is place at index  {"+i+"}{"+j+"}");
                }
            }
        }

    }
}
