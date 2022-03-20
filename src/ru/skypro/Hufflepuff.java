package ru.skypro;

 public class Hufflepuff extends Hogwarts {
 private int industriousness;
 private int loyalty;
 private int honesty;
 public Hufflepuff(String name, int witchcraft, int transgression, int industriousness, int loyalty, int honesty) {
         super(name, witchcraft, transgression);
         this.industriousness = industriousness;
         this.loyalty = loyalty;
         this.honesty = honesty;
     }
 public int getIndustriousness() {
         return industriousness;
     }
 public void setIndustriousness(int industriousness) {
         this.industriousness = industriousness;
     }
 public int getLoyalty() {
         return loyalty;
     }
 public void setLoyalty(int loyalty) {
         this.loyalty = loyalty;
     }
 public int getHonesty() {
         return honesty;
     }
 public void setHonesty(int honesty) {
         this.honesty = honesty;
     }
 public String toString() {
         return "Имя: " + getName() + "; колдовство: " + getWitchcraft() + "; трансгрессия: " + getTransgression() + "; трудолюбие: " + this.industriousness + "; верность: " + this.loyalty + "; честность: " + this.honesty;
     }
 public void compareStudentsHufflepuff (Hufflepuff student) {
         if (this.getIndustriousness() > student.getIndustriousness()) {
             System.out.println("Cтудент " + this.getName() + " трудолюбивее, чем студент " + student.getName());
         } else if (this.getIndustriousness() == student.getIndustriousness()) {
             System.out.println("Студенты " + this.getName() + " и  " + student.getName() + " обладают одинаковым уровнем трудолюбия");
         } else {
             System.out.println("Cтудент " + student.getName() + " трудолюбивее, чем студент " + this.getName());
         }
         if (this.getLoyalty() > student.getLoyalty()) {
             System.out.println("Cтудент " + this.getName() + " обладает большей верностью, чем студент " + student.getName());
         } else if (this.getLoyalty() == student.getLoyalty()){
             System.out.println("Cтудент " + this.getName() + " обладает таким уровнем верности, что и студент " + student.getName());
         } else {
             System.out.println("Cтудент " + student.getName() + " обладает большей верностью, чем студент " + this.getName());
         }
         if (this.getHonesty() > student.getHonesty()) {
             System.out.println("Cтудент " + this.getName() + " честнее, чем студент " + student.getName());
         } else if (this.getHonesty() == student.getHonesty()){
             System.out.println("Cтудент " + this.getName() + " и " + student.getName() + " одинаково честны");
         } else {
             System.out.println("Cтудент " + student.getName() + " честнее, чем студент " + this.getName());
         }
     }
 }