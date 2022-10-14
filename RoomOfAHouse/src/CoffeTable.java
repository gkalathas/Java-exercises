public class CoffeTable {
    private String type;
    private double width;
    private double height;

    public CoffeTable(String type, double width, double height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getArea(){
        return width*height;
    }
}
