package com.hkma.consentdomain.bizsvc;

import com.hkma.consentdomain.swagger.model.ConsentRequest;
import com.hkma.consentdomain.swagger.model.ConsentResponseData;
import com.hkma.consentdomain.swagger.model.UpdateConsentRequest;

public interface ConsentBizsvc {

    ConsentResponseData getConsentResponseData(String consentId);

    ConsentResponseData postConsentResponseData(ConsentRequest body);

    void deleteConsent(String consentId);

    void updateConsent(String consentId, UpdateConsentRequest body);

}
