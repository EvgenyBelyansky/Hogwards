package hogwartsPack;

public class Ravenclaw extends Hogwarts{

    private int intelligenceScore;
    private int wisdomScore;
    private int wittyScore;
    private int creativityScore;

    public Ravenclaw(String name, String lastname, int magicPower, int transgressionDistance,
                     int intelligenceScore, int wisdomScore, int wittyScore, int creativityScore) {
        super(name, lastname, magicPower, transgressionDistance);
        if (intelligenceScore < 0 || intelligenceScore > 100 ||
                wisdomScore < 0 || wisdomScore > 100 ||
                wittyScore < 0 || wittyScore > 100 ||
                creativityScore < 0 || creativityScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.intelligenceScore = intelligenceScore;
        this.wisdomScore = wisdomScore;
        this.wittyScore = wittyScore;
        this.creativityScore = creativityScore;
    }

    public int getIntelligenceScore() {
        return intelligenceScore;
    }

    public void setIntelligenceScore(int intelligenceScore) {
        if (intelligenceScore < 0 || intelligenceScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.intelligenceScore = intelligenceScore;
    }

    public int getWisdomScore() {
        return wisdomScore;
    }

    public void setWisdomScore(int wisdomScore) {
        if (wisdomScore < 0 || wisdomScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.wisdomScore = wisdomScore;
    }

    public int getWittyScore() {
        return wittyScore;
    }

    public void setWittyScore(int wittyScore) {
        if (wittyScore < 0 || wittyScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.wittyScore = wittyScore;
    }

    public int getCreativityScore() {
        return creativityScore;
    }

    public void setCreativityScore(int creativityScore) {
        if (creativityScore < 0 || creativityScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.creativityScore = creativityScore;
    }

    public  void compareStudents(Ravenclaw student) {
        int totalScoreS1 = student.intelligenceScore + student.wisdomScore + student.wittyScore + student.creativityScore;
        int totalScoreThis = this.intelligenceScore + this.wisdomScore + this.wittyScore + this.creativityScore;

        if (totalScoreS1 > totalScoreThis) {
            System.out.printf("%s лучший Когтевранец, чем %s%n", student.getName(), this.getName());
        } else if (totalScoreS1 < totalScoreThis) {
            System.out.printf("%s лучший Когтевранец, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s такой же Когтевранец, как и %s%n", this.getName(), student.getName());
        }
    }

    public String toString() {
        return String.format("\nСтудент  - %s %s: " +
                        "%nСила магии - %s, %nДистанция трансгрессии - %s, " +
                        "%nУм - %s, %nМудрость - %s, %nОстроумность - %s, %nТворчество - %s.",

                getName(), getLastname(),
                getMagicPower(), getTransgressionDistance(),
                intelligenceScore, wisdomScore, wittyScore,
                creativityScore
        );
    }
}