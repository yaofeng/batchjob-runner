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
@Table(name="D_TXN_CODE")
public class DTxnCode implements Serializable {
    
    private String intTxnCd;
    
    private String txnName;

    @Id
    @Column(name="INT_TXN_CD")
    public String getIntTxnCd() {
        return intTxnCd;
    }

    public void setIntTxnCd(String intTxnCd) {
        this.intTxnCd = intTxnCd == null ? null : intTxnCd.trim();
    }

    @Column(name="TXN_NM")
    public String getTxnName() {
        return txnName;
    }

    public void setTxnName(String txnName) {
        this.txnName = txnName == null ? null : txnName.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
