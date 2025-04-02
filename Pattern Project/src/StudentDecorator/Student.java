package StudentDecorator;

import TaskFactory.TaskFactory;
import TaskFactory.Task;


public class Student {
    public String name;
    public StudentType type;
    public Task task;

    public Student(String name, StudentType type) {
        this.name = name;
        this.type = type;
        this.task = new TaskFactory().createTask(type);
    }

    public void takeExam() {
        System.out.println(name + " (" + type + ") is solving: " + task.getType());
    }

    public String submitSolution() {
        return name + "'s solution to " + task.getType();
    }

    //public void acquirePower(SuperPower power) { // nvm
      //  System.out.println(name + " acquired power: " + power.usePower());
    //}
}