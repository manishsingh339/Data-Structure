import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {    
        try{
            BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
            
            int _nobOfTestCase = Integer.parseInt(bi.readLine());                                                
            
            for(int i = 0; i < _nobOfTestCase; i++){
                int row = Integer.parseInt(bi.readLine().split("\\s")[0]);                               
              
                String[] ipGrid = new String[row];                
                
                for(int j = 0; j < row; j++){
                    ipGrid[j] = bi.readLine();                                 
                }
                
                row = Integer.parseInt(bi.readLine().split("\\s")[0]);                                
                String[] ipPtr = new String[row];
                for(int k = 0; k < row; k++){
                    ipPtr[k] = bi.readLine();                    
                }
                theGridSearch(ipGrid,ipPtr);
            }
            bi.close();
        }catch(IOException e){
            System.out.println(e);
       }
    
    }
    
    public static void theGridSearch(String[] ipGrid, String[] ipPtr){        
        int count = ipPtr.length;   
        int idex = 0;
        for(int i = 0; i < ipPtr.length; i++){                       
            for(int j = idex; j < ipGrid.length; j++){
            	if(ipGrid[j].indexOf(ipPtr[i]) != -1){            		
                    count--;
                    idex = ++j;
                   // System.out.println(ipPtr[i]+" "+j);
                    break;                                       
                }else {
                	count = ipPtr.length;
				}	            	
            }
            if(count == 0){
            	break;
            }
        }
        
        if(count == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}