/**
 * OOPSBannerApp UC4 – OOPS Banner Display Application
 * @author Developer
 * @version 4.0
 * This version stores each row of the OOPS banner inside a String array and then prints it using a loop.
 * The banner rows are created using String.join()
 **/
class OOPSBannerApp{
	public static void main(String[] args){

		//rows are stored in the String array
		String lines[]=new String[9];
		lines[0]=String.join("   ","   ***   ","   ***   ","*******","   ***** ");
		lines[1]=String.join("   "," **   ** "," **   ** ","**    *"," **      ");
		lines[2]=String.join("   ","**     **","**     **","**    *","**       ");
		lines[3]=String.join("   ","**     **","**     **","**    *"," **      ");
		lines[4]=String.join("   ","**     **","**     **","*******","   ***   ");
		lines[5]=String.join("   ","**     **","**     **","**     ","      ** ");
		lines[6]=String.join("   ","**     **","**     **","**     ","       **");
		lines[7]=String.join("   "," **   ** "," **   ** ","**     ","      ** ");
		lines[8]=String.join("   ","   ***   ","   ***   ","**     "," *****   ");
		
		//printing row by row
		for(String line:lines){
			System.out.println(line);
		}
	}
}