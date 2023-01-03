public class Grades {
    private int mathsGrade;
    private int englishGrade;

    public Grades() {
        this.mathsGrade = 0;
        this.englishGrade = 0;
    }

    public void setMathsGrade(int mathsGrade) {
        this.mathsGrade = mathsGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getMathsGrade() {

        return mathsGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }
}
