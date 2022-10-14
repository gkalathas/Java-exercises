import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone= new MobilePhone("6956333554");
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scan.nextInt();
            scan.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shutting down ...");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
    private static void startPhone(){
        System.out.println("Starting phone......");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - shutdown");
        System.out.println("1 - to print contacts");
        System.out.println("2 - to add new contact");
        System.out.println("3 - to update an existing contact");
        System.out.println("4 - to remove an existing contact");
        System.out.println("5 - query if an existing contact exists");
        System.out.println("6 - to print a list of available actions");
        System.out.println("Choose your action: ");
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name=scan.nextLine();
        System.out.println("Enter new contact number: ");
        String number=scan.nextLine();
        if(mobilePhone.addNewContact(Contact.createContact(name,number))){
            System.out.println(" New contact added: name= "+ name+ ", phone number = "+number);
        }else{
            System.out.println("Cannot add, "+ name + " already on file");
        }
    }
  private static void updateContact(){
      System.out.println("Enter existing contact name: ");
      String name = scan.nextLine();
      Contact existingContactRecord=mobilePhone.queryContact(name);
      if(existingContactRecord==null){
          System.out.println("Contact not found");
          return;
      }
      System.out.println("Enter new contact name: ");
      String newName=scan.nextLine();
      System.out.println("Enter new phone number: ");
      String newNumber=scan.nextLine();
      Contact contact = new Contact(newName,newNumber);
      if(mobilePhone.updateContact(existingContactRecord,contact)){
          System.out.println("Successfully updated contact");
      }else{
          System.out.println("Error updating record");
      }
  }
    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }
    private static void searchContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }
}