public class Character {
	private String name;
	private double hitPoints;
	private double defense;
	private double attackPower;
	private boolean isDefeated;
	private double experienceAtCurrentLevel;
	private int level;
	
	public Character(String name) {
		this.name = name;
		this.hitPoints = 100.0;
		this.attackPower = 25.0;
		this.defense = 20.0;
		this.isDefeated = false;
		this.level = 1;
		this.experienceAtCurrentLevel = 0.0;
	}
	
	public void takeDamage(double opponentAttackPower) {
		if (this.defense <= opponentAttackPower) {
			opponentAttackPower -= this.defense;
		}
		else {
			opponentAttackPower = 0.0;
		}
		this.hitPoints -= opponentAttackPower;
		if (this.hitPoints <= 0.0) {
			this.isDefeated = true;
		}
	}
	
	public void gainExperience(double newExperience) {
		if (newExperience >= 100.0) {
			System.out.println("Nice try...");
		}
		else {
			if (newExperience + this.experienceAtCurrentLevel >= 100) {
				this.level++;
				this.experienceAtCurrentLevel = (newExperience + this.experienceAtCurrentLevel) - 100;
			}
			else {
				this.experienceAtCurrentLevel += newExperience;
			}
		}
	}
	
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Hit Points: " + this.hitPoints);
		System.out.println("Defense: " + this.defense);
		System.out.println("Defeated: " + this.isDefeated);
		System.out.println("Current Level: " + this.level);
		System.out.println("Experience at Current Level: " + this.experienceAtCurrentLevel);
		System.out.println();
	}

	public double getAttackPower() {
		return this.attackPower;
	}

	public void setAttackPower(double attackPower) {
		this.attackPower = attackPower;
	}
} 