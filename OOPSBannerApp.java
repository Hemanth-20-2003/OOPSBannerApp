/**
 * OOPSBannerApp UC5 – OOPS Banner Display Application
 * @author Developer
 * @version 5.0
 * This version directly initializes the banner lines inside a String array in single command using {}.
 * and then printing them row by row
 **/
class OOPSBannerApp{
	public static void main(String[] args){

		// Storing all banner rows directly in an array
		String lines[]={"     ***        ***     *******     ***** ",
						"   **   **    **   **   **    *   **      ",
						"  **     **  **     **  **    *  **       ",
						"  **     **  **     **  **    *   **      ",
						"  **     **  **     **  *******     ***   ",
						"  **     **  **     **  **             ** ",
						"  **     **  **     **  **              **",
						"   **   **    **   **   **             ** ",
						"     ***        ***     **        *****   "};

		// Looping through the array and printing each line
		for(String line:lines){
			System.out.println(line);
		}
	}
}