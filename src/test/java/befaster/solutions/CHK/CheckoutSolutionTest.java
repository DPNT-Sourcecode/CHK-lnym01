package befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CheckoutSolutionTest {

    private static final Integer ILLEGAL_INPUT_RESULT = -1;

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
        assertThat(result, is(ILLEGAL_INPUT_RESULT));

    }
    @Test
    public void empty_input_returns_minus_one(){
        // given:
        String input = " ";

        // when:
        Integer result = subject.checkout(input);

        // then:
        assertThat(result, is(ILLEGAL_INPUT_RESULT));

    }

    @Test
    public void illegal_input_returns_minus_one(){

        // given:
        String input = ",vfmldkbndlkfgmds";

        // when:
        Integer result = subject.checkout(input);

        // then:
        assertThat(result, is(ILLEGAL_INPUT_RESULT));
    }
}


