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
            if(StringUtils.isAlphanumeric(sku)){
                return false;
            }
        }


        return null;   //TODO
    }


}




