public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int power, int distante, int hardworking, int loyal, int honest) {
        super(name, surname, power, distante);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void showInfo() {
        System.out.println("Имя " + name);
        System.out.println("Фамилия " + surname);
        System.out.println("Сила " + power);
        System.out.println("Дистанция " + distante);
        System.out.println("Трудолюбие " + hardworking);
        System.out.println("Верность " + loyal);
        System.out.println("Честность " + honest);
        System.out.println("_________________");
    }

    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int total1 = student1.power + student1.distante + student1.hardworking + student1.loyal + student1.honest;
        int total2 = student2.power + student2.distante + student2.hardworking + student2.loyal + student2.honest;

        if (total1 > total2) {
            System.out.println(student1.name + " " + student1.surname + " лучший студент");
        } else if (total2 > total1) {
            System.out.println(student2.name + " " + student2.surname + " лучший студент");
        } else {
            System.out.println("Баллы студентов одинаковые");
        }
    }
}