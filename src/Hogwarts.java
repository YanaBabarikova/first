public class Hogwarts {
    String name;
    String surname;
    int power;
    int distante;

    public Hogwarts(String surname, String name, int power, int distante) {
        this.surname = surname;
        this.name = name;
        this.power = power;
        this.distante = distante;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDistante() {
        return distante;
    }

    public void setDistante(int distante) {
        this.distante = distante;
    }
    public void showInfo(){
        System.out.println("Имя " + name);
        System.out.println("Фамилия " + surname);
        System.out.println("Сила " + power);
        System.out.println("Дистанция " + distante);
        System.out.println("_________________");
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int total1 = student1.power + student1.distante;
        int total2 = student2.power + student2.distante;

        if (total1 > total2) {
            System.out.println(student1.name + " " + student1.surname + " лучший студент");
        } else if (total2 > total1) {
            System.out.println(student2.name + " " + student2.surname + " лучший студент");
        } else {
            System.out.println("Баллы студентов одинаковые");
        }

    }
}
