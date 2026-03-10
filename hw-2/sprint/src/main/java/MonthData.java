public class MonthData {
    private final int[] days = new int[30];

    public int getDay(int i){
        return days[i];
    }

    public void setDay(int i, int num){
        days[i] = num;
    }

    public void printDaysAndSteps(){
        for (int i = 0; i < days.length; i ++){
            System.out.printf("%d-й день: %d\n", i+1, days[i]);
        }
    }

    public int maxSteps(){
        var max = 0;
        for (int day : days){
            if (day > max) {
                max = day;
            }
        }
        return max;
    }
    public int calcSum(){
        var sum = 0;
        for (int day : days){
            sum+= day;
        }
        return sum;
    }

    public int bestSeries(int goalByStepsPerDay){
        int currentSeries = 0;
        int finalSeries = 0;

        for (int day : days) {
            if (day >= goalByStepsPerDay) {
                currentSeries++;
            } else {
                currentSeries = 0;
            }
            if (currentSeries > finalSeries) {
                finalSeries = currentSeries;
            }
        }
        return finalSeries;
    }
}
