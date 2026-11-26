package se.iths.eitvydas.main.model;

public class Department {
    private Integer departmentId;
    private String name;
    private String city;

    public Department(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

