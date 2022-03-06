package candidate_management.model;

public class Experience extends Person {
  private   int yearOfExperience;
    private  String professionalSkill;


    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, String birth, String address, long phone, String email, int candidateType, int yearOfExperience, String professionalSkill) {
        super(id, firstName, lastName, birth, address, phone, email, candidateType);
        this.yearOfExperience = yearOfExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                super.toString()+
                "yearOfExperience=" + yearOfExperience +
                ", professionalSkill='" + professionalSkill + '\'' +
                '}';
    }
}
