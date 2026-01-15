import java.util.List;

public class Dog {
    private static String breed = "Labrador";
    public String name;
    private int age;
    private double weight;
    private List<String> owners;

    public Dog() {
    }

    public Dog(String name, int age, double weight, List<String> owners) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.owners = owners;
    }

    public static String getBreed() {
        return breed;
    }

    public static void setBreed(String breed) {
        Dog.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        return "Dog" +
                "\nname='" + name + "'" +
                ", age='" + age + "'" +
                ", weight='" + weight + "'" +
                ", owners='" + owners + "'" +
                ", breed='" + breed + "'";
    }
}
