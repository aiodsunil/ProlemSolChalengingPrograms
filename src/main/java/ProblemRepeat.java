//In an integer array, enter  “N” times random
// positive numbers and display which number
// has the most repeating consecutive values,
// how many times does
// it repeat and from which integer
// initiates the repetition of values.

// int [1,2,3,4,5,6,1,6]
//1 ->2

//Ex arrays:
//        [1 ,2, 2, 3, 3, 2, 5, 6]
//out put =>
//        [1, 3, 2, 2, 2, 2, 3, 2, 5, 4, 4, 4, 6, 6]


import java.util.HashMap;

public class ProblemRepeat
{
    public static void main(String[] args) {
//        int[] values ={1 ,2, 2, 3, 3, 3};
        int[] values ={1, 3, 2, 2, 2, 3, 2, 5, 4, 4, 4, 6, 6,8,8,8,8,1,1};

        int count =1;
        int numberRepeat = 0;
        int repeatedCountTemp = 1;
        for(int i = 0; i < values.length-1; i++){
           int temp =values[i];
                if ( temp==values[i+1]){
                    count++;
                }
                else {
                    if (count>repeatedCountTemp) {repeatedCountTemp=count;numberRepeat=temp;}
                    count=1;
                }
            }
        System.out.println("numberRepeat:"+numberRepeat+",repeatedCountTemp:"+repeatedCountTemp);

    }
}
