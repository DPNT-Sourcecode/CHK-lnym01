package befaster.solutions.CHK;

import befaster.solutions.CHK.service.Calculator;
import befaster.solutions.CHK.validator.SkuValidator;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CheckoutSolution {

    private SkuValidator skuListValidator;
    private Calculator calculator;

    public CheckoutSolution(){
        skuListValidator = new SkuValidator();
        calculator = new Calculator();
    }

    public Integer checkout(final String skus) {

        if(StringUtils.isBlank(skus)){
            return 0;
        }
        Pattern valid = Pattern.compile("[ ABCDabcd]{0-1}")
//        // split & validate
//        List<String> splitSkus = Arrays.asList(StringUtils.split(skus, " "));
//        if(! skuListValidator.validate(splitSkus)){
//            return -1;
//        }
//
//        // group items with the same code
//        Map<String,Integer> itemTotals = calculator.getItemCodeTotals(splitSkus);
//
//        return calculator.checkout(itemTotals);
    }
}

