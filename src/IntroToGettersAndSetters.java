public class IntroToGettersAndSetters {

class Taco {
	private String meat;
	private String sauce;
	
	void Taco(String meat, String sauce) {
		this.meat = meat;
		this.sauce = sauce;
	}
	
	void setMeat(String meat) {
		this.meat = meat;
	}
	
	void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	String getMeat() {
		return this.meat;
	}
	
	String getSauce() {
		return this.sauce;
	}
}

class Person {
	private String name;
	private String superpower;
	
	void Person(String name, String superpower) {
		this.name = name;
		this.superpower = superpower;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	
	String getName() {
		return this.name;
	}
	
	String getSuperpower() {
		return this.superpower;
	}
}

}