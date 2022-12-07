package ie.atu;

public class Employee {
    private String name;
    private String ppsId;
    private String employmentType;
    private String gender;
    private int age;

    public Employee(String name, String ppsId, String employmentType, String gender, int age) {
        this.name = name;
        this.ppsId = ppsId;
        this.employmentType = employmentType;
        this.gender = gender;
        this.age = age;
    }
}
