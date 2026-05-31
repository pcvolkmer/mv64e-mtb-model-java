

package dev.pcvolkmer.mv64e.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.pcvolkmer.mv64e.model.FamilyMemberHistoryRelationshipTypeCoding;
import dev.pcvolkmer.mv64e.model.Reference;
import java.util.Arrays;
import org.jspecify.annotations.Nullable;


public class FamilyMemberHistory {
  public static final String JSON_PROPERTY_ID = "id";
  
  private String id;

  public static final String JSON_PROPERTY_PATIENT = "patient";
  
  private Reference patient;

  public static final String JSON_PROPERTY_RELATIONSHIP = "relationship";
  
  private FamilyMemberHistoryRelationshipTypeCoding relationship;

  public FamilyMemberHistory() { 
  }

  public FamilyMemberHistory id(String id) {
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


  public FamilyMemberHistory patient(Reference patient) {
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


  public FamilyMemberHistory relationship(FamilyMemberHistoryRelationshipTypeCoding relationship) {
    this.relationship = relationship;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_RELATIONSHIP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FamilyMemberHistoryRelationshipTypeCoding getRelationship() {
    return relationship;
  }


  @JsonProperty(value = JSON_PROPERTY_RELATIONSHIP, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRelationship(FamilyMemberHistoryRelationshipTypeCoding relationship) {
    this.relationship = relationship;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FamilyMemberHistory familyMemberHistory = (FamilyMemberHistory) o;
    return Objects.equals(this.id, familyMemberHistory.id) &&
        Objects.equals(this.patient, familyMemberHistory.patient) &&
        Objects.equals(this.relationship, familyMemberHistory.relationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patient, relationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FamilyMemberHistory {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

    public static class Builder {

    private FamilyMemberHistory instance;

    public Builder() {
      this(new FamilyMemberHistory());
    }

    protected Builder(FamilyMemberHistory instance) {
      this.instance = instance;
    }

    public FamilyMemberHistory.Builder id(String id) {
      this.instance.id = id;
      return this;
    }
    public FamilyMemberHistory.Builder patient(Reference patient) {
      this.instance.patient = patient;
      return this;
    }
    public FamilyMemberHistory.Builder relationship(FamilyMemberHistoryRelationshipTypeCoding relationship) {
      this.instance.relationship = relationship;
      return this;
    }


    public FamilyMemberHistory build() {
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

  public static FamilyMemberHistory.Builder builder() {
    return new FamilyMemberHistory.Builder();
  }

  public FamilyMemberHistory.Builder toBuilder() {
    return new FamilyMemberHistory.Builder()
      .id(getId())
      .patient(getPatient())
      .relationship(getRelationship());
  }

}

