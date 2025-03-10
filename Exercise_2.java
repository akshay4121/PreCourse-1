//T.C: O(1) for all operations.
//S.C: O(n) n:size of LL 
 
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root  == null){
            return true;
        }

     return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(!isEmpty()){
            StackNode newNode = new StackNode(data);
            newNode.next = root;
            root = newNode;
        }else{
            System.out.println("Stack overflow");
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 

    if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    }
       int popped = root.data;
       root = root.next;
       return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
