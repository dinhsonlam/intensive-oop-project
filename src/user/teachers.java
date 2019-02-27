package user;

public class teachers extends user {

    public teachers() {
    }

    public teachers(int userID, String name) {
        super(userID, name, "Teacher");
    }

    

    @Override
    public void setPosition(String position) {
        super.setPosition(position); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayUserInfo() {
        System.out.println("---Teacher Information---");
        System.out.println("Id: " + super.getUserID());
        System.out.println("Name: " + super.getName());
        System.out.println("Position: " + super.getPosition());

    }

}
