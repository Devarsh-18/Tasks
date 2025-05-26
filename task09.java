public class task {
    private int number;
    private String name;
    private float grade;
    private char gradeLetter;
private boolean passed;
private String status;
public task(int number, String name, float grade, char gradeLetter, boolean passed, String status) {
	super();
	this.number = number;
	this.name = name;
	this.grade = grade;
	this.gradeLetter = gradeLetter;
	this.passed = passed;
    this.status = status;
}
public int getNumber() {
    return number;

}
public String getName() {
    return name;

}
public float getGrade() {
    return grade;

}
public char getGradeLetter() {
    return gradeLetter;

}
public boolean isPassed() {
    return passed;
}

    public String getStatus() {
        return status;
    }

    static class main{
    public static void main(String[] args) {
        task t1 = new task(25, "John Doe", 88.75F, 'A', true, "passed");
        System.out.println("student number is - " + t1.getNumber());
        System.out.println("student name is - " +t1.getName());
        System.out.println("student grade is - " +t1.getGrade());
        System.out.println("student grade number is - " +t1.getGradeLetter());
        System.out.println("student examination pass status - " +t1.isPassed());
        System.out.println("pass/fail status - " +t1.getStatus() + "");

    }
}


}

