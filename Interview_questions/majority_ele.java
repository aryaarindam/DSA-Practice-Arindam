/*Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.*/

public class Solution {



    // MOORE'S VOTING ALGORITHM.  
    public int majorityElement(final List<Integer> A) {
        
        int n = A.size();
        int poll = 0;
        int majority_ele = -1;

        for(int i = 0 ; i < A.size() ; ++i)
        {
            if(poll == 0)
                majority_ele = A.get(i);
            
            if(majority_ele != A.get(i))
                poll--;
            
            if(majority_ele == A.get(i))
                poll++;

        }

        int cnt = 0;

        for(int i = 0 ; i < A.size() ; ++i)
        {
            if(majority_ele == A.get(i))
                cnt++;
        }

        
        return (cnt > n/2)? majority_ele: 0;

    }
}
