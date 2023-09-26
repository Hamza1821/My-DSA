// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int num ,positive=0,negative=0,zeros=0;
     int choice =1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter the number");
            num=sc.nextInt();
            System.out.println("do you want to continue enter 1 for yes" );
            choice= sc.nextInt();
            if(num>0){
                positive++;
            }
            else if(num==0){
                zeros++;
            }
            else{
                negative++;
            }
            
            
        }while(choice==1);
        System.out.println("positive number:"+positive);
        System.out.println("negative number:"+negative);
        System.out.println("Zeros:"+zeros);
    }
}
