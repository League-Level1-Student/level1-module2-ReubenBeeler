public class SeaCreatureRunner {
	static SeaCreature SB = new SeaCreature("Spongebob");
	static SeaCreature PT = new SeaCreature("Patrick");
	static SeaCreature SW = new SeaCreature("Squidward");
	
	public static void main(String args[]) {
		SB.eat();
		SB.laugh();
		
		System.out.println(PT.getName());
		PT.eat();
		PT.laugh();
		
		System.out.println(SW.getName());
		SW.eat();
		SW.laugh();
	}
}