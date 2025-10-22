package university;

public class Student {

    private String name;
    private int age;
    private int yearOfStudy;
    private String collegeName;

    public Student(String name, int age, int yearOfStudy, String collegeName) {
        this.name = name;
        this.age = age;
        this.yearOfStudy = yearOfStudy;
        this.collegeName = collegeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

}