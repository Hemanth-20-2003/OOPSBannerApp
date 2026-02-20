/**
 * OOPSBannerApp UC1 – OOPS Banner Display Application
 * @author Developer
 * @version 8.0
 * This version allows the user to dynamically prints the banner using HashMap Data Structure.
 **/
 
 import java.util.*;

class OOPSBannerApp{
	
	
	// This method creates the mapping between characters and their patterns using HashMap and returns it.
	public static HashMap<Character,String[]> createCharacterMap(){
		HashMap<Character,String[]> map=new HashMap<>();
		map.put('O',new String[]{"   ***   ",
						" **   ** ",
						"**     **",
						"**     **",
						"**     **",
						"**     **",
						"**     **",
						" **   ** ",
						"   ***   "});
		map.put('P',new String[]{"*******",
						"**    *",
						"**    *",
						"**    *",
						"*******",
						"**     ",
						"**     ",
						"**     ",
						"**     "});
		map.put('S',new String[]{"   ***** ",
						" **      ",
						"**       ",
						" **      ",
						"   ***   ",
						"      ** ",
						"       **",
						"      ** ",
						" *****   "});
		return map;
	}
	
	
	// Prints the full message in banner format using HashMap. Takes the message and the hashmap as input and prints the OOPS banner line by line
	public static void printMessage(String msg, HashMap<Character,String[]> charMap){
		for(int i=0;i<9;i++){
			System.out.print("  ");
			for(char k:msg.toCharArray()){
				System.out.print(charMap.get(k)[i]+"  ");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args){
		HashMap<Character,String[]> x=createCharacterMap();
		String j="OOPS";
		printMessage(j,x);
		
	}
}