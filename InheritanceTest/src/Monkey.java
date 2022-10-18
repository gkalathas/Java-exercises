public abstract class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void jump();
    public abstract void bite();
}
