public class Television {
    private String manufacturer;
    private Dimension dimensions;
    private Resolution resolution;

    public Television(String manufacturer, Dimension dimensions, Resolution resolution) {
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.resolution = resolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
