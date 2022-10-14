public class Point {
    private int x;
    private int y;
    public Point(){

    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double distance= Math.sqrt(this.x^2+ this.y^2);
        return distance;
    }
    public double distance(int x,int y){
        double distance= Math.sqrt(x^2+y^2);
        return distance;
    }
    public double  distance(Point point1, Point point2){
        double distance= Math.sqrt((point2.x-point1.x)^2+(point2.y-point1.y)^2);
        return distance;
    }
}
