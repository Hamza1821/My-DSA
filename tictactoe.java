import java.util.*;
public class tictactoe {
   public static Scanner sc=new Scanner(System.in);

    public static void gameStart(char [][] sheet){
       
        
        char player='X';
        Xturn(sheet,player,1);
     }
     public static void Xturn(char [][] sheet,char player,int times){
        if(times==10){
            printSheet(sheet);
            System.out.println("Draw");
            return;
        }
        printSheet(sheet);
        System.out.println(player +"'s turn, Enter position for "+ player);
        char ch=sc.next().charAt(0);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(sheet[i][j]== ch){
                    sheet[i][j]=player;
                    if(isWin(sheet,i,j,player)){
                    return;
                 }
                }
            }
        }
          Oturn(sheet, 'O', times+1);

        
     }
      public static void Oturn(char [][] sheet,char player,int times){
        if(times==10){
             printSheet(sheet);
            System.out.println("Draw");
            return;
        }
        printSheet(sheet);
        System.out.println(player +"'s turn, Enter position for 00"+ player);
        char ch=sc.next().charAt(0);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(sheet[i][j]== ch){
                    sheet[i][j]=player;
                    if(isWin(sheet,i,j,player)){
                    return;
                 }
                }
                 
            }
        }
        
        

        Xturn(sheet, 'X', times+1);
     }
     public static boolean isWin(char [][] sheet ,int row ,int col, char player){
         int count=0;
         // row check
         for(int i=0;i<3;i++){
            if(sheet[row][i]==player){
                count++;
            }
         }if(count==3){
            printSheet(sheet);
            System.out.println("player "+player+" wins");
            return true;
         }
         count=0;
         //column check
         for(int i=0;i<3;i++){
            if(sheet[i][col]==player){
                count++;
            }
         }if(count==3){
            printSheet(sheet);
            System.out.println("player "+player+" wins");
            return true;
         }
         count=0;
         //diagoalcheck backslash
         for(int i=0;i<3;i++){
            if(sheet[i][i]==player){
                count++;
            }
         }if(count==3){
            printSheet(sheet);
            System.out.println("player "+player+" wins");
            return true;
         }
         count=0;
         //diagonal check slash
         for(int i=0;i<3;i++){
            if(sheet[i][2-i]==player){
                count++;
            }
         }
         if(count==3){
            printSheet(sheet);
            System.out.println("player "+player+" wins");
            return true;
         }

         return false;
     }













    public static void main(String[] args) {
        char [][] sheet={{'0','1','2'},{'3','4','5'},{'6','7','8'}};
        
        gameStart(sheet);

       
    }
    public static void printSheet(char [][] sheet){
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sheet[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
