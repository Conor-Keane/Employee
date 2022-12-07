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
        this.name= name;
    }

    public void setEmploymentType(String employmentType) {
        if("Full-time".equalsIgnoreCase(employmentType) || "Part-time".equalsIgnoreCase(employmentType) || "Contract".equalsIgnoreCase(employmentType)){
            this.employmentType = employmentType;
        }
        else {
            throw new IllegalArgumentException("Enter Part-time, Full-time or Contract, make sure to have the - for example, between part and time");
        }
    }

    public void setPpsId(String ppsId) { this.ppsId = ppsId; }

    public void setGender(String gender) {
        if("Male".equalsIgnoreCase(employmentType) || "Female".equalsIgnoreCase(employmentType) || "Non-Binary".equalsIgnoreCase(employmentType)){
            this.employmentType = employmentType;
        }
        else {
            throw new IllegalArgumentException("Male, Female or non-binary, make sure to have the - for example, non-Binary");
        }
    }

    public void setAge(int age) {
        if(age > 15 || age < 66) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Must be over 16 and under 66");
        }
    }
}
