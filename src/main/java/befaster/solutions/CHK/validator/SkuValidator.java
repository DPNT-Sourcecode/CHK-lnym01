package befaster.solutions.CHK.validator;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class SkuValidator {

    private enum ItemCode {
        A, B, C, D
    }

    public Boolean validate(List<String> input ){

        if(CollectionUtils.isEmpty(input)){
            // shouldn't happen...
            return false;
        }

        for(String sku: input) {
            // is letters and numbers only
            if(! StringUtils.isAlphanumeric(sku)){
                return false;
            }
            // only last character should be a letter
            char lastChar = sku.charAt(sku.length()-1);
            if(){

            }
            // last letter should be an ItemCode
        }


        return null;   //TODO
    }


}





