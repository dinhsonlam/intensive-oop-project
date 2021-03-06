package main;

import book.*;
import java.util.Scanner;
import user.librarians;
import user.students;
import user.teachers;
import user.user;

import static otherFeature.checkInputData.CheckInpInt;

public class main {

    static bookDetail sach1 = new bookDetail(0, "", "", "");

    static user hocsinh = new students(0, "", "");
    static user giaovien = new teachers();
    static librarians thuthu = new librarians();

    public static void main(String[] args) {

        menu();

    }

    private static int login() {
        String Username;
        String Password;

        Password = "123456789";
        Username = "Librarian";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome!");
            return 1;
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
            return 0;
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
            return 0;
        } else {
            System.out.println("Invalid Username & Password!");
            return 0;
        }

    }

    private static void menu() {
        System.out.println("********************************************");
        System.out.println("*       Welcome to Lam Thiet Library       *");
        System.out.println("********************************************");
        System.out.println("\n\n");

        System.out.println("\tPress 1: Books Management");// display all of book, add a new books, delete book
        System.out.println("\tPress 2: Members Management ");//display all of member, add a new member, display all of member info and delete member
        System.out.println("\tPress 3: Display Existing Available Books");
        System.out.println("\tPress 4: Display Existing Book Being Borrowed");
        System.out.println("\tPress 5: Borrow Book");//show member, show book -> choose type of member, choose book and
        System.out.println("\tPress 6: Return Book");
        System.out.println("\tPress 7: Exit");//exit now

        System.out.println("--- Please select you obtion to take action --- ");

        Scanner input = new Scanner(System.in);

        int choose;
        do {
            choose = CheckInpInt();

            action(choose);
        } while (choose != 8);

    }

    private static void action(int selectOption) {
        int check;
        switch (selectOption) {
            case 1:
//                Book Management
                sach1.displayAvailbleBookInfor();
                System.out.println("[1]: Add a new Book | [2]: Remove book | [3]: exit");
                check = CheckInpInt();
                while (check != 1 && check != 2) {
                    System.err.println("\t[There is not this feature]");
                    check = CheckInpInt();
                }

                if (check == 1) {
                    do {
                        System.out.println("\tPlease enter book info: ");
                        sach1.addBook();
                    } while ((check = askUsingFunction()) == 1);

                    if (check == 2) {
                        menu();
                    } else {
                        stopProgram();
                    }

                } else {

//                    display all book in list book
                    sach1.displayAvailbleBookInfor();
                    check = CheckInpInt();
//                    choose the book and delete
                    sach1.removeBook(check);
                }

                break;

//                --Lam is making it
            case 2:

//                Members Management
                thuthu.displayUserInfo();
                System.out.println("[1]: Add a member | [2]: Back");
                check = CheckInpInt();
                while (check != 1 && check != 2) {
                    System.err.println("\t[There is not this feature]");
                    check = CheckInpInt();
                }

                if (check == 1) {
                    do {
                        System.out.println("\tPlease enter member info: ");
                        thuthu.addUser();

                    } while ((check = askUsingFunction()) == 1);

                    if (check == 2) {
                        menu();
                    } else {
                        stopProgram();
                    }

                } else {
                    menu();

                }

//                System.out.println("This function is building...\n \tPlease choose another feature");
                break;
            case 3:
                System.out.println("This function is building...\n \tPlease choose another feature");

                do {
                    sach1.displayAvailbleBookInfor();
                } while ((check = askUsingFunction()) == 1);

                if (check == 2) {
                    menu();
                } else {
                    stopProgram();
                }
                break;

            case 4:
                System.out.println("This function is building...\n \tPlease choose another feature");
                break;
            case 5:
//            
                sach1.displayIssueBookInfo();
                System.out.println("\tPlease choose name book: ");
//               Kiem tra du lieu nhap va, cho phep nhap vao kieu so nguyen Int
                int input = CheckInpInt();

                if (sach1.checkBookId(input) == 0) {
                    System.out.println("\t[Your borrowed book]");
                    sach1.displayBorrowedInfo(input);
                } else {
                    System.err.println("\t[There are not any borrowed book at our Library]");
                }
                break;
            case 6:
                System.out.println("This function is building...\n \tPlease choose another feature");

                break;
            case 7:
                stopProgram();
//                done
                break;
            default:
                System.err.println("\t[There is not this feature]");
        }
    }

    private static int askUsingFunction() {

        System.out.println("\n");
        System.out.println("Would you like use this function?");
        System.out.println("Press[1]: Continue Using      Press[2]: Back Menu     Press[0]: Exit Now");
        int next = CheckInpInt();
        while (next != 1 && next != 2 && next != 0) {
            System.err.print("--Invalid data-- ");
            next = CheckInpInt();
        }
        if (next == 1) {
//            continue to use this function
            return 1;
        } else if (next == 2) {
//            comeback main menu
            return 2;
        } else {
//            exit immediately
            return 0;
        }

    }

//    exit exit immediately
    private static void stopProgram() {
        System.out.println("[Exited]");
        System.exit(0);
    }

//    Check input data of Int
//    public static int CheckInpInt() {
//
//        Scanner input = new Scanner(System.in);
//
//        boolean check = false;
//
//        int n = 0;
//        while (!check) {
//            System.out.print(" ");
//            try {
//                n = input.nextInt();
//                check = true;
//            } catch (Exception e) {
//                System.err.print("--Invalid data--: ");
//                input.nextLine();
//            }
//        }
//        return (n);
//    }
//        Check input data of float
//    public static float CheckInpFloat() {
//
//        Scanner input = new Scanner(System.in);
//
//        boolean check = false;
//
//        float n = 0;
//        while (!check) {
//            System.out.print(" ");
//            try {
//                n = input.nextFloat();
//                check = true;
//            } catch (Exception e) {
//                System.err.print("--Invalid data--: ");
//                input.nextLine();
//            }
//        }
//        return (n);
//    }
//        Check input data of Double
//    public static double CheckInpDouble() {
//
//        Scanner input = new Scanner(System.in);
//
//        boolean check = false;
//
//        double n = 0;
//        while (!check) {
//            System.out.print(" ");
//            try {
//                n = input.nextDouble();
//                check = true;
//            } catch (Exception e) {
//                System.err.print("--Invalid data--: ");
//                input.nextLine();
//            }
//        }
//        return (n);
//    }
}
