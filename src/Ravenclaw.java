public class Ravenclaw extends Hogwarts {
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname, int power, int distante, int wise, int witty, int creative) {
        super(name, surname, power, distante);
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public void showInfo() {
        System.out.println("Имя " + name);
        System.out.println("Фамилия " + surname);
        System.out.println("Сила " + power);
        System.out.println("Дистанция " + distante);
        System.out.println("Мудрость " + wise);
        System.out.println("Остроумие " + witty);
        System.out.println("Творчество " + creative);
        System.out.println("_________________");
    }

    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int total1 = student1.power + student1.distante + student1.wise + student1.witty + student1.creative;
        int total2 = student2.power + student2.distante + student2.wise + student2.witty + student2.creative;

        if (total1 > total2) {
            System.out.println(student1.name + " " + student1.surname + " лучший студент");
        } else if (total2 > total1) {
            System.out.println(student2.name + " " + student2.surname + " лучший студент");
        } else {
            System.out.println("Баллы студентов одинаковые");
        }
    }
}
