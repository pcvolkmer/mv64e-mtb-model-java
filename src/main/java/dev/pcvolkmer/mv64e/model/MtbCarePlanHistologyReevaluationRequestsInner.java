

package dev.pcvolkmer.mv64e.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.pcvolkmer.mv64e.model.Reference;
import java.util.Arrays;
import java.util.Date;
import org.jspecify.annotations.Nullable;


public class MtbCarePlanHistologyReevaluationRequestsInner {
  public static final String JSON_PROPERTY_ID = "id";
  
  private String id;

  public static final String JSON_PROPERTY_PATIENT = "patient";
  
  private Reference patient;

  public static final String JSON_PROPERTY_SPECIMEN = "specimen";
  
  private Reference specimen;

  public static final String JSON_PROPERTY_ISSUED_ON = "issuedOn";
  
  private Date issuedOn;

  public MtbCarePlanHistologyReevaluationRequestsInner() { 
  }

  public MtbCarePlanHistologyReevaluationRequestsInner id(String id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }


  @JsonProperty(value = JSON_PROPERTY_ID, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public MtbCarePlanHistologyReevaluationRequestsInner patient(Reference patient) {
    this.patient = patient;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_PATIENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Reference getPatient() {
    return patient;
  }


  @JsonProperty(value = JSON_PROPERTY_PATIENT, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPatient(Reference patient) {
    this.patient = patient;
  }


  public MtbCarePlanHistologyReevaluationRequestsInner specimen(Reference specimen) {
    this.specimen = specimen;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_SPECIMEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Reference getSpecimen() {
    return specimen;
  }


  @JsonProperty(value = JSON_PROPERTY_SPECIMEN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpecimen(Reference specimen) {
    this.specimen = specimen;
  }


  public MtbCarePlanHistologyReevaluationRequestsInner issuedOn(Date issuedOn) {
    this.issuedOn = issuedOn;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_ISSUED_ON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Date getIssuedOn() {
    return issuedOn;
  }


  @JsonProperty(value = JSON_PROPERTY_ISSUED_ON, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuedOn(Date issuedOn) {
    this.issuedOn = issuedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MtbCarePlanHistologyReevaluationRequestsInner mtbCarePlanHistologyReevaluationRequestsInner = (MtbCarePlanHistologyReevaluationRequestsInner) o;
    return Objects.equals(this.id, mtbCarePlanHistologyReevaluationRequestsInner.id) &&
        Objects.equals(this.patient, mtbCarePlanHistologyReevaluationRequestsInner.patient) &&
        Objects.equals(this.specimen, mtbCarePlanHistologyReevaluationRequestsInner.specimen) &&
        Objects.equals(this.issuedOn, mtbCarePlanHistologyReevaluationRequestsInner.issuedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patient, specimen, issuedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MtbCarePlanHistologyReevaluationRequestsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    specimen: ").append(toIndentedString(specimen)).append("\n");
    sb.append("    issuedOn: ").append(toIndentedString(issuedOn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

    public static class Builder {

    private MtbCarePlanHistologyReevaluationRequestsInner instance;

    public Builder() {
      this(new MtbCarePlanHistologyReevaluationRequestsInner());
    }

    protected Builder(MtbCarePlanHistologyReevaluationRequestsInner instance) {
      this.instance = instance;
    }

    public MtbCarePlanHistologyReevaluationRequestsInner.Builder id(String id) {
      this.instance.id = id;
      return this;
    }
    public MtbCarePlanHistologyReevaluationRequestsInner.Builder patient(Reference patient) {
      this.instance.patient = patient;
      return this;
    }
    public MtbCarePlanHistologyReevaluationRequestsInner.Builder specimen(Reference specimen) {
      this.instance.specimen = specimen;
      return this;
    }
    public MtbCarePlanHistologyReevaluationRequestsInner.Builder issuedOn(Date issuedOn) {
      this.instance.issuedOn = issuedOn;
      return this;
    }


    public MtbCarePlanHistologyReevaluationRequestsInner build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  public static MtbCarePlanHistologyReevaluationRequestsInner.Builder builder() {
    return new MtbCarePlanHistologyReevaluationRequestsInner.Builder();
  }

  public MtbCarePlanHistologyReevaluationRequestsInner.Builder toBuilder() {
    return new MtbCarePlanHistologyReevaluationRequestsInner.Builder()
      .id(getId())
      .patient(getPatient())
      .specimen(getSpecimen())
      .issuedOn(getIssuedOn());
  }

}

