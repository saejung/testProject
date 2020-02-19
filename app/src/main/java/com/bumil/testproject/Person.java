package com.bumil.testproject;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;             //이름
    private String gender;           //성별
    private String organization;    //소속

    /*
    * 생성자
    * @param name           :이름
    * @param gender         :성별
    * @param organization   :소속 ㅁㅁ
    */
    public Person(String name, String gender, String organization)
    {
        this.name = name;
        this.gender = gender;
        this.organization = organization;
    }

    @Override
    public String toString()
    {
        return String.format("이름 : %s\n" +
                              "성별 : %s\n" +
                              "소속 : %s", name, gender, organization);
    }

}
