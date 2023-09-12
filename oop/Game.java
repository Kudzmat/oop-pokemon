
import creation.*;

public class Game {

    public static void main(String[] args) {
        
        // creating a new fire Pokemon
        FirePokemon firePoke = new FirePokemon("Charizard");

        // normal attack
        firePoke.attack();

        // elemntal attack to fairy Pokemon
        firePoke.elementAttack("fairy");

        // elemental damage from fire Pokemon
        firePoke.takeDamage("fire", "element");

        // element attack to water Pokemon
        firePoke.takeDamage("water", "element");

        // normal attack from water Pokemon
        firePoke.takeDamage("water", "normal");
        
        
    }
    
}
