package laborki.model;
/**
 * @author Rafał Sochacki 20047
 * @author Adrian Szostak 19777
 *
 * Class to build a Human
 */
public class Human {
    private int age;
    private int weight;
    private int height;
    private String name;
    private String gender;
    private int feetSize;
    private int indexNumber;

    public Human() {
    }

    public Human(int age, int weight, int height, String name, String gender, int feetSize, int indexNumber) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.gender = gender;
        this.feetSize = feetSize;
        this.indexNumber = indexNumber;
    }

    public int getFeetSize() {
        return feetSize;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFeetSize(int feetSize) {
        this.feetSize = feetSize;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

