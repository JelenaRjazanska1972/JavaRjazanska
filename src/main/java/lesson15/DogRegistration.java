package lesson15;

public class DogRegistration {

    public static void main(String[] args) {
        Dog dogMops=new Dog("Hatiko", "black", "Mops",false, false);
      Dog[]registrate={dogMops};
      for (Dog dog:registrate){
          System.out.println(dog.getName());
      }

        System.out.println("Color: "  + dogMops.getColor());
    }
}
