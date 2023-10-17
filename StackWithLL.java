public class StackWithLL{
    class node{
      int data;
      node next;
      node(int data){
        this.data=data;
        this.next=null;      }}
        node head;

        class stack{


         void  push(int data){
          node newNode=new node(data);
          if(head==null){
            head=newNode;
          }else{
            newNode.next=head;
            head=newNode;
          } }

          int pop(){
            if(head==null){
              return -1;
            }
            int value=head.data;
            head=head.next;
            return value;
          }
          
          int peek(){
            if(head==null){
              return -1;
            }
            return head.data;
          }



        }
        


    public static void main(String[] args) {
      StackWithLL s = new StackWithLL();
       StackWithLL.stack st = s.new stack();
       st.push(0);
       st.push(3);
       st.push(87);
       st.push(73);
       st.push(348);
       st.pop();

         System.out.println( st.peek());;

    }
}