<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Map_Controller_Put_Request</name>
   <tag></tag>
   <elementGuidId>a4362a05-54c1-4000-8de2-cb14786b8fe7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;a\&quot;: \&quot;string\&quot;,\n  \&quot;b\&quot;: \&quot;string\&quot;,\n  \&quot;compGroup\&quot;: \&quot;string\&quot;,\n  \&quot;description\&quot;: \&quot;string\&quot;,\n  \&quot;device\&quot;: \&quot;string\&quot;,\n  \&quot;dgNumbers\&quot;: \&quot;string\&quot;,\n  \&quot;language\&quot;: \&quot;string\&quot;,\n  \&quot;linkname\&quot;: \&quot;HUSSAIN\&quot;,\n  \&quot;mapName\&quot;: \&quot;ABC\&quot;,\n  \&quot;mapType\&quot;: \&quot;string\&quot;,\n  \&quot;noOfDg\&quot;: \&quot;string\&quot;,\n  \&quot;owner\&quot;: \&quot;string\&quot;,\n  \&quot;txn\&quot;: \&quot;string\&quot;,\n  \&quot;typ\&quot;: \&quot;string\&quot;,\n  \&quot;type\&quot;: \&quot;string\&quot;,\n  \&quot;x\&quot;: \&quot;string\&quot;,\n  \&quot;y\&quot;: \&quot;string\&quot;,\n  \&quot;z\&quot;: \&quot;string\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://localhost:9090/hogan-connector/map/ABC?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
