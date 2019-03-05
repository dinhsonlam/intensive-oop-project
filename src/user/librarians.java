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
        System.out.println("-All of member's information:-");
        
        System.out.println("\t-------Teacher Member------");
        for (teachers teacher : teacherList) {

            System.out.println("\tId: " + teacher.getUserID());
            System.out.println("\tName: " + teacher.getName());
            System.out.println("\tPosition: " + teacher.getPosition());
            System.out.println("---------------------------");
        }

        System.out.println("\t-------Student Member------");
        for (students student : studentList) {

            System.out.println("\tId: " + student.getUserID());
            System.out.println("\tName1: " + student.getName());
            System.out.println("\tPosition: " + student.getPosition());
            System.out.println("\tClass: " + student.getClass_());
            System.out.println("---------------------------");
        }
    }

    public void addUser() {
        System.out.println("Choose type of member: ");
        System.out.println("[1]: Students | [2]: Teachers ");
        int chooseUser;

        do {
            chooseUser = checkInputData.CheckInpInt();
//            System.out.println("Try again!!");
        } while (chooseUser != 1 && chooseUser != 2);

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
        } else {
            int id = (teacherList.size() > 0) ? (teacherList.size() + 1) : 1;

            System.out.println("Enter teacher's name: ");
            String name = input.nextLine();
            user user_ = new teachers(id, name);

            this.teacherList.add((teachers) user_);
        }

    }

    public void removeUser(int userID, String userType) {

//        userType = student or teacher
//        System.out.println("Chooce type of");
        if ("student".equals(userType)) {
            this.studentList.remove(userID);
        } else {
            this.teacherList.remove(userID);
        }
    }

//    function cho muon sach
    public void borrowBook() {

    }

    public void displayAllUser() {
        System.out.println("-All of member's information:-");

        for (teachers teacher : teacherList) {
            System.out.println("-------Teacher Member------");
            System.out.println("\tId: " + teacher.getUserID());
            System.out.println("\tName: " + teacher.getName());
            System.out.println("\tPosition: " + teacher.getPosition());
            System.out.println("---------------------------");
        }

        for (students student : studentList) {
            System.out.println("-------Teacher Member------");
            System.out.println("\tId: " + student.getUserID());
            System.out.println("\tName1: " + student.getName());
            System.out.println("\tPosition: " + student.getPosition());
            System.out.println("\tClass: " + student.getClass_());
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        librarians thuthu1 = new librarians();
        thuthu1.addUser();
        thuthu1.addUser();
        thuthu1.displayAllUser();
    }

}
