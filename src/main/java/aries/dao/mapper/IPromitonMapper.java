package aries.dao.mapper;

import aries.dao.entity.po.PromotionRecord;

import java.util.List;

/**
 * Created by Ouyang on 2014/9/17.
 */
public interface IPromitonMapper {
    List<PromotionRecord> getPromotionRecords();

    List<PromotionRecord> getTopXPromotionRecords(int x);
}
