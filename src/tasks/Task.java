package tasks;

public abstract class Task {

    protected int numberOfTask;         /*номер задания*/
    protected String textOfTask;        /*текст задания*/

    /*
     * КОНСТРУКТОРЫ
     */

    /*конструктор по умолчанию*/
    public Task() {
        numberOfTask = 0;
        textOfTask = "отсутствует";
    }

    /*конструктор с параметрами*/
    public Task(int numberOfTask, String textOfTask) {
         this.numberOfTask = numberOfTask;
         this.textOfTask = textOfTask;
    }

    /*
     * ГЕТТЕРЫ И СЕТТЕРЫ
     */

    /*возвращает номер задачи*/
    public int getNumberOfTask() {
        return numberOfTask;
    }

    /*устанавливает номер задачи*/
    public void setNumberOfTask(int numberOfTask) {
        this.numberOfTask = numberOfTask;
    }

    /*возвращает текст задачи*/
    public String getTextOfTask() {
        return textOfTask;
    }

    /*возвращает текст задачи*/
    public void setTextOfTask(String textOfTask) {
        this.textOfTask = textOfTask;
    }
}
