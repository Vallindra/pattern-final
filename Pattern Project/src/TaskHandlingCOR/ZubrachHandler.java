package TaskHandlingCOR;

import StudentDecorator.StudentType;


public class ZubrachHandler implements SolutionHandler {
    private SolutionHandler nextHandler;

    @Override
    public void setNextHandler(SolutionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleSolution(String solution, StudentType type) {
        if (type == StudentType.ZUBRACH) {
            System.out.println("Added to Zubrach pile: " + solution);
        } else if (nextHandler != null) {
            System.out.println("NOPE 1 ne e zubrach");
            nextHandler.handleSolution(solution, type);
        }
    }
}