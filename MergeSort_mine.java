public class MergeSort_mine {
    public static void mergeSort(int arr[],int left, int right){
       if (left<right) {
           int mid = (left + right) / 2;
           mergeSort(arr, left, mid);
           mergeSort(arr, mid + 1, right);
           merge(arr, left, mid, right);
       }
    }
    public static void merge(int a[],int left,int mid,int right){
        int n1=mid-left+1;
        int leftArr[]=new int[n1];

        int n2=right-mid;
        int rightArr[]=new int[n2];

        for (int x=0;x<n1;x++){
            leftArr[x]=a[left+x];
        }
        for (int x=0;x<n2;x++){
            rightArr[x]=a[mid+1+x];
        }


        int i=0;int j=0;int k=left;
        while (i<n1 && j<n2){
            if (leftArr[i]<=rightArr[j]){
                a[k]=leftArr[i];
                i++;
            }else{
                a[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            a[k]=leftArr[i];
            i++;
            k++;
        }
        while (j<n2){
            a[k]=rightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[]={9,3,4,5,6,4,69,79,87,45,12};
        System.out.println("Before Sorting");
        for (int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        mergeSort(arr,0, arr.length-1);
        System.out.println("After Sorting");
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
