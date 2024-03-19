package homework15;

public class ZooUtil {
private static String [] animalSpecies={"лев", "слон", "обезьяна"};
private static String[] animalSounds={"ррр","тууу","оааа"};

    public static void main(String[] args) {

String animal="лиса";
findAnimalSound(animal,animalSpecies,animalSounds);
    }

    public static void printAnimalSounds(String[]animals, String[]sounds){
        for (int i=0; i<animals.length; i++){
            String animalsString = animals[i];
            String animalSoundString = sounds[i];
            System.out.println(animalsString + " " + animalSoundString);
        }
    }
    public  static void findAnimalSound(String animal,String[]animals, String[]sounds){
        boolean found=false;
        for (int i=0; i<animal.length();i++){
            if (animal.equals(animals[i])){
                String sound = sounds[i];
                System.out.println(sound);
                found=true;
            }
        }
        if (!found){
        System.out.println("No");
    }
}}

