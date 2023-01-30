public class patterns {
    static int row = 5;

    public static void normalTriangle() {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void mirrorOfTraiangle() {

        for (int i = 1; i <= row; i++) {
            System.out.print("\t\t\t");
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 1; i < row; i++) {
            System.out.print("\t\t   ");

            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row - i; j++) {
                System.out.print("*");
            }
            System.out.println();

            /*
             * 
             **
             ***
             **** -
             ***
             **
             *
             * 
             */
        }
    }

    /* 
        **** 
         ***  
          **
           *
     */

    public static void reverseDownSideTriangle() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < j; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= row - i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    /*
            ***** 
           *****
          *****
         *****
      */

    public static void paralleloGram() {
        for (int i = 1; i < row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void hollowRectangle() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || j == 1) {
                    System.out.print("*");
                } else if (i == row || j == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // mirrorTriangle();
        // mirrorOfTraiangle();
        // reverseDownSideTriangle();
        // paralleloGram();
        hollowRectangle();
    }
}
