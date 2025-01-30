package HCI.Tech_Minds_Academy_MiniSystem;

import javax.swing.*;
import java.util.Date;

public class Student {


    private String fName;
    private String lName;
    private String birthDate;
    private String age;
    private String contactNumber;
    private String gender;
    private String course;
    private String year;

    public Student(String fName, String lName, String birthDate, String age, String contactNumber, String gender, String course, String year) {
        this.fName = fName ;
        this.lName = lName;
        this.birthDate = birthDate;
        this.age = age;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.course = course;
        this.year = year;
    }

    public String toString() {
        return "[Student: " +
                "FirstName = '" + fName + '\'' +
                ", LastName = '" + lName + '\'' +
                ", BirthDate = '" + birthDate + '\'' +
                ", age='" + age + '\'' +
                ", contact = '" + contactNumber + '\'' +
                ", sex = '" + gender + '\'' +
                ", course = '" + course + '\'' +
                ", year = '" + year + '\'' +
                ']';
    }

    public String getFirstName() {

        return fName;
    }

    public String getLastName() {

        return lName;
    }

    public String getBirthDate() {

        return birthDate;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }
    public void setLastName(String lName) {
        this.lName = lName;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String setAge(String age) {

        return age;
    }
    public String setContactNumber(String contactNumber) {
        return contactNumber;
    }
    public String setGender(String gender) {
        return gender;
    }
    public String setCourse(String course) {
        return course;
    }
public String setYear(String year) {
        return year;
}
}
