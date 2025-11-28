import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch1 {
    public static void linear1(int a[],int key){
        int j=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==key){
                System.out.println("Elemnet found at index "+i);
                j=i;
            }
        }
        if (j == 0){
            System.out.println("Element Not Found...!");
        }
    }
    public static int linear2(int a[],int key){
        for (int i=0;i<a.length;i++){
            if (a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
    int a[]=new int[size];
    for (int i=0;i<a.length;i++){
        System.out.println("Enter the element at index "+i+": ");
        a[i]=sc.nextInt();
    }
        System.out.println("Your Array: "+Arrays.toString(a));
//        System.out.println("Your array printing using for each loop");
//    for (int i:a){
//        System.out.print(i+" ");
//    }
        System.out.println("Enter the element to search: ");
        int search=sc.nextInt();
        //LinearSearch1.linear1(a,search);
        int x=linear2(a,search);
        System.out.println("Index="+x);

    }
}
