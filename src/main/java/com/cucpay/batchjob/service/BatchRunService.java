package com.cucpay.batchjob.service;

import com.cucpay.batchjob.repository.DTxnCodeRespository;
import com.cucpay.batchjob.repository.TBatchRunStaRespository;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author YaoFeng
 */
@Service
public class BatchRunService {
    
    @Resource
    private DTxnCodeRespository dTxnCodeRespository;
    
    @Resource
    private TBatchRunStaRespository tBatchRunStaRespository;
    
    public String doBatch() {
        return null;
    }
}
