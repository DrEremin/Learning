package tasks;

public class DragAndDrop extends Task implements Autochecked {

    String[][] variants;            /*двумерный массив с вариантами*/

    /*
     * КОНСТРУКТОРЫ
     */

    /*конструктор по умолчанию*/
    public DragAndDrop() {
        super();
        variants = new String[][]{{"вариант 1", "вариант 2"},
                {"вариант 3", "вариант 4"}};
    }

    /*конструктор с двумя параметрами*/
    public DragAndDrop(int numberOfTask, String textOfTask) {
        super(numberOfTask, textOfTask);
        this.variants = new String[][]{{"вариант 1", "вариант 2"},
                {"вариант 3", "вариант 4"}};;
    }
    /*конструктор со всеми параметрами*/
    public DragAndDrop(int numberOfTask, String textOfTask, String[][] variants) {
        super(numberOfTask, textOfTask);
        this.variants = variants;
    }

    /*
     * ГЕТТЕРЫ И СЕТТЕРЫ
     */

    /*возвращает двумерный массив с вариантами*/
    public String[][] getVariants() {
        return variants;
    }

    /*присваивает ссылку на двумерный массив с вариантами*/
    public void setVariants(String[][] variants) {
        this.variants = variants;
    }
}
