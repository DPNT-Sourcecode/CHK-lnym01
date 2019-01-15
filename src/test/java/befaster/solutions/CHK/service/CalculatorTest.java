package befaster.solutions.CHK.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalculatorTest {

    private Calculator subject;

    @Before
    public void setup(){
        subject = new Calculator();
    }

    @Test
    public void value_of_returns_correct_value_without_offer(){

        // given:
        String input = "2A";

        // when:
        int result = subject.valueOf(input);

        // then:
        assertThat(result,is(100));
    }

    @Test
    public void value_of_returns_correct_value_with_offer(){

        // given:
        String input = "5A";

        // when:
        int result = subject.valueOf(input);

        // then:
        assertThat(result,is(230));
    }
}

