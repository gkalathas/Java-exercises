public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy hamburger", meat, "brown rye", price);
    }
    public void addHealthyAddition1(String healthyExtra1Name, double getHealthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price= healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, double getHealthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price= healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name!=null){
            hamburgerPrice+=this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name!=null){
            hamburgerPrice+=this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
