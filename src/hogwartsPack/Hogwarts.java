package hogwartsPack;

public class Hogwarts {

    private String name;
    private String Lastname;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, String lastname, int magicPower, int transgressionDistance)  {
        if (magicPower < 0 || magicPower > 100 || transgressionDistance < 0 || transgressionDistance > 100) {
            throw new IllegalArgumentException("Недопустимое значение атрибута, введите значение от 0 до 100");
        }
        this.name = name;
        this.Lastname = lastname;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 0 || magicPower > 100) {
            throw new IllegalArgumentException("Недопустимое значение атрибута, введите значение от 0 до 100");
        }
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        if (transgressionDistance < 0 || transgressionDistance> 100) {
            throw new IllegalArgumentException("Недопустимое значение атрибута, введите значение от 0 до 100");
        }
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "hogwartsPack.Hogwarts{" +
                "name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", magicPower=" + magicPower +
                ", tкагnsgressionDistance=" + transgressionDistance +
                '}';
    }

    public  void compareStudents(Hogwarts student) {
        int totalMagicScoreStudent = student.magicPower + student.transgressionDistance;
        int totalMagicScoreThis = this.magicPower + this.transgressionDistance;

        if (totalMagicScoreStudent > totalMagicScoreThis) {
            System.out.printf("%s обладает большей мощностью магии, чем %s%n", student.getName(), this.getName());
        } else if (totalMagicScoreStudent < totalMagicScoreThis) {
            System.out.printf("%s обладает большей мощностью магии, чем %s%n", this.getName(), student.getName());
        } else {
            System.out.printf("%s обладает такой же мощностью магии, как и %s%n", this.getName(), student.getName());
        }
    }


}
