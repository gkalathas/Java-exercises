public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double amountToDeposit){
        this.accountBalance+=amountToDeposit;

    }
    public void withdraw(double amountToWithdraw){
        if(this.accountBalance<amountToWithdraw){
            System.out.println("insufficient funds");
        }else{
            this.accountBalance-=amountToWithdraw;
            System.out.println("Withdrawal successful. Please collect your money");
            System.out.println("New balance: "+this.accountBalance+" Euro");

        }
    }
}
