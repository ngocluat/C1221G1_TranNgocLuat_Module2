package collection_review.model;

public class Intern extends Person {
    //Majors University University name
   private String majors;
   private int university;
   private String universityName;

    public Intern() {
    }

    public Intern(int id, String firstName, String lastName, String birth, String address, long phone, String email, int candidateType, String majors, int university, String universityName) {
        super(id, firstName, lastName, birth, address, phone, email, candidateType);
        this.majors = majors;
        this.university = university;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getUniversity() {
        return university;
    }

    public void setUniversity(int university) {
        this.university = university;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                super.toString() +
                "majors='" + majors + '\'' +
                ", university=" + university +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
