package candidate_management.model;

public class Fresher extends Person {
    private int graduatedTime;
    private int rankOfGraduation;
    private String university;

    public Fresher() {
    }

    public Fresher(int id, String firstName, String lastName, String birth, String address, long phone, String email, int candidateType, int graduatedTime, int rankOfGraduation, String university) {
        super(id, firstName, lastName, birth, address, phone, email, candidateType);
        this.graduatedTime = graduatedTime;
        this.rankOfGraduation = rankOfGraduation;
        this.university = university;
    }

    public int getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(int graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    public int getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(int rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                super.toString() +
                "graduatedTime=" + graduatedTime +
                ", rankOfGraduation=" + rankOfGraduation +
                ", university='" + university + '\'' +
                '}';
    }

}
