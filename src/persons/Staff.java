package persons;

public interface Staff {

    /*метод без реализации "помочь студенту"*/
    public void helpToStudent(Student student);

    /*дефолтный метод "дать дополнительные материалы"*/
    default public void giveAdditionalMaterials() {
        System.out.println("https://habr.com/en/hubs/");
    }
}
