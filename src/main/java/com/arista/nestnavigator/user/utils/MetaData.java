package com.arista.nestnavigator.user.utils;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MetaData {
    private int totalRecords;
    private int processedRecords;
    private String version;
    private long executionTimeMs;
}
