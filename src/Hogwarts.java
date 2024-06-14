public class Hogwarts {
    private String firstName;
    private String lastName;
    private int transgressionRange;
    private int powerOfMagic;

    public Hogwarts(String firstName, String lastName, int transgressionRange, int powerOfMagic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.transgressionRange = transgressionRange;
        this.powerOfMagic = powerOfMagic;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getTransgressionRange() {
        return this.transgressionRange;
    }

    public int getPowerOfMagic() {
        return this.powerOfMagic;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void compareStudents(Hogwarts st1, Hogwarts st2) {
        int a = st1.getPowerOfMagic() + st1.getTransgressionRange();
        int b = st2.getPowerOfMagic() + st2.getTransgressionRange();
        if (a > b) {
            System.out.println(st1.getFirstName() + " is cooler than " + st2.getFirstName());
        } else {
            System.out.println(st2.getFirstName() + " is cooler than " + st1.getFirstName());
        }
    }
}

class Griffindor extends Hogwarts {
    private String faculty;
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String firstName, String lastName, int transgressionRange, int powerOfMagic,
                      int nobility, int honor, int courage) {
        super(firstName, lastName, transgressionRange, powerOfMagic);
        this.faculty = "Griffindor";
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return this.nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getCourage() {
        return this.courage;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Имя - " + getFirstName() + " " + getLastName() + ". Факультет - " + getFaculty() + ". Благородсто - " + getNobility() +
                " честь - " + getHonor() + " храбрость - " + getCourage();
    }

    public void compareStudentsOfThisFaculty(Griffindor st1, Griffindor st2) {
        int a = st1.getCourage() + st1.getHonor() + st1.getNobility();
        int b = st2.getCourage() + st2.getHonor() + st2.getNobility();
        if (a > b) {
            System.out.println(st1.getFirstName() + " is cooler than " + st2.getFirstName());
        } else {
            System.out.println(st2.getFirstName() + " is cooler than " + st1.getFirstName());
        }
    }
}

class Hufflepuff extends Hogwarts {
    private String faculty;
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int transgressionRange, int powerOfMagic,
                      int hardWork, int loyalty, int honesty) {
        super(firstName, lastName, transgressionRange, powerOfMagic);
        this.faculty = "Hufflepuff";
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return this.hardWork;
    }

    public int getLoyalty() {
        return this.loyalty;
    }

    public int getHonesty() {
        return this.honesty;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Имя - " + getFirstName() + " " + getLastName() + ". Факультет - " + getFaculty() + ". Трудолюбие - " + getHardWork() +
                " верность - " + getLoyalty() + " честность - " + getHonesty();
    }

    public void compareStudentsOfThisFaculty(Hufflepuff st1, Hufflepuff st2) {
        int a = st1.getHardWork() + st1.getLoyalty() + st1.getHonesty();
        int b = st2.getHardWork() + st2.getLoyalty() + st2.getHonesty();
        if (a > b) {
            System.out.println(st1.getFirstName() + " is cooler than " + st2.getFirstName());
        } else {
            System.out.println(st2.getFirstName() + " is cooler than " + st1.getFirstName());
        }
    }
}

class Ravenclaw extends Hogwarts {
    private String faculty;
    private int smart;
    private int wise;
    private int wit;
    private int creativity;

    public Ravenclaw(String firstName, String lastName, int transgressionRange, int powerOfMagic,
                     int smart, int wise, int wit, int creativity) {
        super(firstName, lastName, transgressionRange, powerOfMagic);
        this.faculty = "Ravenclaw";
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return this.smart;
    }

    public int getWise() {
        return this.wise;
    }

    public int getWit() {
        return this.wit;
    }

    public int getCreativity() {
        return this.creativity;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Имя - " + getFirstName() + " " + getLastName() + ". Факультет - " + getFaculty() + ". Iq - " + getSmart() +
                " мудрость - " + getWise() + " остроумие - " + getWit() + " творчество - " + getCreativity();
    }

    public void compareStudentsOfThisFaculty(Ravenclaw st1, Ravenclaw st2) {
        int a = st1.getSmart() + st1.getWise() + st1.getWit() + st1.getCreativity();
        int b = st2.getSmart() + st2.getWise() + st2.getWit() + st2.getCreativity();
        if (a > b) {
            System.out.println(st1.getFirstName() + " is cooler than " + st2.getFirstName());
        } else {
            System.out.println(st2.getFirstName() + " is cooler than " + st1.getFirstName());
        }
    }
}

class Slytherin extends Hogwarts {
    private String faculty;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String firstName, String lastName, int transgressionRange, int powerOfMagic,
                     int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(firstName, lastName, transgressionRange, powerOfMagic);
        this.faculty = "Slytherin";
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public int getLustForPower() {
        return this.lustForPower;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Имя - " + getFirstName() + " " + getLastName() + ". Факультет - " + getFaculty() + ". Хитрость - " + getCunning() +
                " решительность - " + getDetermination() + " амбициозность - " + getAmbition() + " находчивость - " +
                getResourcefulness() + " жажда власти - " + getLustForPower();
    }

    public void compareStudentsOfThisFaculty(Slytherin st1, Slytherin st2) {
        int a = st1.getCunning() + st1.getDetermination() + st1.getAmbition() + st1.getResourcefulness() + st1.getLustForPower();
        int b = st2.getCunning() + st2.getDetermination() + st2.getAmbition() + st2.getResourcefulness() + st2.getLustForPower();
        if (a > b) {
            System.out.println(st1.getFirstName() + " is cooler than " + st2.getFirstName());
        } else {
            System.out.println(st2.getFirstName() + " is cooler than " + st1.getFirstName());
        }
    }
}
