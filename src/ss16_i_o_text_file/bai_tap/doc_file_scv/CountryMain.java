package ss16_i_o_text_file.bai_tap.doc_file_scv;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryMain {

    public static void docFile() {
        try {
            // Đọc file theo đường dẫn
            File file = new File("src\\ss16_i_o_text_file\\bai_tap\\doc_file_scv\\tesxt.csv");

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            // Đọc từng dòng của file và tiến hành cộng tổng lại
            FileReader fileReader= new FileReader(file);
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
        CountryMain.docFile();
    }
}
