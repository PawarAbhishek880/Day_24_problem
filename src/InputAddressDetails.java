import java.util.Scanner;

public class InputAddressDetails {

    public static Info takeInput() {
        Scanner scanner = new Scanner(System.in);
        Info info = new Info();

        System.out.println("Enter First Name :- ");
        info.firstName = scanner.nextLine();

        System.out.println("Enter Last Name :- ");
        info.lastName = scanner.nextLine();

        System.out.println("Enter Address :- ");
        info.address = scanner.nextLine();

        System.out.println("Enter City :- ");
        info.city = scanner.nextLine();

        System.out.println("Enter State :- ");
        info.state = scanner.nextLine();

        System.out.println("Enter Zip Code :- ");
        info.zipCode = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter Contact Number :- ");
        info.contactNumber = scanner.nextLine();

        System.out.println("Enter Email :- ");
        info.email = scanner.nextLine();

        return info;
    }
}
