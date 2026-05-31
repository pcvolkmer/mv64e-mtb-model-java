

package dev.pcvolkmer.mv64e.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.pcvolkmer.mv64e.model.BaseVariantLocalizationCoding;
import dev.pcvolkmer.mv64e.model.DnaFusionFusionPartner3prime;
import dev.pcvolkmer.mv64e.model.DnaFusionFusionPartner5prime;
import dev.pcvolkmer.mv64e.model.Reference;
import dev.pcvolkmer.mv64e.model.VariantExternalId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;


public class DnaFusion {
  public static final String JSON_PROPERTY_FUSION_PARTNER3PRIME = "fusionPartner3prime";
  
  private DnaFusionFusionPartner3prime fusionPartner3prime;

  public static final String JSON_PROPERTY_LOCALIZATION = "localization";
  
  private @Nullable Set<BaseVariantLocalizationCoding> localization;

  public static final String JSON_PROPERTY_FUSION_PARTNER5PRIME = "fusionPartner5prime";
  
  private DnaFusionFusionPartner5prime fusionPartner5prime;

  public static final String JSON_PROPERTY_EXTERNAL_IDS = "externalIds";
  
  private @Nullable List<VariantExternalId> externalIds;

  public static final String JSON_PROPERTY_ID = "id";
  
  private String id;

  public static final String JSON_PROPERTY_REPORTED_NUM_READS = "reportedNumReads";
  
  private Integer reportedNumReads;

  public static final String JSON_PROPERTY_PATIENT = "patient";
  
  private Reference patient;

  public DnaFusion() { 
  }

  public DnaFusion fusionPartner3prime(DnaFusionFusionPartner3prime fusionPartner3prime) {
    this.fusionPartner3prime = fusionPartner3prime;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_FUSION_PARTNER3PRIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DnaFusionFusionPartner3prime getFusionPartner3prime() {
    return fusionPartner3prime;
  }


  @JsonProperty(value = JSON_PROPERTY_FUSION_PARTNER3PRIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFusionPartner3prime(DnaFusionFusionPartner3prime fusionPartner3prime) {
    this.fusionPartner3prime = fusionPartner3prime;
  }


  public DnaFusion localization(@Nullable Set<BaseVariantLocalizationCoding> localization) {
    this.localization = localization;
    return this;
  }

  public DnaFusion addLocalizationItem(BaseVariantLocalizationCoding localizationItem) {
    if (this.localization == null) {
      this.localization = new LinkedHashSet<>();
    }
    this.localization.add(localizationItem);
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_LOCALIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public @Nullable Set<BaseVariantLocalizationCoding> getLocalization() {
    return localization;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(value = JSON_PROPERTY_LOCALIZATION, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalization(@Nullable Set<BaseVariantLocalizationCoding> localization) {
    this.localization = localization;
  }


  public DnaFusion fusionPartner5prime(DnaFusionFusionPartner5prime fusionPartner5prime) {
    this.fusionPartner5prime = fusionPartner5prime;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_FUSION_PARTNER5PRIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DnaFusionFusionPartner5prime getFusionPartner5prime() {
    return fusionPartner5prime;
  }


  @JsonProperty(value = JSON_PROPERTY_FUSION_PARTNER5PRIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFusionPartner5prime(DnaFusionFusionPartner5prime fusionPartner5prime) {
    this.fusionPartner5prime = fusionPartner5prime;
  }


  public DnaFusion externalIds(@Nullable List<VariantExternalId> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public DnaFusion addExternalIdsItem(VariantExternalId externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new ArrayList<>();
    }
    this.externalIds.add(externalIdsItem);
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public @Nullable List<VariantExternalId> getExternalIds() {
    return externalIds;
  }


  @JsonProperty(value = JSON_PROPERTY_EXTERNAL_IDS, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalIds(@Nullable List<VariantExternalId> externalIds) {
    this.externalIds = externalIds;
  }


  public DnaFusion id(String id) {
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


  public DnaFusion reportedNumReads(Integer reportedNumReads) {
    this.reportedNumReads = reportedNumReads;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_REPORTED_NUM_READS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getReportedNumReads() {
    return reportedNumReads;
  }


  @JsonProperty(value = JSON_PROPERTY_REPORTED_NUM_READS, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReportedNumReads(Integer reportedNumReads) {
    this.reportedNumReads = reportedNumReads;
  }


  public DnaFusion patient(Reference patient) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnaFusion dnaFusion = (DnaFusion) o;
    return Objects.equals(this.fusionPartner3prime, dnaFusion.fusionPartner3prime) &&
        Objects.equals(this.localization, dnaFusion.localization) &&
        Objects.equals(this.fusionPartner5prime, dnaFusion.fusionPartner5prime) &&
        Objects.equals(this.externalIds, dnaFusion.externalIds) &&
        Objects.equals(this.id, dnaFusion.id) &&
        Objects.equals(this.reportedNumReads, dnaFusion.reportedNumReads) &&
        Objects.equals(this.patient, dnaFusion.patient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fusionPartner3prime, localization, fusionPartner5prime, externalIds, id, reportedNumReads, patient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnaFusion {\n");
    sb.append("    fusionPartner3prime: ").append(toIndentedString(fusionPartner3prime)).append("\n");
    sb.append("    localization: ").append(toIndentedString(localization)).append("\n");
    sb.append("    fusionPartner5prime: ").append(toIndentedString(fusionPartner5prime)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reportedNumReads: ").append(toIndentedString(reportedNumReads)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

    public static class Builder {

    private DnaFusion instance;

    public Builder() {
      this(new DnaFusion());
    }

    protected Builder(DnaFusion instance) {
      this.instance = instance;
    }

    public DnaFusion.Builder fusionPartner3prime(DnaFusionFusionPartner3prime fusionPartner3prime) {
      this.instance.fusionPartner3prime = fusionPartner3prime;
      return this;
    }
    public DnaFusion.Builder localization(Set<BaseVariantLocalizationCoding> localization) {
      this.instance.localization = localization;
      return this;
    }
    public DnaFusion.Builder fusionPartner5prime(DnaFusionFusionPartner5prime fusionPartner5prime) {
      this.instance.fusionPartner5prime = fusionPartner5prime;
      return this;
    }
    public DnaFusion.Builder externalIds(List<VariantExternalId> externalIds) {
      this.instance.externalIds = externalIds;
      return this;
    }
    public DnaFusion.Builder id(String id) {
      this.instance.id = id;
      return this;
    }
    public DnaFusion.Builder reportedNumReads(Integer reportedNumReads) {
      this.instance.reportedNumReads = reportedNumReads;
      return this;
    }
    public DnaFusion.Builder patient(Reference patient) {
      this.instance.patient = patient;
      return this;
    }


    public DnaFusion build() {
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

  public static DnaFusion.Builder builder() {
    return new DnaFusion.Builder();
  }

  public DnaFusion.Builder toBuilder() {
    return new DnaFusion.Builder()
      .fusionPartner3prime(getFusionPartner3prime())
      .localization(getLocalization())
      .fusionPartner5prime(getFusionPartner5prime())
      .externalIds(getExternalIds())
      .id(getId())
      .reportedNumReads(getReportedNumReads())
      .patient(getPatient());
  }

}

