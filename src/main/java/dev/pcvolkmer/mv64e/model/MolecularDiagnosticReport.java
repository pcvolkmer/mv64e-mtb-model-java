

package dev.pcvolkmer.mv64e.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.pcvolkmer.mv64e.model.MolecularDiagnosticReportTypeCoding;
import dev.pcvolkmer.mv64e.model.Reference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.jspecify.annotations.Nullable;


public class MolecularDiagnosticReport {
  public static final String JSON_PROPERTY_TYPE = "type";
  
  private MolecularDiagnosticReportTypeCoding type;

  public static final String JSON_PROPERTY_SPECIMEN = "specimen";
  
  private Reference specimen;

  public static final String JSON_PROPERTY_ISSUED_ON = "issuedOn";
  
  private Date issuedOn;

  public static final String JSON_PROPERTY_PERFORMER = "performer";
  
  private @Nullable Reference performer;

  public static final String JSON_PROPERTY_PATIENT = "patient";
  
  private Reference patient;

  public static final String JSON_PROPERTY_ID = "id";
  
  private String id;

  public static final String JSON_PROPERTY_RESULTS = "results";
  
  private @Nullable List<String> results;

  public MolecularDiagnosticReport() { 
  }

  public MolecularDiagnosticReport type(MolecularDiagnosticReportTypeCoding type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MolecularDiagnosticReportTypeCoding getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(MolecularDiagnosticReportTypeCoding type) {
    this.type = type;
  }


  public MolecularDiagnosticReport specimen(Reference specimen) {
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


  public MolecularDiagnosticReport issuedOn(Date issuedOn) {
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


  public MolecularDiagnosticReport performer(@Nullable Reference performer) {
    this.performer = performer;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_PERFORMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public @Nullable Reference getPerformer() {
    return performer;
  }


  @JsonProperty(value = JSON_PROPERTY_PERFORMER, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformer(@Nullable Reference performer) {
    this.performer = performer;
  }


  public MolecularDiagnosticReport patient(Reference patient) {
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


  public MolecularDiagnosticReport id(String id) {
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


  public MolecularDiagnosticReport results(@Nullable List<String> results) {
    this.results = results;
    return this;
  }

  public MolecularDiagnosticReport addResultsItem(String resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_RESULTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public @Nullable List<String> getResults() {
    return results;
  }


  @JsonProperty(value = JSON_PROPERTY_RESULTS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(@Nullable List<String> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MolecularDiagnosticReport molecularDiagnosticReport = (MolecularDiagnosticReport) o;
    return Objects.equals(this.type, molecularDiagnosticReport.type) &&
        Objects.equals(this.specimen, molecularDiagnosticReport.specimen) &&
        Objects.equals(this.issuedOn, molecularDiagnosticReport.issuedOn) &&
        Objects.equals(this.performer, molecularDiagnosticReport.performer) &&
        Objects.equals(this.patient, molecularDiagnosticReport.patient) &&
        Objects.equals(this.id, molecularDiagnosticReport.id) &&
        Objects.equals(this.results, molecularDiagnosticReport.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, specimen, issuedOn, performer, patient, id, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MolecularDiagnosticReport {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    specimen: ").append(toIndentedString(specimen)).append("\n");
    sb.append("    issuedOn: ").append(toIndentedString(issuedOn)).append("\n");
    sb.append("    performer: ").append(toIndentedString(performer)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

    public static class Builder {

    private MolecularDiagnosticReport instance;

    public Builder() {
      this(new MolecularDiagnosticReport());
    }

    protected Builder(MolecularDiagnosticReport instance) {
      this.instance = instance;
    }

    public MolecularDiagnosticReport.Builder type(MolecularDiagnosticReportTypeCoding type) {
      this.instance.type = type;
      return this;
    }
    public MolecularDiagnosticReport.Builder specimen(Reference specimen) {
      this.instance.specimen = specimen;
      return this;
    }
    public MolecularDiagnosticReport.Builder issuedOn(Date issuedOn) {
      this.instance.issuedOn = issuedOn;
      return this;
    }
    public MolecularDiagnosticReport.Builder performer(Reference performer) {
      this.instance.performer = performer;
      return this;
    }
    public MolecularDiagnosticReport.Builder patient(Reference patient) {
      this.instance.patient = patient;
      return this;
    }
    public MolecularDiagnosticReport.Builder id(String id) {
      this.instance.id = id;
      return this;
    }
    public MolecularDiagnosticReport.Builder results(List<String> results) {
      this.instance.results = results;
      return this;
    }


    public MolecularDiagnosticReport build() {
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

  public static MolecularDiagnosticReport.Builder builder() {
    return new MolecularDiagnosticReport.Builder();
  }

  public MolecularDiagnosticReport.Builder toBuilder() {
    return new MolecularDiagnosticReport.Builder()
      .type(getType())
      .specimen(getSpecimen())
      .issuedOn(getIssuedOn())
      .performer(getPerformer())
      .patient(getPatient())
      .id(getId())
      .results(getResults());
  }

}

