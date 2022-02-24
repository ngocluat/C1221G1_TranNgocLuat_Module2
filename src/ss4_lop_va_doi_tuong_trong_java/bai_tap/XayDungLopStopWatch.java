package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Date;

public class XayDungLopStopWatch {
    private long starTime;
    private long endTime;
    private long end, star;

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public XayDungLopStopWatch() {

    }

    public long startTime() {
        return star = new Date().getTime();

    }

    public long endTime() {
        return end = new Date().getTime();

    }
    public long ketThuc() {
        return end - star;

    }
    public static void main(String[] args) {
        XayDungLopStopWatch xayDungLopStopWatch = new XayDungLopStopWatch();
        System.out.println(xayDungLopStopWatch.startTime());
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                System.out.print("a");
            }
        }

        System.out.println("\n" + xayDungLopStopWatch.endTime());
        // từ giây * 10000==> miliGiaay
        System.out.println(xayDungLopStopWatch.ketThuc() * 10000);
    }
}
