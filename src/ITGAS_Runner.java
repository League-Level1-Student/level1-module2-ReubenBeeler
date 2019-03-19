public class ITGAS_Runner {
	
	static Person p0 = new Person("Reuben", "Coding");
	static Person p1 = new Person("Dalton", "Running");
	static Person p2 = new Person("Vanessa", "Ultimate Frisbee");
	
	public static void main(String args[]) {
		new IntroToGettersAndSetters();
		System.out.println(p0.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}