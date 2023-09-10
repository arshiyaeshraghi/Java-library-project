public class Book {
    // Id for the book
    private static int nextBookId = 5000;

    private int id;
    private String title;
    private int yearOfPublication;
    private String publisher;
    private String genre;
    private boolean borrowed;
    private Member borrowedBy;
    private String borrowerName; // A property to store the borrower's name

    // Constructor
    public Book(String title, int yearOfPublication, String publisher, String genre) {
        this.id = generateID();
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
        this.genre = genre;
        this.borrowed = false;   // Add this line to set the initial state of the book as not borrowed
        this.borrowedBy = null; // Add this line to set the initial state of the book as not borrowed by any member
        this.borrowerName = borrowerName;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getGenre() {
        return this.genre;
    }

    public Member getBorrowedBy() {
        return borrowedBy;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setBorrowedBy(Member borrowedBy) {
        this.borrowedBy = borrowedBy;
    }
    
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    // Methods
    private static int generateID() {
        return nextBookId++;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

}