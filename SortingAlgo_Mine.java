import java.util.Arrays;
public class SortingAlgo_Mine {
    //Both methods are same just rewrite it for practice purpose
    public static void insertSort(int a[]){
        for (int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while (j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    public static void insert(int a[]){
        for (int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while (j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int a[]={1,23,5,111,9,2};
        System.out.println("Original Array: "+ Arrays.toString(a));

        //Sorting array using inbuild sort() method in Arrays class
//        Arrays.sort(a);
//        System.out.print(Arrays.toString(a));

        //insertSort(a);
        insert(a);
        System.out.println("Sorted  Array");
        for(int b: a){
            System.out.print(b+ " ");
        }
        //System.out.println("After Sorting the array: "+ Arrays.toString(a));
    }
}
