public class Run {
	public static void main(String[] args) {
		//create Scottie
		Character scottie = new Character("Scottie");
		
		//create Mister P
		Character misterP = new Character("Partridge");
		
		//attack Scottie
		scottie.takeDamage(misterP.getAttackPower());
		
		//attack Mister P
		misterP.takeDamage(scottie.getAttackPower());
		
		//gain experience
		scottie.gainExperience(55.0);
		misterP.gainExperience(99.0);
		
		//print state
		scottie.display();
		misterP.display();
	}
}