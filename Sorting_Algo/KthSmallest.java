/*Q4. Kth Smallest Element

Problem Description
Find the Bth smallest element in given array A .
NOTE: Users should try to solve it in less than equal to B swaps.

Example Input

Input 1:

A = [2, 1, 4, 3, 2]
B = 3
Input 2:

A = [1, 2]
B = 2

*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
       
        List<Integer> temp_list = new ArrayList<>();
        temp_list.addAll(A);

        for(int i = 0 ; i < temp_list.size() - 1 ; ++i){

            int min_value = temp_list.get(i);
            int min_index = i;

            for(int j = i + 1 ; j < temp_list.size() ; j++)
            {
                if(temp_list.get(j) < min_value){
                    min_value = temp_list.get(j);
                    min_index = j;
                }
            }

            Collections.swap(temp_list,i,min_index);
        }
        

      //  System.out.println(temp_list);

        return temp_list.get(B-1);

    }
}

