package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bookDetail implements book {

    private int bookID;
    private String title;
    private String author;
    private String status;
    
    public static Scanner input = new Scanner(System.in);
    private List<bookDetail> bookList = new ArrayList<bookDetail>();

    public bookDetail(int bookID, String title, String author, String status) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        bookDetail.input = input;
    }

    public List<bookDetail> getBookList() {
        return bookList;
    }

    public void setBookList(List<bookDetail> bookList) {
        this.bookList = bookList;
    }

    
//    public static void main(String[] args) {
//        bookDetail book1 = new bookDetail(0, "Dac Nhan Tam", "To Hoai");
////        
//        book1.addBook();
//        book1.addBook();
//        book1.displayAvailbleBookInfor();
//    }

    @Override
    public void addBook() {

        int id = (bookList.size() > 0) ? (bookList.size() + 1) : 1;

        String title = inputTitle();
        String author = inputAuthor();
        String status = "availble";//default value of status
        bookDetail bookDetail = new bookDetail(id, title, author,status);

//        add book to list
        this.bookList.add(bookDetail);
        
    }

    @Override
    public void removeBook(int bookID) {

        this.bookList.remove(bookID);

    }

    @Override
    public void updateBook(int bookID) {

        boolean isExisted = false;
        int size = this.bookList.size();
        for (int i = 0; i < size; i++) {
            if (this.bookList.get(i).getBookID() == bookID) {
                this.bookList.get(i).setTitle(this.inputTitle());
                this.bookList.get(i).setAuthor(this.inputAuthor());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("Id = %d not existed.\n ", bookID);
        }
    }

    @Override
    public void displayAvailbleBookInfor() {
        System.out.println("-Book information:-");
        for (bookDetail book : bookList) {
            System.out.println("----------");
            System.out.println("Id: " + book.getBookID());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("----------");
        }
    }

    @Override
    public void displayIssueBookInfo() {
        System.out.println("-Book information:-");
        for (bookDetail book : bookList) {
            System.out.println("----------");
            System.out.println("Id: " + book.getBookID());
            System.out.println("Book Name: " + book.getTitle());

        }
    }

    //    fucntions to input data into object
    public int inputId() {
        System.out.println("Input book id: ");
        while (true) {
            try {
                int id = Integer.parseInt((input.nextLine()));
                return id;
            } catch (Exception e) {
                System.err.println("invalid! Input id");
            }
        }

    }

    public String inputTitle() {
        System.out.println("Input book title: ");
        return input.nextLine();
    }

    public String inputAuthor() {
        System.out.println("Input autthor: ");
        return input.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+"BookID: "+this.bookID+", bookTitle: "+this.title+", author: "+this.author; 
    }

    
    //    Kiem tra id nhập vào để mượn sách -- Thiet made it
    public int checkBookId(int id) {

        for (bookDetail book : bookList) {
            if (book.getBookID() == id) {
                return 0;
            }
        }
        return 1;

    }

    
        //Hien thi sach duoc muon sau khi chon id sach -- Thiet made it
    public void displayBorrowedInfo(int id) {
        for (bookDetail book : bookList) {
            if (book.getBookID() == id) {
                System.out.println("----------");
                System.out.println("Id: " + book.getBookID());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("----------");
                break;
            }
        }
    }

    
    
    
}
