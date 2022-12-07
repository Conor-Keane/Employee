package ie.atu;

public class Employee {
    private String name;
    private String ppsId;
    private String employmentType;
    private String gender;
    private int age;

    public Employee(String name, String ppsId, String employmentType, String gender, int age) {
        setName(name);
        setPpsId(ppsId);
        setEmploymentType(employmentType);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }
    public String getPpsId() { return ppsId; }
    public String getEmploymentType() { return employmentType; }
    public String getGender() { return gender; }
    public int getAge() { return age; }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public void setPpsId(String ppsId) { this.ppsId = ppsId; }

    public void setGender(String gender) { this.gender = gender;}

    public void setAge(int age) {this.age = age;}

}
