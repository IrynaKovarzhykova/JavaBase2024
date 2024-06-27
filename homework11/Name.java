package homework11;

public class Name {
    public static void main(String[] args) {

        Person person1 = new Person("John", 30, "Engineer");
        Person person2 = new Person("Mary", 25, "Teacher");
        Person person3 = new Person("Bob", 35, "Doctor");

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();


        Person person4 = new Person("Alice", 28, "Architect");
        person4.printInfo();


        person4.setProfession("Designer");


        System.out.println("After updating profession:");
        person4.printInfo();
    }
}


class Person {
    private String name;
    private int age;
    private String profession;


    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }


    public void setProfession(String profession) {
        this.profession = profession;
    }


    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Profession: " + profession);
    }
}