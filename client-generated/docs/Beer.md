

# Beer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Beer id |  [optional] [readonly]
**name** | **String** |  |  [optional]
**style** | [**StyleEnum**](#StyleEnum) |  |  [optional]
**upc** | **String** |  |  [optional]
**price** | **Float** |  |  [optional]
**quantityOnHand** | **BigDecimal** |  |  [optional]
**brewery** | [**Brewery**](Brewery.md) |  |  [optional]



## Enum: StyleEnum

Name | Value
---- | -----
ALE | &quot;ALE&quot;
PALE_ALE | &quot;PALE_ALE&quot;
IPA | &quot;IPA&quot;
WHEAT | &quot;WHEAT&quot;
LAGER | &quot;LAGER&quot;



