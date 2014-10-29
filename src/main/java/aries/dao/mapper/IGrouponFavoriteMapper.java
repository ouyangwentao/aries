package aries.dao.mapper;

import aries.dao.annotation.DBSource;
import aries.dao.entity.po.GrouponFavorite;

import java.util.List;

/**
 * Created by Ouyang on 2014/9/19.
 */
public interface IGrouponFavoriteMapper {
    @DBSource("db_mobizdb")
    List<GrouponFavorite> getUserFavorite(String cardNo);
}
