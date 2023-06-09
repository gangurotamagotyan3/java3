public class Person {
    enum Gender {
        MAN, WOMAN
    }

    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public void speak() {
        if (gender == Gender.MAN) {
            System.out.println("I'm a man");
        } else {
            System.out.println("I'm a woman");
        }
    }

    public static void main(String[] args) {
        Person man = new Person(Gender.MAN);
        man.speak();
        Person woman = new Person(Gender.WOMAN);
        woman.speak();
    }
}