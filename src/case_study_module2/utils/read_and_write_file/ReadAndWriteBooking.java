package case_study_module2.utils.read_and_write_file;

import case_study_module2.model.Booking;
import case_study_module2.model.Contract;
import case_study_module2.services.BookingCompater;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    private static final String NAME_FILE_BOOKING ="src\\case_study_module2\\data\\booking.csv" ;
    private static final String NAME_FILE_CONTRACT ="src\\case_study_module2\\data\\contracFile.csv" ;

    private static List<String> readListString(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static Set<Booking> readSet() {
        Set<Booking> bookingSet = new TreeSet<>(new BookingCompater());
        List<String> stringList = readListString(NAME_FILE_BOOKING);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Booking booking = new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            bookingSet.add(booking);
        }
        return bookingSet;
    }
    public static List<Contract> readListConTract() {
        List<Contract> contractList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE_CONTRACT);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Contract contract = new Contract(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), arr[4]);
            contractList.add(contract);
        }
        return contractList;
    }
}
