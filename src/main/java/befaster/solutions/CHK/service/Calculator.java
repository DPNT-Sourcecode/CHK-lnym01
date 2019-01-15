package befaster.solutions.CHK.service;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public class Calculator {

    public Map<String, Integer> getItemCodeTotals(final List<String> splitSkus) {

        Map<String, Integer> skuQuantityTotals = new HashMap<>();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (String sku : splitSkus) {

            String itemCode = StringUtils.substring(sku, sku.length() - 1).toUpperCase();
            int quantifier = getQuantifier(sku, itemCode);


            switch (itemCode) {
                case "A":
                    a += quantifier;
                    break;
                case "B":
                    b += quantifier;
                    break;
                case "C":
                    c += quantifier;
                    break;
                case "D":
                    d += quantifier;
                    break;
                default:
                    // should never happen
                    break;
            }


            skuQuantityTotals.put("A", a);
            skuQuantityTotals.put("B", b);
            skuQuantityTotals.put("C", c);
            skuQuantityTotals.put("D", d);
        }
        return skuQuantityTotals;
    }

    public int getQuantifier(String sku, String itemCode) {
        String quantifierString = StringUtils.substringBefore(sku, itemCode);
        int quantifier = 1;
        if(!StringUtils.isEmpty(quantifierString)){
            quantifier = Integer.parseInt(quantifierString);
        }
        return quantifier;
    }

    public Integer checkout(final Map<String, Integer> skuMap){

        int total = 0;

        int aCount = skuMap.get("A");
        total += ((aCount / 3) * 130) + ((aCount%3) * 50);

        int bCount = skuMap.get("B");
        total += ((bCount / 2) * 45) + ((bCount%2) * 30);

        int cCount = skuMap.get("C");
        total += cCount * 20;

        int dCount = skuMap.get("D");
        total += dCount *15;

        return total;

    }


}

