package com.autohome.kotlin.javakotlin;

/**
 * StudentJava
 **/
public class StudentJava {


    public StudentJava(){

    }

    public StudentJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String object;
    private String name;
    private int age;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
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

    public void hello() {
        System.out.println("hello, " + name);
    }

    public static void main(String[] args) {

        //在java中调用Kotlin
        //1. 生成kotlin对象
        StudentKotlin studentKotlin = new StudentKotlin();
        //2. kotlin中的var属性生成getter和setter，val属性只生成setter方法
        studentKotlin.getName();
        studentKotlin.setName("李四");
        studentKotlin.getAge();
//        studentKotlin.setAge(20);
        //3. 对于Kotlin中的包集变量和函数在Java中被当做静态变量和方法使用
        StudentKotlin2Kt.getName();
        StudentKotlin2Kt.f1();
        //4. 使用Kotlin中的data class最为Java中的VO，DTO等POJO使用
        StudentKotlinDataClass studentKotlinDataClass = new StudentKotlinDataClass("张三", 18);
        studentKotlinDataClass.getName();
        studentKotlinDataClass.getAge();

    }
}
