package BetCalulator;

public class Main {
    public static void main(String[] args) {
        Combination c = new Combination(2.33, 1);
        StraightBet s = new StraightBet(10, 1);

        double odds[] = {16.66, 2.65, 7.55, 12.44};
        Dutching  d = new  Dutching (100, odds);
        d.dutch();
        System.out.println("=============================");
        System.out.println(d.toString());
//        System.out.println(odds[0]);
        double terms[] = {0.25, 0.2, .25, .2};

        System.out.println("=============================");
        c.calcCombTotalValues(odds, terms);
        System.out.println("=============================");
        s.calcTotalValues(odds, terms);
//        c.calcFiveFolds(odds, terms);
//   System.out.println("stake " + b.getTotalStake() + " returns " + b.getTotalReturns());
    }

}
