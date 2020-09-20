package BetCalulator;

public class Dutching {
    public double totalStake;
    public double totalProfit;
    public double[] odds;
    public double[] probabilities;
    public double[] stakes;
    public double[] returns;
    public double[] sortStakes;


    public Dutching(double totalStake, double[] odds) {
        this.totalStake = totalStake;
        this.odds = odds;
    }

    public void calcProb(){
        int i = 0;
        probabilities = new double[odds.length] ;
        for(double odd : odds){
            double prob = ((1 /(odd)) * 100) ;
            probabilities[i] = prob;
            i++;
        }
    }

    public void calStakes(){
        stakes = new double[probabilities.length];
        sortStakes = new double[probabilities.length];
        int i = 0;
        double sum = 0.0;
        for (double probability : probabilities) {
            sum += probability;
        }
        for(double prob : probabilities){
            double stake = prob / (sum) * totalStake;
            stakes[i] = stake;
            sortStakes[i] = (double) Math.round(stake * 100)/100;
            i++;
        }
    }

    public void calcReturns(){
        returns = new double[odds.length];
        int i = 0;
        for(double stake : stakes){
            double ret = (stake * odds[i]) * 100 / 100;
            returns[i] = (double) Math.round(ret * 100) / 100;
            i++;
        }
    }

    public double getTotalStake() {
        return totalStake;
    }

    public double[] getOdds() {
        return odds;
    }

    public double[] getProbabilities() {
        return probabilities;
    }

    public double[] getStakes() {
        return stakes;
    }

    public double[] getReturns() {
        return returns;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit() {

        this.totalProfit = (double) Math.round((returns[0] - totalStake) * 100) / 100;
    }

    public void dutch(){
        calcProb();
        calStakes();
        calcReturns();
        setTotalProfit();
    }
    public String toString(){

        String result = "Total Stake : " + totalStake + "\n";
        int i = 0;
        for(double ret : returns){
            String selection = Integer.toString(i+1);
            result += "Selection " + selection + " , Stake : £" + sortStakes[i] + ", Odds : " + odds[i] +
                    ", Returns : £" + returns[i] + "\n";
            i++;
         }
        result += "If any selection wins Total Profit : £" + getTotalProfit();
        return result;
    }

}
