/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.hkma.consentdomain.swagger;

import com.hkma.consentdomain.swagger.model.ConsentRequest;
import com.hkma.consentdomain.swagger.model.ConsentResponse;
import com.hkma.consentdomain.swagger.model.UpdateConsentRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-01T03:13:57.351Z[GMT]")
public interface V1Api {

    @Operation(summary = "Delete consent by consentId", description = "", tags={ "Consent" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "successful operation") })
    @RequestMapping(value = "/v1/account-consents/{consentId}",
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteConsentsByConsentId(@Parameter(in = ParameterIn.PATH, description = "Id of consent", required=true, schema=@Schema()) @PathVariable("consentId") String consentId);


    @Operation(summary = "Get consents by consentId", description = "", tags={ "Consent" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ConsentResponse.class))) })
    @RequestMapping(value = "/v1/account-consents/{consentId}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<ConsentResponse> getConsentsByConsentId(@Parameter(in = ParameterIn.PATH, description = "Id of consent", required=true, schema=@Schema()) @PathVariable("consentId") String consentId);


    @Operation(summary = "Create or update consent", description = "", tags={ "Consent" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "successful operation", content = @Content(schema = @Schema(implementation = ConsentResponse.class))) })
    @RequestMapping(value = "/v1/account-consents",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<ConsentResponse> postAccountConsent(@Parameter(in = ParameterIn.DEFAULT, description = "Create or update consent", required=true, schema=@Schema()) @Valid @RequestBody ConsentRequest body);

    @Operation(summary = "Update consent by consentId", description = "", tags={ "Consent" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "successful operation") })
    @RequestMapping(value = "/v1/account-consents/{consentId}",
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> updateConsentsByConsentId(@Parameter(in = ParameterIn.PATH, description = "Id of consent", required=true, schema=@Schema()) @PathVariable("consentId") String consentId, @Parameter(in = ParameterIn.DEFAULT, description = "Create or update consent", required=true, schema=@Schema()) @Valid @RequestBody UpdateConsentRequest body);

}



