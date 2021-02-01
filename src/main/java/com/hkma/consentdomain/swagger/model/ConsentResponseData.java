package com.hkma.consentdomain.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsentResponseData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-01T03:13:57.351Z[GMT]")


public class ConsentResponseData   {
  @JsonProperty("consentId")
  private String consentId = null;

  @JsonProperty("creationDate")
  private String creationDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusUpdateDate")
  private String statusUpdateDate = null;

  @JsonProperty("permissions")
  @Valid
  private List<String> permissions = null;

  @JsonProperty("expirationDate")
  private String expirationDate = null;

  public ConsentResponseData consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Get consentId
   * @return consentId
   **/
  @Schema(description = "")
  
    public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public ConsentResponseData creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   **/
  @Schema(description = "")
  
    public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public ConsentResponseData status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ConsentResponseData statusUpdateDate(String statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
    return this;
  }

  /**
   * Get statusUpdateDate
   * @return statusUpdateDate
   **/
  @Schema(description = "")
  
    public String getStatusUpdateDate() {
    return statusUpdateDate;
  }

  public void setStatusUpdateDate(String statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
  }

  public ConsentResponseData permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public ConsentResponseData addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<String>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   **/
  @Schema(description = "")
  
    public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public ConsentResponseData expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   **/
  @Schema(description = "")
  
    public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentResponseData consentResponseData = (ConsentResponseData) o;
    return Objects.equals(this.consentId, consentResponseData.consentId) &&
        Objects.equals(this.creationDate, consentResponseData.creationDate) &&
        Objects.equals(this.status, consentResponseData.status) &&
        Objects.equals(this.statusUpdateDate, consentResponseData.statusUpdateDate) &&
        Objects.equals(this.permissions, consentResponseData.permissions) &&
        Objects.equals(this.expirationDate, consentResponseData.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDate, status, statusUpdateDate, permissions, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentResponseData {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDate: ").append(toIndentedString(statusUpdateDate)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
