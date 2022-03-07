package collection_review.controllers;

import collection_review.services.FunctionExperience;
import collection_review.services.FunctionFresher;
import collection_review.services.FunctionInternship;

import java.util.Scanner;

public class Management {
   static Scanner scanner = new Scanner(System.in);

   public static void managementSystem() {
      boolean flag = true;
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
               FunctionExperience functionExperience = new FunctionExperience();
               System.out.println("1. creating Experience\n" +
                       "2. updating Experience\n" +
                       "3. deleting Experience\n" +
                       "4. searching Experience\n");
               int choseExperience = Integer.parseInt(scanner.nextLine());
               switch (choseExperience) {
                  case 1:
                     functionExperience.Creating();
                     break;
                  case 2:
                     functionExperience.Updating();
                     functionExperience.hienThi();
                     break;
                  case 3:
                     functionExperience.hienThi();
                     functionExperience.Deleting();
                     functionExperience.hienThi();
                     break;
                  case 4:
                     functionExperience.Searching();
                     break;
               }
               break;
            case 2:
               //Fresher
               FunctionFresher functionFresher = new FunctionFresher();
               System.out.println(" 1. creating Fresher\n" +
                       " 2. updating Fresher\n" +
                       " 3. deleting Fresher\n" +
                       " 4. searching Fresher\n");
               int choseFresher = Integer.parseInt(scanner.nextLine());
               switch (choseFresher) {
                  case 1:
                     functionFresher.Creating();
                     break;
                  case 2:
                     functionFresher.Updating();
                     functionFresher.Display();
                     break;
                  case 3:
                     functionFresher.Display();
                     functionFresher.Deleting();
                     functionFresher.Display();
                     break;
                  case 4:
                     functionFresher.Searching();
                     break;

               }

               break;
            case 3:
               //Internship
               FunctionInternship functionInternship = new FunctionInternship();
               System.out.println("1. creating Experience\n" +
                       " 2. updating Experience\n" +
                       " 3. deleting Experience\n" +
                       " 4. searching Experience\n");
               int choseintern = Integer.parseInt(scanner.nextLine());
               switch (choseintern) {
                  case 1:
                     functionInternship.Updating();
                     break;
                  case 2:
                    //functionInternship.Updating();
                     // The system is under warranty
                     break;
                  case 3:
                     functionInternship.Deleting();
                     break;
                  case 4:
                     functionInternship.Searching();
                     break;

               }
               break;
            case 4:
               // searching all
               break;
            case 5:
               flag = false;
               break;

         }

      } while (flag);

   }
}
