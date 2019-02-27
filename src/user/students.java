
package user;


public class students extends user{
    private String class_;

    public students(String class_) {
        this.class_ = class_;
    }

    public students(int userID, String name) {
        super(userID, name, "Student");
    }

    
    
    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("---Student Information---");
        System.out.println("Id: "+super.getUserID());
        System.out.println("Name: "+super.getName());
        System.out.println("Position: "+super.getPosition());
    }
    
    
}
