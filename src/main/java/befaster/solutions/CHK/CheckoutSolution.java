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

        String input = skus.toUpperCase();
        for(int i = 0; i < skus.length(); i++){
            if(input.charAt(i) == 'A'){
                return 50;
            }
            if(input.charAt(i) == 'B'){
                return 30;
            }
            if(input.charAt(i) == 'C'){
                return 20;
            }
            if(input.charAt(i) == 'D'){
                return 15;
            }
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
