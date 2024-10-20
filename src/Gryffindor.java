public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int power, int distante, int nobility, int honor, int courage){
       super(name, surname, power, distante);
       this.courage = courage;
       this.nobility = nobility;
       this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    public void showInfo(){
        System.out.println("Имя " + name);
        System.out.println("Фамилия " + surname);
        System.out.println("Сила " + power);
        System.out.println("Дистанция " + distante);
        System.out.println("Благородство " + nobility);
        System.out.println("Честь " + honor);
        System.out.println("Храбрость " + courage);
        System.out.println("_________________");
    }


    public static void compareStudents(Gryffindor student1, Gryffindor student2) {
        int total1 = student1.power + student1.distante + student1.nobility + student1.honor + student1.courage;
        int total2 = student2.power + student2.distante + student2.nobility + student2.honor + student2.courage;

        if (total1 > total2) {
            System.out.println(student1.name + " " + student1.surname + " лучший студент");
        } else if (total2 > total1) {
            System.out.println(student2.name + " " + student2.surname + " лучший студент");
        } else {
            System.out.println("Баллы студентов одинаковые");
        }

    }

}
