package aries.dao.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by Ouyang on 2014/9/17.
 */

public class ManyDBSources extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return ManyDBSourceSwitch.getDataSourceType();
    }
}
