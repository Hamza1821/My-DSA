//Q1 wap to delete a nth node from last 


class LLQ1{
    int i=0;
    int size(){
       
        return i;
    };
    class node{
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
        }
        
    }
    node head;
  //  add first
     void addFirst(String data){
        i++;
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
     }
     void addLast(String data){
        i++;
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        node ptr = head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
     }
     void printList(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
       node  ptr=head;
       while(ptr!=null){
        System.out.print(ptr.data + "->");
        ptr=ptr.next;
       }
       System.out.print("null");
       System.out.println();
     }
     void removeFirst(){
        i--;
        head=head.next;
     }
     void removeLast(){

        if(head==null){
            return;
        }
        if(head.next==null){
            i--;
            head=null;
            return;
        }
        i--;
        node seconLastNode=head;
        node lastNode =head.next;
        while(lastNode.next!=null){
          lastNode=lastNode.next;
          seconLastNode=seconLastNode.next;
        }
        seconLastNode.next=null;
        
     }


       Void DnfL(int n){
        if(head==null){
         return null;
        }
        if(n==size()){
            head=head.next;
            return null; 
        }
        int length=size();
        node curNode=head;
        int j=2;
        while(j<=length-n){
          curNode=curNode.next;
          j++;
        }
        curNode.next=curNode.next.next;
        return null;
    }

    public static void main(String[] args) {
      LLQ1 list =new LLQ1();
      list.addFirst("is");
      list.addFirst("this");
      list.addLast("a");
      list.addLast("list")  ;
      list.printList();
      list.DnfL(4);
      list.printList();
   
      
    }
}
