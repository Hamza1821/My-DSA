import java.util.ArrayList;

class recursion6 {
   public static void printSubset(ArrayList<Integer> subset){
    for(int i =0 ; i<subset.size();i++){
        System.out.print(subset.get(i)+" ");

    }System.out.println();
   }
    public static void subSet(int n,ArrayList<Integer> subset){
        if (n==0){
            printSubset(subset);
            return;
        }
        //add hoga 
        subset.add(n);
        subSet(n-1, subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        subSet(n-1, subset);
       

    }
    public static void main(String[] args) {
        int n= 3;
        ArrayList<Integer> subset =new ArrayList<>();
        subSet(n, subset);
    }
    
}
