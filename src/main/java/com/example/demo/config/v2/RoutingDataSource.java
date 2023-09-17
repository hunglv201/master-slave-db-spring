package com.example.demo.config.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Slf4j
public class RoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        var dataSourceType = TransactionSynchronizationManager.isCurrentTransactionReadOnly();
        log.info("current dataSourceType : {}", dataSourceType);
        if(dataSourceType)
            return DataSourceType.READ_ONLY;
        return DataSourceType.WRITE_ONLY;
    }
}