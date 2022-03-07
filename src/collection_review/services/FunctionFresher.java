package collection_review.services;

import collection_review.model.Fresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionFresher implements IFunctions {
    static Scanner scanner = new Scanner(System.in);
    static List<Fresher> fresherList = new ArrayList<>();

    //int id, String firstName, String lastName, String birth, String address, long phone,
// String email, int candidateType, int graduatedTime, int rankOfGraduation, String university) {
    static {
        fresherList.add(new Fresher(0010, "Lê Thị", "Lan", "12-1-1999", "quang nam", 12345678, "lan@gmail.com", 2, 2013, 2, "Rmit"));
        fresherList.add(new Fresher(0011, "trần Thị", "A", "12-1-1999", "Hà noi", 12345678, "a@gmail.com", 2, 2011, 1, "Rmit"));
        fresherList.add(new Fresher(0012, "Lê Văn", "Lan", "12-1-1999", "quang ngai", 12345678, "lan@gmail.com", 2, 2022, 0, "Rmit"));
    }

    @Override
    public void Creating() {
        boolean check = true;
        String chars = "Y";
        do {
            System.out.println("Creating Experience");
            System.out.println(" nhập id ");
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
            System.out.println(" enter candidate Type");
            int candidateType = Integer.parseInt(scanner.nextLine());
            System.out.println("eter graduated Time");
            int graduatedTime = Integer.parseInt(scanner.nextLine());
            System.out.println(" enter rank Of Graduation");
            int rankOfGraduation = Integer.parseInt(scanner.nextLine());
            System.out.println("enter university");
            String university = scanner.nextLine();
            fresherList.add(new Fresher(id, firstName, lastName, birth, address, phone, eMail, candidateType, graduatedTime, rankOfGraduation, university));
            System.out.println(": Do you want to continue (Y/N)?. ");
            String charChecks = scanner.nextLine();
            check = chars.equals(charChecks.toUpperCase());
        } while (check);
    }

    @Override
    public void Updating() {
        System.out.println(" enter id you want to Updating");
        int id = Integer.parseInt(scanner.nextLine());
        for (Fresher exceptions : fresherList) {
            if (exceptions.getId() == id) {
                System.out.println(exceptions);
                System.out.println("1.Do you want to fix it all?\n" +
                        "2.Do you want to fix it order  ");
                int selection = Integer.parseInt(scanner.nextLine());
                switch (selection) {
                    case 1:
                        System.out.println("edit  firstName ");
                        String firstNameedit = scanner.nextLine();
                        exceptions.setFirstName(firstNameedit);
                        System.out.println(" edit lastName ");
                        String lastNameedit = scanner.nextLine();
                        exceptions.setLastName(lastNameedit);
                        System.out.println("edit birth ");
                        String birthedit = scanner.nextLine();
                        exceptions.setBirth(birthedit);
                        System.out.println("edit address");
                        String addressedit = scanner.nextLine();
                        exceptions.setAddress(addressedit);
                        System.out.println(" edit phone correct input required");
                        long phoneedit = Long.parseLong(scanner.nextLine());
                        exceptions.setPhone(phoneedit);
                        System.out.println("edit email");
                        String eMailedit = scanner.nextLine();
                        exceptions.setEmail(eMailedit);
                        System.out.println(" enter edit candidate Type ");
                        int candidateType= Integer.parseInt(scanner.nextLine());
                        exceptions.setCandidateType(candidateType);
                        System.out.println(" edit graduated Time");
                        int graduatedTime= Integer.parseInt(scanner.nextLine());
                        exceptions.setGraduatedTime(graduatedTime);
                        System.out.println(" edit rank Of Graduation");
                        int graduation= Integer.parseInt(scanner.nextLine());
                        exceptions.setRankOfGraduation(graduation);
                        System.out.println("edit university");
                        String university = scanner.nextLine();
                        exceptions.setUniversity(university);
                    case 2:
                        System.out.println("1.edit  firstName \n" +
                                "2.edit birth \n" +
                                "3. edit phone correct input required\n");
                        int order = Integer.parseInt(scanner.nextLine());
                        switch (order) {
                            case 1:
                                System.out.println("edit  firstName ");
                                String firstNameeditOder = scanner.nextLine();
                                exceptions.setFirstName(firstNameeditOder);
                                break;
                            case 2:
                                System.out.println("edit birth ");
                                String birtheditOder = scanner.nextLine();
                                exceptions.setBirth(birtheditOder);
                                break;
                            case 3:
                                System.out.println(" edit phone correct input required");
                                long phoneeditOder = Long.parseLong(scanner.nextLine());
                                exceptions.setPhone(phoneeditOder);
                                break;
                        }
                }
            }
        }
    }

    @Override
    public void Deleting() {
        System.out.println(" enter ID you want delete ");
        int iDDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < fresherList.size(); i++) {
            if (fresherList.get(i).getId() == iDDelete) {
                fresherList.remove(fresherList.get(i));
                break;
            }
        }

    }

    @Override
    public void Searching() {
        System.out.println(" choose the name you want to find");
        String nameSeach = scanner.nextLine();
        ArrayList<Fresher> list = new ArrayList<>();
        for (int i = 0; i < fresherList.size(); i++) {
            if (fresherList.get(i).getFirstName().contains(nameSeach)) {
                list.add(fresherList.get(i));
            }
        }
        for (Fresher element : list
        ) {
            System.out.println(element);
        }
    }

    public void Display() {
        for (Fresher element : fresherList
        ) {
            System.out.println(element);
        }
    }
}
