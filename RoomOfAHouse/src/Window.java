import java.util.Objects;

public class Window {
    private double width;
    private double height;

    public Window(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public boolean hasView(String view){
        if(Objects.equals(view, "Sea View".toLowerCase()) || Objects.equals(view, "Mountain View".toLowerCase())){
            return true;
        }else{
            return false;
        }
    }
}
