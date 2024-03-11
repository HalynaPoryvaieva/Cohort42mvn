package lesson24Hw;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw24,Task 2
 * @version 11-Mar-24
 * @author Halyna Poryvaieva
 */
public class Student {
    private int id;
    private String name;
    private String groupName;

    public Student(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
