package ru.skypro;

 public class Gryffindor extends Hogwarts {
 private int nobility;
 private int honor;
 private int bravery;
 public Gryffindor(String name, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
 public int getNobility() {
         return nobility;
     }
 public void setNobility(int nobility) {
         this.nobility = nobility;
     }
 public int getHonor() {
         return honor;
     }
 public void setHonor(int honor) {
         this.honor = honor;
     }
 public int getBravery() {
         return bravery;
     }
 public void setBravery(int bravery) {
         this.bravery = bravery;
     }
 public String toString () {
     return "Имя: " + getName() + "; колдовство: " + getWitchcraft() + "; трансгрессия: " + getTransgression() + "; благородство: " + this.nobility + "; честь: " + this.honor + "; храбрость: " + this.bravery;
 }
 public void compareStudentsGryffindor (Gryffindor student) {
         if (this.getNobility() > student.getNobility()) {
             System.out.println("Cтудент " + this.getName() + " благороднее, чем студент " + student.getName());
         } else if (this.getNobility() == student.getNobility()) {
             System.out.println("Студенты " + this.getName() + " и  " + student.getName() + " одинаково благородны");
         } else {
             System.out.println("Cтудент " + student.getName() + " благороднее, чем студент " + this.getName());
         }
         if (this.getHonor() > student.getHonor()) {
             System.out.println("Cтудент " + this.getName() + " обладает большей честью, чем студент " + student.getName());
         } else if (this.getHonor() == student.getHonor()){
             System.out.println("Cтудент " + this.getName() + " обладает одинковым уровнем чести, что и студент " + student.getName());
         } else {
             System.out.println("Cтудент " + student.getName() + " обладает большей честью, чем студент " + this.getName());
         }
         if (this.getBravery() > student.getBravery()) {
             System.out.println("Cтудент " + this.getName() + " обладает большей храбростью, чем студент " + student.getName());
         } else if (this.getBravery() == student.getBravery()){
             System.out.println("Cтудент " + this.getName() + " обладает одинковым уровнем храбрости, что и студент " + student.getName());
         } else {
             System.out.println("Cтудент " + student.getName() + " обладает большей храбростью, чем студент " + this.getName());
         }
     }
 }