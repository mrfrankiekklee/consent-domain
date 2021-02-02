package com.hkma.consentdomain.swagger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hkma.consentdomain.bizsvc.ConsentBizsvcImpl;
import com.hkma.consentdomain.swagger.model.ConsentRequest;
import com.hkma.consentdomain.swagger.model.ConsentResponse;
import com.hkma.consentdomain.swagger.model.ConsentResponseData;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-01T03:13:57.351Z[GMT]")
@Controller
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final ConsentBizsvcImpl consentBizsvcImpl;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request, ConsentBizsvcImpl consentBizsvcImpl) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.consentBizsvcImpl = consentBizsvcImpl;
    }

    public ResponseEntity<Void> deleteConsentsByConsentId(@Parameter(in = ParameterIn.PATH, description = "Id of consent", required=true, schema=@Schema()) @PathVariable("consentId") String consentId) {
        consentBizsvcImpl.deleteConsent(consentId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<ConsentResponse> getConsentsByConsentId(@Parameter(in = ParameterIn.PATH, description = "Id of consent", required=true, schema=@Schema()) @PathVariable("consentId") String consentId) {

        ConsentResponseData consentResponseData = consentBizsvcImpl.getConsentResponseData(consentId);
        ConsentResponse consentResponse = new ConsentResponse();
        consentResponse.setData(consentResponseData);
        return new ResponseEntity<ConsentResponse>(consentResponse, HttpStatus.OK);
    }

    public ResponseEntity<ConsentResponse> postAccountConsent(@Parameter(in = ParameterIn.DEFAULT, description = "Create or update consent", required=true, schema=@Schema()) @Valid @RequestBody ConsentRequest body) {
        ConsentResponseData consentResponseData = consentBizsvcImpl.postConsentResponseData(body);
        ConsentResponse consentResponse = new ConsentResponse();
        consentResponse.setData(consentResponseData);
        return new ResponseEntity<ConsentResponse>(consentResponse, HttpStatus.OK);
    }

}
