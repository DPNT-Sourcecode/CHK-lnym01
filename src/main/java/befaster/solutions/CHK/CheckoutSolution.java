package befaster.solutions.CHK;

import befaster.solutions.CHK.service.Calculator;
import befaster.solutions.CHK.validator.SkuValidator;

public class CheckoutSolution {

//    private SkuValidator skuListValidator;
//    private Calculator calculator;

//    public CheckoutSolution(){
//        skuListValidator = new SkuValidator();
//        calculator = new Calculator();
//    }

    public Integer checkout(final String skus) {

        if(skus == null){
            return -1;
        }
        if(skus.length()==0){
            return 0;
        }

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for(int i = 0; i < skus.length(); i++){
            if(skus.charAt(i) == 'A'){
                a ++;
                continue;
            }
            if(skus.charAt(i) == 'B'){
                b++;
                continue;
            }
            if(skus.charAt(i) == 'C'){
                c++;
                continue;
            }
            if(skus.charAt(i) == 'D'){
                d++;
                continue;
            }
            return -1;
        }

        int total = 0;

        total += ((a / 3) * 130) + ((a%3) * 50);
        total += ((b / 2) * 45) + ((b%2) * 30);
        total += c * 20;
        total += d *15;

        return total;

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

