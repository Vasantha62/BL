package model;

public class Student {
    private int id;
    private String name;
    private String branch;

    // for INSERT
    public Student(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    // for READ
    public Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getBranch() { return branch; }
}
