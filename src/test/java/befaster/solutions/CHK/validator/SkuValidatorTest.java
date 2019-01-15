package befaster.solutions.CHK.validator;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SkuValidatorTest {

    private SkuValidator subject;

    @Before
    public void setup(){
        subject = new SkuValidator();
    }

    @Test
    public void invalid_input_returns_false(){
        // given:
        List<String> input = Arrays.asList("1A", "3%");

        // when:
        boolean result = subject.validate(input);

        // then:
        assertThat(result, is(false));
    }

    @Test
    public void valid_input_returns_true(){
        // given:
        List<String> input = Arrays.asList("1A", "D", "2B");

        // when:
        boolean result = subject.validate(input);

        // then:
        assertThat(result, is(true));
    }
}
