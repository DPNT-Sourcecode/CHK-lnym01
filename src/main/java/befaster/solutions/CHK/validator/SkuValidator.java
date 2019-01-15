package befaster.solutions.CHK.validator;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.regex.Pattern;

public class SkuValidator {

    Pattern skuPattern = Pattern.compile("\\d+[ABCD]{1}");

    private enum ItemCode {
        A, B, C, D
    }

    public Boolean validate(List<String> input ){

        skuPattern.

        if(CollectionUtils.isEmpty(input)){
            // shouldn't happen...
            return false;
        }

        for(String sku: input) {



//            // is letters and numbers only
//            if(! StringUtils.isAlphanumeric(sku)){
//                return false;
//            }
//            // only last character should be a letter
//            char lastChar = sku.charAt(sku.length()-1);
//            if(lastChar < 'A' || lastChar > 'Z'){
//                return false;
//            }
//            String skuQuantifier = StringUtils.substring(sku, 0, sku.length());
//            if(StringUtils.is)
//
//            // last letter should be an ItemCode
        }


        return null;   //TODO
    }


}

