import StudentDecorator.*;
import TaskHandlingCOR.KalitkoHandler;
import TaskHandlingCOR.SolutionHandler;
import TaskHandlingCOR.TarikatHandler;
import TaskHandlingCOR.ZubrachHandler;
import UniversitySingleton.University;


public class ExamApp {
    public static void main(String[] args) {
        SolutionHandler zubrachHandler = new ZubrachHandler();
        SolutionHandler tarikatHandler = new TarikatHandler();
        SolutionHandler kalitkoHandler = new KalitkoHandler();

        zubrachHandler.setNextHandler(tarikatHandler);
        tarikatHandler.setNextHandler(kalitkoHandler);



        // I AINT TESTING ALLAT


        // Singleton University
        University university = University.getInstance();
        System.out.println("Exam starting at " + university.getClass().getSimpleName());

        // Create students of different types
        Student zubrach = new TelepathyDecorator(new Student("Mitko", StudentType.ZUBRACH));
        Student tarikat = new InfraredVisionDecorator(new Student("Petar", StudentType.TARIKAT));
        Student kalitko = new ForeheadWrinklingDecorator(new Student("Ivancho", StudentType.KALITKO));


        // Students take exam
        zubrach.takeExam();
        tarikat.takeExam();
        kalitko.takeExam();

        // Students submit solutions
        String zubrachSolution = zubrach.submitSolution();
        String tarikatSolution = tarikat.submitSolution();
        String kalitkoSolution = kalitko.submitSolution();


        // Set up Chain of Responsibility


        System.out.println("\n=== Grading Solutions ===");


        System.out.println("\n1. Handling Zubrach solution:");
        zubrachHandler.handleSolution(zubrachSolution, StudentType.ZUBRACH);
        // Expected: Handled by ZubrachHandler immediately

        System.out.println("\n2. Handling Tarikat solution:");
        zubrachHandler.handleSolution(tarikatSolution, StudentType.TARIKAT);
        // Expected:
        // - ZubrachHandler can't handle, passes to next
        // - TarikatHandler handles it

        System.out.println("\n3. Handling Kalitko solution:");
        zubrachHandler.handleSolution(kalitkoSolution, StudentType.KALITKO);
        // Expected:
        // - ZubrachHandler can't handle, passes to next
        // - TarikatHandler can't handle, passes to next
        // - KalitkoHandler handles it


        System.out.println("\n4. Handling solutions in random order:");
        // Mix up the order to show chain flexibility
        zubrachHandler.handleSolution(kalitkoSolution, StudentType.KALITKO);
        zubrachHandler.handleSolution(zubrachSolution, StudentType.ZUBRACH);
        zubrachHandler.handleSolution(tarikatSolution, StudentType.TARIKAT);
    }
}