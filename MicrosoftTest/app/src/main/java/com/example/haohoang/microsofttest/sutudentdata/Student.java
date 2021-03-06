package com.example.haohoang.microsofttest.sutudentdata;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tranh on 3/5/2017.
 */

public class Student {

    @SerializedName("personId")
    private String personid;
    @SerializedName("name")
    private String name;
    @SerializedName("userData")
    private String userData;
    private String idStudent;
    private String url;

    @Override
    public String toString() {
        return "Student{" +
                "personid='" + personid + '\'' +
                ", name='" + name + '\'' +
                ", idStudent='" + idStudent + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    // Hàm này service trả về
    public Student(String name, String userData) {
        // userData có dạng maxSV+" "URL
        this.name = name;
        this.userData = userData;
        String[] strings = userData.split(" ");
        strings[0] = this.idStudent;
        strings[1] = this.url;
    }

    // Hàm này do mình khởi tạo mới SInh viên
    public Student(String name, String idStudent, String url) {
        this.name = name;
        //bỏ hết dấu cách trong mã SV
        idStudent = idStudent.replaceAll("\\s", "");
        this.idStudent = idStudent;
        // bỏ hết dấu cách trong url
        url = url.replaceAll("\\s", "");
        this.url = url;
        userData = this.idStudent + " " + this.url;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

}
