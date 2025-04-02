
package TaskFactory;

import StudentDecorator.StudentType;

//import java.util.Random; //nvm

public class TaskFactory {
    public Task createTask(StudentType type) {
        switch (type) {
            case ZUBRACH:
                return new TrickyTask();
            case TARIKAT:
                return new ShortTask();
            case KALITKO:
                return new KnownTask();
            default:
                return new TrickyTask(); // NUKE THE BUILDING THERES AN ALIEN
                //throw new IllegalArgumentException("Unknown student type");
        }
    }
}

