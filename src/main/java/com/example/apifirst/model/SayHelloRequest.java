package com.example.apifirst.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * SayHelloRequest
 */

@JsonTypeName("sayHello_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-06T22:15:28.907398500-04:00[America/New_York]", comments = "Generator version: 7.13.0")
public class SayHelloRequest {

  private String name;

  public SayHelloRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SayHelloRequest(String name) {
    this.name = name;
  }

  public SayHelloRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the person to greet
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "John", description = "The name of the person to greet", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SayHelloRequest sayHelloRequest = (SayHelloRequest) o;
    return Objects.equals(this.name, sayHelloRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SayHelloRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

