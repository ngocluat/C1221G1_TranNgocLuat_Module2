package case_study_module2.utils.read_and_write_file;

import case_study_module2.services.IToStringCSV;
import case_study_module2.services.serviceI_mpl.IToStringSet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class WriteBooking {

        public static <T> void writeListString(String filePath, Set<T> list, boolean append) {
            File file = new File(filePath);
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(file, append);
                bufferedWriter = new BufferedWriter(fileWriter);
                for (T t :list) {
                    bufferedWriter.write(((IToStringSet) t).write());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
