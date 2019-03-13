public class TeaMakerRunner {
	
	static TeaBag bag0 = new TeaBag("Green");
	static Kettle pot0 = new Kettle();
	static Cup cup0 = new Cup();
	
	public static void main(String args[]) {
		new TeaMaker();
		pot0.boil();
		cup0.makeTea(bag0, pot0.getWater());
	}
}