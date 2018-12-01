}
import java.util.Scanner;

public class Eevee {//everything below defines the "Eevee" Class
	private String name;// can be typed as "String name;" if public view is okay
	private boolean shiny;
	private char gender;

	
	//Now we make the constructor
	public Eevee() {//(method)Rule is that this HAS to be the same name as the class
		name = "unpronouceable by humans but sounds like 'Eevee'.";
		shiny = false;
		gender = 'f';
		//things are now defined
	}//end of Eevee
	
	//setters & getters portion
	//only needed when I need the attributes above and they are set to "private"
	public String getName() {
		return name;
	}//this is a getter
	public void setName(String tempName) {
		name = tempName;
	}//this is a setter
	
	public boolean getShiny() {
		return shiny;
	}//this is a getter
	public void setShiny(boolean tempShiny) {
		shiny = tempShiny;
	}//this is a setter
	
	public char getGender() {
		return gender;
	}//this is a getter
	public void setGender(char tempGender) {
		gender = tempGender;
	}//this is a setter
	
	public static void main(String[] args) {
		Eevee newCatch = new Eevee ();
		System.out.println("My Eevee's name is "+ newCatch.getName());
		newCatch.setName("Destroyer of Worlds");
		System.out.println("My Eevee's new name is "+ newCatch.getName());
		Scanner scan = new Scanner (System.in);
		System.out.println("What should Eevee's new name be?");
		String tempVariable = scan.nextLine();
	newCatch.setName(tempVariable);
		System.out.println("I've re-renamed Eevee to " + newCatch.getName());
	}//end of main method
}//end of class
