public class Student {
    int age;
    int numberOfGroup;
    int numberOfCompletedTasks;
    int numberOfCompletedModules;
    String firstName;
    String lastName;
    String aimOfStudy;
    boolean experience;

    public Student(int age, String firstName, String lastName) {
        this(age, 0, 0, 0, firstName, lastName,
                "Get a job as a Java developer", false);
    }

    public Student(int age, int numberOfGroup, int numberOfCompletedTasks, int numberOfCompletedModules,
                   String firstName, String lastName, String aimOfStudy, boolean experience) {
        this.age = age;
        this.numberOfGroup = numberOfGroup;
        this.numberOfCompletedTasks = numberOfCompletedTasks;
        this.numberOfCompletedModules = numberOfCompletedModules;
        this.firstName = firstName;
        this.lastName = lastName;
        this.aimOfStudy = aimOfStudy;
        this.experience = experience;
    }

    toCompleteTask() {

    }

    toAsk() {

    }

    passModule() {

    }

    talkToCurator() {

    }

}
