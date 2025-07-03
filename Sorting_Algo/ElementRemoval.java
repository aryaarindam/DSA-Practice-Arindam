/* Problem Description

Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.*/

Sol: 

public class Solution {
        public int solve(ArrayList<Integer> A) {

                Collections.sort(A);
                Collections.reverse(A);

                int minSum = 0;

                for(int i = 0 ; i < A.size() ; ++i)
                    minSum += (i + 1) * A.get(i);


            return minSum;
        }
}

