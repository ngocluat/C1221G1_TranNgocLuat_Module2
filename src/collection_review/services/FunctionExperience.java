package collection_review.services;

import collection_review.model.Experience;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionExperience implements IFunctions {
    static Scanner scanner = new Scanner(System.in);
    public static List<Experience> exceptions = new ArrayList<>();

    static {
        exceptions.add(new Experience(001, "Ngoc Luat", "Trần", "19-09-2000", "Quang nam", 06526465656, "luat@gmail.com", 2, 3, "siêng năng"));
        exceptions.add(new Experience(002, "Tran Lung", "linh", "19-09-1999", "Quang ngãi ", 0565656456, "lung@gmail.com", 0, 3, "siêng năng"));
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
            System.out.println("enter candidate Type");
            int candidateType = Integer.parseInt(scanner.nextLine());
            System.out.println("enter year Of Experience");
            int yearOfExperience = Integer.parseInt(scanner.nextLine());
            System.out.println("enter professional Skill");
            String professionalSkill = scanner.nextLine();

            exceptions.add(new Experience(id, firstName, lastName, birth, address, phone, eMail, candidateType, yearOfExperience, professionalSkill));
            System.out.println(": Do you want to continue (Y/N)?. ");
            String select = scanner.nextLine();
            check = chars.equals(select.toUpperCase());
        } while (check);
    }


    @Override
    public void Updating() {
        System.out.println(" enter id you want to Updating");
        int id = Integer.parseInt(scanner.nextLine());
        for (Experience exception : exceptions) {
            if (exception.getId() == id) {
                System.out.println(exception);
                System.out.println("1.Do you want to fix it all?\n" +
                        "2.Do you want to fix it order  ");
                int selection = Integer.parseInt(scanner.nextLine());
                switch (selection) {
                    case 1:
                        System.out.println("edit  firstName ");
                        String firstNameedit = scanner.nextLine();
                        exception.setFirstName(firstNameedit);
                        System.out.println(" edit lastName ");
                        String lastNameedit = scanner.nextLine();
                        exception.setLastName(lastNameedit);
                        System.out.println("edit birth ");
                        String birthedit = scanner.nextLine();
                        exception.setBirth(birthedit);
                        System.out.println("edit address");
                        String addressedit = scanner.nextLine();
                        exception.setAddress(addressedit);
                        System.out.println(" edit phone correct input required");
                        long phoneedit = Long.parseLong(scanner.nextLine());
                        exception.setPhone(phoneedit);
                        System.out.println("edit email");
                        String eMailedit = scanner.nextLine();
                        exception.setEmail(eMailedit);
                        System.out.println("edit candidate Type");
                        int candidateTypeedit = Integer.parseInt(scanner.nextLine());
                        exception.setCandidateType(candidateTypeedit);
                        System.out.println("edit year Of Experience");
                        int yearOfExperienceedit = Integer.parseInt(scanner.nextLine());
                        exception.setYearOfExperience(yearOfExperienceedit);
                        System.out.println("edit professional Skill");
                        String professionalSkilledit = scanner.nextLine();
                        exception.setProfessionalSkill(professionalSkilledit);
                        break;
                    case 2:
                        System.out.println("1.edit  firstName \n" +
                                "2.edit birth \n" +
                                "3. edit phone correct input required\n" +
                                "4.edit professional Skill ");
                        int order = Integer.parseInt(scanner.nextLine());
                        switch (order) {
                            case 1:
                                System.out.println("edit  firstName ");
                                String firstNameeditOder = scanner.nextLine();
                                exception.setFirstName(firstNameeditOder);
                                break;
                            case 2:
                                System.out.println("edit birth ");
                                String birtheditOder = scanner.nextLine();
                                exception.setBirth(birtheditOder);
                                break;
                            case 3:
                                System.out.println(" edit phone correct input required");
                                long phoneeditOder = Long.parseLong(scanner.nextLine());
                                exception.setPhone(phoneeditOder);
                                break;
                            case 4:
                                System.out.println("edit professional Skill");
                                String professionalSkilleditOder = scanner.nextLine();
                                exception.setProfessionalSkill(professionalSkilleditOder);
                                break;
                        }
                        break;
                }
            }
            break;
        }
    }

    @Override
    public void Deleting() {
        System.out.println("select the id you want to delete");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < exceptions.size(); i++) {
            if (exceptions.get(i).getId() == idDelete) {
                exceptions.remove(exceptions.get(i));
                break;
            }
        }
    }

    @Override
    public void Searching() {
        System.out.println(" choose the name you want to find");
        String nameSeach = scanner.nextLine();
        ArrayList<Experience> experienceList = new ArrayList<>();

        for (Experience exception : exceptions) {
            if (exception.getFirstName().toUpperCase().contains(nameSeach.toUpperCase())) {
                experienceList.add(exception);
            }
        }
        for (Experience experience : experienceList) {
            System.out.println(experience);
        }
    }

    public void hienThi() {
        for (Experience experien : exceptions) {
            System.out.println(experien);
        }
    }
}
