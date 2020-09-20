package BetCalulator;

import java.util.ArrayList;
import java.util.List;

public class Combination extends StraightBet {
    private double totalStake;
    private double combWinReturns;
    private double combEachReturns;
    private double totalCombReturns;
    private double totalCombProfit;
    private List<String> expression1;
    private List<String> expression2;
    private List<String> expression3;
    private List<String> expression4;
    private List<String> expression5;
    private List<String> expression6;
    private List<String> expression7;
    private List<String> expression8;

    public Combination(double unitStake, int selections) {
        super(unitStake, selections);
    }


    public void setSinglesCombReturns(double[] a, double[] b) {
        expression1 = new ArrayList<>();
        String exp = "";
        double total = 0;
        double calc = 0;
        double ewTotal = 0;
        double ewCalc = 0;

        for (int i = 0; i < a.length; i++) {
            calc = a[i] * unitStake;
            ewCalc = ((a[i] - 1) * b[i] + 1) * unitStake;
            total += calc;
            ewTotal += ewCalc;
            exp = a[i] + " * £" + unitStake + " = £" + calc;
            expression1.add(exp);
        }
        setCombWinReturns((double) Math.round(total*100)/ 100);
        setCombEachReturns((double) Math.round(ewTotal*100)/ 100);

        setTotalStake(a.length);
    }

    public void calcDouble(double[] a, double[] b) {
        expression2 = new ArrayList<>();
        String exp = "";
        double calc = 0;
        double ewCalc = 0;
        double winTotal = 0;
        double ewTotal = 0;
        int totStake = 0;

        for (int i = 0; i < a.length - 1; i++)
            for (int j = i + 1; j < a.length; j++) {
                double[] arr = {a[i], a[j]};
                double[] ewArr = {b[i], b[j]};
                calc = setWinReturns(arr);
                ewCalc = setEachReturns(arr, ewArr);
                winTotal = winTotal + calc;
                ewTotal += ewCalc;


                totStake++;
                exp = "£" + unitStake + " "  + a[i] + " * " + a[j] + " = £" + calc;
                expression2.add(exp);
            }
        setTotalStake(totStake);
        setCombWinReturns((double) Math.round(winTotal*100)/ 100);
        setCombEachReturns((double) Math.round(ewTotal*100)/ 100);

    }
    public void calcTrebles(double[] a, double[] b) {
        expression3 = new ArrayList<>();
        String exp = "";
        double calc = 0;
        double ewCalc = 0;
        double winTotal = 0;
        double ewTotal = 0;
        int totStake = 0;

        for (int i = 0; i < a.length - 2; i++)
            for (int j = i + 1; j < a.length - 1; j++)
                for (int k = j + 1; k < a.length; k++){
                double[] arr = {a[i], a[j],  a[k]};
                double[] ewArr = {b[i], b[j], b[k]};
                calc = setWinReturns(arr);
                ewCalc = setEachReturns(arr, ewArr);
                winTotal += calc;
                ewTotal += ewCalc;
                totStake++;
                exp = "£" + unitStake + " "  + a[i] + " * " + a[j] + " * " + a[k] + " = £" + calc;
                expression3.add(exp);
            }
        setTotalStake(totStake);
        setCombWinReturns((double) Math.round(winTotal*100)/ 100);
        setCombEachReturns((double) Math.round(ewTotal*100)/ 100);

    }
    public void calcFourFolds(double[] a, double[] b) {
        expression4 = new ArrayList<>();
        String exp = "";
        double calc = 0;
        double ewCalc = 0;
        double winTotal = 0;
        double ewTotal = 0;
        int totStake = 0;

        for (int i = 0; i < a.length - 3; i++)
            for (int j = i + 1; j < a.length - 2; j++)
                for (int k = j + 1; k < a.length - 1; k++)
                    for (int l = k + 1; l < a.length; l++){
                    double[] arr = {a[i], a[j],  a[k], a[l]};
                    double[] ewArr = {b[i], b[j], b[k], b[l]};
                    calc = setWinReturns(arr);
                    ewCalc = setEachReturns(arr, ewArr);
                    winTotal += calc;
                    ewTotal += ewCalc;
                    totStake++;
                    exp = "£" + unitStake + " "  + a[i] + " * " + a[j] + " * " + a[k] + " * " + a[l] + " = £" + calc;
                    expression4.add(exp);
                }
        setTotalStake(totStake);
        setCombWinReturns((double) Math.round(winTotal*100)/ 100);
        setCombEachReturns((double) Math.round(ewTotal*100)/ 100);

    }

