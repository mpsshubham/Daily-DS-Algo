package src.com.java.array;

public class CheckArraySortedAndRotated03 {

    public static void main(String[] args) {

        int arr1[] =  {3,4,5,1,2};
        System.out.println("Array is sorted and rotated: "+check(arr1));

        int arr2[] =  {2,1,3,4};
        System.out.println("Array is sorted and rotated: "+check(arr2));

    }

    static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n])
                count++;
        }
        return (count <= 1);
    }
}
