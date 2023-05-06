import java.util.Scanner;

public class StudentVersion {
    public static void main(String[] args) {
        boolean run = true;
        String choice;

        do {
            choice = displayMenu();
            switch (choice) {
                case "x" ->  //replace if by switch
                        run = false;
                case "1" -> {
                    double x = getNumber(1);
                    double y = getNumber(2);
                    //Syntax error: There is a typo in the display() method
                    // call within the main() method. It should be display(total);
                    // instead of display(total);was int total = sumMethod(x,y);
                    double total = sumMethod(x, y);
                    display(total);
                    run = checkFinish();
                }
                case "2" -> {
                    double x = getNumber(1);
                    double y = getNumber(2);
                    double total = subtractMethod(x, y);
                    display(total);
                    run = checkFinish();
                }
                case "3" -> {
                    double x = getNumber(1);
                    double y = getNumber(2);
                    //change m to M on  multiplyMethod
                    double total = multiplyMethod(x, y);
                    display(total);
                    run = checkFinish();
                }

//Logical error: There is an extra condition in the else statement of the main() method.
// It should be else if (choice.equals("4")){ instead of else (choice.equals("4")){.
                // wa  else  (choice.equals("4"))
                case "4" -> {
                    double x = getNumber(1);
                    double y = getNumber(2);
                    double total = divideMethod(x, y);
                    display(total);
                    run = checkFinish();
                }
                default -> System.out.println("Entry not recognised, please try again...");
            }

        } while (run);
    }

    public static double getNumber(int count){
        while (true) {
            if (count == 1) {
                System.out.print("Enter 1st number: ");
            } else {
                System.out.println("Enter 2nd number: ");
            }
            Scanner reader = new Scanner(System.in);
            try {
                //Type mismatch error: The getNumber() method is returning a String instead of a double.
                // The nextLine() method returns a String, so it needs to be parsed into a double using Double.parseDouble().
                //was like this double x = reader.nextLine();
                return Double.parseDouble(reader.nextLine());
            } catch (Exception e){
                System.out.println("Number not recognised, please try again.");
            }
        }
    }

    public static String displayMenu(){
        System.out.println(" Calculator Menu");
        System.out.println("1. Add numbers");
        System.out.println("2. Subtract numbers");
        System.out.println("3. Multiply numbers");
        System.out.println("4. Divide numbers");
        System.out.println("x. Exit program");
        System.out.println();
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter option (1,2,3,4,x): ");
        return reader.nextLine();
    }

    public static boolean checkFinish(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Have you finished (y/n): ");
        String ans = reader.nextLine().trim().toLowerCase();
        return !ans.equals("y");
    }
    //Logical error: The sumMethod() method is actually multiplying the two input numbers instead of adding them.
    // This needs to be fixed by changing return (n * m); to return (n + m);.

    public static double sumMethod(double n, double m){
        System.out.println("When adding the numbers");
        return (n + m); // change the * to +
    }

    public static double subtractMethod(double n, double m){
        System.out.println("When subtracting the numbers");
        return (n - m);
    }

    public static double multiplyMethod(double n, double m){
        System.out.println("When multiplying the numbers");
        return (n * m);
    }

    public static double divideMethod(double n, double m){
        System.out.println("When dividing the numbers");
        return (n / m);
    }

    public static void display(double sum){
        // syntax error: There is a missing semicolon in the display() method.
        // It should be System.out.println("The answer is: " + sum);.
        System.out.println("The answer is: " + sum);
    }
}