import java.util.*;
/*
Problem Description

Given an array, arr[] of size N, the task is to find the count of array indices such that removing an
element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

1 <= N <= 105
-105 <= A[i] <= 105
Sum of all elements of A <= 109

*/

public class Special_idx {
    public int solve(ArrayList<Integer> A) {

        int n = A.size();

        int totalSum = 0;
        
        int[] evenSum = new int[A.size()];
        int[] oddSum = new int[A.size()];

        evenSum[0] = A.get(0);
        for(int i = 1 ; i < A.size() ; ++i)
        {
            if(i % 2 == 0)
                evenSum[i] = A.get(i) + evenSum[i - 1];
          else  evenSum[i] = evenSum[i - 1];
        }

        oddSum[0] = 0;
        for(int i = 1 ; i < A.size() ; ++i)
        {
            if(i % 2 != 0)
                oddSum[i] = A.get(i) + oddSum[i - 1];
           else oddSum[i] = oddSum[i - 1];
        }

        int cnt = 0;

        for(int i = 0 ; i < A.size() ; ++i)
        {
            if(i % 2 == 0){
                
                if(evenSum[i] - A.get(i) + oddSum[n - 1] - oddSum[i] == oddSum[i] + evenSum[n - 1] - evenSum[i])
                    cnt++;
            }
            if(i % 2 != 0)
            {
                if(oddSum[i] - A.get(i) + evenSum[n - 1] - evenSum[i] == evenSum[i] + oddSum[n-1] - oddSum[i])
                    cnt++;
            }
        }

        return cnt;
    }
}
