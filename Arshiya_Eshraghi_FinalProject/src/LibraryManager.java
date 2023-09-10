public class LibraryManager {
    // Id for the manager
    private static int nextManagerId = 1000;

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String phoneNumber;
    private String email;
    private String nationalCode;


    // Constructor
    public LibraryManager(String firstName, String lastName, String gender, int age, String phoneNumber, String email,
            String nationalCode) {
        this.id = generateID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.nationalCode = nationalCode;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNationalCode() {
        return this.nationalCode;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    // Methods
    private static int generateID() {
        return nextManagerId++;
    }

}