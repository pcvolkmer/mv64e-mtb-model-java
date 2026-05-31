

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
import dev.pcvolkmer.mv64e.model.Reference;
import dev.pcvolkmer.mv64e.model.RnaFusionFusionPartner3prime;
import dev.pcvolkmer.mv64e.model.RnaFusionFusionPartner5prime;
import dev.pcvolkmer.mv64e.model.VariantExternalId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;


public class RnaFusion {
  public static final String JSON_PROPERTY_FUSION_PARTNER3PRIME = "fusionPartner3prime";
  
  private RnaFusionFusionPartner3prime fusionPartner3prime;

  public static final String JSON_PROPERTY_LOCALIZATION = "localization";
  
  private @Nullable Set<BaseVariantLocalizationCoding> localization;

  public static final String JSON_PROPERTY_FUSION_PARTNER5PRIME = "fusionPartner5prime";
  
  private RnaFusionFusionPartner5prime fusionPartner5prime;

  public static final String JSON_PROPERTY_EFFECT = "effect";
  
  private @Nullable String effect;

  public static final String JSON_PROPERTY_EXTERNAL_IDS = "externalIds";
  
  private @Nullable List<VariantExternalId> externalIds;

  public static final String JSON_PROPERTY_ID = "id";
  
  private String id;

  public static final String JSON_PROPERTY_REPORTED_NUM_READS = "reportedNumReads";
  
  private Integer reportedNumReads;

  public static final String JSON_PROPERTY_PATIENT = "patient";
  
  private Reference patient;

  public RnaFusion() { 
  }

  public RnaFusion fusionPartner3prime(RnaFusionFusionPartner3prime fusionPartner3prime) {
    this.fusionPartner3prime = fusionPartner3prime;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_FUSION_PARTNER3PRIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RnaFusionFusionPartner3prime getFusionPartner3prime() {
    return fusionPartner3prime;
  }


  @JsonProperty(value = JSON_PROPERTY_FUSION_PARTNER3PRIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFusionPartner3prime(RnaFusionFusionPartner3prime fusionPartner3prime) {
    this.fusionPartner3prime = fusionPartner3prime;
  }


  public RnaFusion localization(@Nullable Set<BaseVariantLocalizationCoding> localization) {
    this.localization = localization;
    return this;
  }

  public RnaFusion addLocalizationItem(BaseVariantLocalizationCoding localizationItem) {
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


  public RnaFusion fusionPartner5prime(RnaFusionFusionPartner5prime fusionPartner5prime) {
    this.fusionPartner5prime = fusionPartner5prime;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_FUSION_PARTNER5PRIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RnaFusionFusionPartner5prime getFusionPartner5prime() {
    return fusionPartner5prime;
  }


  @JsonProperty(value = JSON_PROPERTY_FUSION_PARTNER5PRIME, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFusionPartner5prime(RnaFusionFusionPartner5prime fusionPartner5prime) {
    this.fusionPartner5prime = fusionPartner5prime;
  }


  public RnaFusion effect(@Nullable String effect) {
    this.effect = effect;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_EFFECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public @Nullable String getEffect() {
    return effect;
  }


  @JsonProperty(value = JSON_PROPERTY_EFFECT, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEffect(@Nullable String effect) {
    this.effect = effect;
  }


  public RnaFusion externalIds(@Nullable List<VariantExternalId> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public RnaFusion addExternalIdsItem(VariantExternalId externalIdsItem) {
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


  public RnaFusion id(String id) {
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


  public RnaFusion reportedNumReads(Integer reportedNumReads) {
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


  public RnaFusion patient(Reference patient) {
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
    RnaFusion rnaFusion = (RnaFusion) o;
    return Objects.equals(this.fusionPartner3prime, rnaFusion.fusionPartner3prime) &&
        Objects.equals(this.localization, rnaFusion.localization) &&
        Objects.equals(this.fusionPartner5prime, rnaFusion.fusionPartner5prime) &&
        Objects.equals(this.effect, rnaFusion.effect) &&
        Objects.equals(this.externalIds, rnaFusion.externalIds) &&
        Objects.equals(this.id, rnaFusion.id) &&
        Objects.equals(this.reportedNumReads, rnaFusion.reportedNumReads) &&
        Objects.equals(this.patient, rnaFusion.patient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fusionPartner3prime, localization, fusionPartner5prime, effect, externalIds, id, reportedNumReads, patient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RnaFusion {\n");
    sb.append("    fusionPartner3prime: ").append(toIndentedString(fusionPartner3prime)).append("\n");
    sb.append("    localization: ").append(toIndentedString(localization)).append("\n");
    sb.append("    fusionPartner5prime: ").append(toIndentedString(fusionPartner5prime)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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

    private RnaFusion instance;

    public Builder() {
      this(new RnaFusion());
    }

    protected Builder(RnaFusion instance) {
      this.instance = instance;
    }

    public RnaFusion.Builder fusionPartner3prime(RnaFusionFusionPartner3prime fusionPartner3prime) {
      this.instance.fusionPartner3prime = fusionPartner3prime;
      return this;
    }
    public RnaFusion.Builder localization(Set<BaseVariantLocalizationCoding> localization) {
      this.instance.localization = localization;
      return this;
    }
    public RnaFusion.Builder fusionPartner5prime(RnaFusionFusionPartner5prime fusionPartner5prime) {
      this.instance.fusionPartner5prime = fusionPartner5prime;
      return this;
    }
    public RnaFusion.Builder effect(String effect) {
      this.instance.effect = effect;
      return this;
    }
    public RnaFusion.Builder externalIds(List<VariantExternalId> externalIds) {
      this.instance.externalIds = externalIds;
      return this;
    }
    public RnaFusion.Builder id(String id) {
      this.instance.id = id;
      return this;
    }
    public RnaFusion.Builder reportedNumReads(Integer reportedNumReads) {
      this.instance.reportedNumReads = reportedNumReads;
      return this;
    }
    public RnaFusion.Builder patient(Reference patient) {
      this.instance.patient = patient;
      return this;
    }


    public RnaFusion build() {
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

  public static RnaFusion.Builder builder() {
    return new RnaFusion.Builder();
  }

  public RnaFusion.Builder toBuilder() {
    return new RnaFusion.Builder()
      .fusionPartner3prime(getFusionPartner3prime())
      .localization(getLocalization())
      .fusionPartner5prime(getFusionPartner5prime())
      .effect(getEffect())
      .externalIds(getExternalIds())
      .id(getId())
      .reportedNumReads(getReportedNumReads())
      .patient(getPatient());
  }

}

