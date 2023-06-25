// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Example 2:
// Input: nums = [0]
// Output: [0]

// Constraints:
// a. 1 <= nums.length <= 10^4
// b. -2^31 <= nums[i] <= 2^31 - 1


import java.util.*;
class MoveZero{
    public static void solve(int nums[])
    {
        int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[ind]=nums[i];
                ind++;
            }
        }
        while(ind<nums.length)
        {
            nums[ind]=0;
            ind++;
        }

    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the nums");
        int size=scanner.nextInt();
        int nums[]=new int[size];
        System.out.println(("Enter the element in the nums"));
        for(int i=0;i<size;i++)
        {
            nums[i]=scanner.nextInt();
        }
        solve(nums);
        System.out.println("Array after the moving zeros");
        for(int i:nums)
        {
            System.out.print(i+" ");
        }

    }
}