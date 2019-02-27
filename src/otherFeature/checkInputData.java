
package otherFeature;

import java.util.Scanner;

public class checkInputData {
    
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
