package tasks;

public class Code extends Task {

    String textOfCode;             /*текст кода*/

    /*
     * КОНСТРУКТОРЫ
     */

    /*конструктор по умолчанию*/
    public Code() {
        super();
        textOfCode = "Код отсутствует";
    }

    /*конструктор с параметрами*/
    public Code(int numberOfTask, String textOfTask, String textOfCode) {
        super(numberOfTask, textOfTask);
        this.textOfCode = textOfCode;
    }

    /*
     * ГЕТТЕРЫ И СЕТТЕРЫ
     */

    public String getTextOfCode() {
        return textOfCode;
    }

    public void setTextOfCode(String textOfCode) {
        this.textOfCode = textOfCode;
    }
}
