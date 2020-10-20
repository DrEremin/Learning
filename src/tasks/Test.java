package tasks;

public class Test extends Task implements Autochecked {

    private String[] answers;            /*массив с ответами*/

    /*
     * КОНСТРУКТОРЫ
     */

    /*конструктор по умолчанию*/
    public Test() {
        super();
        answers = new String[]{"a", "b", "c"};
    }

    /*конструктор с двумя параметрами*/
    public Test(int numberOfTask, String textOfTask) {
        super(numberOfTask, textOfTask);
        this.answers = new String[]{"a", "b", "c"};
    }

    /*конструктор со всеми параметрами*/
    public Test(int numberOfTask, String textOfTask, String[] answers) {
        super(numberOfTask, textOfTask);
        this.answers = answers;
    }

    /*
     * ГЕТТЕРЫ И СЕТТЕРЫ
     */

    /*возвращает массив с ответами*/
    public String[] getAnswers() {
        return answers;
    }

    /*присваивает ссылку на массив с ответами*/
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
}
