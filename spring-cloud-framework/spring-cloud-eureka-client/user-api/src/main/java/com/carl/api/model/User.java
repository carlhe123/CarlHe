package com.carl.api.model;

/**
 * @Description User POJO 类
 * @Author carl.he
 * @Date 2019/5/20 20:13
 * @Version 1.0
 **/
public class User {

    /** 用户名 */
    private String name;
    /** 用户年龄 */
    private int age;
    /** 用户性别 */
    private String sex;
    /** 用户id */
    private int id;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                '}';
    }
}