    public void calcFiveFolds(double[] a, double[] b) {
        expression5 = new ArrayList<>();
        String exp = "";
        double calc = 0;
        double ewCalc = 0;
        double winTotal = 0;
        double ewTotal = 0;
        int totStake = 0;

        for (int i = 0; i < a.length - 4; i++)
            for (int j = i + 1; j < a.length - 3; j++)
                for (int k = j + 1; k < a.length - 2; k++)
                    for (int l = k + 1; l < a.length - 1; l++)
                        for (int m = l + 1; m < a.length; m++){
                        double[] arr = {a[i], a[j],  a[k], a[l], a[m]};
                        double[] ewArr = {b[i], b[j], b[k], b[l], b[m]};
                        calc = setWinReturns(arr);
                        ewCalc = setEachReturns(arr, ewArr);
                        winTotal += calc;
                        ewTotal += ewCalc;
                        totStake++;
                        exp = "£" + unitStake + " "  + a[i] + " * " + a[j] + " * " + a[k] + " * " + a[l] + " * " + a[m]+ " = £" + calc;
                        expression5.add(exp);
                    }
        setTotalStake(totStake);
        setCombWinReturns((double) Math.round(winTotal*100)/ 100);
        setCombEachReturns((double) Math.round(ewTotal*100)/ 100);

    }

    public void calcSixFolds(double[] a, double[] b) {
        expression6 = new ArrayList<>();
        String exp = "";
        double calc = 0;
        double ewCalc = 0;
        double winTotal = 0;
        double ewTotal = 0;
        int totStake = 0;

        for (int i = 0; i < a.length - 5; i++)
            for (int j = i + 1; j < a.length - 4; j++)
                for (int k = j + 1; k < a.length - 3; k++)
                    for (int l = k + 1; l < a.length - 2; l++)
                        for (int m = l + 1; m < a.length - 1; m++)
                            for (int n = m + 1; n < a.length; n++){
                            double[] arr = {a[i], a[j],  a[k], a[l], a[m], a[n]};
                            double[] ewArr = {b[i], b[j], b[k], b[l], b[m], b[n]};
                            calc = setWinReturns(arr);
                            ewCalc = setEachReturns(arr, ewArr);
                            winTotal += calc;
                            ewTotal += ewCalc;
                            totStake++;
                                exp = "£" + unitStake + " "  + a[i] + " * " + a[j] + " * " + a[k] + " * " + a[l] + " * " + a[m] +  " * " + a[n] + " = £" + calc;
                            expression6.add(exp);
                        }

        setTotalStake(totStake);
        setCombWinReturns((double) Math.round(winTotal*100)/ 100);
        setCombEachReturns((double) Math.round(ewTotal*100)/ 100);

    }

    public void calcSevenFolds(double[] a, double[] b) {
        expression7 = new ArrayList<>();
        String exp = "";
        double calc = 0;
        double ewCalc = 0;
        double winTotal = 0;
        double ewTotal = 0;
        int totStake = 0;

        for (int i = 0; i < a.length - 6; i++)
            for (int j = i + 1; j < a.length - 5; j++)
                for (int k = j + 1; k < a.length - 4; k++)
                    for (int l = k + 1; l < a.length - 3; l++)
                        for (int m = l + 1; m < a.length - 2; m++)
                            for (int n = m + 1; n < a.length - 1; n++)
                                for (int p = n + 1; p < a.length; p++){
                                double[] arr = {a[i], a[j],  a[k], a[l], a[m], a[n], a[p]};
                                double[] ewArr = {b[i], b[j], b[k], b[l], b[m], b[n], b[p]};
                                calc = setWinReturns(arr);
                                ewCalc = setEachReturns(arr, ewArr);
                                winTotal += calc;
                                ewTotal += ewCalc;
                                totStake++;
                                exp = "£" + unitStake + " "  + a[i] + " * " + a[j] + " * " + a[k] + " * " + a[l] + " * " + a[m] +  " * " + a[n] +  " * " + a[p] + " = £" + calc;
                                expression7.add(exp);
                            }

        setTotalStake(totStake);
        setCombWinReturns((double) Math.round(winTotal*100)/ 100);
        setCombEachReturns((double) Math.round(ewTotal*100)/ 100);

    }

