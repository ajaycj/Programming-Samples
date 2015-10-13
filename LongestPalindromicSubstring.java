

public class SubString {
	public static boolean isPalindrome(String chunk){
		for(int i =0 ; i< chunk.length()-1; i++){
			if(chunk.charAt(i) != chunk.charAt(chunk.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] arg){
		String args = "malayalam";
		String LongestPalindrome = null;
		int maxlength = 0;
		
		for(int i = 0; i < args.length(); i++){
			for(int j = i+1; j<args.length(); j++){
				int len  = j-i;
				String chunk = args.substring(i, j+1);
				if (isPalindrome(chunk)){
					if(len >maxlength ){
						LongestPalindrome = chunk;
						maxlength = len;
						//System.out.println("test1"+chunk);
					}
				}	
			}
		}
		System.out.println("Longest Substring is: "+LongestPalindrome +" and is of length: " +(maxlength+1));
		
	}
	
	
}
