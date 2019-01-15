package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloSolutionTest {

    private HelloSolution subject;

    @Before
    public void setup(){
        subject = new HelloSolution();
    }

    @Test
    public void hello_outputs_friend_name(){

        //given:
        String input = "Simon";

        //when:
        String result = subject.hello(input);

        //then:
        assertThat(result, is("Hello, Simon!"));

    }
}


