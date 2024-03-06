package homework15;

import java.util.Scanner;
public class AnimalArray {
    public static String[] animalSpecies = {"лев", "слон", "обезьяна"};
    public static String[] animalSounds = {"рррр", "туууу", "ух - ух - ух - яаааа"};
    public static void main(String[] args) {
        printAnimalSounds();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите название животного ");
        String animal = scanner.nextLine().toLowerCase();
        findAnimalSound(animal, animalSounds, animalSpecies);
    }
    public static void printAnimalSounds() {
        for (int i = 0; i < animalSpecies.length; i++) {
            if (animalSpecies.length != animalSounds.length) {
                System.out.println("ошибка!");
            } else {
                String animal = animalSpecies[i];
                String sound = animalSounds[i];
                System.out.println(String.format("Животное " + animal + " издает звук: " + sound));
            }
        }
    }
    public static void findAnimalSound(String animal, String[] animalSounds, String[] animalSpecies) {
        for (int i = 0; i < 3; i++) {
            if (animal.equals(animalSpecies[i])) {
                String sound = animalSounds[i];
                System.out.println("Животное " + animal + " издает звук: " + sound);
                break;
            } else {
                System.out.println("Информация не найдена!");
                break;
            }
        }
    }
}



