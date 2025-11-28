public class BinarySearch {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60, 70};
            int index = binarySearch(arr, 8);
            if(index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found");
            }
        }

        public static int binarySearch(int[] arr, int key) {
            int low = 0, high = arr.length - 1;
            while(low <= high) {
                int mid = low+high/ 2;
                if(arr[mid]==key) {
                    return mid;
                } else if(arr[mid]<key) {
                    low=mid+1;
                } else{
                    high=mid-1;
                }
            }
            return -1;
        }
    }