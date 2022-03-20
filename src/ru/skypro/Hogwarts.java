package ru.skypro;

public class Hogwarts {
private int witchcraft;
private int transgression;
private String name;
public Hogwarts (String name, int witchcraft, int transgression) {
        this.witchcraft = witchcraft;
        this.transgression = transgression;
        this.name = name;
    }
public int getWitchcraft() {
        return witchcraft;
    }
public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }
public int getTransgression() {
        return transgression;
    }
public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
public String getName() {
        return name;
    }
public void setName(String name) {
        this.name = name;
    }

public void compareStudents (Hogwarts student) {
    if (this.getWitchcraft() > student.getWitchcraft()) {
        System.out.println("Cтудент " + this.getName() + " обладает большей магией, чем студент " + student.getName());
    } else if (this.getWitchcraft() == student.getWitchcraft()) {
        System.out.println("Сила магии студента " + this.getName() + " равна силе магии студента " + student.getName());
    } else {
        System.out.println("Cтудент " + student.getName() + " обладает большей магией, чем студент " + this.getName());
    }
    if (this.getTransgression() > student.getTransgression()) {
        System.out.println("Cтудент " + this.getName() + " трансгрессирует на большее расстояние, чем студент " + student.getName());
        } else if (this.getTransgression() == student.getTransgression()){
        System.out.println("Cтудент " + this.getName() + " трансгрессирует на то же расстояние, что и студент " + student.getName());
    } else {
        System.out.println("Cтудент " + student.getName() + " трансгрессирует на большее расстояние, чем студент " + this.getName());
    }
    }
}