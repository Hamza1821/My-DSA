 class LL{
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
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
     }
     void addLast(String data){
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
     }
     void removeFirst(){
        head=head.next;
     }
     void removeLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        node seconLastNode=head;
        node lastNode =head.next;
        while(lastNode.next!=null){
          lastNode=lastNode.next;
          seconLastNode=seconLastNode.next;
        }
        seconLastNode.next=null;
        
     }


    public static void main(String[] args) {
      LL list =new LL();
      list.addFirst("is");
      list.addFirst("this");
      list.addLast("a");
    //  
      list.printList();
        list.removeLast();
          list.printList();
    }
}
