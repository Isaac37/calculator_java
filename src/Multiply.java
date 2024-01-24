public class Multiply implements Operate{
    @Override
    public Double getResult(Double... numbers) {
        Double sum = 1.0;
        for (Double num : numbers) {
            sum *= num;
        }
        return sum;

    }
}
