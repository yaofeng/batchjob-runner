package com.cucpay.batchjob.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author YaoFeng
 */
@Entity
@Table(name="T_BATCH_RUN_STA")
public class TBatchRunSta implements Serializable {
    
    
    private String intTxnCd;
    
    private String batchRunStaCd;

    @Id
    @Column(name="INT_TXN_CD")
    public String getIntTxnCd() {
        return intTxnCd;
    }

    public void setIntTxnCd(String intTxnCd) {
        this.intTxnCd = intTxnCd == null ? null : intTxnCd.trim();
    }

    @Column(name="BATCH_RUN_STA_CD")
    public String getBatchRunStaCd() {
        return batchRunStaCd;
    }

    public void setBatchRunStaCd(String batchRunStaCd) {
        this.batchRunStaCd = batchRunStaCd == null ? null : batchRunStaCd.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
