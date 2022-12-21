# BeerApi

All URIs are relative to *https://dev.example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBeerV1**](BeerApi.md#createBeerV1) | **POST** /v1/beer | Create beer
[**deleteBeerByIdV1**](BeerApi.md#deleteBeerByIdV1) | **DELETE** /v1/beer/{beerId} | Delete beer by id
[**getBeerByIdV1**](BeerApi.md#getBeerByIdV1) | **GET** /v1/beer/{beerId} | Find beer by id
[**listBeersV1**](BeerApi.md#listBeersV1) | **GET** /v1/beer | Get list of beers
[**updateBeerByIdV1**](BeerApi.md#updateBeerByIdV1) | **PUT** /v1/beer/{beerId} | Update beer by id


<a name="createBeerV1"></a>
# **createBeerV1**
> Customer createBeerV1(beer)

Create beer

Create **beer**

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.example.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: jwtAuth
    HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
    jwtAuth.setBearerToken("BEARER TOKEN");

    BeerApi apiInstance = new BeerApi(defaultClient);
    Beer beer = new Beer(); // Beer | 
    try {
      Customer result = apiInstance.createBeerV1(beer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeerApi#createBeerV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beer** | [**Beer**](Beer.md)|  |

### Return type

[**Customer**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwtAuth](../README.md#jwtAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Beer created |  * Location - Location of the created beer <br>  |
**400** | Bad request |  -  |
**409** | Conflict |  -  |

<a name="deleteBeerByIdV1"></a>
# **deleteBeerByIdV1**
> deleteBeerByIdV1(beerId)

Delete beer by id

Delete **beer** by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.example.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: jwtAuth
    HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
    jwtAuth.setBearerToken("BEARER TOKEN");

    BeerApi apiInstance = new BeerApi(defaultClient);
    UUID beerId = new UUID(); // UUID | Beer id
    try {
      apiInstance.deleteBeerByIdV1(beerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeerApi#deleteBeerByIdV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beerId** | [**UUID**](.md)| Beer id |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [jwtAuth](../README.md#jwtAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Delete beer by id |  -  |
**404** | Not found |  -  |

<a name="getBeerByIdV1"></a>
# **getBeerByIdV1**
> Beer getBeerByIdV1(beerId)

Find beer by id

Find **beer** by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.example.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: jwtAuth
    HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
    jwtAuth.setBearerToken("BEARER TOKEN");

    BeerApi apiInstance = new BeerApi(defaultClient);
    UUID beerId = new UUID(); // UUID | Beer id
    try {
      Beer result = apiInstance.getBeerByIdV1(beerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeerApi#getBeerByIdV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beerId** | [**UUID**](.md)| Beer id |

### Return type

[**Beer**](Beer.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwtAuth](../README.md#jwtAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Find beer by id |  -  |
**404** | Not found |  -  |

<a name="listBeersV1"></a>
# **listBeersV1**
> BeerPagedList listBeersV1(pageNumber, pageSize)

Get list of beers

Get list of **beers** in the system

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.example.com");

    BeerApi apiInstance = new BeerApi(defaultClient);
    Integer pageNumber = 56; // Integer | Page number
    Integer pageSize = 20; // Integer | Page size
    try {
      BeerPagedList result = apiInstance.listBeersV1(pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeerApi#listBeersV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| Page number |
 **pageSize** | **Integer**| Page size | [optional] [default to 20]

### Return type

[**BeerPagedList**](BeerPagedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get list of beers |  -  |
**404** | Beers not found |  -  |

<a name="updateBeerByIdV1"></a>
# **updateBeerByIdV1**
> Beer updateBeerByIdV1(beerId, beer)

Update beer by id

Update **beer** by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.example.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure HTTP bearer authorization: jwtAuth
    HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
    jwtAuth.setBearerToken("BEARER TOKEN");

    BeerApi apiInstance = new BeerApi(defaultClient);
    UUID beerId = new UUID(); // UUID | Beer id
    Beer beer = new Beer(); // Beer | 
    try {
      Beer result = apiInstance.updateBeerByIdV1(beerId, beer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeerApi#updateBeerByIdV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beerId** | [**UUID**](.md)| Beer id |
 **beer** | [**Beer**](Beer.md)|  |

### Return type

[**Beer**](Beer.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwtAuth](../README.md#jwtAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Beer updated |  -  |
**400** | Bad request |  -  |
**404** | Not found |  -  |
**409** | Conflict |  -  |

