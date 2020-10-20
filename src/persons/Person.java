package persons;

public abstract class Person {

    protected String firstName;  /*имя человека*/
    protected String lastName;   /*фамилия человека*/
    protected int age;           /*возраст человека*/

    /*
     * КОНСТРУКТОРЫ
     */

    /*конструктор по умолчанию*/
    public Person() {
        this("Имя не задано", "Фамилия не задана", 0);
    }

    /*конструктор с параметрами*/
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /*
     * ГЕТТЕРЫ И СЕТТЕРЫ
     */

    /*возвращает имя человека*/
    public String getFirstName() {
        return firstName;
    }

    /*устанавливает человеку имя*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /*возвращает фамилию человека*/
    public String getLastName() {
        return lastName;
    }

    /*устанавливает человеку фамилию*/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*возвращает возраст человека*/
    public int getAge() {
        return age;
    }

    /*устанавливает человеку возраст*/
    public void setAge(int age) {
        this.age = age;
    }
}
