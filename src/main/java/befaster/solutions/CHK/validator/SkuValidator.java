package befaster.solutions.CHK.validator;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

@Deprecated
public class SkuValidator {

//    Pattern skuPattern = Pattern.compile("\\d*[ABCD]{1}");
//
//    public Boolean validate(List<String> input ){
//
//         Predicate<String> validSku = skuPattern.asPredicate();
//
//        if(CollectionUtils.isEmpty(input)){
//            // shouldn't happen...
//            return false;
//        }
//
//        for(String sku: input) {
//            if (validSku.negate().test(sku)) {
//                return false;
//            }
//        }
//        return true;
//    }
}
