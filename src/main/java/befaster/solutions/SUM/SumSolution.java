package befaster.solutions.SUM;

public class SumSolution {

    private static final int MIN = 0;

    private static final int MAX = 100;

    public Integer compute(Integer x, Integer y) {

        if(x == null || y == null){
            throw new IllegalArgumentException("compute: one or more parameters is null");
        }
        if(! parameterWithinRange(x) ||  !parameterWithinRange(y)){
            throw new IllegalArgumentException("compute: one or more parameters exceed min/max range");
        }

        return x + y;
    }

    private boolean parameterWithinRange(int input){

        if(input < MIN || input > MAX){
            return false;
        }
        return true;
    }

}