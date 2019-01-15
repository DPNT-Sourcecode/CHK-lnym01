package befaster.solutions.CHK.service;

import org.apache.commons.lang3.StringUtils;

public class Calculator {

    public int valueOf(String sku){
        String itemCode = StringUtils.substring(sku, sku.length()-1);
        int quantifier = Integer.parseInt(StringUtils.substringBefore(sku, itemCode));

        switch(itemCode){
            case "A":
                return ((quantifier/3)*130) + ((quantifier %3) *50);
            case "B":
                return ((quantifier/2)*45) + ((quantifier%2)*30);
            case "C":
                return quantifier * 20;
            case "D":
                return quantifier * 15;
            default:
                // should never happen
                return -1;
        }

    }
}
