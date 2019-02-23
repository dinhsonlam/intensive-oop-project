package book;

import java.util.Scanner;

public class schoolBook extends bookDetail {

    private String status;
    private int number;

    public schoolBook(int bookID, String title, String author) {
        super(bookID, title, author);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String bookStatus() {
        switch (number) {
            case 0:
                this.status = "new";
                break;

            case 1:
                this.status = "old";
                break;

            default:
                break;
        }
        return this.status;
    }

    @Override
    public void addBook() {
        super.addBook();
        System.out.println("Enter status of book: [0: new / 1: old]");
        Scanner input2 = new Scanner(System.in);
        this.status = input2.nextLine();
    
    }

    @Override
    public String toString() {
        return super.toString()+ ", Status: "+this.bookStatus(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
