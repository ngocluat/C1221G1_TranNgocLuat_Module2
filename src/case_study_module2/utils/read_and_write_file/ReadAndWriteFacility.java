package case_study_module2.utils.read_and_write_file;

import case_study_module2.model.House;
import case_study_module2.model.Room;
import case_study_module2.model.Villa;

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


    //        ghi file
    private static void writeListString(String filePath, List<String> stringList, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeListVilla(List<Villa> villaList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Villa c : villaList) {
            stringList.add(c.toStringFacility());
        }
        writeListString(NAME_FILE_VILLA, stringList, append);
    }

    public static void writeListRoom(List<Room> roomList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Room c : roomList) {
            stringList.add(c.toStringFacility());
        }
        writeListString(NAME_FILE_ROOM, stringList, append);
    }

    public static void writeListHouse(List<House> houseList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (House c : houseList) {
            stringList.add(c.toStringFacility());
        }
        writeListString(NAME_FILE_HOUSE, stringList, append);
    }
}
