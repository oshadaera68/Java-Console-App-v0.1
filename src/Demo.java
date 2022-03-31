import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        logInApp();

        String[] id = new String[30];
        String[] name = new String[id.length];
        int[] prf = new int[id.length];
        int[] dbms = new int[id.length];
        input(id,name,prf,dbms);
    }

    public static void input(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                addNewStudent(id, name, prf, dbms);
                break;
            case 2:
                addNewStudentWithMarks(id, name, prf, dbms);
                break;
            case 3:
                addMarks(id, name, prf, dbms);
                break;
            case 4:
                updateStudentDetails(id, name, prf, dbms);
                break;
            case 5:
                updateMarks(id, name, prf, dbms);
                break;
            case 6:
                deleteStudent(id, name, prf, dbms);
                break;
            case 7:
                printStudentDetails(id, name, prf, dbms);
                break;
            case 8:
                printStudentRank(id, name, prf, dbms);
                break;
            case 9:
                bestInPrf(id, name, prf, dbms);
                break;
            case 10:
                bestInDbms(id, name, prf, dbms);
                break;
            default:
                System.out.println("Invalid Number...Try again!!!");
        }
    }

    //case 1
    private static void addNewStudent(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //case 2
    private static void addNewStudentWithMarks(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //case 3
    private static void addMarks(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //case 4
    private static void updateStudentDetails(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //case 5
    private static void updateMarks(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //case 6
    private static void deleteStudent(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //case 7
    private static void printStudentDetails(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //case 8
    private static void printStudentRank(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //case 9
    private static void bestInPrf(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //case 10
    private static void bestInDbms(String[] id, String[] name, int[] prf, int[] dbms) {
    }

    //Starting menu in Console App
    private static void getMenuConsole() {

        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("|%65s%23s\n", "+" + boldString + "WELCOME TO MINDARTLK MARKS MANAGEMENT SYSTEM - v0.1.0" + normalString + "+", "|");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("[1] Add New Student\t\t\t  [2] Add New Student With Marks");
        System.out.println("[3] Add Marks\t\t\t  [4] Update Student Details");
        System.out.println("[5] Update Marks\t\t\t  [6] Delete Student");
        System.out.println("[7] Print Student Details\t\t\t  [8] Print Student Rank");
        System.out.println("[9] Best in Programming Fundamentals\t\t\t  [10] Best in DBMS");
        System.out.println();
    }


    //Log in method
    public static void logInApp() {
        Scanner inputUserNameAndPassword = new Scanner(System.in);

        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        String userName;
        String password;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("|%65s%23s\n", "+" + boldString + "WELCOME TO MINDARTLK MARKS MANAGEMENT SYSTEM - v0.1.0" + normalString + "+", "|");
        System.out.printf("|%50s%38s\n", "+" + boldString + "Log In Page" + normalString + "+", "|");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

        System.out.print("\t\tEnter User Name:-");
        userName = inputUserNameAndPassword.next();

        System.out.print("\t\tEnter User Password:-");
        password = inputUserNameAndPassword.next();

        if (password.equals("admin") && userName.equals("era")) {
            clearWorkingConsole();
            getMenuConsole();
        } else {
            while (true) {
                System.out.println("\t\t Try Again...!");

                System.out.print("\t\tEnter User Name:-");
                userName = inputUserNameAndPassword.next();

                System.out.print("\t\tEnter User Password:-");
                password = inputUserNameAndPassword.next();

                if (password.equals("admin") && userName.equals("era")) {
                    clearWorkingConsole();
                    getMenuConsole();
                    break;
                }
            }
        }
    }

    public static void clearWorkingConsole() {
        try {
            final String opSystem = System.getProperty("opSystem.name");
            if (opSystem.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}