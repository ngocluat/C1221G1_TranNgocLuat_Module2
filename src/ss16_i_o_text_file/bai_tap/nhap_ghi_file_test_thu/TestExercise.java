package ss16_i_o_text_file.bai_tap.nhap_ghi_file_test_thu;

import java.io.*;
import java.util.Scanner;

public class TestExercise {
    // ghi file
    public static void writeStudentToCSV(String path) {
        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            boolean flag = true;
            int check = 1;
            do {// nhập nhiều
                System.out.println(" nhập tên bạn muôn thêm ");
                bufferedWriter.write(scanner.nextLine());

                bufferedWriter.newLine();
                System.out.println("bạn có muốn ghi thêm \n" +
                        "1. có \n" +
                        "2. không");
                int chose = Integer.parseInt(scanner.nextLine());
                if (chose == check) {
                    flag = true;
                } else {
                    flag = false;
                }
            } while (flag);
//            bufferedWriter.write(scanner.nextLine());   // nhập 1
//                bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //            đọc fole
    public static void docFile() {
        try {
            // Đọc file theo đường dẫn
            File file = new File("src\\ss16_i_o_text_file\\bai_tap\\copy_file_text_assignment\\sourcefile");

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            // Đọc từng dòng của file và tiến hành cộng tổng lại
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";

            while ((line = br.readLine()) != null) {
                System.err.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        TestExercise.writeStudentToCSV("src\\ss16_i_o_text_file\\bai_tap\\copy_file_text_assignment\\sourcefile");
        TestExercise.docFile();
        TestExercise.writeStudentToCSV("src\\ss16_i_o_text_file\\bai_tap\\copy_file_text_assignment\\targetfile");
        TestExercise.docFile();
    }
}
