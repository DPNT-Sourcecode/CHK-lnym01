package befaster.solutions.CHK.validator;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class SkuValidator {

    private enum itemCode {
        A, B, C, D
    }

    public boolean validate(List<String> input ){

        if(CollectionUtils.isEmpty(input)){
            // shouldn't happen...
            return false;
        }

        

        input.stream().

        return false;   //TODO
    }


}



