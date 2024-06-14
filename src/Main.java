public class Main {
    public static void main(String[] args) {
        Griffindor[] allGriffindors = new Griffindor[3];
        Hufflepuff[] allHufflpuffs = new Hufflepuff[3];
        Ravenclaw[] allRavenclaws = new Ravenclaw[3];
        Slytherin[] allSlytherins = new Slytherin[3];
        allGriffindors[0] = new Griffindor("Griffindor", "Harry", "Potter", 30, 40, 40, 50, 80);
        allGriffindors[1] = new Griffindor("Griffindor", "Hermione", "Granger", 40, 40, 50, 60, 50);
        allGriffindors[2] = new Griffindor("Griffindor", "Ronald", "Weasley", 20, 30, 20, 40, 70);
        allHufflpuffs[0] = new Hufflepuff("Hufflepuff", "Zacharias", "Smith", 20, 52, 56, 85, 52);
        allHufflpuffs[1] = new Hufflepuff("Hufflepuff", "Cedric", "Diggory", 50, 60, 82, 85, 40);
        allHufflpuffs[2] = new Hufflepuff("Hufflepuff", "Justin", "Finch-Fletchley", 52, 74, 42, 10, 78);
        allRavenclaws[0] = new Ravenclaw("Ravenclaw", "Cho", "Chang", 20, 40, 85, 42, 52, 85);
        allRavenclaws[1] = new Ravenclaw("Ravenclaw", "Padma", "Patil", 50, 78, 52, 12, 53, 53);
        allRavenclaws[2] = new Ravenclaw("Ravenclaw", "Marcus", "Belby", 45, 42, 12, 23, 11, 15);
        allSlytherins[0] = new Slytherin("Slytherin", "Draco", "Malfoy", 20, 20, 10, 30, 100, 40, 50);
        allSlytherins[1] = new Slytherin("Slytherin", "Graham", "Montague", 10, 20, 10, 30, 40, 20, 10);
        allSlytherins[2] = new Slytherin("Slytherin", "Gregory", "Goyle", 200, 20, 10, 30, 40, 20, 10);
        allSlytherins[0].compareStudentsOfThisFaculty(allSlytherins[0], allSlytherins[1]);
        allGriffindors[0].compareStudents(allGriffindors[0], allSlytherins[0]);
    }
}
