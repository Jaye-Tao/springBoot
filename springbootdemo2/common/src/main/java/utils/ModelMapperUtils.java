/**
 * @Description:
 * @ClassName: com.ali.openim.util.ModelMapperUtils
 * @author: Omar(OmarZhang)
 * @date: 2015年12月3日 上午1:39:01
 */
package utils;

import com.google.common.collect.Lists;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.convention.NameTokenizers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created Jay
 * Date 2018/2/24
 * 对象转换工具类
 */
public final class ModelMapperUtils {

    private static ModelMapper modelMapper = new ModelMapper();

    static {
        modelMapper
                .getConfiguration().setFieldMatchingEnabled(true)
                .setSourceNameTokenizer(NameTokenizers.UNDERSCORE)
                .setDestinationNameTokenizer(NameTokenizers.UNDERSCORE)
                .setMatchingStrategy(MatchingStrategies.STANDARD);
    }

    private ModelMapperUtils() {
    }

    /**
     * 源对象转换为目标对象
     * @Title: toParse
     * @param sourceObj
     * @param descObject
     * @return
     * @author: Jaye
     */
    public static <E> E toParse(Object sourceObj, Class<E> descObject) {
        if(sourceObj != null) {
            return modelMapper.map(sourceObj, descObject);
        }
        return null;
    }

    /**
     * 源对象集合转换为目标对象集合
     * @Title: toParseList
     * @param sourceObjList
     * @param descObject
     * @return
     * @author: Jaye
     */
    public static <E, H> List<E> toParseList(List<H> sourceObjList, Class<E> descObject) {
        if(CpCollectionUtils.isEmpty(sourceObjList)) {
            return Lists.newArrayList();
        }
        List<E> tempList = new ArrayList<E>(sourceObjList.size());
        for (Iterator<H> it = sourceObjList.iterator(); it.hasNext(); ) {
            H h = it.next();
            tempList.add(toParse(h, descObject));
        }
        return tempList;
    }

}
