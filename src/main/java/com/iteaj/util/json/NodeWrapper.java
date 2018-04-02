package com.iteaj.util.json;

/**
 * create time: 2018/3/29
 *
 * @author iteaj
 * @version 1.0
 * @since 1.7
 */
public interface NodeWrapper<T> extends JsonWrapper<T> {

    /**
     * 返回节点Key
     * @return
     */
    String getKey();

    /**
     * 返回此节点对应的val
     * @return
     */
    Object getVal();

}
