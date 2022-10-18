public abstract class Pen {
    private String name;

    public Pen(String name) {
        this.name = name;
    }
    public abstract void write();
    public abstract void refill();
}
