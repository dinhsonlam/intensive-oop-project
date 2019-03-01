package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import otherFeature.checkInputData;

public class librarians extends user {

    private String userName = "librarian";
    private String password = "123";

    public static Scanner input = new Scanner(System.in);
    private List<students> studentList = new ArrayList<students>();
    private List<teachers> teacherList = new ArrayList<teachers>();

    public librarians() {

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("User name: " + getUserName());
        System.out.println("Password: " + getPassword());
    }

    public void addUser() {
        System.out.println("Choose type of member: ");
        System.out.println("[1]: Students | [2]: Teachers | [3]: Back");
        int chooseUser;
        
        do {
            chooseUser = checkInputData.CheckInpInt();
//            System.out.println("Try again!!");
        } while (chooseUser != 1 && chooseUser != 2 && chooseUser != 3);

        if (chooseUser == 1) {
            int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
            System.out.println("Enter student's name ");
            String name = input.nextLine();
            System.out.println("Enter student's class: ");
            String class_ = input.nextLine();

//            create a new user object
            user user_ = new students(id, name, class_);
//            add user into list
            this.studentList.add((students) user_);
        }else if(chooseUser == 2){
            int id = (teacherList.size() > 0) ? (teacherList.size() + 1) : 1;
            
            System.out.println("Enter teacher's name: ");
            String name = input.nextLine();
            System.out.println("Enter ");
        }else{
            
        }
            

    }

    public void removeUser() {

    }

    public void bookBorrowing() {

    }

    public void displayAllUser() {

    }

    public static void main(String[] args) {
        librarians thuthu1 = new librarians();
        thuthu1.addUser();
    }

}
