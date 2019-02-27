package user;


public abstract class user {

    private int userID;
    private String name;
    private String position;

    

    public user() {
    }

    public user(int userID, String name, String position) {
        this.userID = userID;
        this.name = name;
        this.position = position;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract void displayUserInfo();

}
