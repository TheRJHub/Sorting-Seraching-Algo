import java.util.Arrays;
import java.util.Scanner;

public class ElementInsert {
    public static void main(String[] args) {
        int[] a={10, 20, 30, 40, 50};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter pos to insert: ");
        int pos=sc.nextInt();

        System.out.print("Element1: ");
        int e1=sc.nextInt();
        System.out.print("Ellement2: ");
        int e2=sc.nextInt();

        int[] b=new int[a.length + 2];

        for(int i=0;i<pos;i++) {
            b[i]=a[i];
        }
        b[pos]=e1;
        b[pos+1]=e2;
        for(int i=pos;i<a.length;i++) {
            b[i + 2] = a[i];
            System.out.println("After: "+Arrays.toString(b));
        }
    }
}
