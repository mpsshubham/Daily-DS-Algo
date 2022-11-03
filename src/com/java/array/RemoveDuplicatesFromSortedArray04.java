package src.com.java.array;

public class RemoveDuplicatesFromSortedArray04 {

    public static void main(String[] args) {

        int arr1[] =  {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Duplicates index: "+removeDuplicates(arr1,arr1.length));

        int arr2[] =  {8,10,5,7,9};
        System.out.println("Duplicates index: "+removeDuplicates(arr2,arr2.length));

    }

    static int removeDuplicates(int nums[],int size) {
        int n = nums.length;
        if (n == 0 || n == 1)
            return n;

        int j = 0;

        for (int i = 0; i < n-1; i++)
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i];

        nums[j++] = nums[n-1];

        return j;
    }
}
