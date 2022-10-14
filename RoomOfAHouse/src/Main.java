public class Main {
    public static void main(String[] args) {
        Television television= new Television("Samsung", new Dimension(3.2,4.5),
                new Resolution("1440*2560"));
        LivingRoom myLivingRoom = new LivingRoom(new Couch("inArt", "4 person couch", 6),
                television, new CoffeTable("Wooden",1.80, 0.80),
                new Chair("Gaming chair"),new Window(1.20,1.80));
        System.out.println(myLivingRoom.getCouch().getManufacturer());
    }
}