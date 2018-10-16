package org.qujianlei.entity;

import java.util.List;

/**
 * @author 曲健磊
 * @date 2018年10月16日 下午10:49:34
 * @description 分页后的实体对象,包含分页后的list,第几页,总页数,总条数,and so on...
 */
public class PageEntity<E> {

    private List<E> pageList; // 这一页的列表

    private int number; // 当前是第几页

    private int size; // 当前这一页有多少条记录

    private int totalPages; // 总共多少页

    private int totalElements; // 总共多少条记录

    private boolean hasContent; // 这一页是否有内容

    private boolean isFirst; // 这一页是否是第一页

    private boolean isLast; // 这一页是否是最后一页

    private boolean hasPrevious; // 是否有前一页

    private boolean hasNext; // 是否有后一页

}
