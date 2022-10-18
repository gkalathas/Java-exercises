public class Human extends Monkey implements Animal{
    public Human(String name) {
        super(name);
    }

    @Override
    public void jump() {
        System.out.println("A human cant jump as high as a monkey");
    }

    @Override
    public void bite() {
        System.out.println("Human in most case don't bite");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " needs too eat regularly");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " needs at least 8 hours sleep");
    }
}
