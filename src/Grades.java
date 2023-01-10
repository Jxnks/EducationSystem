public class Grades {
    private int mathsGrade;
    private int englishGrade;

    public Grades() {
        this.mathsGrade = 0;
        this.englishGrade = 0;
    }

    public void setGrades(int mathsGrade, int englishGrade){
        this.mathsGrade = mathsGrade;
        this.englishGrade = englishGrade;
    }

    public void setMathsGrade(int mathsGrade) {
        this.mathsGrade = mathsGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getMathsGrade() {
        System.out.println("Maths grade: " + mathsGrade);
        return mathsGrade;
    }

    public int getEnglishGrade() {
        System.out.println("English grade: " + englishGrade);
        return englishGrade;
    }

    public void getGrades() {
        this.getMathsGrade();
        this.getEnglishGrade();
    }
}
