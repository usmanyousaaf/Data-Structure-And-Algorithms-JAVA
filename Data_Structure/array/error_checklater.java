package array;

import java.util.Scanner;

public class error_checklater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int [] a=new int [size];
        for (int i=0;i<a.length;i++){
            System.out.println("enter the number you enter at index  : "+i);
            a[i]=sc.nextInt();
        }
        System.out.println("the data you enter is : ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("do you want the list in reverse order [Y/N]");
        String choise=sc.next();

        if(choise=="Y"){
            for (int i=a.length-1;i>=0;i--){
                System.out.print(a[i]+" ");
            }
        }
        else {
            System.out.println("u r exit !!");
        }
    }
}
