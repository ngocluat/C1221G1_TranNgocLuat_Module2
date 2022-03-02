package ss11_generic_stack_queue.bai_tap.dem_so_lan_xuat_hien;

public class TestSoLanXuatHien {
    public static void main(String[] args) {

        String tenCuaToi = "tran ngoc luat tran luat";
        String tenVietHoa = tenCuaToi.toUpperCase();
        String[] demSoLuong = tenVietHoa.split(" ");

        for (int i = 0; i < demSoLuong.length; i++) {
            int count = 0;
            for (int j = 1; j < demSoLuong.length; j++) {
                if (demSoLuong[i].equals(demSoLuong[j])) {
                    count++;
                    System.out.println(demSoLuong[i] + " " );
                }
            }
            System.out.print(count);
        }
    }
}
