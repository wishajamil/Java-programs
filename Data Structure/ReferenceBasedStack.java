import java.util.ArrayList;

public class ReferenceBasedStack implements StackInterface {
	
	private ArrayList<Integer> list;
	
	public ReferenceBasedStack(){
		list = new ArrayList<>();
	}


	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) return true;
		return false;
	}


	public void push(int newItem){
		// TODO Auto-generated method stub
		list.add(0,newItem);
		
	}

	public void pop() throws StackException {
		// TODO Auto-generated method stub
		if(list.isEmpty())
			throw new StackException("The Stack is already empty !!!");
		else
			list.remove(0);
	}

	public void popAll() {
		// TODO Auto-generated method stub
		list.removeAll(list);
		
	}

	public int peek() throws StackException {
		// TODO Auto-generated method stub
		if(list.isEmpty()) throw new StackException("The Stack is empty, we can not use Peek !!!");
		else
			return list.get(0);
	}

}