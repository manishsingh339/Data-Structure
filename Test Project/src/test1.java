
public class test1 {
	
	public static void subStrFun(int strlen, String str, String qry){
    	String sub = "";
		for(int i = 0; i < strlen; i++ ){
			for(int j = 1; j <= strlen - i; j++ ){
	            //System.out.println(str.substring(i, i+j));
	            sub = str.substring(i, i+j);
	            if(sub.length() > 1){
	            	sub.startsWith(arg0); 
	            	sub.endsWith(suffix);
	            }
			}
		}		
	}
}
