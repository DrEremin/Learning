import java.util.Random;
import persons.*;
import tasks.*;

public class SkillFactory {

    public static final int lengthTask = 40; /*константа длины массива заданий*/

    public static void main(String[] args) {

        int lengthStudent;                   /* переменная, хранящая длину массива студентов */
        int randomNumberOfTasks;             /*случайное количество задач для решения*/
        int limitSolvedTasksOfAllStudents;   /* лимит всех заданий для всех студентов */
        Random random = new Random();        /* объект для получения случайных значений */
        Task[] task = new Task[lengthTask];  /* массив заданий */

        /*массив менторов*/
        Mentor[] mentor = new Mentor[]{ new Mentor("Иван", "Иванов", 30),
                new Mentor("Сергей", "Сергеев", 35) };

        Student[] student = new Student[6]; /* массив студентов */

        String[] firstName = new String[]{"Андрей", "Максим", "Денис", "Анна", "Петр", "Елена"};
        String[] lastName = new String[]{"Алексеев", "Матвеев", "Сидоров", "Никонорова",
                "Денисов", "Артемьева"};

        lengthStudent = student.length;
        /* инициализация массива объектов класса Student */
        for (int i = 0; i < lengthStudent; i++) {
            student[i] = new Student(firstName[i], lastName[i], 25 + i, mentor[i % 2]);
            System.out.println("Студент " + student[i].getFirstName() + " " + student[i].getLastName() +
                    ", Ментор " + student[i].getMentor());
        }

        /* инициализация массива объектов наследников класса Task */
        for (int i = 0, j; i < task.length; i++) {
            j = random.nextInt(300);
            if (( j / 100) == 0) {
                task[i] = new Test(i, String.format("текст задания №%d", i));
            } else if (( j / 100) == 1) {
                task[i] = new DragAndDrop(i, String.format("текст задания №%d", i));
            } else if ((j / 100) == 2) {
                task[i] = new Code(i, String.format("текст задания №%d", i), "текст кода");
            }
            System.out.println("Тип объекта [" + i + "]" +  " " + task[i].getClass());
        }
        limitSolvedTasksOfAllStudents = task.length * lengthStudent;

        /*основной цикл обучения*/
        while (Student.getSumSolvedTasksOfAllStudents() < limitSolvedTasksOfAllStudents) {
            randomNumberOfTasks = random.nextInt(lengthTask - 1) + 1;
            System.out.println("Количество задач для решения студентами " + randomNumberOfTasks);
            for (int i = 0; i < lengthStudent; i++) {
                System.out.printf("Студент %s %s решает задачи...\n", student[i].getFirstName(),
                        student[i].getLastName());
                student[i].toSolveTasks(randomNumberOfTasks, task);
            }
            System.out.println("Ощее число решенных всеми студентами задач составляет " +
                    Student.getSumSolvedTasksOfAllStudents());
            System.out.println("========================================================");

        }
    }
}
