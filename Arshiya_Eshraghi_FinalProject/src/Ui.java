import java.util.Scanner;

public class Ui {
    // Scaner
    static Scanner sc = new Scanner(System.in);

    // Methods
    public static int printMenu(){
        System.out.println("        Library Menu     ");
        System.out.println("        ------------     ");
        System.out.println("1. Manager Registration");
        System.out.println("2. Add a book by manager");
        System.out.println("3. Delete a book by manager");
        System.out.println("4. Search for a book by name");
        System.out.println("5. View the list of books");
        System.out.println("6. Member Registration");
        System.out.println("7. View the list of members");
        System.out.println("8. Borrow a book by a member");
        System.out.println("9. View the list of borrowed books");
        System.out.println("10. Exit");

        System.out.print("Please enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        return choice;
    }

}
