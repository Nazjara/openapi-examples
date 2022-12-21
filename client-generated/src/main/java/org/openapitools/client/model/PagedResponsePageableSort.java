/*
 * OpenAPI Example
 * OpenAPI Example
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: nazjara@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PagedResponsePageableSort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T01:31:56.004371168+02:00[Europe/Kyiv]")
public class PagedResponsePageableSort {
  public static final String SERIALIZED_NAME_SORTED = "sorted";
  @SerializedName(SERIALIZED_NAME_SORTED)
  private Boolean sorted;

  public static final String SERIALIZED_NAME_UNSORTED = "unsorted";
  @SerializedName(SERIALIZED_NAME_UNSORTED)
  private Boolean unsorted;


  public PagedResponsePageableSort sorted(Boolean sorted) {
    
    this.sorted = sorted;
    return this;
  }

   /**
   * Get sorted
   * @return sorted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSorted() {
    return sorted;
  }


  public void setSorted(Boolean sorted) {
    this.sorted = sorted;
  }


  public PagedResponsePageableSort unsorted(Boolean unsorted) {
    
    this.unsorted = unsorted;
    return this;
  }

   /**
   * Get unsorted
   * @return unsorted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUnsorted() {
    return unsorted;
  }


  public void setUnsorted(Boolean unsorted) {
    this.unsorted = unsorted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResponsePageableSort pagedResponsePageableSort = (PagedResponsePageableSort) o;
    return Objects.equals(this.sorted, pagedResponsePageableSort.sorted) &&
        Objects.equals(this.unsorted, pagedResponsePageableSort.unsorted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorted, unsorted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResponsePageableSort {\n");
    sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
    sb.append("    unsorted: ").append(toIndentedString(unsorted)).append("\n");
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

