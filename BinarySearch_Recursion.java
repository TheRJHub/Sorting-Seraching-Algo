public class BinarySearch_Recursion {
    public static int Binary1(int a[],int left,int right,int key){
        if (left<=right){
            int mid=(left+right)/2;
            if (a[mid]==key){
                return mid;
            } else if (a[mid]>key) {
                return Binary1(a,left,mid-1,key);
            }
            else if (a[mid]<key){
                return Binary1(a,mid+1,right,key);
            }
        }
        return -1;
    }
    public static void Binary2(int a[],int key){
        int left=0;int right=a.length-1;
        while (left<=right){
            int mid=(left+right)/2;
                if (a[mid]==key){
                    System.out.println("Element found at index "+mid);
                    break;
                }else if(a[mid]>key){
                    right=mid-1;
                }else if (a[mid]<key){
                    left=mid+1;
                }
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,45,5,7,450};
        int x=Binary1(a,0,6,450);
        if (x==-1){
            System.out.println("Elemet not found...!");
        }else{
            System.out.println("Elemet found at index "+x);
        }
    }
}
