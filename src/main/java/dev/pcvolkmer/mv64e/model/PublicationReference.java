

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


public class PublicationReference {
  public static final String JSON_PROPERTY_ID = "id";
  
  private String id;

  public enum SystemEnum {
    HTTPS_WWW_DOI_ORG(String.valueOf("https://www.doi.org")),
    
    HTTPS_PUBMED_NCBI_NLM_NIH_GOV(String.valueOf("https://pubmed.ncbi.nlm.nih.gov"));

    private String value;

    SystemEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SystemEnum fromValue(String value) {
      for (SystemEnum b : SystemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SYSTEM = "system";
  
  private SystemEnum system;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  
  private @Nullable String display;

  public static final String JSON_PROPERTY_TYPE = "type";
  
  private @Nullable String type;

  public PublicationReference() { 
  }

  public PublicationReference id(String id) {
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


  public PublicationReference system(SystemEnum system) {
    this.system = system;
    return this;
  }

  
  @JsonProperty(value = JSON_PROPERTY_SYSTEM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SystemEnum getSystem() {
    return system;
  }


  @JsonProperty(value = JSON_PROPERTY_SYSTEM, required = true)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSystem(SystemEnum system) {
    this.system = system;
  }


  public PublicationReference display(@Nullable String display) {
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


  public PublicationReference type(@Nullable String type) {
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
    PublicationReference publicationReference = (PublicationReference) o;
    return Objects.equals(this.id, publicationReference.id) &&
        Objects.equals(this.system, publicationReference.system) &&
        Objects.equals(this.display, publicationReference.display) &&
        Objects.equals(this.type, publicationReference.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, system, display, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }

    public static class Builder {

    private PublicationReference instance;

    public Builder() {
      this(new PublicationReference());
    }

    protected Builder(PublicationReference instance) {
      this.instance = instance;
    }

    public PublicationReference.Builder id(String id) {
      this.instance.id = id;
      return this;
    }
    public PublicationReference.Builder system(SystemEnum system) {
      this.instance.system = system;
      return this;
    }
    public PublicationReference.Builder display(String display) {
      this.instance.display = display;
      return this;
    }
    public PublicationReference.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    public PublicationReference build() {
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

  public static PublicationReference.Builder builder() {
    return new PublicationReference.Builder();
  }

  public PublicationReference.Builder toBuilder() {
    return new PublicationReference.Builder()
      .id(getId())
      .system(getSystem())
      .display(getDisplay())
      .type(getType());
  }

}

