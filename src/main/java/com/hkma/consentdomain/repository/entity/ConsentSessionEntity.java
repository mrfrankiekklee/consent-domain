package com.hkma.consentdomain.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="consent_session")
public class ConsentSessionEntity implements Serializable {

    @Id
    @Column(name = "record_id")
    private String recordId;

    @Column(name = "consent_id")
    private String consentId;

    @Column(name = "refresh_token")
    private String refreshToken;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
