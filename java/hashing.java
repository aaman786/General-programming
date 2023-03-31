/* 
    arr[] -->  0    1   2   3   4   5   6   7   8   9
                    11  72  21                  18  39


    we  have to perform hashing :- f(x) = x % size of array, which is 10 
    since, f(x) = x % 10            x   -> x % 10    f(x)
                                    72                2
                                    39                9
                                    11                1
                                    18                8
                                    21                1 [hash collison as element value repeated again]  
                                    we have to put collision values in next index of array.
 */

public class hashing {

    public static void main(String[] args) {
        System.out.println(92 % 5);
    }
}
