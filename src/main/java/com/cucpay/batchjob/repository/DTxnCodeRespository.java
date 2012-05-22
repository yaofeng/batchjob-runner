package com.cucpay.batchjob.repository;

import com.cucpay.batchjob.domain.DTxnCode;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author YaoFeng
 */
public interface DTxnCodeRespository extends CrudRepository<DTxnCode, String> {
    
}
