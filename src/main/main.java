package main;

import book.*;
import java.util.Scanner;

public class main {

    static bookDetail sach1 = new bookDetail(0, "", "");

    public static void main(String[] args) {

        menu();
//        while (true) {
//            do {
//                if (login() == 1) {
//                    menu();
//                } else {
//                    System.out.println("Thoat");
//                }
//            } while (true);
//        }

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

        System.out.println("\tPress 2: Members Management ");// add a new member, display and delete member
        System.out.println("\tPress 5: Books Management");// add a new books, delete book
//        System.out.println("\tPress 1: Display Existing Libraries");
        System.out.println("\tPress 3: Display Existing Available Books");
        System.out.println("\tPress 4: Display Existing Book Being Borrowed");
        System.out.println("\tPress 7: Issue a book");
        System.out.println("\tPress 8: Exit");

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
                System.out.println("This function is building...");
                break;
            case 2:
                System.out.println("This function is building...");
                break;
            case 3:
                System.out.println("This function is building...");

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
                System.out.println("This function is building...");
                break;
            case 5:
                do {
                    sach1.addBook();
                    System.out.println("Add book OK");
                } while ((check = askUsingFunction()) == 1);

                if (check == 2) {
                    menu();
                } else {
                    stopProgram();
                }
                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            default:
                throw new AssertionError();
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
        System.exit(1);
    }

//    Check input data of Int
    public static int CheckInpInt() {

        Scanner input = new Scanner(System.in);

        boolean check = false;

        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.err.print("--Invalid data--: ");
                input.nextLine();
            }
        }
        return (n);
    }

//        Check input data of float
    public static float CheckInpFloat() {

        Scanner input = new Scanner(System.in);

        boolean check = false;

        float n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextFloat();
                check = true;
            } catch (Exception e) {
                System.err.print("--Invalid data--: ");
                input.nextLine();
            }
        }
        return (n);
    }

//        Check input data of Double
    public static double CheckInpDouble() {

        Scanner input = new Scanner(System.in);

        boolean check = false;

        double n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextDouble();
                check = true;
            } catch (Exception e) {
                System.err.print("--Invalid data--: ");
                input.nextLine();
            }
        }
        return (n);
    }

    
}
