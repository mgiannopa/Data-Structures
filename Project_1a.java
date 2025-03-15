public class CircularQueue {
	

    private int data[];
    private int front;
    private int rear;
    private int element;
    
	   //-----------------------------------------------------------------
	   //  Creates an empty queue using the default capacity.
	   //-----------------------------------------------------------------
	   public CircularQueue(int k)
	   {
		  data=new int [k];
		 front=0;
		 rear=0;
		 
	   }
	   
	   public int[] getdata() {
	       return data;
			
		}

	   //-----------------------------------------------------------------
	   //  Adds the specified element to the rear of the queue, expanding
	   //  the capacity of the queue array if necessary.
	   //-----------------------------------------------------------------
	   public void enqueue (int element) {
	     
            
             if (size()==data.length-1)
            { expandCapacity();
            }
            data[rear] = element;
            rear=(rear+1)%data.length;
             }
        
	     
	   
	//  Returns the number of elements currently in this queue.
	   //-----------------------------------------------------------------
	   public int size()
	   {
		    return (data.length-front+rear)%data.length;
       }
	   
	  
	   //-----------------------------------------------------------------
	   //-----------------------------------------------------------------
	   public boolean isEmpty()
	   {
	       if (front==rear)
	       {return true;
	       }
	       else 
	        return false;
	   }
	   //  Removes the element at the front of the queue and returns a
	   //  reference to it. 
	   //-----------------------------------------------------------------
	   public int dequeue()
	   {
	       int temp;
	        if (isEmpty()) {
           
            return 0;
        }
        else {
                temp=data[front];
                data[front] = 0;
                front=(front+1)%data.length;
            }
            
        return temp;
	   }
	   
	 
	 //-----------------------------------------------------------------
	   //  Creates a new array to store the contents of the queue with
	   //  twice the capacity of the old one.
	   //-----------------------------------------------------------------
	   public void expandCapacity(){
	   int newArray[]= new int[data.length];
        int oldSize=size();
        for (int i = 0; i < data.length; i++)
            newArray[i] = data[i];
        data=new int[newArray.length*2];
        for (int i=0;i<newArray.length;i++){
            data[i]=newArray[front];
            front=(front+1)%newArray.length;
        }
        front=0;
        rear=oldSize;}
	 
        //-----------------------------------------------------------------
	    //  Returns a string representation of the table of the queue. 
	   //-----------------------------------------------------------------
	  public String queuetoString()
	  {
            String[] strArray = new String[data.length];
            String s = "";
            
 
        for (int i = 0; i < data.length; i++) {
            if (data[i]==0){
                s+="-\n";
            }
            else{
            s +=String.valueOf(data[i]+"\n");
            
        }
	  }
	    return s;
}


 public static void main (String[] args) {
        CircularQueue theQueue = new CircularQueue(5);
     
        theQueue.enqueue(10);
        theQueue.enqueue(20);
        theQueue.enqueue(30);
        theQueue.enqueue(40);
        
        theQueue.enqueue(50);
        theQueue.enqueue(60);
        theQueue.queuetoString();
        theQueue.dequeue();
        theQueue.dequeue();
        theQueue.enqueue(70);
        theQueue.enqueue(80);
        theQueue.enqueue(90);
       
        theQueue.enqueue(100);
        theQueue.queuetoString();
 }
 }