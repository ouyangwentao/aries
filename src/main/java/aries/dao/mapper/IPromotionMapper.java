package aries.dao.mapper;

import aries.dao.annotation.DBSource;
import aries.dao.entity.po.PromotionRecord;

import java.util.List;

/**
 * Created by Ouyang on 2014/9/17.
 */
public interface IPromotionMapper {

    @DBSource("db_mobilebusi")
    List<PromotionRecord> getPromotionRecords();

    @DBSource("db_mobilebusi")
    List<PromotionRecord> getTopXPromotionRecords(int x);
}
