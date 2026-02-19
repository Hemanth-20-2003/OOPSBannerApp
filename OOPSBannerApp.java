/**
 * OOPSBannerApp UC1 – OOPS Banner Display Application
 * @author Developer
 * @version 7.0
 * This version allows the user to dynamically prints the banner using predefined character patterns stored in a map-like structure.
 **/

class OOPSBannerApp{
	
	// inner class to store a character and its banner pattern
	static class CharacterPatternMap{
		Character ch;    // The character (like O, P, S)
		String[] pattern;   // 9-line pattern representing that character
	}
	
	// This method creates the mapping between characters and their patterns
	public static CharacterPatternMap[] createCharacterMap(){
		CharacterPatternMap[] map=new CharacterPatternMap[3];
		map[0]=new CharacterPatternMap();
		map[0].ch='O';
		map[0].pattern=new String[]{"   ***   ",
						" **   ** ",
						"**     **",
						"**     **",
						"**     **",
						"**     **",
						"**     **",
						" **   ** ",
						"   ***   "};
		map[1]=new CharacterPatternMap();
		map[1].ch='P';
		map[1].pattern=new String[]{"*******",
						"**    *",
						"**    *",
						"**    *",
						"*******",
						"**     ",
						"**     ",
						"**     ",
						"**     "};
		map[2]=new CharacterPatternMap();
		map[2].ch='S';
		map[2].pattern=new String[]{"   ***** ",
						" **      ",
						"**       ",
						" **      ",
						"   ***   ",
						"      ** ",
						"       **",
						"      ** ",
						" *****   "};
		return map;
	}
	
	// Finds and returns the pattern for a given character
	public static String[] getPattern(char ch, CharacterPatternMap[] map){
		for(CharacterPatternMap m:map){
				if(m.ch==ch){
					return m.pattern;
				}
		}
		return null;
	}
	
	// Prints the full message in banner format
	public static void printMessage(String msg, CharacterPatternMap[] charMap){
		for(int i=0;i<9;i++){
			System.out.print("  ");
			for(char k:msg.toCharArray()){
				System.out.print(getPattern(k,charMap)[i]+"  ");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args){
		CharacterPatternMap[] x=createCharacterMap();
		String j="OOPS";
		printMessage(j,x);
		
	}
}