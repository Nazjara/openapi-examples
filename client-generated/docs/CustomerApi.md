# CustomerApi

All URIs are relative to *https://dev.example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerV1**](CustomerApi.md#createCustomerV1) | **POST** /v1/customer | Create customer
[**deleteCustomerByIdV1**](CustomerApi.md#deleteCustomerByIdV1) | **DELETE** /v1/customer/{customerId} | Delete customer by id
[**getCustomerByIdV1**](CustomerApi.md#getCustomerByIdV1) | **GET** /v1/customer/{customerId} | Find customer by id
[**listCustomersV1**](CustomerApi.md#listCustomersV1) | **GET** /v1/customer | Get all customers
[**updateCustomerByIdV1**](CustomerApi.md#updateCustomerByIdV1) | **PUT** /v1/customer/{customerId} | Update customer by id


<a name="createCustomerV1"></a>
# **createCustomerV1**
> Customer createCustomerV1(customer)

Create customer

Create **customer**

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

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

    CustomerApi apiInstance = new CustomerApi(defaultClient);
    Customer customer = new Customer(); // Customer | 
    try {
      Customer result = apiInstance.createCustomerV1(customer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#createCustomerV1");
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
 **customer** | [**Customer**](Customer.md)|  |

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
**201** | Customer created |  * Location - Location of the created customer <br>  |
**400** | Bad request |  -  |
**409** | Conflict |  -  |

<a name="deleteCustomerByIdV1"></a>
# **deleteCustomerByIdV1**
> deleteCustomerByIdV1(customerId)

Delete customer by id

Delete **customer** by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

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

    CustomerApi apiInstance = new CustomerApi(defaultClient);
    UUID customerId = new UUID(); // UUID | Customer id
    try {
      apiInstance.deleteCustomerByIdV1(customerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#deleteCustomerByIdV1");
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
 **customerId** | [**UUID**](.md)| Customer id |

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
**204** | Delete customer by id |  -  |
**404** | Not found |  -  |

<a name="getCustomerByIdV1"></a>
# **getCustomerByIdV1**
> Customer getCustomerByIdV1(customerId)

Find customer by id

Find **customer** by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

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

    CustomerApi apiInstance = new CustomerApi(defaultClient);
    UUID customerId = new UUID(); // UUID | Customer id
    try {
      Customer result = apiInstance.getCustomerByIdV1(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#getCustomerByIdV1");
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
 **customerId** | [**UUID**](.md)| Customer id |

### Return type

[**Customer**](Customer.md)

### Authorization

[basicAuth](../README.md#basicAuth), [jwtAuth](../README.md#jwtAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Find customer by id |  -  |
**404** | Not found |  -  |

<a name="listCustomersV1"></a>
# **listCustomersV1**
> CustomerPagedList listCustomersV1(pageNumber, pageSize)

Get all customers

Get all **customers** in the system

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dev.example.com");

    CustomerApi apiInstance = new CustomerApi(defaultClient);
    Integer pageNumber = 56; // Integer | Page number
    Integer pageSize = 20; // Integer | Page size
    try {
      CustomerPagedList result = apiInstance.listCustomersV1(pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#listCustomersV1");
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

[**CustomerPagedList**](CustomerPagedList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get all customers |  -  |

<a name="updateCustomerByIdV1"></a>
# **updateCustomerByIdV1**
> Customer updateCustomerByIdV1(customerId, customer)

Update customer by id

Update **customer** by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

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

    CustomerApi apiInstance = new CustomerApi(defaultClient);
    UUID customerId = new UUID(); // UUID | Customer id
    Customer customer = new Customer(); // Customer | 
    try {
      Customer result = apiInstance.updateCustomerByIdV1(customerId, customer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerApi#updateCustomerByIdV1");
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
 **customerId** | [**UUID**](.md)| Customer id |
 **customer** | [**Customer**](Customer.md)|  |

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
**200** | Customer updated |  -  |
**400** | Bad request |  -  |
**404** | Not found |  -  |
**409** | Conflict |  -  |

