import java.util.ArrayList;
import java.util.Scanner;

public class DeleteRecord {


    public static ArrayList<Info> deleteRecord(ArrayList<Info> info) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name to be deleted");
        String[] name = sc.nextLine().split(" ", 2);

        int count = 0;
        for (Info o : info) {
            count++;
            if (o.firstName.equals(name[0]) && o.lastName.equals(name[1])) {
                info.remove(count);

                break;
            }
        }

        return info;
    }

}
