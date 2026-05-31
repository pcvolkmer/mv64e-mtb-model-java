

package dev.pcvolkmer.mv64e.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.pcvolkmer.mv64e.model.HealthInsuranceTypeCoding;
import dev.pcvolkmer.mv64e.model.Reference;
import java.util.Arrays;
import org.jspecify.annotations.Nullable;


public class PatientHealthInsurance {
  public static final String JSON_PROPERTY_TYPE = "type";
  
  private HealthInsuranceTypeCoding type;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  
  private @Nullable Reference reference;

  public PatientHealthInsurance() { 
  }

  public PatientHealthInsurance type(HealthInsuranceTypeCoding type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HealthInsuranceTypeCoding getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(HealthInsuranceTypeCoding type) {
    this.type = type;
  }


  public PatientHealthInsurance reference(@Nullable Reference reference) {
    this.reference = reference;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_REFERENCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public @Nullable Reference getReference() {
    return reference;
  }


  @JsonProperty(value = JSON_PROPERTY_REFERENCE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(@Nullable Reference reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientHealthInsurance patientHealthInsurance = (PatientHealthInsurance) o;
    return Objects.equals(this.type, patientHealthInsurance.type) &&
        Objects.equals(this.reference, patientHealthInsurance.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientHealthInsurance {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

    public static class Builder {

    private PatientHealthInsurance instance;

    public Builder() {
      this(new PatientHealthInsurance());
    }

    protected Builder(PatientHealthInsurance instance) {
      this.instance = instance;
    }

    public PatientHealthInsurance.Builder type(HealthInsuranceTypeCoding type) {
      this.instance.type = type;
      return this;
    }
    public PatientHealthInsurance.Builder reference(Reference reference) {
      this.instance.reference = reference;
      return this;
    }


    public PatientHealthInsurance build() {
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

  public static PatientHealthInsurance.Builder builder() {
    return new PatientHealthInsurance.Builder();
  }

  public PatientHealthInsurance.Builder toBuilder() {
    return new PatientHealthInsurance.Builder()
      .type(getType())
      .reference(getReference());
  }

}

