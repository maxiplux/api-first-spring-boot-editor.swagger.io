package com.example.apifirst.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * SayHello200Response
 */

@JsonTypeName("sayHello_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-06T22:15:28.907398500-04:00[America/New_York]", comments = "Generator version: 7.13.0")
public class SayHello200Response {

  private @Nullable String message;

  public SayHello200Response message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Greeting message
   * @return message
   */
  
  @Schema(name = "message", example = "hi John", description = "Greeting message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SayHello200Response sayHello200Response = (SayHello200Response) o;
    return Objects.equals(this.message, sayHello200Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SayHello200Response {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

