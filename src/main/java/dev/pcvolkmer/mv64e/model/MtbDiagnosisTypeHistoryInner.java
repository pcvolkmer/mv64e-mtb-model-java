

package dev.pcvolkmer.mv64e.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.pcvolkmer.mv64e.model.MtbDiagnosisTypeCoding;
import java.util.Arrays;
import java.util.Date;
import org.jspecify.annotations.Nullable;


public class MtbDiagnosisTypeHistoryInner {
  public static final String JSON_PROPERTY_VALUE = "value";
  
  private MtbDiagnosisTypeCoding value;

  public static final String JSON_PROPERTY_DATE = "date";
  
  private Date date;

  public MtbDiagnosisTypeHistoryInner() { 
  }

  public MtbDiagnosisTypeHistoryInner value(MtbDiagnosisTypeCoding value) {
    this.value = value;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_VALUE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MtbDiagnosisTypeCoding getValue() {
    return value;
  }


  @JsonProperty(value = JSON_PROPERTY_VALUE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(MtbDiagnosisTypeCoding value) {
    this.value = value;
  }


  public MtbDiagnosisTypeHistoryInner date(Date date) {
    this.date = date;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Date getDate() {
    return date;
  }


  @JsonProperty(value = JSON_PROPERTY_DATE, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(Date date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MtbDiagnosisTypeHistoryInner mtbDiagnosisTypeHistoryInner = (MtbDiagnosisTypeHistoryInner) o;
    return Objects.equals(this.value, mtbDiagnosisTypeHistoryInner.value) &&
        Objects.equals(this.date, mtbDiagnosisTypeHistoryInner.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MtbDiagnosisTypeHistoryInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

    public static class Builder {

    private MtbDiagnosisTypeHistoryInner instance;

    public Builder() {
      this(new MtbDiagnosisTypeHistoryInner());
    }

    protected Builder(MtbDiagnosisTypeHistoryInner instance) {
      this.instance = instance;
    }

    public MtbDiagnosisTypeHistoryInner.Builder value(MtbDiagnosisTypeCoding value) {
      this.instance.value = value;
      return this;
    }
    public MtbDiagnosisTypeHistoryInner.Builder date(Date date) {
      this.instance.date = date;
      return this;
    }


    public MtbDiagnosisTypeHistoryInner build() {
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

  public static MtbDiagnosisTypeHistoryInner.Builder builder() {
    return new MtbDiagnosisTypeHistoryInner.Builder();
  }

  public MtbDiagnosisTypeHistoryInner.Builder toBuilder() {
    return new MtbDiagnosisTypeHistoryInner.Builder()
      .value(getValue())
      .date(getDate());
  }

}

