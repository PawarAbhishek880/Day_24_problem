import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Info> addDeatils = new ArrayList();
        System.out.println("----- Address Book System -----");

        while(true){
            System.out.println("1. Add Address Details");
            System.out.println("2. Show Address Details");
            System.out.println("3. Update Address Details");
            System.out.println("4. Search Address Details");
            System.out.println("5. Delete Address Details");
            System.out.println("6. Exit");

            System.out.print("Input :- ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Info info = InputAddressDetails.takeInput();
                    addDeatils.add(info);
                    break;
                case 2:
                    ShowRecords.showDetails(addDeatils);
                    break;
                case 3:
                    new UpdateAddressDetails(addDeatils);
                    break;
                case 4:
                    ShowRecords.searchByName(addDeatils);
                    break;
                case 5:
                    addDeatils = new ArrayList<Info>(DeleteRecord.deleteRecord(addDeatils));
                    break;
                default:
                    System.out.println("Thank you..!");
                    System.exit(0);
            }

        }
    }
}
