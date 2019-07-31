public class StackArrayBased implements StackInterface {
	final int MAX = 100;
	private int top ;
	private int[] array ;
	
	
	public StackArrayBased(){
		top=-1;
		array= new int[MAX];
		
	}
	public Boolean isEmpty(){
		if(top==-1) return true;
		return false;
	}

	public void push(int newItem) throws StackException{
		if(top<MAX){ 
			top+=1;
			array[top] = newItem;
			
		}
		else{
			throw new StackException("Stack is full");
		}
	}

	public void pop() throws StackException{
		if(!isEmpty()){ 
			top-=1;
		}
		else{
			throw new StackException("Stack is full");
		}
	}
	
	public void popAll(){
		if(!isEmpty()){ 
			top-=1;
		}
		
	}

	public int peek()throws StackException{
		if(!isEmpty()){ 
			return array[top];
		}
		else{
			throw new StackException("Stack is Empty!!");
		}
		
	}
   