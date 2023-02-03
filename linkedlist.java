public class linkedlist {
    Node head;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node a=head;
        while(a.next!=null){
            a=a.next;
        }
        a.next=newNode;
        newNode=null;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node a=head;
        while(a!=null){
            System.out.print(a.data + "->");
            a=a.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] str){
    linkedlist l1=new linkedlist();
    l1.addFirst("is");
    l1.addFirst("name");
    l1.addFirst("My");
    l1.addLast("Areeba");
    l1.printList();
    }
}
