package model;

import enums.GradeEnum;
import enums.SexTypeEnum;

public class Collabs extends Person{

    private GradeEnum grade;
    private String email;
    private String adress;
    private int emp_id;
    private int salary;


    /*** constructors ***/
    public Collabs(){}

    public Collabs(String firstname, String lastname, int age, SexTypeEnum sex, GradeEnum grade, String email, String adress, int emp_id, int salary) {
        super(firstname, lastname, age, sex);
        this.grade = grade;
        this.email = email;
        this.adress = adress;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    public Collabs(GradeEnum grade, String email, String adress, int emp_id, int salary) {
        this.grade = grade;
        this.email = email;
        this.adress = adress;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    /*** getters  and setters ***/
    public GradeEnum getGrade() {
        return grade;
    }

    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /*** print into String ***/
    @Override
    public String toString() {
        return "Collabs{" +
                "grade=" + grade +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", emp_id=" + emp_id +
                ", salary=" + salary +
                '}';
    }
}
