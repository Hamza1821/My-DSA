// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *



import java.util.*;

class butterfly{
    public static void main(String[] args) {
        int n=4;
        //first half
        for(int i=1 ; i<=n;i++){

            //star printing 
            for(int j=1; j<=i;j++){
             System.out.print("*");
            }

            //space printing
            for(int j=1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            //star printing
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second half

        for(int i=n; i>=1;i--){

            //star printing 
            for(int j=1; j<=i;j++){
             System.out.print("*");
            }

            //space printing
            for(int j=1; j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            //star printing
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}