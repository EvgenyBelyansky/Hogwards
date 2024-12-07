package hogwartsPack;

public class Griffindor extends Hogwarts {

    private int noblenessScore;
    private int honorScore;
    private int braveryScore;

    public Griffindor
            (String name, String lastname, int magicPower, int transgressionDistance,
             int noblenessScore, int honorScore, int braveryScore) {
        super(name, lastname, magicPower, transgressionDistance);
        if (noblenessScore < 0 || noblenessScore > 100 ||
                honorScore < 0 || honorScore > 100 ||
                braveryScore < 0 || braveryScore > 100) {
            throw new IllegalArgumentException("Недопустимое значение атрибута, введите значение от 0 до 100");
        }
        this.noblenessScore = noblenessScore;
        this.honorScore = honorScore;
        this.braveryScore = braveryScore;
    }

    public int getNoblenessScore() {
        return noblenessScore;
    }

    public void setNoblenessScore(int noblenessScore) {
        if (noblenessScore < 0 || noblenessScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.noblenessScore = noblenessScore;
    }

    public int getHonorScore() {
        return honorScore;
    }

    public void setHonorScore(int honorScore) {
        if (honorScore < 0 || honorScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.honorScore = honorScore;
    }

    public int getBraveryScore() {
        return braveryScore;
    }

    public void setBraveryScore(int braveryScore) {
        if (braveryScore < 0 || braveryScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.braveryScore = braveryScore;
    }

    public void compareStudents(Griffindor student) {
        int totalScoreS1 = student.getBraveryScore() + student.getHonorScore() + student.getNoblenessScore();
        int totalScoreThis = this.getBraveryScore() + this.getHonorScore() + this.getNoblenessScore();

        if (totalScoreS1 > totalScoreThis) {
            System.out.printf("%s лучший Гриффиндорец, чем %s%n", student.getName(), this.getName());
        } else if (totalScoreS1 < totalScoreThis) {
            System.out.printf("%s лучший Гриффиндорец, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s такой же Гриффиндорец, как и %s%n", this.getName(), student.getName());
        }

    }

    @Override
    public String toString() {
        return String.format("\nСтудент  - %s %s: " +
                        "%nСила магии - %s, %nДистанция трансгрессии - %s, " +
                        "%nБлагородство - %s, %nЧесть - %s, %nХрабрость - %s.",
                getName(), getLastname(),
                getMagicPower(), getTransgressionDistance(),
                noblenessScore, honorScore, braveryScore
        );
    }
}
