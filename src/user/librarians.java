package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import otherFeature.checkInputData;

public class librarians extends user {

    private String userName;
    private String password;

    public static Scanner input = new Scanner(System.in);
    private List<students> studentList = new ArrayList<students>();
    private List<teachers> teacherList = new ArrayList<teachers>();
    public librarians() {
        this.userName = "librarian";
        this.password = "123";
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
        System.out.println("Choose type of user: ");
        System.out.println("[1]: Student | [2]: Teacher | [3]: Back");
        int chooseUser;
       
        
        do {
            chooseUser = checkInputData.CheckInpInt();
            System.out.println("Nhap lai!!");
        } while (chooseUser != 1 && chooseUser != 2 && chooseUser !=3);
        System.out.println("Chon thanh cong chuc nang so: "+chooseUser);
        
    }

    public void removeUser() {

    }

    public void bookBorrowing() {

    }
    
    public void displayAllUser(){
        
    }
    
    public static void main(String[] args) {
        librarians thuthu1 = new librarians();
        thuthu1.addUser();
    }

}
