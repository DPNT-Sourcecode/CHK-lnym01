package befaster.solutions.CHK.service;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class CalculatorTest {

    private Calculator subject;

    @Before
    public void setup(){
        subject = new Calculator();
    }

    @Test
    public void get_item_code_totals_returns_correct_amount(){

        // given:
        List<String> input = Arrays.asList("3A", "2A");

        // when:
        Map<String, Integer> result = subject.getItemCodeTotals(input);

        // then:
        assertThat(result.get("A"), is(5));

    }
}

