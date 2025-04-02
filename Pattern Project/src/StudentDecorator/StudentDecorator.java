package StudentDecorator;


public abstract class StudentDecorator extends Student {
    public Student decoratedStudent;

    public StudentDecorator(Student student) {
        super(student.name, student.type);
        this.decoratedStudent = student;
    }

    @Override
    public void takeExam() {
        decoratedStudent.takeExam();
    }

    @Override
    public String submitSolution() {
        return decoratedStudent.submitSolution();
    }
}
