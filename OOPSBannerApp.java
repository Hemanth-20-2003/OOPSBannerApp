/**
 * OOPSBannerApp UC3 – OOPS Banner Display Application
 * @author Developer
 * @version 3.0
 * by using String.join() to align and format each row.
 * Instead of manually spacing everywhere.
 **/
class OOPSBannerApp{
	public static void main(String[] args){
		
		// Printing the banner row by row
		System.out.println(String.join("   ","   ***   ","   ***   ","*******","   ***** "));
		System.out.println(String.join("   "," **   ** "," **   ** ","**    *"," **      "));
		System.out.println(String.join("   ","**     **","**     **","**    *","**       "));
		System.out.println(String.join("   ","**     **","**     **","**    *"," **      "));
		System.out.println(String.join("   ","**     **","**     **","*******","   ***   "));
		System.out.println(String.join("   ","**     **","**     **","**     ","      ** "));
		System.out.println(String.join("   ","**     **","**     **","**     ","       **"));
		System.out.println(String.join("   "," **   ** "," **   ** ","**     ","      ** "));
		System.out.println(String.join("   ","   ***   ","   ***   ","**     "," *****   "));
	}
}