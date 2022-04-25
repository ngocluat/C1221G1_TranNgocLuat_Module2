package case_study_module2.services;

import case_study_module2.model.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingCompater implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate startDatel = LocalDate.parse(o1.getNgayBatDau(), formatter);
            LocalDate startDate2 = LocalDate.parse(o2.getNgayBatDau(), formatter);
            LocalDate endDatel = LocalDate.parse(o2.getNgayKetThuc(), formatter);

            LocalDate endDate2 = LocalDate.parse(o2.getNgayKetThuc(), formatter);
            if (startDatel.compareTo(startDate2) < 0) {
                return 1;
            } else if (startDatel.compareTo(startDate2) < 0) {
                return -1;
            } else {
                if (endDatel.compareTo(endDate2) > 0) {
                    return 1;
                } else if (endDatel.compareTo(endDate2) < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }


}