package persons;

import tasks.*;
import java.util.Random;

public class Mentor extends Person implements Staff {

    private boolean moodOfMentor;               /*значение настроения ментора*/
    public final Random random = new Random(); /*константа рандома*/

    /*
     * КОНСТРУКТОРЫ
     */

    /*конструктор по умолчанию*/
    Mentor() {
        super();
        moodOfMentor = true;
    }

    /*конструктор с параметрами*/
    public Mentor(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        moodOfMentor = true;
    }

    /*
     * ГЕТТЕРЫ И СЕТТЕРЫ
     */

    /*возвращает настроение ментора*/
    public boolean getMoodOfMentor() {
        return moodOfMentor;
    }

    /*устанавливает ментору настроение*/
    public void setMoodOfMentor(boolean moodOfMentor) {
        this.moodOfMentor = moodOfMentor;
    }

    /*
     * ПРОЧИЕ МЕТОДЫ
     */

    /*переопределенный метод подбадривания студета*/
    @Override
    public void helpToStudent(Student student) {
        System.out.println("Уважаемый " + student.getFirstName() +
                "! Не падайте духом! Я помогу Вам разобраться в этом:)");
    }

    /*метод проверки, присланного студентом кода*/
    boolean checkToCode(Task task) {
        if (random.nextInt() > 1000) {
            System.out.println("Задача №" + task.getNumberOfTask() + " принята");
            return this.moodOfMentor = true;
        } else {
            System.out.println("Задача №" + task.getNumberOfTask() + " не принята");
            return this.moodOfMentor = false;
        }
    }
}
