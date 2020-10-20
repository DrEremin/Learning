package persons;

import tasks.*;

public class Student extends Person {

    private int numberOfPassedTasks;  /*количество решенных задач*/
    private Mentor mentor;            /*закрепленный за студентом ментор*/
    private boolean solvedAllTasks;   /*признак решения студентом всех задач*/

    /*счетчик количеста решенных заданий у всех студентов*/
    private static int sumSolvedTasksOfAllStudents = 0;

    /*
     * КОНСТРУКТОРЫ
     */

    /*конструктор по умолчанию*/
    public Student () {
        super();
        numberOfPassedTasks = 0;
        solvedAllTasks = false;
    }

    /*конструктор с параметрами*/
    public  Student (String firstName, String lastName, int age, Mentor mentor) {
        super(firstName, lastName, age);
        numberOfPassedTasks = 0;
        solvedAllTasks = false;
        this.mentor = mentor;
    }

    /*
     * ГЕТТЕРЫ И СЕТТЕРЫ
     */

    /*возвращает число решенных, студентом, задач*/
    public int getNumberOfPassedTasks() {
        return numberOfPassedTasks;
    }

    /*устанавливает число решенных, студентом, задач*/
    public void setNumberOfPassedTasks(int numberOfPassedTasks) {
        this.numberOfPassedTasks = numberOfPassedTasks;
    }

    /*возвращает имя и фамилию ментора, прикрепленного за студентом*/
    public String getMentor() {
        return mentor.getFirstName() + " " + mentor.getLastName();
    }

    /*закрепляет ментора за студентом*/
    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    /*возвращает состояние флага решения, студентом, всех задач*/
    public boolean getSolvedAllTasks() {
        return solvedAllTasks;
    }

    /*устанавливает флаг решения, студентом, всех задач в определенное состояние*/
    public void setSolvedAllTasks(boolean solvedAllTasks) {
        this.solvedAllTasks = solvedAllTasks;
    }

    /*возвращает число решенных задач всеми студентами*/
    public static int getSumSolvedTasksOfAllStudents() {
        return sumSolvedTasksOfAllStudents;
    }

    /*
     * ПРОЧИЕ МЕТОДЫ
     */

    /*метод решения задачи*/
    private void toSolveTask(Task task) {
        boolean moodOfMentor = false;

        if (task instanceof Autochecked) {
            numberOfPassedTasks++;
            sumSolvedTasksOfAllStudents++;
            System.out.println("Задача №" + task.getNumberOfTask() + " выполнена");
            return;
        } else {
            while (!moodOfMentor) {
                moodOfMentor = mentor.checkToCode(task);
            }
            numberOfPassedTasks++;
            sumSolvedTasksOfAllStudents++;
        }
    }

    /*метод решения заданного количества задач*/
    public void toSolveTasks(int numberOfTasks, Task[] tasks) {
        int limitOfSolves;
        if (solvedAllTasks)
            return;
        if (numberOfTasks > tasks.length - this.numberOfPassedTasks - 1) {
            limitOfSolves = tasks.length;
        } else {
            limitOfSolves = this.numberOfPassedTasks + numberOfTasks;
        }
        for (int i = this.numberOfPassedTasks; i < limitOfSolves; i++) {
            this.toSolveTask(tasks[i]);
            if (this.numberOfPassedTasks == tasks.length) {
                System.out.println("Студент " + this.firstName + " " + this.lastName
                        + " решил все задачи");
                this.solvedAllTasks = true;
                return;
            }
        }
        System.out.println("Студент " + this.firstName + " " + this.lastName
                    + " решил не все задачи");
    }
}
