import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Cat ===");
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("Before nullify:");
        System.out.println(cat);

        ObjectNullifier.nullifyObject(cat);
        System.out.println("\nAfter nullify:");
        System.out.println(cat);

        System.out.println("\n=== Static field should be null ===");
        System.out.println("Cat breed: " + Cat.getBreed());

        System.out.println("\n=== Testing Dog ===");
        Dog dog = new Dog("Sharik", 5, 12.5, new ArrayList<>(Arrays.asList("Ivan", "Maria")));
        System.out.println("Before nullify:");
        System.out.println(dog);

        ObjectNullifier.nullifyObject(dog);
        System.out.
                println("\nAfter nullify:");
        System.out.println(dog);

        System.out.println("\n=== Static field should be null ===");
        System.out.println("Dog breed: " + Dog.getBreed());

        System.out.println("\n=== Primitive fields remain ===");
        System.out.println("Cat age: " + cat.getAge());
        System.out.println("Dog age: " + dog.getAge());
        System.out.println("Dog weight: " + dog.getWeight());
    }
}
