//Q2 wap to check weather it is palindrome or not

class LLQ2{
    int i=0;
    int size(){
        return i;
    }
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


     void printList(node shead){
        if(shead==null){
            System.out.println("empty list");
            return;
        }
       node  ptr=shead;
       while(ptr!=null){
        System.out.print(ptr.data + "->");
        ptr=ptr.next;
       }
       System.out.print("null");
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
     node findMiddle(){
        node hare=head;
        node turtle=head;
       while (hare!=null && hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
     }


     node reverse(node head){
        node prev=null;
        node curr=head;
        while(curr!=null){
            node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;

     }

     
     boolean isPallindrom(){
    if(head==null || head.next==null){
        return true;
    }
    node middle=findMiddle();
    node secofHalStart=reverse(middle.next);
    node firstHalfStart=head;
    while(secofHalStart!=null){
        if(firstHalfStart.data!=secofHalStart.data){
            return false;
        }
        firstHalfStart=firstHalfStart.next;
        secofHalStart=secofHalStart.next;
    }
    return true;
}


    public static void main(String[] args) {
      LLQ2 list =new LLQ2();
      list.addFirst("is");
     
      list.addFirst("this");
      list.addLast("is");
      list.addLast("this");
   
       boolean isPallindromResult= list.isPallindrom();
      if(isPallindromResult==true){
        System.out.println("list is Pallindrome");
      }else{
        System.out.println("list is not pallindrome");      }
          
    }
}
