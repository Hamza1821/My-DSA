class LLQ3{
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

    String isLoop(){
        if (head==null){
            return "no loop";
        }
        node hare=head;
        node turtle =head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                return "loop found";
            }
        }
        return "no loop";
    }
     void createLoop(){
        node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
     }


     public static void main(String[] args) {
        LLQ3 list = new LLQ3();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.addFirst("4");
        list.addFirst("5");
        list.addFirst("6");
        // list.createLoop();
        System.out.println(list.isLoop());;

        
     }
}