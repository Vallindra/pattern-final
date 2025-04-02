package TaskHandlingCOR;

import StudentDecorator.StudentType;


public class TarikatHandler implements SolutionHandler {
    private SolutionHandler nextHandler;

    @Override
    public void setNextHandler(SolutionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleSolution(String solution, StudentType type) {
        if (type == StudentType.TARIKAT) {
            System.out.println("Added to Tarikat pile: " + solution);
        } else if (nextHandler != null) {
            System.out.println("NOPE 2 ne e tarikat");
            nextHandler.handleSolution(solution, type);
        }
    }
}
