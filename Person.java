public class Person {
    enum Gender {
        MAN, WOMAN
    }

    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public void speak() {
        switch (gender) {
            case MAN -> System.out.println("I'am a man");
            case WOMAN -> System.out.println("I'am a woman");
        }
    }

    public static void main(String[] args) {
        Person man = new Person(Gender.MAN);
        man.speak();
        Person woman = new Person(Gender.WOMAN);
        woman.speak();
    }
}