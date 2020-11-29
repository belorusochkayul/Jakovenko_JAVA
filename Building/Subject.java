public class Subject {
    private String subjectName;
    private int subjectSquare;

    public Subject(String subjectName, int subjectSquare) {
        this.subjectName = subjectName;
        this.subjectSquare = subjectSquare;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectSquare() {
        return subjectSquare;
    }

    public void setSubjectSquare(int subjectSquare) {
        this.subjectSquare = subjectSquare;
    }
}