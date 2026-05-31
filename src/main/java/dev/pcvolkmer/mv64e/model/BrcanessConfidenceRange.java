

package dev.pcvolkmer.mv64e.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.jspecify.annotations.Nullable;


public class BrcanessConfidenceRange {
  public static final String JSON_PROPERTY_MIN = "min";
  
  private BigDecimal min;

  public static final String JSON_PROPERTY_MAX = "max";
  
  private BigDecimal max;

  public BrcanessConfidenceRange() { 
  }

  public BrcanessConfidenceRange min(BigDecimal min) {
    this.min = min;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_MIN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getMin() {
    return min;
  }


  @JsonProperty(value = JSON_PROPERTY_MIN, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMin(BigDecimal min) {
    this.min = min;
  }


  public BrcanessConfidenceRange max(BigDecimal max) {
    this.max = max;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_MAX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getMax() {
    return max;
  }


  @JsonProperty(value = JSON_PROPERTY_MAX, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMax(BigDecimal max) {
    this.max = max;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrcanessConfidenceRange brcanessConfidenceRange = (BrcanessConfidenceRange) o;
    return Objects.equals(this.min, brcanessConfidenceRange.min) &&
        Objects.equals(this.max, brcanessConfidenceRange.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrcanessConfidenceRange {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

    public static class Builder {

    private BrcanessConfidenceRange instance;

    public Builder() {
      this(new BrcanessConfidenceRange());
    }

    protected Builder(BrcanessConfidenceRange instance) {
      this.instance = instance;
    }

    public BrcanessConfidenceRange.Builder min(BigDecimal min) {
      this.instance.min = min;
      return this;
    }
    public BrcanessConfidenceRange.Builder max(BigDecimal max) {
      this.instance.max = max;
      return this;
    }


    public BrcanessConfidenceRange build() {
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

  public static BrcanessConfidenceRange.Builder builder() {
    return new BrcanessConfidenceRange.Builder();
  }

  public BrcanessConfidenceRange.Builder toBuilder() {
    return new BrcanessConfidenceRange.Builder()
      .min(getMin())
      .max(getMax());
  }

}

