package tasks;

public interface Autochecked {

    /*метод "выполнить задание"*/
    default public void toPerformTask() {
        System.out.println("Задание выплонено");
    }
}
