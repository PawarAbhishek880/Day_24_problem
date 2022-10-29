import java.util.ArrayList;
import java.util.Scanner;
public class ShowRecords {

    public static void showDetails(ArrayList<Info> addDet) {

        for (Info o: addDet) {
            System.out.println("---------------------------------------");

            System.out.println("First Name :- " + o.firstName);
            System.out.println("Last Name :- " + o.lastName);
            System.out.println("Address :- " + o.address);
            System.out.println("City :- " + o.city);
            System.out.println("State :- " + o.state);
            System.out.println("Zip Code :- " + o.zipCode);
            System.out.println("Contact Number :- " + o.contactNumber);
            System.out.println("Email ID :- " + o.email);

            System.out.println("---------------------------------------");
        }

    }

    public static void searchByName(ArrayList<Info> addDet) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name to be searched");
        String[] name = sc.nextLine().split(" ", 2);

        for (Info o: addDet) {
            if (o.firstName.equals(name[0]) && o.lastName.equals(name[1])) {
                System.out.println("Address :- " + o.address);
                System.out.println("City :- " + o.city);
                System.out.println("State :- " + o.state);
                System.out.println("Zip Code :- " + o.zipCode);
                System.out.println("Contact Number :- " + o.contactNumber);
                System.out.println("Email ID :- " + o.email);

                break;
            }
        }

        System.out.println("---------------------------------------------------");
    }
}
