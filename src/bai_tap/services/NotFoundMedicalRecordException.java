package bai_tap.services;

public class NotFoundMedicalRecordException extends  Exception {
    public NotFoundMedicalRecordException(String message) {
        super(message);
    }
}
