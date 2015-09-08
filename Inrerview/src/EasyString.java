
public class EasyString {

	public static void main(String[] args) {
		String _ipStr = "abcabc";
		easyString(_ipStr);

	}
	
	public static void easyString(String str){
		int len = str.length(), count = 0;
		String opStr = "";
		boolean bool = false;
		
		for(int i = 1; i < len/2; i++){
			if(2*i < len){
				System.out.println(i+" "+i+" "+(len-2*i));
				opStr= str.substring(0, i)+str.substring(i, 2*i)+str.substring(2*i); // YYW
				/*if( str.substring(0, i).equals(str.substring(i, 2*i)) ){
					
				}*/
				
				System.out.println(opStr);
				bool = str.equals(opStr);
				if(bool == true){
					count++;
				}				
			}
		}
       System.out.println(count);
	}
}
