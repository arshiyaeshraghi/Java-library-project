import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Member> members = new ArrayList<>();
        ArrayList<LibraryManager> managers = new ArrayList<>();

        while (true) {
            int choice = Ui.printMenu();

            switch (choice) {
                case 1:
                    // Register the library manager
                    System.out.println("Please enter your information");
                    System.out.println("Enter first name: ");
                    String firstName = sc.nextLine();

                    System.out.println("Enter last name: ");
                    String lastName = sc.nextLine();

                    System.out.println("Enter gender: ");
                    String gender = sc.nextLine();

                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter phone number: ");
                    String phoneNumber = sc.nextLine();

                    System.out.println("Enter email: ");
                    String email = sc.nextLine();

                    System.out.println("Enter national code: ");
                    String nationalCode = sc.nextLine();

                    // Create a new Manager instance
                    LibraryManager newManager = new LibraryManager(firstName, lastName, gender, age, phoneNumber, email,
                            nationalCode);

                    // Add the new manager to the managers list
                    managers.add(newManager);

                    // Display the generated manager ID
                    System.out.println("Manager registered successfully.");
                    System.out.println("Your Manager ID: " + newManager.getId());
                    break;

                case 2:
                    // Add a book by manager
                    System.out.println("Please enter book details");
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Year of Publication: ");
                    int yearOfPublication = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Publisher: ");
                    String publisher = sc.nextLine();
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    // Create a new book instance
                    Book newBook = new Book(title, yearOfPublication, publisher, genre);

                    // Add the new book to the book list
                    books.add(newBook);

                    System.out.println("Thanks book added successfully.");
                    break;
                case 3:
                    // Delete a book by manager
                    System.out.println("Enter the title of the book to delete:");
                    String bookTitleToDelete = sc.nextLine();

                    // Find the book by title
                    Book bookToDelete = null;
                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(bookTitleToDelete)) {
                            bookToDelete = book;
                            break;
                        }
                    }

                    // Check if the book was found
                    if (bookToDelete != null) {
                        // Remove the book from the libraryBooks list
                        books.remove(bookToDelete);
                        System.out.println("Book '" + bookTitleToDelete + "' has been deleted.");
                    } else {
                        System.out.println("Book '" + bookTitleToDelete + "' not found in the library.");
                    }
                    break;
                case 4:
                    // Search for a book by name
                    System.out.print("Enter the book name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(searchName)) {
                            System.out.println("Book found");
                            System.out.println("Title: " + book.getTitle());
                            System.out.println("Year of Publication: " + book.getYearOfPublication());
                            System.out.println("Publisher: " + book.getPublisher());
                            System.out.println("Genre: " + book.getGenre());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5:
                    // View the list of books
                    if (books.isEmpty()) {
                        System.out.println("The library has no books at the moment.");
                    } else {
                        System.out.println("List of Books in the Library");
                        for (Book book : books) {
                            System.out.println("Title: " + book.getTitle());
                            System.out.println("Year of Publication: " + book.getYearOfPublication());
                            System.out.println("Publisher: " + book.getPublisher());
                            System.out.println("Genre: " + book.getGenre());
                            System.out.println("ID: " + book.getId());
                            System.out.println("----------------------------------");
                        }
                    }
                    break;
                case 6:
                    // Register a user
                    System.out.println("Please enter user information:");
                    System.out.print("First Name: ");
                    String firstـname = sc.nextLine();
                    System.out.print("Last Name: ");
                    String last_name = sc.nextLine();
                    System.out.print("Age: ");
                    int userAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Phone Number: ");
                    String phone_number = sc.nextLine();
                    System.out.print("Email: ");
                    String useEmail = sc.nextLine();
                    System.out.print("National Code: ");
                    String national_code = sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();

                    // Create a new member instance
                    Member newUser = new Member(firstـname, last_name, userAge, phone_number, useEmail, national_code,
                            password);

                    // Add the new member to the member list
                    members.add(newUser);

                    System.out.println("User registered successfully.");
                    for (Member member : members) {
                        System.out.println("Member ID: " + member.getId());
                    }
                    break;
                case 7:
                    // View the list of members
                    System.out.println("List of Members:");
                    for (Member member : members) {
                        System.out.println("Member ID: " + member.getId());
                        System.out.println("First Name: " + member.getFirstName());
                        System.out.println("Last Name: " + member.getLastName());
                        System.out.println("Age: " + member.getAge());
                        System.out.println("Phone Number: " + member.getPhoneNumber());
                        System.out.println("Email: " + member.getEmail());
                        System.out.println("National Code: " + member.getNationalCode());
                        System.out.println("---------------");
                    }
                    break;
                case 8:
                    // Borrow a book by a member
                    System.out.println("Enter the member's ID:");
                    int memberId = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the book title to borrow:");
                    String bookTitleToBorrow = sc.nextLine();

                    // Find the member by ID
                    Member borrowingMember = null;
                    for (Member member : members) {
                        if (member.getId() == memberId) {
                            borrowingMember = member;
                            break;
                        }
                    }

                    // Find the book by title
                    Book borrowedBook = null;
                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(bookTitleToBorrow)) {
                            borrowedBook = book;
                            break;
                        }
                    }

                    if (borrowingMember != null && borrowedBook != null) {
                        // Check if the book is available (not already borrowed)
                        if (!borrowedBook.isBorrowed()) {
                            // Borrow the book
                            borrowedBook.setBorrowed(true);
                            borrowedBook.setBorrowedBy(borrowingMember);

                            System.out.println("Book borrowed successfully!");
                        } else {
                            System.out.println("Sorry, the book is already borrowed.");
                        }
                    } else {
                        System.out.println("Member ID or book title not found.");
                    }
                    break;
                case 9:
                    // View the list of borrowed books
                    System.out.println("List of Borrowed Books");
                    for (Book book : books) {
                        if (book.isBorrowed()) {
                            System.out.println("Book ID: " + book.getId());
                            System.out.println("Title: " + book.getTitle());
                            System.out.println("Borrower: " + book.getBorrowerName());
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 10:
                    // Exit the program
                    System.out.println("Goodbye!");
                default:
                    System.out.println("Please enter a valid number.");
            }
        }
    }

}
