public abstract class AbstractPerson {

    protected abstract String getGender();

    public void speak() {
        System.out.println("i am a " + getGender());
    }
}
