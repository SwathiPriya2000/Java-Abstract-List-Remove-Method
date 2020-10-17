// Java code to illustrate remove() method 
  
import java.util.*; 
import java.util.LinkedList; 
  
public class AbstractListRemove { 
    public static void main(String args[]) 
    { 
  
        // Creating an empty AbstractList 
        LinkedList<String>
            list = new LinkedList<String>(); 
  
        // Using add() method to add elements in the list 
        list.add("Live"); 
        list.add("Laugh"); 
        list.add("Love"); 
        list.add("100"); 
        list.add("200"); 
  
        // Output the list 
        System.out.println("AbstractList: " + list); 
  
        // Remove the head using remove() 
        list.remove(3); 
  
        // Print the final list 
        System.out.println("Final AbstractList: " + list); 
    } 
} 



