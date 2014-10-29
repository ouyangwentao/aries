package aries.dao.db;

/**
 * Created by Ouyang on 2014/9/17.
 */
/**
 * 动态数据库选择
 * 根据DataSourceType是数据源的类型来决定是使用数据库
 * 通过ThreadLocal绑定实现选择功能
 * @author wangjianshen
 *
 */
public class ManyDBSourceSwitch {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return contextHolder.get();
    }

    public static void clearDataSourceType() {
        contextHolder.remove();
    }


}