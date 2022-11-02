package src.com.java.array;

public class SecondLargest02 {

    public static void main(String[] args) {

        int arr1[] =  {2,5,1,3,0};
        System.out.println("Second Largest element in the array is: "+findSecondLargestElement(arr1,arr1.length));

        int arr2[] =  {8,10,5,7,9};
        System.out.println("Second Largest element in the array is: "+findSecondLargestElement(arr2,arr2.length));

    }

    static int findSecondLargestElement(int arr[],int size) {
        if(size < 2)
            return -1;
        int max= Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if(arr[i] > secondMax && arr[i]!=max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
