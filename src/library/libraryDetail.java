
package library;


public class libraryDetail {
    private int libraryID;
    private String name;
    private String address;

    public libraryDetail() {
    }

    public libraryDetail(int libraryID, String name, String address) {
        this.libraryID = libraryID;
        this.name = name;
        this.address = address;
    }

    public int getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(int libraryID) {
        this.libraryID = libraryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
