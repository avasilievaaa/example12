package ru.skypro;

 public class Slytherin extends Hogwarts {
 private int trick;
 private int determination;
 private int ambition;
 private int resourcefulness;
 private int authoritativeness;
 public Slytherin(String name, int witchcraft, int transgression, int trick, int determination, int ambition, int resourcefulness, int authoritativeness) {
     super(name, witchcraft, transgression);
     this.trick = trick;
     this.determination = determination;
     this.ambition = ambition;
     this.resourcefulness = resourcefulness;
     this.authoritativeness = authoritativeness;
    }
 public int getTrick() {
     return trick;
     }
 public void setTrick(int trick) {
      this.trick = trick;
     }
 public int getDetermination() {
      return determination;
     }
 public void setDetermination(int determination) {
       this.determination = determination;
     }
 public int getAmbition() {
       return ambition;
     }
 public void setAmbition(int ambition) {
      this.ambition = ambition;
     }
 public int getResourcefulness() {
       return resourcefulness;
     }
 public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
     }
 public int getAuthoritativeness() {
        return authoritativeness;
     }
 public void setAuthoritativeness(int authoritativeness) {
        this.authoritativeness = authoritativeness;
     }
 public String toString() {
     return "Имя: " + getName() + "; колдовство: " + getWitchcraft() + "; трансгрессия: " + getTransgression() + "; хитрость: " + this.trick + "; решительность: " + this.determination + "; амбициозность: " + this.ambition + "; находчивость: " + this.resourcefulness + "; находчивость: " + this.authoritativeness;
     }
     public void compareStudentsSlytherin (Slytherin student) {
         if (this.getTrick() > student.getTrick()) {
             System.out.println("Cтудент " + this.getName() + " хитрее, чем студент " + student.getName());
         } else if (this.getTrick() == student.getTrick()) {
             System.out.println("Студенты " + this.getName() + " и  " + student.getName() + " одинаково хитры");
         } else {
             System.out.println("Cтудент " + student.getName() + " хитрее, чем студент " + this.getName());
         }
         if (this.getDetermination() > student.getDetermination()) {
             System.out.println("Cтудент " + this.getName() + " решительнее, чем студент " + student.getName());
         } else if (this.getDetermination() == student.getDetermination()){
             System.out.println("Cтудент " + this.getName() + " обладает таким уровнем мудрости, что и студент " + student.getName());
         } else {
             System.out.println("Студенты " + this.getName() + " и  " + student.getName() + " одинаково решительны");
         }
         if (this.getAmbition() > student.getAmbition()) {
             System.out.println("Cтудент " + this.getName() + " амбициознее, чем студент " + student.getName());
         } else if (this.getAmbition() == student.getAmbition()){
             System.out.println("Cтудент " + this.getName() + " и " + student.getName() + " одинаково амбициозны");
         } else {
             System.out.println("Cтудент " + student.getName() + " амбициознее, чем студент " + this.getName());
         }
         if (this.getResourcefulness() > student.getResourcefulness()) {
             System.out.println("Cтудент " + this.getName() + " находчивее, чем студент " + student.getName());
         } else if (this.getResourcefulness() == student.getResourcefulness()){
             System.out.println("Cтудент " + this.getName() + " и " + student.getName() + " обладают одинаковым уровнем находчивости");
         } else {
             System.out.println("Cтудент " + student.getName() + " находчивее, чем студент " + this.getName());
         }
         if (this.getAuthoritativeness() > student.getAuthoritativeness()) {
             System.out.println("Cтудент " + this.getName() + " жаждет власти больше, чем студент " + student.getName());
         } else if (this.getAuthoritativeness() == student.getAuthoritativeness()){
             System.out.println("Cтудент " + this.getName() + " и " + student.getName() + " одинаково жаждут власти");
         } else {
             System.out.println("Cтудент " + student.getName() + " жаждет власти больше " + this.getName());
         }
     }
 }