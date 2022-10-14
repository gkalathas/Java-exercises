public class Couch {
    private String manufacturer;
    private String type;
    private int numberOfPillows;

    public Couch(String manufacturer, String type, int numberOfPillows) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.numberOfPillows = numberOfPillows;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

}
