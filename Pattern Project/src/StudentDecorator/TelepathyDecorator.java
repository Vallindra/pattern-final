package StudentDecorator;


public class TelepathyDecorator extends StudentDecorator {
    public TelepathyDecorator(Student student) {
        super(student);
    }

    @Override
    public void takeExam() {
        super.takeExam();
        System.out.println(name + " is using telepathy to read others' minds!");
    }
}