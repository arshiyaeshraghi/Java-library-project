public class Member {
    // Id for the member
    private static int nextMemberId = 101;

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String email;
    private String nationalCode;
    private String password;

    // Constructor
    public Member(String firstName, String lastName, int age, String phoneNumber, String email, String nationalCode,
            String password) {
        this.id = generateID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.nationalCode = nationalCode;
        this.password = password;
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

    public String getPassword() {
        return this.password;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return nextMemberId++;
    }
}