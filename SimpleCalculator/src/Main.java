public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(2.4);
        calculator.setSecondNumber(0.0);
        System.out.println("First number = " + calculator.getFirstNumber());
        System.out.println("Second number = "+ calculator.getSecondNumber());
        System.out.println("Multiplication =" + calculator.getMultiplicationResult());
        System.out.println("addition = "+ calculator.getAdditionResult());
        System.out.println("Division = " + calculator.getDivisionResult());
        System.out.println("Subtraction = "+ calculator.getSubtractionResult());
        Person person = new Person();
        person.setFirstName("George");
        person.setLastName("Kalathas");
        person.setAge(31);
        System.out.println("Hello "+ person.getFullName()+ " your age is "+ person.getAge()+" years old." );
        VipCustomer vipCustomer= new VipCustomer();
        System.out.println(vipCustomer.getName());
        VipCustomer person1 = new VipCustomer("Maria", "maria@gmail.com");
        System.out.println("Our new customer is "+ person1.getName()+ ". Her credit limit is "+ person1.getCreditLimit()+" and her email address is "+ person1.getEmailAddress());

    }
}

