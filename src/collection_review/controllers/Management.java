package collection_review.controllers;

import collection_review.services.FunctionExperience;
import collection_review.services.FunctionFresher;
import collection_review.services.FunctionInternship;

import java.util.Scanner;

public class Management {
   static Scanner scanner = new Scanner(System.in);

   public static void managementSystem() {
      boolean flag = true;
      FunctionInternship functionInternship = new FunctionInternship();
      FunctionFresher functionFresher = new FunctionFresher();
      FunctionExperience functionExperience = new FunctionExperience();
      System.out.println("hello world");
      do {
         System.out.println("CANDIDATE MANAGEMENT SYSTEM\n" +
                 "1.\tExperience\n" +
                 "2.\tFresher\n" +
                 "3.\tInternship\n" +
                 "4.\tSearching\n" +
                 "5.\tExit\n" +
                 "Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program.");
         int chose = Integer.parseInt(scanner.nextLine());
         switch (chose) {
            case 1:
               //Experience
               System.out.println("1. creating Experience\n" +
                       "2. updating Experience\n" +
                       "3. deleting Experience\n" );
               int choseExperience = Integer.parseInt(scanner.nextLine());
               switch (choseExperience) {
                  case 1:
                     functionExperience.creating();
                     break;
                  case 2:
                     functionExperience.updating();
                     functionExperience.hienThi();
                     break;
                  case 3:
                     functionExperience.hienThi();
                     functionExperience.deleting();
                     functionExperience.hienThi();
                     break;
               }
               break;
            case 2:
               System.out.println(" 1. creating Fresher\n" +
                       " 2. updating Fresher\n" +
                       " 3. deleting Fresher\n");
               int choseFresher = Integer.parseInt(scanner.nextLine());
               switch (choseFresher) {
                  case 1:
                     functionFresher.creating();
                     break;
                  case 2:
                     functionFresher.updating();
                     functionFresher.Display();
                     break;
                  case 3:
                     functionFresher.Display();
                     functionFresher.deleting();
                     functionFresher.Display();
                     break;
                  case 4:
                     functionFresher.searching();
                     break;

               }

               break;
            case 3:
               System.out.println("1. creating Experience\n" +
                       " 2. updating Experience\n" +
                       " 3. deleting Experience\n");
               int choseintern = Integer.parseInt(scanner.nextLine());
               switch (choseintern) {
                  case 1:
                     functionInternship.creating();
                     break;
                  case 2:
                    functionInternship.updating();
                     break;
                  case 3:
                     functionInternship.deleting();
                     break;
               }
               break;
            case 4:
               System.out.println("1.searching Experience\n" +
                       "2.searching Fresher\n" +
                       "3.searching Experience");
               int choseSearch= Integer.parseInt(scanner.nextLine());
               switch (choseSearch){
                  case 1 :
                     functionExperience.searching();
                     break;
                  case 2 :
                     functionFresher.searching();
                     break;
                  case 3 :
                     functionInternship.searching();
                     break;
               }
               break;
            case 5:
               flag = false;
               break;

         }

      } while (flag);

   }
}
