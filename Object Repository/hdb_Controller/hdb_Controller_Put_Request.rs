<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>hdb_Controller_Put_Request</name>
   <tag></tag>
   <elementGuidId>55c33199-f8d5-49ea-8cdc-877f5501e6d0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;dglist\&quot;: [\n    {\n      \&quot;dType\&quot;: \&quot;string\&quot;,\n      \&quot;dgDescr\&quot;: \&quot;string\&quot;,\n      \&quot;dgParent\&quot;: \&quot;string\&quot;,\n      \&quot;dgid\&quot;: \&quot;string\&quot;,\n      \&quot;dpropExit\&quot;: \&quot;string\&quot;,\n      \&quot;keyLen\&quot;: \&quot;string\&quot;,\n      \&quot;keyLoc\&quot;: \&quot;string\&quot;,\n      \&quot;ltype\&quot;: \&quot;string\&quot;,\n      \&quot;lvl\&quot;: \&quot;string\&quot;,\n      \&quot;seq\&quot;: \&quot;string\&quot;,\n      \&quot;type\&quot;: \&quot;string\&quot;\n    }\n  ],\n  \&quot;hdb\&quot;: {\n    \&quot;coGroup\&quot;: \&quot;string\&quot;,\n    \&quot;dataPropagation\&quot;: \&quot;string\&quot;,\n    \&quot;databaseId\&quot;: \&quot;1234\&quot;,\n    \&quot;databaseType\&quot;: \&quot;khaja\&quot;,\n    \&quot;description\&quot;: \&quot;string\&quot;,\n    \&quot;owner\&quot;: \&quot;string\&quot;,\n    \&quot;readOnlyDbid\&quot;: \&quot;string\&quot;,\n    \&quot;relationalActy\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;\n  },\n  \&quot;ims\&quot;: {\n    \&quot;dbdName\&quot;: \&quot;string\&quot;,\n    \&quot;dlitype\&quot;: \&quot;string\&quot;,\n    \&quot;maxKeylen\&quot;: \&quot;string\&quot;,\n    \&quot;posParameter\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;\n  },\n  \&quot;mod\&quot;: {\n    \&quot;modelCoGrp\&quot;: \&quot;string\&quot;,\n    \&quot;modelDbId\&quot;: \&quot;string\&quot;,\n    \&quot;modelReason\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;\n  },\n  \&quot;vsm\&quot;: {\n    \&quot;datasetFormat\&quot;: \&quot;string\&quot;,\n    \&quot;ddname\&quot;: \&quot;string\&quot;,\n    \&quot;maxRecSize\&quot;: \&quot;string\&quot;,\n    \&quot;password\&quot;: \&quot;string\&quot;,\n    \&quot;type\&quot;: \&quot;string\&quot;,\n    \&quot;version\&quot;: \&quot;string\&quot;\n  }\n}&quot;,
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
   <restUrl>http://localhost:9090/hogan-connector/hdb/1234?</restUrl>
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
