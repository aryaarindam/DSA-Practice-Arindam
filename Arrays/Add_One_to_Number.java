/*Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.*/

/*
Input 1:

[1, 2, 3]

Output 1:

[1, 2, 4]

Input 2:

[9,9,9]

Output 2:

[1,0,0,0]

Input 3:

[0,0,1,0,2,9,9]

Output 3:

[1,0,3,0,0]

*/
public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        int starIdx = 0;
        int carry = 1;

        for(int i = 0 ; i < A.size() ; ++i)
        {
            if(A.get(i) != 0)
                break;
            starIdx++;
        }

        if(starIdx == A.size())
            return new ArrayList<>(Arrays.asList(1));

        for(int i = A.size() - 1 ; i >= starIdx ; i--){

            if(i == A.size() - 1 && (A.get(i) + 1) % 10 == 0){
                temp.add(0);
                carry = 1;
            }
            else if(A.get(i) + carry == 10)
            {
                temp.add(0);
                carry = 1;
            }
            else{
                
                temp.add(A.get(i) + carry);
                carry = 0;
            }
        }

        if(carry == 1)
            temp.add(carry);

        Collections.reverse(temp);

        return temp;   

    }
}

