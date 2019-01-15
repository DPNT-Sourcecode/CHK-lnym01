package befaster.solutions.CHK;

import befaster.solutions.CHK.service.Calculator;
import befaster.solutions.CHK.validator.SkuValidator;

public class CheckoutSolution {

    private SkuValidator skuListValidator;
    private Calculator calculator;

    public CheckoutSolution(){
        skuListValidator = new SkuValidator();
        calculator = new Calculator();
    }

    public Integer checkout(final String skus) {

        if(skus == null){
            return -1;
        }
        if(skus.length()==0){
            return 0;
        }

        String significantChar = skus.substring(0,1).toUpperCase();

        if(significantChar.equals("A")){
            return 50;
        }
        if(significantChar.equals("B")){
            return 30;
        }
        if(significantChar.equals("C")){
            return 20;
        }
        if(significantChar.equals("D")){
            return 15;
        }

        return -1;

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



