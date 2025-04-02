package StudentDecorator;


public class InfraredVisionDecorator extends StudentDecorator {
    public InfraredVisionDecorator(Student student) {
        super(student);
    }

    @Override
    public void takeExam() {
        super.takeExam();
        System.out.println(name + " is using infrared vision to see through papers!");
    }
}