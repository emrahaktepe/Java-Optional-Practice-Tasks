package Optional_Tasks;

public class Loops_04_RemoveDuplicates {

	/*
	 Write a program that can remove the duplicates from String
			Ex:
			
			str = "AAABBBCC"
			output: "ABC"
	 */
	
	public static void main(String[] args) {
		
		String str = "AAABBBCC";
		String strNew = "";
		int i = 0;
		
		while(i <= str.length()-1) {
				if (!strNew.contains(str.substring(i, i+1))) {
			strNew += str.substring(i, i+1);
		}
				i++;
	}
		System.out.println(strNew);
		
		
		
		
//		if (!strNew.contains("A")) {
//			strNew += str.charAt(0);
//		}
//		System.out.println(strNew);
	}
	
	
}
