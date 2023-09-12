package creation;

public class FirePokemon extends Pokemon {

    // A fire Pokemon's attributes
    private String type = "fire";
    private String weakness = "water";
    private String strength = "fairy";
    private String resistance = "fire";

    
    public FirePokemon(String name) {
         // Call the constructor of the superclass (Pokemon) with the 'name' parameter.
        // You don't need to explicitly set 'type' here because it's already initialized in the superclass.
        super(name);
    }

    // a new method for elemental attacks
    public void elementAttack(String enemyType) {

        if (enemyType.equals(this.strength)) {

            System.out.printf("%s used a %s attack and it's super effective!%n", this.name, this.type);

        } 
        else if (enemyType.equals(this.resistance)) {

            System.out.printf("%s used a %s attack, it wasn't very effective.%n", this.name, this.type);

        } 
        else {
            System.out.printf("%s used a %s attack!%n", this.name, this.type);
        }
    }

    // overriding the take damage method from the parent class to make it suit a fire Pokemon
    public void takeDamage(String enemyType, String attackType) {

        if (enemyType.equals(this.weakness) && attackType.equals("element")) {

            System.out.printf("%s took damage from a %s attack, the attack was super effective!%n", this.name, this.weakness);
        }

        else if (enemyType.equals(this.resistance) && attackType.equals("element"))

        System.out.printf("%s took damage from a %s attack, the attack was not effective.%n", this.name, this.resistance);

        else {
            System.out.printf("%s took damage from the attack!%n", this.name);
        }
    }

    
}
