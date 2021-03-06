package befaster.solutions.SUM;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
    private SumSolution sum;

    @Before
    public void setUp() {

        sum = new SumSolution();
    }

    @Test
    public void compute_sum() {

        assertThat(sum.compute(1, 1), equalTo(2));
    }

    @Test(expected=IllegalArgumentException.class)
    public void test_null_input_throws_illegal_argument_exception(){
        sum.compute(null, 1);
    }
    @Test(expected=IllegalArgumentException.class)
    public void test_input_exceeding_range_constraints_throws_illegal_argument_exception(){
        sum.compute(101, 1);
    }
}
