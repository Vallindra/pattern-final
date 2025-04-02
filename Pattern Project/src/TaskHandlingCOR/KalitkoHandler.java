package TaskHandlingCOR;

import StudentDecorator.StudentType;


public class KalitkoHandler implements SolutionHandler {
    private SolutionHandler nextHandler;

    @Override
    public void setNextHandler(SolutionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleSolution(String solution, StudentType type) {
        if (type == StudentType.KALITKO) {
            System.out.println("Added to Kalitko pile: " + solution);
        } else if (nextHandler != null) {
            System.out.println("NOPE 3");
            nextHandler.handleSolution(solution, type);
        }
    }
}
