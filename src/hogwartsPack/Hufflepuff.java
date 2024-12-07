package hogwartsPack;

public class Hufflepuff extends Hogwarts{

    private int diligenceScore;
    private int loyaltyScore;
    private int honestyScore;

    public Hufflepuff(String name, String lastname, int magicPower, int transgressionDistance,
                      int diligenceScore, int loyaltyScore, int honestyScore) {
        super(name, lastname, magicPower, transgressionDistance);
        if (diligenceScore < 0 || diligenceScore > 100 ||
                loyaltyScore < 0 || loyaltyScore > 100 ||
                honestyScore < 0 || honestyScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.diligenceScore = diligenceScore;
        this.loyaltyScore = loyaltyScore;
        this.honestyScore = honestyScore;
    }

    public int getDiligenceScore() {
        return diligenceScore;
    }

    public void setDiligenceScore(int diligenceScore) {
        if (diligenceScore < 0 || diligenceScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.diligenceScore = diligenceScore;
    }

    public int getLoyaltyScore() {
        return loyaltyScore;
    }

    public void setLoyaltyScore(int loyaltyScore) {
        if (loyaltyScore < 0 || loyaltyScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.loyaltyScore = loyaltyScore;
    }

    public int getHonestyScore() {
        return honestyScore;
    }

    public void setHonestyScore(int honestyScore) {
        if (honestyScore < 0 || honestyScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.honestyScore = honestyScore;
    }

    public  void compareStudents(Hufflepuff student) {
        int totalScoreS1 = student.diligenceScore + student.loyaltyScore + student.honestyScore;
        int totalScoreThis = this.diligenceScore + this.loyaltyScore + this.honestyScore;

        if (totalScoreS1 > totalScoreThis) {
            System.out.printf("%s лучший Пуффендуец, чем %s%n", student.getName(), this.getName());
        } else if (totalScoreS1 < totalScoreThis) {
            System.out.printf("%s лучший Пуффендуец, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s такой же Пуффендуец, как и %s%n", this.getName(), student.getName());
        }
    }

    public String toString() {
        return String.format("\nСтудент  - %s %s: " +
                        "%nСила магии - %s, %nДистанция трансгрессии - %s, " +
                        "%nТрудолюбие - %s, %nВерность - %s, %nЧестность - %s.",

                getName(), getLastname(),
                getMagicPower(), getTransgressionDistance(),
                diligenceScore, loyaltyScore, honestyScore
        );
    }
}
