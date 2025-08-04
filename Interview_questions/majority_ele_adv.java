/*
Problem Description

You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.*/

public class Solution {
//Extended Moore's voting Algo. Here we can have at most 2 majority element which satisfies the condition element > n/3. At max we can have 2n/3 + 2

	public int repeatedNumber(final List<Integer> a) {

            int poll_1 = 0;
            int poll_2 = 0;
            int n = a.size();

            int element_1 = -1;
            int element_2 = -1;

            for(int i = 0 ; i < a.size() ; ++i){

                if(element_1 == a.get(i))
                    poll_1++;
                else if(element_2 == a.get(i))
                    poll_2++;
                else if(poll_1 == 0){
                    element_1 = a.get(i);
                    poll_1 = 1;
                }
                else if(poll_2 == 0){
                    element_2 = a.get(i);
                    poll_2 = 1;
                }
                    
                else{
                    poll_1--;
                    poll_2--;
                }
            }

            int cnt1 = 0;
            int cnt2 = 0;

            for(int var : a)
            {
                if(var == element_1) cnt1++;
                if(var == element_2) cnt2++;
            }

            if(cnt1 > n/3)
                return element_1;
        
            else if(cnt2 > n/3)
                return element_2;

        return -1;
	}
}

