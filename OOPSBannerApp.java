/**
 * OOPSBannerApp UC6 – OOPS Banner Display Application
 * @author Developer
 * @version 6.0
 * printing each letter from different methods inside a utility class.
 **/
class OOPSBannerApp{
	public static void main(String[] args){

		// Getting the pattern for each letter from the Util class
		String letterO[]=Util.printOLetter();
		String letterP[]=Util.printPLetter();
		String letterS[]=Util.printSLetter();

		// Looping through each row and printing OOPS side by side
		for(int i=0;i<9;i++){
			System.out.println(letterO[i]+"  "+letterO[i]+"  "+letterP[i]+"  "+letterS[i]);
		}
	}
}

// Utility class that contains reusable methods(Letter patterns)
class Util{

	// Method to generate the letter 'O'
	public static String[] printOLetter(){
		String lines[]={"     ***   ",
						"   **   ** ",
						"  **     **",
						"  **     **",
						"  **     **",
						"  **     **",
						"  **     **",
						"   **   ** ",
						"     ***   "};
		return lines;
	}

	// Method to generate the letter 'P'
	public static String[] printPLetter(){
		String lines[]={"*******",
						"**    *",
						"**    *",
						"**    *",
						"*******",
						"**     ",
						"**     ",
						"**     ",
						"**     "};
		return lines;
	}

	// Method to generate the letter 'S'
	public static String[] printSLetter(){
		String lines[]={"   ***** ",
						" **      ",
						"**       ",
						" **      ",
						"   ***   ",
						"      ** ",
						"       **",
						"      ** ",
						" *****   "};
		return lines;
	}
}