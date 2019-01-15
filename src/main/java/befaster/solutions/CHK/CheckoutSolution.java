package befaster.solutions.CHK;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class CheckoutSolution {
    public Integer checkout(final String skus) {

        if(StringUtils.isBlank(skus)){
            return -1;
        }
        // split
        List<String> splitSkus = Arrays.asList(StringUtils.split(skus, " "));

        // validate

        return 0;   //TODO: 0 to differentiate between blank and regular execution for now

//        throw new SolutionNotImplementedException();
    }
}

