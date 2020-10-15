public class Student {
    private int age;
    private int numberOfGroup;
    private int numberOfPassedTasks;
    private int numberOfPassedModules;
    private String firstName;
    private String lastName;
    private String aimOfStudy;
    private boolean experience;
    private static int sumSolvedTasksOfAllStudents = 0;
    private static int maxOfPassedModules = 0;
    public static final int MAX_NUMBER_OF_MODULES = 55;


    public Student(int age, String firstName, String lastName) {
        this(age, 0, 0, 0, firstName, lastName,
                "Get a job as a Java developer", false);
    }

    public Student(int age, int numberOfGroup, int numberOfCompletedTasks, int numberOfCompletedModules,
                   String firstName, String lastName, String aimOfStudy, boolean experience) {
        this.age = age;
        this.numberOfGroup = numberOfGroup;
        this.numberOfPassedTasks = numberOfCompletedTasks;
        this.numberOfPassedModules = numberOfCompletedModules;
        this.firstName = firstName;
        this.lastName = lastName;
        this.aimOfStudy = aimOfStudy;
        this.experience = experience;
    }

    public void toCompleteTask() {
        sumSolvedTasksOfAllStudents++;
        System.out.println("Задача выполнена");
    }

    /*toAsk() {

    }*/

    public void toPassModule() {
        if (numberOfPassedModules == MAX_NUMBER_OF_MODULES) {
            System.out.println("Все модули пройдены");
            return;
        }
        numberOfPassedModules++;
        System.out.println("Модуль пройден");
        if (numberOfPassedModules > maxOfPassedModules) {
            maxOfPassedModules = numberOfPassedModules;
        }
    }

    /*talkToCurator() {

    }*/

}
