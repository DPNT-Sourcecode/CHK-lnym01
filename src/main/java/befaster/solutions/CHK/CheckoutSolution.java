package befaster.solutions.CHK;

import org.apache.commons.lang3.StringUtils;

public class CheckoutSolution {
    public Integer checkout(final String skus) {

        if(StringUtils.isBlank(skus)){
            return -1;
        }

        return 0;   //TODO: 0 to differentiate between blank and regular execution for now

//        throw new SolutionNotImplementedException();
    }
}
