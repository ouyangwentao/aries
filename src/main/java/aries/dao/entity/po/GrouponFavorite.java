package aries.dao.entity.po;

import java.util.Date;

/**
 * Created by Ouyang on 2014/9/19.
 */
public class GrouponFavorite {
    /**
     * 会员卡号
     */
    private String cardNo;

    /**
     * 团购产品ID
     */
    private String productID;

    /**
     * 收藏时间
     */
    private Date collectTime;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}
