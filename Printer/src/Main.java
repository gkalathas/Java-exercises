public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        printer.printPages(40);
        printer.getPagesPrinted();
        printer.printPages(40);
        printer.getPagesPrinted();
    }
}