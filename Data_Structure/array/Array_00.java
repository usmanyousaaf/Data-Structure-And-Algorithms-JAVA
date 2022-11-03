package array;
// MAKE  A SIMPLE ARRAY PRINT IT IN REVERSE
public class Array_00 {
    public static void main(String[] args) {
        int [] data={10,20,3,40,55,66,8,10};
        // SIMPLE ARRAY
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        for (int i=data.length-1;i>=0;i-- ){
            System.out.print(data[i]+" ");
        }

    }
}

