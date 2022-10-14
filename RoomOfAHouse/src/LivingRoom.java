public class LivingRoom {
    private Couch couch;
    private Television television;
    private CoffeTable coffeTable;
    private Chair chairs;
    private Window windows;

    public LivingRoom(Couch couch, Television television, CoffeTable coffeTable, Chair chairs, Window windows) {
        this.couch = couch;
        this.television = television;
        this.coffeTable = coffeTable;
        this.chairs = chairs;
        this.windows = windows;
    }

    public Couch getCouch() {
        return couch;
    }

    public Television getTelevision() {
        return television;
    }

    public CoffeTable getCoffeTable() {
        return coffeTable;
    }

    public Chair getChairs() {
        return chairs;
    }

    public Window getWindows() {
        return windows;
    }
}
