package LeetCodePractice;

public class LeetCodeArrays {

    /**
     * Q1. Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
     *
     * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
     *
     * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
     * Return k.
     *
     */
        public int removeDuplicates(int[] nums) {

            //array is sorted in ascending order
            // arr[] = {1,1,2}
            //2,2,3,3,4,4,4,5,5}
            //skip 1st elemnt from comparasion
            //skip first position from adding elements
            //if current element is equal to previous element bypass and skip to next
            //until next element is not equal to previous
            //add each unique element in new array
            // Step1 - create new array of size of nums
            //step2 - create counter/2nd pointer to track number of unique elements.
            //increment counter each time element is added to new array

            int[] uniqueElementsArray = new int[nums.length];
            int numberOfUniqueElements = 1;

            for(int i =1; i<nums.length; i++){
                if(nums[i] != nums[i-1]){
                    nums[numberOfUniqueElements] = nums[i];
                    numberOfUniqueElements++;
                }

            }

            return numberOfUniqueElements;
        }


    /**
     *
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     * Explanation:
     * The element 1 occurs at the indices 0 and 3.
     */


    public boolean containsDuplicate(int[] nums) {
        //for array  nums = [1,2,3,1]
        //Pick 1st element and traverse array to compare it with each element
        //If match found return true
        //else pick next element and travere it through to compare
        // at position i-1 if no match found return false

        for(int i=0; i<nums.length-1; i++){
            for(int j= i+1; i<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }


    public void rotate(int[] nums, int k) {
        /**
         Given an integer array nums, rotate the array to the right by k steps, where k is
         non-negative.

         Input: nums = [1,2,3,4,5,6,7], k = 3
         Output: [5,6,7,1,2,3,4]

         Use modulus % operator for cyclic array
         check if k is greater than array size (nums.length)
         if nums.length % k == 0 {do not rotate}
         else { rotate }
         (current pos + K) % k = new position
        */

        int len = nums.length;
        k = k % len;
        int pos = 0;
        int[] resultArray = new int[len];


            for(int i =0; i<len; i++){
               pos = (i + k)% len;
               //pos = 0 + 3 % 7 = 3
               resultArray[pos] = nums[i];

            }

            System.arraycopy(resultArray,0,nums,0,len);
    }


}


