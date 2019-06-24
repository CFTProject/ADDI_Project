<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Sdb_Controller_Put_Request</name>
   <tag></tag>
   <elementGuidId>a558728a-4362-4214-bb64-deca5b375fbf</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;accessMethod\&quot;: \&quot;string\&quot;,\n  \&quot;blockSize\&quot;: \&quot;string\&quot;,\n  \&quot;ddName\&quot;: \&quot;string\&quot;,\n  \&quot;description\&quot;: \&quot;string\&quot;,\n  \&quot;deviceClass\&quot;: \&quot;string\&quot;,\n  \&quot;filetyp\&quot;: \&quot;string\&quot;,\n  \&quot;logicalRecLength\&quot;: \&quot;string\&quot;,\n  \&quot;own\&quot;: \&quot;POOLA\&quot;,\n  \&quot;recFm\&quot;: \&quot;string\&quot;,\n  \&quot;recFmt\&quot;: \&quot;string\&quot;,\n  \&quot;sdbId\&quot;: \&quot;KHAJA\&quot;,\n  \&quot;status\&quot;: \&quot;string\&quot;,\n  \&quot;typ\&quot;: \&quot;HUSSAIN\&quot;\n}&quot;,
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
   <restUrl>http://localhost:9090/hogan-connector/sequential-db/KHAJA?</restUrl>
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
