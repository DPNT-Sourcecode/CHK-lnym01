package befaster.solutions.CHK;

import befaster.solutions.CHK.validator.SkuValidator;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class CheckoutSolution {

    private SkuValidator skuListValidator;

    public CheckoutSolution(){
        skuListValidator = new SkuValidator();
    }

    public Integer checkout(final String skus) {

        if(StringUtils.isBlank(skus)){
            return -1;
        }
        // split & validate
        List<String> splitSkus = Arrays.asList(StringUtils.split(skus, " "));
        if(! skuListValidator.validate(splitSkus)){
            return -1;
        }

        return 0;   //TODO: 0 to differentiate between blank and regular execution for now

//        throw new SolutionNotImplementedException();
    }


}

