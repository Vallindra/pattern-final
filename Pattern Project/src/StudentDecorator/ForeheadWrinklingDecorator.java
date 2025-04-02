package StudentDecorator;


public class ForeheadWrinklingDecorator extends StudentDecorator {
    public ForeheadWrinklingDecorator(Student student) {
        super(student);
    }

    @Override
    public void takeExam() {
        super.takeExam();
        System.out.println(name + " is wrinkling forehead for deep thinking!");
    }
}
