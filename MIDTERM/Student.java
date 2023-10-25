import java.util.Scanner;

class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        String fullName = firstName;

        if (middleName != null && !middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (suffix != null && !suffix.isEmpty()) {
            fullName += " " + suffix;
        }

        return fullName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter First Name: ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        student.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        student.setLastName(scanner.nextLine());

        System.out.print("Enter Suffix: ");
        student.setSuffix(scanner.nextLine());

        System.out.println("\nFirst Name: " + student.firstName);
        System.out.println("Middle Name: " + student.middleName);
        System.out.println("Last Name: " + student.lastName);
        System.out.println("Suffix: " + student.suffix);
        System.out.println("Full Name: " + student.getFullName());
    }
}
