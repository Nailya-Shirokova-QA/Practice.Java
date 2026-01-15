import java.util.ArrayList;
import java.util.List;

public class Cat {
    private static String breed = "Persian";
    public String name;
    private int age;
    private List<String> friendsName = new ArrayList<>();

    public Cat() {
    }

    public Cat(String name, int age, List<String> friendsName) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
    }

    public static String getBreed() {
        return breed;
    }

    public static void setBreed(String breed) {
        Cat.breed = breed;
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

    public List<String> getFriendsName() {
        return friendsName;
    }

    public void setFriendsName(List<String> friendsName) {
        this.friendsName = friendsName;
    }

    @Override
    public String toString() {
        return "Cat" +
                "\nname='" + name + "'" +
                ", age='" + age + "'" +
                ", friendsName='" + friendsName + "'" +
                ", breed='" + breed + "'";
    }
}
