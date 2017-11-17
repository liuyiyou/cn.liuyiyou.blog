package cn.liuyiyou.web.model;

import java.util.Date;

/**
 * @author: liuyiyou
 * @date: 2017/11/13
 * Time: 上午11:17
 */
public class PageEntity {

    public final static String TOTAL = "total";

    public final static Long EXPIRE = 30L;

    private transient Integer total = 1000;

    private transient Integer page = 1;

    private transient Integer pageSize = 5000;

    private transient Date createTimeStart;

    private transient Date createTimeEnd;

    private transient Date statusTimeStart;

    private transient Date statusTimeEnd;

    public transient boolean forUpdate = false;

    private String orderByClause;

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public static String getTOTAL() {
        return TOTAL;
    }

    public static Long getEXPIRE() {
        return EXPIRE;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Date getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Date createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public Date getStatusTimeStart() {
        return statusTimeStart;
    }

    public void setStatusTimeStart(Date statusTimeStart) {
        this.statusTimeStart = statusTimeStart;
    }

    public Date getStatusTimeEnd() {
        return statusTimeEnd;
    }

    public void setStatusTimeEnd(Date statusTimeEnd) {
        this.statusTimeEnd = statusTimeEnd;
    }

    public boolean isForUpdate() {
        return forUpdate;
    }

    public void setForUpdate(boolean forUpdate) {
        this.forUpdate = forUpdate;
    }
}
