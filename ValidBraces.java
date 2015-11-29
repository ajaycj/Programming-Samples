import java.util.*;
public class ValidBraces{
  public static void main(String[] args){
    String totest = "{[()]}";
    System.out.print(validity(totest));
  }
  
  public static boolean validity(String string){
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');
    
    Stack<Character> stack = new Stack<>();
    
    for(int i = 0; i < string.length(); i++){
    	char para = string.charAt(i);
    	if(map.keySet().contains(para)){
    		stack.push(para);
       	}
    	else if(map.values().contains(para)){
    		if(!stack.empty() && map.get(stack.peek())==para){
    			stack.pop();
    		}
    		else{
    			return false;
    		}
    		
    	}
    }
	return stack.empty();
    
  }
}
