package befaster.solutions.CHK.service;

import org.apache.commons.lang3.StringUtils;

public class Calculator {

    public int valueOf(String sku){
        String itemCode = StringUtils.substring(sku, sku.length()-1);
        int quantifier = Integer.parseInt(StringUtils.substringBefore(sku, itemCode));

        switch(itemCode){
            "A": 
        }

        return 0;   // todo
    }
}
