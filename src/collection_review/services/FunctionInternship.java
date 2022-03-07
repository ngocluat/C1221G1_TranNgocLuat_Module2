package collection_review.services;

import collection_review.model.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionInternship implements IFunctions {
    static Scanner scanner = new Scanner(System.in);
    static List<Intern> internList = new ArrayList<>();
//int id, String firstName, String lastName, String birth, String address, long phone,
// String email, int candidateType, String majors, int university, String universityName) {


    static {
        internList.add(new Intern(123, "Lê Minh", " A", "12-1-1999", "tam kì ", 456789876, "a@gmail.com", 2, "CNTT", 2, "Rmit"));
        internList.add(new Intern(123, "Lê Lê", "B", "12-1-1999", "tam tiến  ", 45675656, "b@gmail.com", 2, "CNTT", 2, "Rmit"));
    }

    @Override
    public void Creating() {
        boolean check = true;
        String chars = "Y";
        do {
            System.out.println("Creating Intern");
            System.out.println(" enter id ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("enter firstName ");
            String firstName = scanner.nextLine();
            System.out.println(" enter lastName ");
            String lastName = scanner.nextLine();
            System.out.println("enter birth ");
            String birth = scanner.nextLine();
            System.out.println("enter address");
            String address = scanner.nextLine();
            System.out.println(" enter phone correct input required");
            long phone = Long.parseLong(scanner.nextLine());
            System.out.println("enter email");
            String eMail = scanner.nextLine();
            System.out.println("enter candidate Type ");
            int candidateType = Integer.parseInt(scanner.nextLine());
            System.out.println(" enter majors");
            String majors= scanner.nextLine();
            System.out.println(" enter university");
            int university= Integer.parseInt(scanner.nextLine());
            System.out.println(" enter university Name");
            String universityName = scanner.next();
            internList.add( new Intern(id,firstName,lastName,birth,address,phone,eMail,candidateType,majors,university,universityName));
            System.out.println("Do you want to continue (Y/N)?.");
            String slect = scanner.nextLine();
            check=chars.toUpperCase().equals(slect.toUpperCase());
        } while (check);
    }

    @Override
    public void Updating() {
        // sửa

    }

    @Override
    public void Deleting() {
        System.out.println("enter ID  you want to delete");
        int iDDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getId() == iDDelete) {
                internList.remove(internList.get(i));
            }
        }
        for (Intern internAfterDelete : internList) {
            System.out.println(internAfterDelete);
        }

    }


    @Override
    public void Searching() {
        System.out.println(" enter first name  you want to Searching ");
        String firstNamesearch = scanner.nextLine();
        List<Intern> internList1 = new ArrayList<>();
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getFirstName().toUpperCase().contains(firstNamesearch.toUpperCase())) {
                internList1.add(internList.get(i));
            }
        }
        for (Intern intern : internList1) {
            System.out.println(intern);
        }

    }
}
