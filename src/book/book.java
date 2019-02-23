
package book;

import java.util.Map;

public interface book {
    
    public abstract  void addBook();

    public abstract void deleteBook(int bookID);

    public abstract void updateBook(int bookID);

    public abstract void displayAvailbleBookInfor();

    public abstract void displayIssueBookInfo();


}
