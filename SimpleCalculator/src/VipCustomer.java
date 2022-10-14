public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;
    public VipCustomer(){
        this("default name", 9.999, "myEmail@.com");
    }
    public VipCustomer(String name, String emailAddress){
        this(name,9.9999, emailAddress);

    }
    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
