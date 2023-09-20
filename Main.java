class Cricketer {
    private String name;
    private int age;
    private String nationality;

    public Cricketer(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
    }
}
interface BatsmanInterface {
    void printBatsmanDetails();
    int getBatsmanRanking();

}

interface BowlerInterface {
    void printBowlerDetails();
    int getBowlerRanking();

}


class Batsman extends Cricketer implements BatsmanInterface {
    private int score;
    private int batsmanRanking;

    public Batsman(String name, int age, String nationality, int score, int batsmanRanking) {
        super(name, age, nationality);
        this.score = score;
        this.batsmanRanking = batsmanRanking;
    }

    public void printBatsmanDetails() {
        super.printDetails();
        System.out.println("Score: " + score);
        System.out.println("Batsman Ranking: " + batsmanRanking);
    }

    public int getBatsmanRanking() {
        return batsmanRanking;
    }
}

class Bowler extends Cricketer implements BowlerInterface {
    private int wickets;
    private int bowlerRanking;

    public Bowler(String name, int age, String nationality, int wickets, int bowlerRanking) {
        super(name, age, nationality);
        this.wickets = wickets;
        this.bowlerRanking = bowlerRanking;
    }

    public void printBowlerDetails() {
        super.printDetails();
        System.out.println("Wickets: " + wickets);
        System.out.println("Bowler Ranking: " + bowlerRanking);
    }

    public int getBowlerRanking() {
        return bowlerRanking;
    }
}

class AllRounder implements BatsmanInterface, BowlerInterface {
    private String name;
    private int age;
    private String nationality;
    private int batsmanRanking;
    private int bowlerRanking;

    public AllRounder(String name, int age, String nationality, int batsmanRanking, int bowlerRanking) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.batsmanRanking = batsmanRanking;
        this.bowlerRanking = bowlerRanking;
    }

    public void printBatsmanDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Batsman Ranking: " + batsmanRanking);
    }

    public void printBowlerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Bowler Ranking: " + bowlerRanking);
    }

    public int getBatsmanRanking() {
        return batsmanRanking;
    }

    public int getBowlerRanking() {
        return bowlerRanking;
    }
}

public class Main {
    public static void main(String[] args) {
        Batsman batsman = new Batsman("Ahmad", 35, "Pakistani", 505, 3);
        Bowler bowler = new Bowler("Hafeez", 22, "Afghanistani", 150, 6);
        AllRounder allRounder = new AllRounder("Ben", 30, "American", 2, 1);

        System.out.println("Batsman Details:");
        batsman.printBatsmanDetails();
        System.out.println("Batsman Ranking: " + batsman.getBatsmanRanking());

        System.out.println("\nBowler Details:");
        bowler.printBowlerDetails();
        System.out.println("Bowler Ranking: " + bowler.getBowlerRanking());

        System.out.println("\nAll-Rounder Details:");
        allRounder.printBatsmanDetails();
        System.out.println("Batsman Ranking: " + allRounder.getBatsmanRanking());
        allRounder.printBowlerDetails();
        System.out.println("Bowler Ranking: " + allRounder.getBowlerRanking());
    }
}