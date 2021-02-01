package com.hkma.consentdomain.swagger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hkma.consentdomain.swagger.model.ConsentRequest;
import com.hkma.consentdomain.swagger.model.ConsentResponse;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-01T03:13:57.351Z[GMT]")
@RestController
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteConsentsByConsentId(@Parameter(in = ParameterIn.PATH, description = "Id of consent", required=true, schema=@Schema()) @PathVariable("consentId") String consentId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ConsentResponse> getConsentsByConsentId(@Parameter(in = ParameterIn.PATH, description = "Id of consent", required=true, schema=@Schema()) @PathVariable("consentId") String consentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ConsentResponse>(objectMapper.readValue("{\n  \"data\" : {\n    \"consentId\" : \"consentId\",\n    \"permissions\" : [ \"permissions\", \"permissions\" ],\n    \"statusUpdateDate\" : \"statusUpdateDate\",\n    \"creationDate\" : \"creationDate\",\n    \"status\" : \"status\",\n    \"expirationDate\" : \"expirationDate\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  }\n}", ConsentResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ConsentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ConsentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ConsentResponse> postAccountConsent(@Parameter(in = ParameterIn.DEFAULT, description = "Create or update consent", required=true, schema=@Schema()) @Valid @RequestBody ConsentRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ConsentResponse>(objectMapper.readValue("{\n  \"data\" : {\n    \"consentId\" : \"consentId\",\n    \"permissions\" : [ \"permissions\", \"permissions\" ],\n    \"statusUpdateDate\" : \"statusUpdateDate\",\n    \"creationDate\" : \"creationDate\",\n    \"status\" : \"status\",\n    \"expirationDate\" : \"expirationDate\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  }\n}", ConsentResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ConsentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ConsentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
