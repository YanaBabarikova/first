public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, int power, int distante, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower){
        super(name, surname, power, distante);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public void showInfo(){
        System.out.println("Имя " + name);
        System.out.println("Фамилия " + surname);
        System.out.println("Сила " + power);
        System.out.println("Дистанция " + distante);
        System.out.println("Хитрость " + cunning);
        System.out.println("Решительность " + determination);
        System.out.println("Амбициозность " + ambition);
        System.out.println("Находчивость " + resourcefulness);
        System.out.println("Жажда власти " + thirstForPower);
        System.out.println("_________________");
    }

    public static void compareStudents(Slytherin student1, Slytherin student2) {
        int total1 = student1.power + student1.distante + student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.thirstForPower;
        int total2 = student2.power + student2.distante + student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.thirstForPower ;

        if (total1 > total2) {
            System.out.println(student1.name + " " + student1.surname + " лучший студент");
        } else if (total2 > total1) {
            System.out.println(student2.name + " " + student2.surname + " лучший студент");
        } else {
            System.out.println("Баллы студентов одинаковые");
        }
    }
}
