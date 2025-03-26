/******************************************************************
 *
 *   Malia Kuykendall / COMP 272/400C-001
 *
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

 import java.util.*;

 class ProblemSolutions {
 
     /**
      * Method: isSubset()
      *
      * Given two arrays of integers, A and B, return whether
      * array B is a subset if array A. Example:
      *      Input: [1,50,55,80,90], [55,90]
      *      Output: true
      *      Input: [1,50,55,80,90], [55,90, 99]
      *      Output: false
      *
      * The solution time complexity must NOT be worse than O(n).
      * For the solution, use a Hash Table.
      *
      * @param list1 - Input array A
      * @param list2 - input array B
      * @return      - returns boolean value B is a subset of A.
      */
 
     public boolean isSubset(int list1[], int list2[]) {
        boolean isASubSet = true;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(i, list1[i]);
        }
        // for loop, complexity of n
        for (int i = 0; i < list2.length; i++) {
            if (!map.containsValue(list2[i])) {
                isASubSet = false;
            }
        }
        // another for loop, complexity of n

        // code has 2 un-nested for-loops, meaning the complexity is n+n, or 2n,
        // this overall comes out to a complexity of O(n)
         // ADD YOU CODE HERE -- DON'T FORGET TO ADD YOR NAME AT TOP OF FILE
        
 
         return isASubSet;
     }
 
 
     /**
      * Method: findKthLargest
      *
      * Given an Array A and integer K, return the k-th maximum element in the array.
      * Example:
      *      Input: [1,7,3,10,34,5,8], 4
      *      Output: 7
      *
      * @param array - Array of integers
      * @param k     - the kth maximum element
      * @return      - the value in the array which is the kth maximum value
      */
 
     public int findKthLargest(int[] array, int k) {
        int kthLargest = 0;

        // order elements with priority queue, and reverse order
        //  since priority queue normally orders with natural ordering (lowest value to highest)
        // iterate through the queue k amount of times, return this element

        PriorityQueue<Integer> findKthQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            findKthQueue.add(array[i]);
        }
        for (int i = 0; i < k; i++){
            kthLargest = findKthQueue.poll();
        }
         // ADD YOUR CODE HERE
 
         return kthLargest;
     }
 
 
     /**
      * Method: sort2Arrays
      *
      * Given two arrays A and B with n and m integers respectively, return
      * a single array of all the elements in A and B in sorted order. Example:
      *      Input: [4,1,5], [3,2]
      *      Output: 1 2 3 4 5
      *
      * @param array1    - Input array 1
      * @param array2    - Input array 2
      * @return          - Sorted array with all elements in A and B.
      */
 
     public int[] sort2Arrays(int[] array1, int[] array2) {

        PriorityQueue<Integer> sortedQueue = new PriorityQueue<>();
        for (int i = 0; i < array1.length; i++) {
            sortedQueue.add(array1[i]);
        }
        for (int j = 0; j < array2.length; j++) {
            sortedQueue.add(array2[j]);
        }
        int[] sortedArray = new int[sortedQueue.size()];
        for (int k = 0; k < sortedArray.length; k++) {
            sortedArray[k] = sortedQueue.poll();
        }
        // create a new priority queue
        // add all elements to queue
        // then add elements from queue and remove to array, 1 by 1 to ensure correct order

         // ADD YOU CODE HERE
 
         return sortedArray;
     }
 
 }