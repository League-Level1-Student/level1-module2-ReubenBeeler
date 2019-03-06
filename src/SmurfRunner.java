public class SmurfRunner {
	static Smurf handySmurf = new Smurf("Handy");
	static Smurf PapaSmurf = new Smurf("Papa");
	static Smurf Smurfette = new Smurf("Smurfette");
	public static void main(String args[]) {
		System.out.println(handySmurf.getName());
		handySmurf.eat();
		
		System.out.println(PapaSmurf.getName() + " " + PapaSmurf.getHatColor() + " " + PapaSmurf.isGirlOrBoy());
		
		System.out.println("My name is Smurfette. " + Smurfette.getHatColor() + " " + Smurfette.isGirlOrBoy());
	}
}