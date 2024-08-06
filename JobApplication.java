import java.util.Scanner;

public class JobApplication {

    private String name;
    private String email;
    private String phone;
    private String position;
    private String coverLetter;

    // Constructor
    public JobApplication(String name, String email, String phone, String position, String coverLetter) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.coverLetter = coverLetter;
    }

    // Display the application details
    public void displayApplication() {
        System.out.println("Job Application Details:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Position Applied For: " + position);
        System.out.println("Cover Letter: " + coverLetter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Job Application Form");

        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email Address: ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Position Applied For: ");
        String position = scanner.nextLine();

        System.out.print("Enter Cover Letter: ");
        String coverLetter = scanner.nextLine();

        // Create a JobApplication object
        JobApplication application = new JobApplication(name, email, phone, position, coverLetter);

        // Display the application details
        application.displayApplication();

        scanner.close();
    }
}
