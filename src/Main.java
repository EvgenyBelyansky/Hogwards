import hogwartsPack.Griffindor;
import hogwartsPack.Hufflepuff;
import hogwartsPack.Ravenclaw;
import hogwartsPack.Slytherin;

public class Main {
    public  static void main(String[] args) {

        Griffindor harryPotter = new Griffindor(
                "Гарри", "Поттер",
                85, 50,
                60, 70, 80
        );
        Griffindor hermioneGranger = new Griffindor(
                "Гермиона", "Грейнджер",
                55, 40,
                30, 50, 75
        );
        Griffindor ronWeasley = new Griffindor(
                "Рон", "Уизли",
                40, 25,
                30, 60, 10
        );

        Slytherin dracoMalfoy = new Slytherin(
                "Драко", "Малфой",
                70, 65,
                70, 60, 80,
                60, 70
        );
        Slytherin grahamMontague = new Slytherin(
                "Грэхэм", "Монтегю",
                40, 60,
                50, 40, 20,
                10, 40
        );
        Slytherin gregoryGoyle = new Slytherin(
                "Грегори", "Гойл",
                40, 59,
                12, 25, 10,
                15, 5
        );

        Ravenclaw zhouChang = new Ravenclaw(
                "Чжоу", "Чанг",
                35, 74,
                46, 53, 58, 96
        );
        Ravenclaw padmaPatil = new Ravenclaw(
                "Падма", "Патил",
                49, 58,
                44, 65, 63, 52
        );
        Ravenclaw marcusBelby = new Ravenclaw(
                "Маркус", "Белби",
                73, 54,
                49, 75, 89, 21
        );

        Hufflepuff zachariaSmith = new Hufflepuff(
                "Захария", "Смит",
                26, 99,
                86, 58, 90
        );
        Hufflepuff sedricDiggory = new Hufflepuff(
                "Седрик", "Диггори",
                91, 15,
                28, 36, 55
        );
        Hufflepuff justinFinchFletchley = new Hufflepuff(
                "Джастин", "Финч-Флетчли",
                100, 99,
                99, 99, 99
        );


        harryPotter.compareStudents(ronWeasley);
        harryPotter.compareStudents(zhouChang);

        System.out.println(harryPotter);

        System.out.println(dracoMalfoy);



    }

}