    public void calcEightFolds(double[] a, double[] b) {
        expression8 = new ArrayList<>();
        String exp = "";
        double calc = 0;
        double ewCalc = 0;
        double winTotal = 0;
        double ewTotal = 0;
        int totStake = 0;

        for (int i = 0; i < a.length - 7; i++)
            for (int j = i + 1; j < a.length - 6; j++)
                for (int k = j + 1; k < a.length - 5; k++)
                    for (int l = k + 1; l < a.length - 4; l++)
                        for (int m = l + 1; m < a.length - 3; m++)
                            for (int n = m + 1; n < a.length - 2; n++)
                                for (int p = n + 1; p < a.length - 1; p++)
                                    for (int q = p + 1; q < a.length; q++){
                                    double[] arr = {a[i], a[j],  a[k], a[l], a[m], a[n], a[p], a[q]};
                                    double[] ewArr = {b[i], b[j], b[k], b[l], b[m], b[n], b[p], b[q]};
                                    calc = setWinReturns(arr);
                                    ewCalc = setEachReturns(arr, ewArr);
                                    winTotal += calc;
                                    ewTotal += ewCalc;
                                    totStake++;
                                    exp = "£" + unitStake + " "  + a[i] + " * " + a[j] + " * " + a[k] + " * " + a[l] + " * " + a[m] +  " * " + a[n] +  " * " + a[p] + " * " + a[q] + " = £" + calc;
                                    expression8.add(exp);
                                }

        setTotalStake(totStake);
        setCombWinReturns((double) Math.round(winTotal*100)/ 100);
        setCombEachReturns((double) Math.round(ewTotal*100)/ 100);


    }

    public void calcCombTotalValues(double[] a, double[] b){
        setSinglesCombReturns(a, b);
        calcDouble(a, b);
        calcTrebles(a, b);
        calcFourFolds(a, b);
        calcFiveFolds(a, b);
        calcSixFolds(a, b);
        calcSevenFolds(a, b);
        calcEightFolds(a, b);

        setCombWinProfit();
        setCombEachProfit();
        setCombTotalReturns();
        setCombTotalProfit();


        System.out.println(toString());
    }
    public void setTotalStake(double totStake) {
        this.totalStake += totStake * unitStake;
    }

    public void setCombWinReturns(double winTotal) {
        this.combWinReturns +=  (double) Math.round(winTotal * 100) / 100;
    }

    public void setCombEachReturns(double ewTotal) {
        this.combEachReturns +=  (double) Math.round(ewTotal * 100) / 100;
    }

    public double getTotalStake() {
        return totalStake;
    }

    public double  getCombWinReturns() {
        return this.combWinReturns;
    }

    public double getCombEachReturns() {
        return this.combEachReturns;
    }

    public void setCombTotalReturns() {
        this.totalCombReturns =  (double) Math.round((getCombWinReturns() + getCombEachReturns()) * 100) / 100;
    }

    public void setCombTotalProfit() {
        this.totalCombProfit = (double) Math.round((getTotalCombReturns() - (totalStake * 2)) * 100) / 100;
    }

    public double getTotalCombReturns() {
        return totalCombReturns;
    }

    public double getTotalCombProfit() {
        return totalCombProfit;
    }


    public void setCombEachProfit() {
        this.eachProfit = (double) Math.round((getCombEachReturns() - (totalStake * 2)) * 100) / 100;
    }

    public void setCombWinProfit() {
        this.winProfit =  (double) Math.round((getCombWinReturns() - totalStake) * 100)/ 100;
    }
    @Override
    public String toString() {

        return "Unit Stake = £" + unitStake + ": Total Stake = £" + totalStake + ": Win only returns = £" + combWinReturns + ": Win only profit = £"
                + winProfit + "\n" + "Each way stake = £" + (totalStake * 2) + ": Total stake = £" + (totalStake * 2) + ": Total returns = £" +
                totalCombReturns + ": Total profit = £" + totalCombProfit + "\n" + "Each way only returns = £" + combEachReturns +
                ": Each way only profit = £" + eachProfit;
    }

}
