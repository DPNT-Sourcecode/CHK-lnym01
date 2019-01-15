package befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CheckoutSolutionTest {

    private CheckoutSolution subject;

    @Before
    public void setup(){
        subject = new CheckoutSolution();
    }

    @Test
    public void null_input_returns_minus_one(){
        // given:
        String input = null;

        // when:
        Integer result = subject.checkout(input);

        // then:
        assertThat(result, is(-1));

    }
    @Test
    public void empty_input_returns_zero(){
        // given:
        String input = " ";

        // when:
        Integer result = subject.checkout(input);

        // then:
        assertThat(result, is(0));

    }

    @Test
    public void illegal_input_returns_minus_one(){

        // given:
        String input = ",vfmldkbndlkfgmds";

        // when:
        Integer result = subject.checkout(input);

        // then:
        assertThat(result, is(-1));
    }

    @Test
    public void correct_input_returns_expected_total(){

        // given:
        String input = "3A 2A 2B C";

        // when:
        Integer result = subject.checkout(input);

        // then:
        assertThat(result, is(295));
    }
}
