import java.util.Random;

public class BandNameMaker {
    public static void main(String args[]) {
        String[] nouns = {
            "Noah", "the Noahs", "Barbie", "the Barbies", "the Nuclear Bomb", "the Nuclear Bombs", "Barney", "the Barnies", "Harry Potter", "the Harry Potters",
            "Homer Simpson", "the Homer Simpsons", "the Simpson", "the Simpsons", "the Beatle", "the Beatles", "the Beetle", "the Beetles", "Percy Jackson",
            "the Percy Jacksons", "My Little Pony", "my Little Ponies", "Phineas", "the Phineasi", "Ferb", "the Ferbs", "Calvin", "the Calvins", "Hobbes",
            "the Hobbes"
        };
        
        String noun1 = nouns[new Random().nextInt(nouns.length)];
        String noun2 = nouns[new Random().nextInt(nouns.length)];
        
        noun1 = noun1.substring(0, 1).toUpperCase() + noun1.substring(1);

        System.out.println(">> GENERATED BAND NAME: " + noun1 + " and " + noun2);
        System.out.println(">> ALL POSSIBILITIES: " + nouns.length*nouns.length);
        
        try {
            Runtime.getRuntime().exec("say " + noun1 + " and " + noun2);
        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println(">> TEXT-TO-SPEECH ALGORITHM NOT COOPERATING");
        }
    }
}
