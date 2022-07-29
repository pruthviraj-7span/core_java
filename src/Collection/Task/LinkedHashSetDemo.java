package Collection.Task;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {   
     public static void main(String args[]){    
            LinkedHashSet<String> lh=new LinkedHashSet<>(); // Implementing HashSet     
                   lh.add("A");    // Adding elements  
                   lh.add("B");      
                   lh.add("C");     
                   lh.add("D");    
                   lh.add("E");    
              Iterator<String> i=lh.iterator(); // Traversing objects    
                while(i.hasNext()) // Return true if the Scanner has another token input
                {    
                   System.out.println(i.next());// printing elements     
                }    
     }    
} 