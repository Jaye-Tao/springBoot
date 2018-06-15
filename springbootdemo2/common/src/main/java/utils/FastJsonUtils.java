package utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;

/**
 * Created Jay
 * Date 2018/2/7
 * json 转换工具类
 *
 */
public final class FastJsonUtils {


    private FastJsonUtils(){

    }

    /**
     * json转对象
     * @Title: toObject
     * @param json JSON 字符串
     * @param clazz 转换对象
     * @return
     * @author: Jaye
     */
    public static <T>  T toObject(String json,Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    /**
     * json转对象集合
     * @Title: toObjectList
     * @param jsons JSON 字符串
     * @param clazz 转换对象
     * @return
     * @author Jaye
     * @date 2016年3月10日 下午4:43:27
     */
    public static <T> List<T> toObjectList(String jsons, Class<T> clazz) {
        return JSON.parseArray(jsons, clazz);
    }

    /**
     * 对象转换转换为JSON字符串
     * @param obj 对象
     * @return String json
     * @author Jaye
     */
    public static String toJson(Object obj) {
        return JSON.toJSONString(obj, SerializerFeature.WriteMapNullValue,SerializerFeature.WriteDateUseDateFormat);
    }

}
