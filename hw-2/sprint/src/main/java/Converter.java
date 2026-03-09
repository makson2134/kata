
public class Converter {
    private int stepsToSmCoef;
    private int stepsToCalCoef;

    private static final double smToKmCoef = 0.00001;
    private static final double calToKcalCoef = 0.001;

    public Converter(int stepsToSmCoef, int stepsToCalCoef){
        this.stepsToSmCoef = stepsToSmCoef;
        this.stepsToCalCoef = stepsToCalCoef;
    }

    public int getStepsToSmCoef(){
        return this.stepsToSmCoef;
    }

    public void setStepsToSmCoef(int stepsToSmCoef){
        this.stepsToSmCoef = stepsToSmCoef;
    }

    public int getStepsToCalCoef(){
        return this.stepsToCalCoef;
    }

    public void setStepsToCalCoef(int stepsToCalCoef){
        this.stepsToCalCoef = stepsToCalCoef;
    }

    public double convertToKm (int steps){
        return (steps*stepsToSmCoef*smToKmCoef);
    }

    public double convertStepsToKilocalories(int steps){
        return (steps*stepsToCalCoef*calToKcalCoef);
    }
}
