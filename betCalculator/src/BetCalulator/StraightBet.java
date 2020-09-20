package BetCalulator;

public class StraightBet {
    protected int selections;
    protected double unitStake;
    protected double winReturns;
    protected double winProfit;
    protected double totalReturns;
    protected double totalProfit;
    protected double eachReturns;
    protected double eachProfit;


    public StraightBet(double unitStake, int selections) {
        this.unitStake = unitStake;
        this.selections = selections;
    }

    public double setWinReturns(double[] a) {
        double calc = a[0];
        for (int i = 1; i < a.length; i++) {
            calc *= a[i];
        }
        this.winReturns = (double) Math.round((calc * unitStake) * 100) / 100;
        return winReturns;
    }

    public double setEachReturns(double[] a, double[] b) {
        double calc = ((a[0] - 1) * b[0] + 1);
        for (int i = 1; i < a.length; i++) {
            calc *= ((a[i] - 1) * b[i] + 1);
        }
        this.eachReturns = (double) Math.round((calc * unitStake) * 100) / 100;
        return eachReturns;
    }


    public void calcTotalValues(double[] a, double[] b) {
        setWinReturns(a);
        setEachReturns(a, b);
        setWinProfit();
        setEachProfit();
        setTotalReturns();
        setTotalProfit();

        System.out.println(toString());
    }

    public double getWinReturns() {
        return winReturns;
    }


    public double getWinProfit() {
        return winProfit;
    }

    public void setWinProfit() {
        this.winProfit = getWinReturns() - unitStake;
    }

    public double getTotalReturns() {
        return totalReturns;
    }

    public void setTotalReturns() {
        this.totalReturns = (double) Math.round((getWinReturns() + getEachReturns()) * 100) / 100;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit() {
        this.totalProfit = (double) Math.round((getTotalReturns() - (unitStake * 2)) * 100) / 100;
    }

    public double getEachReturns() {
        return eachReturns;
    }


    public double getEachProfit() {
        return eachProfit;
    }

    public void setEachProfit() {
        this.eachProfit = (double) Math.round((getEachReturns() - (unitStake * 2)) * 100) / 100;
    }

    public String toString() {

        return "Unit Stake = £" + unitStake + ": Win only returns = £" + winReturns + ": Win only profit = £"
                + winProfit + "\n" + "Each way stake = £" + (unitStake * 2) + ": Total stake = £" + (unitStake * 2) + ": Total returns = £" +
                totalReturns + ": Total profit = £" + totalProfit + "\n" + "Each way only returns = £" + eachReturns +
                ": Each way only profit = £" + eachProfit;
    }
}
