package com.hkma.consentdomain.bizsvc;

import com.hkma.consentdomain.swagger.model.ConsentRequest;
import com.hkma.consentdomain.swagger.model.ConsentResponseData;

public interface ConsentBizsvc {

    ConsentResponseData getConsentResponseData(String consentId);

    ConsentResponseData postConsentResponseData(ConsentRequest body);

    void deleteConsent(String consentId);

}
