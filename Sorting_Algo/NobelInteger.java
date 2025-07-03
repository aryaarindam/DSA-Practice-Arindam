/*
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
*/

/* 
Problem Constraints

1 <= |A| <= 2*105
-108 <= A[i] <= 108
*/

Sol:

public class Solution {
    public int solve(ArrayList<Integer> A) {

            Collections.sort(A);
            Collections.reverse(A);

            int var = 0;
            
            if(A.get(0) == 0)
                return 1;
            
            for(int i = 1 ; i < A.size() ; ++i)
            {
                if(A.get(i - 1) != A.get(i))
                    var = i;
                if(var == A.get(i))
                    return 1;

            }

        return -1;

    }
}

