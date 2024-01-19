/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyecto.clases;

import java.util.ArrayList; 
import java.util.Iterator;
public class ProyectoPatrones {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>(); 
        
        for(int i=1;i<=50;i=i+5) 
        { 
            l.add(i); 
        } 
        
        Iterator<Integer> itr = l.iterator(); 
        
        System.out.println("List before removal"); 
        
        for(int i=0;i<l.size();i++) 
        { 
            System.out.print(l.get(i)+" "); 
        } 
          
        while(itr.hasNext()) 
        { 
            if(itr.next()%2==1) 
                itr.remove(); 
        } 
      
        System.out.println("\nList after removal"); 
        
        for(int i=0;i<l.size();i++) 
        { 
            System.out.print(l.get(i)+" "); 
        } 
    }
}
