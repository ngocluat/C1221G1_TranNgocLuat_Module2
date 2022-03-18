package case_study_module2.utils.read_and_write_file;

import case_study_module2.model.facility.House;
import case_study_module2.model.facility.Room;
import case_study_module2.model.facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFacility {

    final static String NAME_FILE_VILLA = "src\\case_study_module2\\data\\vilaFile.csv";
    final static String NAME_FILE_ROOM = "src\\case_study_module2\\data\\roomFile.csv";
    final static String NAME_FILE_HOUSE = "src\\case_study_module2\\data\\HouseFile.csv";
// dọc file
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
        }
        catch (FileNotFoundException e ){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Villa> readVillaList() {
        List<Villa> villaList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE_VILLA);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Villa villa = new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]),
                    Integer.parseInt(arr[8]));
            villaList.add(villa);
        }
      return  villaList;
    }

    public static List<Room> readRoomList() {
        List<Room> villaList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE_ROOM);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            Room room = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6]);
            villaList.add(room);
        }
        return villaList;
    }

    public static List<House> readHouseList() {
        List<House> houseList = new ArrayList<>();
        List<String> stringList = readListString(NAME_FILE_HOUSE);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            House house = new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7]));
            houseList.add(house);

        }
        return houseList;
    }

}
