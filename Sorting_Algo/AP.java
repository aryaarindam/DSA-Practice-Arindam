/*Problem Description

Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.*/

Solution:

public class Solution {
    public int solve(ArrayList<Integer> A) {

            Collections.sort(A);

            int commonDiff = A.get(1) - A.get(0);
            int fst_elem = A.get(0);
            for(int i = 0 ; i < A.size() ; ++i)
            {
                if((fst_elem + (i * commonDiff)) == A.get(i))
                    continue;
                return 0;
            }

        return 1;
    }
}

