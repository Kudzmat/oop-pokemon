package creation;

public class Pokemon {

    protected String name; // change the name attribute in the Pokemon class to protected, it becomes accessible to subclasses like FirePokemon
    public Pokemon(String name) {
        this.name = name;   

    }

    // method for attacking
    public void attack() {
        System.out.printf("%s attacked the other Pokemon!%n", this.name);
    }

    // method for taking damage
    public void takeDamage() {
        System.out.printf("%s took damage from the attack!%n", this.name);
    }
}