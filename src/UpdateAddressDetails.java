import java.util.ArrayList;
import java.util.Scanner;

public class UpdateAddressDetails {

    public UpdateAddressDetails(ArrayList<Info> info){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name to be updated");
        String[] name = sc.nextLine().split(" ", 2);

        for (Info o: info) {
            
            if (o.firstName.equals(name[0]) && o.lastName.equals(name[1])){

                System.out.println("Enter Address :- ");
                o.address = sc.nextLine();

                System.out.println("Enter City :- ");
                o.city = sc.nextLine();

                System.out.println("Enter State :- ");
                o.state = sc.nextLine();

                System.out.println("Enter Zip Code :- ");
                o.zipCode = sc.nextInt();

                sc.nextLine();
                System.out.println("Enter Contact Number :- ");
                o.contactNumber = sc.nextLine();

                System.out.println("Enter Email :- ");
                o.email = sc.nextLine();

                System.out.println("-----------------------------------------------");

                System.out.println("Record Updated Successfully !");
                break;
            } else {

                System.out.println("No Record Found.");
            }
        }

    }
}
