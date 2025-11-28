import java.util.Arrays;
public class InserttionSort {
    public static void insertionS(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] arr={5, 2, 9, 1, 5, 6};
        System.out.println("Before sort: "+Arrays.toString(arr));
        insertionS(arr);
        System.out.println("After: "+Arrays.toString(arr));
    }
}