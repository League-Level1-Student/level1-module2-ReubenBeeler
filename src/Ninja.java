/*public class Ninja {

  //Assume the Enemy class exists and has the required methods.

     private Ninja(Enemy enemy, String alliegence) {
          this.alliegence = alliegence; 
          this.enemy = enemy;
     } 

     void sabotage() {
          infiltrate( );
          setOnFire(enemy.getLocation());
     } 


String infiltrate(String who) {
     }

     {
          Nagato nagato = Ninja("Nagato", "Nobunaga");
          Momochi momochi = Ninja("Momochi", new Enemy());
     } 
} */

public class Ninja {
	
/* Assume the Enemy class exists and has the required methods. */
	private Enemy enemy;
	private String alliegence;
	
     Ninja(Enemy enemy, String alliegence) {
          this.alliegence = alliegence; 
          this.enemy = enemy;
     } 

     void sabotage() {
          infiltrate("Someone");
          setOnFire(this.enemy.getLocation());
     } 


     String infiltrate(String who) {
	    	 Enemy eN = new Enemy("Nobunaga");
	     Ninja nagato = new Ninja(eN, "Momochi");
	     Ninja momochi = new Ninja(new Enemy("Someone"), "Nagato");
    	 	return "";
     }

} 