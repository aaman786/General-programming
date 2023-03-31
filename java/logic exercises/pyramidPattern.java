public class pyramidPattern {

    public static void displayPyramid() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("\t   ");
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {

            for (int k = 0; k < ((5 * 2) - i + 1); k++) {
                System.out.print(" ");
            }
            for (int j = (5 - i); j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 1; j < (i * 4) + 1; j++) {
                System.out.print(" ");
            }

            // for (int k = 1; k < (i * 2); k++) {
            // System.out.print(" ");
            // }
            for (int j = (5 - i); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPyramid();
    }
}

/* 
        * 
       **
      ***
     **** 
    ****
   ***
  ** 
 *

 */