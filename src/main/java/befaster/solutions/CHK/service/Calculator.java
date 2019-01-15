package befaster.solutions.CHK.service;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {

    public Map<String, Integer> getItemCodeTotals(List<String> splitSkus) {

        Map<String, Integer> skuQuantityTotals = new HashMap();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (String sku : splitSkus) {

            String itemCode = StringUtils.substring(sku, sku.length() - 1).toUpperCase();
            int quantifier = Integer.parseInt(StringUtils.substringBefore(sku, itemCode));

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
}

