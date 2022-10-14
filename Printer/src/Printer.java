public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer(int tonerLevel , boolean duplex) {
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel=-1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public boolean isDuplex(){
        System.out.println("The printer is "+ this.duplex);
        return this.duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            int newTonerLevel= this.tonerLevel+tonerAmount;
            if(newTonerLevel>0 && newTonerLevel<=100){
                return newTonerLevel;
            }else{
                return -1;
            }
        }else{
            return -1;
        }

    }
    public int printPages(int pages){
        int pagesToPrint=pages;
        if(this.duplex){
            if (pagesToPrint<=0){
                System.out.println("No copies made");
                return this.pagesPrinted;
            }else{
                pagesPrinted +=pagesToPrint/2 + pagesToPrint%2;
                System.out.println(pagesPrinted+"  copies printed and the total number of copies printed is "
                        +this.pagesPrinted);
                return this.pagesPrinted;
            }
        }else{
            if (pagesToPrint<=0){
                System.out.println("No copies made");
                return this.pagesPrinted;
            }else{
                pagesPrinted +=pagesToPrint;
                System.out.println(pagesToPrint+" of copies printed and the total number of copies printed is "
                        +this.pagesPrinted);
                return this.pagesPrinted;
            }
        }
    }

}
