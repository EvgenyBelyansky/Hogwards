package hogwartsPack;

public class Slytherin extends Hogwarts{

    private int cunningScore;
    private int decisivenessScore;
    private int ambitionScore;
    private int resourcefulnessScore;
    private int lustForPowerScore;

    public Slytherin(String name, String lastname, int magicPower, int transgressionDistance,
                     int cunningScore, int decisivenessScore, int ambitionScore,
                     int resourcefulnessScore, int lustForPowerScore) {
        super(name, lastname, magicPower, transgressionDistance);
        if (cunningScore < 0 || cunningScore > 100 ||
                decisivenessScore < 0 || decisivenessScore > 100 ||
                ambitionScore < 0 || ambitionScore > 100 ||
                resourcefulnessScore < 0 || resourcefulnessScore > 100 ||
                lustForPowerScore < 0 || lustForPowerScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.cunningScore = cunningScore;
        this.decisivenessScore = decisivenessScore;
        this.ambitionScore = ambitionScore;
        this.resourcefulnessScore = resourcefulnessScore;
        this.lustForPowerScore = lustForPowerScore;
        int totalScore = this.cunningScore + this.decisivenessScore +
                this.ambitionScore + this.resourcefulnessScore + this.lustForPowerScore;
    }

    public int getCunningScore() {
        return cunningScore;
    }

    public void setCunningScore(int cunningScore) {
        if (cunningScore < 0 || cunningScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.cunningScore = cunningScore;
    }

    public int getDecisivenessScore() {
        return decisivenessScore;
    }

    public void setDecisivenessScore(int decisivenessScore) {
        if (decisivenessScore < 0 || decisivenessScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.decisivenessScore = decisivenessScore;
    }

    public int getAmbitionScore() {
        return ambitionScore;
    }

    public void setAmbitionScore(int ambitionScore) {
        if (ambitionScore < 0 || ambitionScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.ambitionScore = ambitionScore;
    }

    public int getResourcefulnessScore() {
        return resourcefulnessScore;
    }

    public void setResourcefulnessScore(int resourcefulnessScore) {
        if (resourcefulnessScore < 0 || resourcefulnessScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.resourcefulnessScore = resourcefulnessScore;
    }

    public int getLustForPowerScore() {
        return lustForPowerScore;
    }

    public void setLustForPowerScore(int lustForPowerScore) {
        if (lustForPowerScore < 0 || lustForPowerScore > 100) {
            throw new IllegalArgumentException("Некорректное значение атрибута, введите значение с 0 до 100");
        }
        this.lustForPowerScore = lustForPowerScore;
    }

    public  void compareStudents(Slytherin student) {
        int totalScoreS1 = student.ambitionScore + student.cunningScore + student.decisivenessScore + student.resourcefulnessScore + student.lustForPowerScore;
        int totalScoreThis = this.ambitionScore + this.cunningScore + this.decisivenessScore + this.resourcefulnessScore + this.lustForPowerScore;

        if (totalScoreS1 > totalScoreThis) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", student.getName(), this.getName());
        } else if (totalScoreS1 < totalScoreThis) {
            System.out.printf("%s лучший Слизеринец, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s такой же Слизеринец, как и %s%n", this.getName(), student.getName());
        }
    }

    public String toString() {
        return String.format("\nСтудент  - %s %s: " +
                        "%nСила магии - %s, %nДистанция трансгрессии - %s, " +
                        "%nАмбициозность - %s, %nХитрость - %s, %nРешительность - %s," +
                        "%nНаходчивость - %s, %nЖажда власти - %s.",

                getName(), getLastname(),
                getMagicPower(), getTransgressionDistance(),
                ambitionScore, cunningScore, decisivenessScore,
                resourcefulnessScore, lustForPowerScore
        );
    }
}
