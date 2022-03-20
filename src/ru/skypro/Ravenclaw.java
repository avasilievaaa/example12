package ru.skypro;

 public class Ravenclaw extends Hogwarts {
 private int mind;
 private int wisdom;
 private int wit;
 private int creative;
 public Ravenclaw(String name, int witchcraft, int transgression, int mind, int wisdom, int wit, int creative) {
        super(name, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }
 public int getMind() {
         return mind;
     }
 public void setMind(int mind) {
         this.mind = mind;
     }
 public int getWisdom() {
         return wisdom;
     }
 public void setWisdom(int wisdom) {
         this.wisdom = wisdom;
     }
 public int getWit() {
         return wit;
     }
 public void setWit(int wit) {
         this.wit = wit;
     }
 public int getCreative() {
         return creative;
     }
 public void setCreative(int creative) {
         this.creative = creative;
     }
 public String toString() {
         return "Имя: " + getName() + "; колдовство: " + getWitchcraft() + "; трансгрессия: " + getTransgression() + "; ум: " + this.mind + "; мудрость: " + this.wisdom + "; остроумность: " + this.wit + "; творчество: " + this.creative;
     }
 public void compareStudentsRavenclaw (Ravenclaw student) {
         if (this.getMind() > student.getMind()) {
             System.out.println("Cтудент " + this.getName() + " умнее, чем студент " + student.getName());
         } else if (this.getMind() == student.getMind()) {
             System.out.println("Студенты " + this.getName() + " и  " + student.getName() + " одинаково умны");
         } else {
             System.out.println("Cтудент " + student.getName() + " умнее, чем студент " + this.getName());
         }
         if (this.getWisdom() > student.getWisdom()) {
             System.out.println("Cтудент " + this.getName() + " мудрее, чем студент " + student.getName());
         } else if (this.getWisdom() == student.getWisdom()){
             System.out.println("Cтудент " + this.getName() + " обладает таким уровнем мудрости, что и студент " + student.getName());
         } else {
             System.out.println("Cтудент " + student.getName() + " мудрее, чем студент " + this.getName());
         }
         if (this.getWit() > student.getWit()) {
             System.out.println("Cтудент " + this.getName() + " остроумнее, чем студент " + student.getName());
         } else if (this.getWit() == student.getWit()){
             System.out.println("Cтудент " + this.getName() + " и " + student.getName() + " одинаково остроумны");
         } else {
             System.out.println("Cтудент " + student.getName() + " остроумнее, чем студент " + this.getName());
         }
         if (this.getCreative() > student.getCreative()) {
             System.out.println("Cтудент " + this.getName() + " более творческий, чем студент " + student.getName());
         } else if (this.getCreative() == student.getCreative()){
             System.out.println("Cтудент " + this.getName() + " и " + student.getName() + " обладают одинаковым уровнем творчества");
         } else {
             System.out.println("Cтудент " + student.getName() + " более творческий, чем студент " + this.getName());
         }
     }
 }