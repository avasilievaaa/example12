package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gryffindor harryPoter = new Gryffindor ("Гарри Поттер", 40,34,49,67,89);
        Gryffindor germonaGranger = new Gryffindor ("Гермиона Грейнджер", 47,51,78,53,87);
        Gryffindor ronWeasley = new Gryffindor ("Рон Уизли", 14,73,27,61,47);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 74,54,21,69,79);
        Hufflepuff cedricDiggory =  new Hufflepuff("Седрик Диггори", 49,75,36,96,41);
        Hufflepuff justinFinchFletchy = new Hufflepuff("Джастин Финч-Флетчи", 98,14,76,27,69);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 26,64,75,69,12,75);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 48,73,19,89,46,19);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 74,17,96,75,25,67);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 67, 14,69,82,37,87,47);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 59, 78,69,42,39,68,63);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 57, 87,41,43,58,49,57);

        System.out.println(harryPoter);
        harryPoter.compareStudentsGryffindor(germonaGranger);
        System.out.println();
        dracoMalfoy.compareStudents(cedricDiggory);
        System.out.println();
    }
}