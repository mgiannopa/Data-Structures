public class Node{
    int value;
    Node next;
    
      Node()
        {
        value=0;
        next=null;
        
        }
       Node(int value,Node next)
        {this.value=value;
        this.next=next;}
        

}
public class SingleList {
    Node head;
    int size;
	SingleList (){
	    head= new Node();
	    head=null;
	    size=0;
	    
	   
	}
	void makeEmpty(){
	    head=null;
	    size=0;

	}
	boolean isEmpty(){
	    return (head==null);
	}
	
	void insertLast (int val ) {
	    Node n = new Node(val,null);
	    n.next=null;
	    if (head==null){
	        head = n;
	    }
	    else{
	        Node curr = head;
	        while(curr.next!=null){
	            curr=curr.next;
	        }
	        curr.next=n;
	        }
	        size++;
	    }
	    
	
	void insertAfter(Node n,int val) {
	  
	   
	    Node newnode= new Node(val,n.next);
	    
	    n.next=newnode;
	    size++;
	}
	
	void deleteFirstTwo() {
	  head=head.next.next;
	  size=size-2;
	}
	
	
	void myTest(){
	    SingleList myList=new SingleList();
	    myList.makeEmpty();
	    
        myList.insertLast(10);
        myList.insertLast(12);
        myList.insertLast(18);
        myList.insertLast(22);
        myList.insertAfter(head.next,15);
	    
	}
}