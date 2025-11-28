package Mock;
import java.util.Arrays;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr ={10, 20, 30, 40, 50};
        int n=arr.length;

        System.out.println("og arr: "+Arrays.toString(arr));

        System.out.print("index for first element: ");
        int index=sc.nextInt();
        System.out.print("first element: ");
        int e1=sc.nextInt();
        System.out.print("second element: ");
        int e2=sc.nextInt();

        int[] newArr=new int[n + 2];

        for(int i=0;i<index;i++) {
            newArr[i] = arr[i];
        }
        newArr[index]=e1;
        newArr[index+1]=e2;

        for(int i=index;i<n;i++) {
            newArr[i + 2] = arr[i];
        }
        System.out.println("updated arr: " + Arrays.toString(newArr));
    }
}
