class recursion5{
    public static int invitePeople(int n){
       if(n==0 || n<0){
        return 0;
       }
       
        if(n==2){
            return 2;

        }
        if(n==1){
            return 1;
        }
        //single invite
        int singleWays=invitePeople(n-1);
        //pair invite
        int pairWays=(n-1)*invitePeople(n-2);
        return singleWays+pairWays;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(invitePeople(n));
    }
}