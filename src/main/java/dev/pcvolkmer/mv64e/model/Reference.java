

package dev.pcvolkmer.mv64e.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.jspecify.annotations.Nullable;


public class Reference {
  public static final String JSON_PROPERTY_ID = "id";
  
  private String id;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  
  private @Nullable String display;

  public static final String JSON_PROPERTY_SYSTEM = "system";
  
  private @Nullable String system;

  public static final String JSON_PROPERTY_TYPE = "type";
  
  private @Nullable String type;

  public Reference() { 
  }

  public Reference id(String id) {
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


  public Reference display(@Nullable String display) {
    this.display = display;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_DISPLAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public @Nullable String getDisplay() {
    return display;
  }


  @JsonProperty(value = JSON_PROPERTY_DISPLAY, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplay(@Nullable String display) {
    this.display = display;
  }


  public Reference system(@Nullable String system) {
    this.system = system;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_SYSTEM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public @Nullable String getSystem() {
    return system;
  }


  @JsonProperty(value = JSON_PROPERTY_SYSTEM, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystem(@Nullable String system) {
    this.system = system;
  }


  public Reference type(@Nullable String type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public @Nullable String getType() {
    return type;
  }


  @JsonProperty(value = JSON_PROPERTY_TYPE, required = false)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@Nullable String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.id, reference.id) &&
        Objects.equals(this.display, reference.display) &&
        Objects.equals(this.system, reference.system) &&
        Objects.equals(this.type, reference.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, display, system, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

    public static class Builder {

    private Reference instance;

    public Builder() {
      this(new Reference());
    }

    protected Builder(Reference instance) {
      this.instance = instance;
    }

    public Reference.Builder id(String id) {
      this.instance.id = id;
      return this;
    }
    public Reference.Builder display(String display) {
      this.instance.display = display;
      return this;
    }
    public Reference.Builder system(String system) {
      this.instance.system = system;
      return this;
    }
    public Reference.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    public Reference build() {
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

  public static Reference.Builder builder() {
    return new Reference.Builder();
  }

  public Reference.Builder toBuilder() {
    return new Reference.Builder()
      .id(getId())
      .display(getDisplay())
      .system(getSystem())
      .type(getType());
  }

}

