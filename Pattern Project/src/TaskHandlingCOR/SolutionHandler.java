package TaskHandlingCOR;

import StudentDecorator.StudentType;


public interface SolutionHandler {
    void setNextHandler(SolutionHandler nextHandler);
    void handleSolution(String solution, StudentType type);
}