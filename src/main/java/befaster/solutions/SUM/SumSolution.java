package befaster.solutions.SUM;

public class SumSolution {

    public Integer compute(Integer x, Integer y) {

        if(x == null || y == null){
            throw new IllegalArgumentException("compute: cannot sum null parameters");
        }

        return x + y;
    }

}



