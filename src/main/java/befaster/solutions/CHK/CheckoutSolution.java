package befaster.solutions.CHK;

import befaster.solutions.CHK.service.Calculator;
import befaster.solutions.CHK.validator.SkuValidator;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class CheckoutSolution {

    private SkuValidator skuListValidator;
    private Calculator calculator;

    public CheckoutSolution(){
        skuListValidator = new SkuValidator();
        calculator = new Calculator();
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

        // group items with the same code
        calculator.getItemCodeTotals(splitSkus);

//        return splitSkus.stream().mapToInt(sku -> calculator.valueOf(sku)).sum();
        return 0;
    }
}

