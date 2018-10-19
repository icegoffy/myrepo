# Getting started

This api contains available reference data

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

## How to Use

The following section explains how to use the ReferenceDataAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *ReferenceDataAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

Clicking the ``` Add ``` button will open a dialog where you need to specify ReferenceDataAPI in ``` Group Id ``` and ReferenceDataAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Reference%20Data%20API-Java&workspaceName=ReferenceDataAPI&projectName=ReferenceDataAPILib&rootNamespace=com.mulesoft.mocksvc)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *ReferenceDataAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java

ReferenceDataAPIClient client = new ReferenceDataAPIClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [ReferenceController](#reference_controller)

## <a name="reference_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mulesoft.mocksvc.controllers.ReferenceController") ReferenceController

### Get singleton instance

The singleton instance of the ``` ReferenceController ``` class can be accessed from the API Client.

```java
ReferenceController reference = client.getReference();
```

### <a name="get_reference_data_super_funds_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mulesoft.mocksvc.controllers.ReferenceController.getReferenceDataSuperFundsGETAsync") getReferenceDataSuperFundsGETAsync

> Common error responses returned by an API


```java
void getReferenceDataSuperFundsGETAsync(
        final AccountTypeEnum accountType,
        final String fundName,
        final String usi,
        final String abn,
        final String xTransactionID,
        final String xTrackingID,
        final String xSessionID,
        final DateTime xCreationTime,
        final String xInitialSystem,
        final String xInitialComponent,
        final String xInitialOperation,
        final String xClientID,
        final String xClientSecret,
        final APICallBack<ReferenceDataSuperFundsResponse84> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountType |  ``` Required ```  | TODO: Add a parameter description |
| fundName |  ``` Optional ```  | Search with full or partial fund name |
| usi |  ``` Optional ```  | Search by Unique Superannuation Identifier |
| abn |  ``` Optional ```  | Search by Fund's ABN |
| xTransactionID |  ``` Optional ```  | Unique ID for the Integration transaction. Generated by the Integration Platform, not the consumer system. |
| xTrackingID |  ``` Optional ```  | Consumer system's tracking ID for this request (if any).
This is optional and purely for troubleshooting / analysis purposes. |
| xSessionID |  ``` Optional ```  | Consumer system's session ID for this request (if any).
This is opti
onal and purely for troubleshooting / analysis purposes. |
| xCreationTime |  ``` Optional ```  | The time this message was created by the invoking system.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialSystem |  ``` Optional ```  | The system that initiated this transaction.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialComponent |  ``` Optional ```  | The first component that was involved in this transaction.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialOperation |  ``` Optional ```  | The first operation that was involved in this transaction.
This is optional and purely for troubleshooting / analysis purposes.may be tunneled to the provider system for fine-grained access control. |
| xClientID |  ``` Optional ```  | The Client ID of the consumer |
| xClientSecret |  ``` Optional ```  | The Client Secret of the consumer |


#### Example Usage

```java
AccountTypeEnum accountType = AccountTypeEnum.fromString("accum");
String fundName = "fundName?";
String usi = "usi?";
String abn = "abn";
String xTransactionID = "X-TransactionID";
String xTrackingID = "X-TrackingID";
String xSessionID = "X-SessionID";
DateTime xCreationTime = new Date();
String xInitialSystem = "X-InitialSystem";
String xInitialComponent = "X-InitialComponent";
String xInitialOperation = "X-InitialOperation";
String xClientID = "X-ClientID";
String xClientSecret = "X-ClientSecret";
// Invoking the API call with sample inputs
reference.getReferenceDataSuperFundsGETAsync(accountType, fundName, usi, abn, xTransactionID, xTrackingID, xSessionID, xCreationTime, xInitialSystem, xInitialComponent, xInitialOperation, xClientID, xClientSecret, new APICallBack<ReferenceDataSuperFundsResponse84>() {
    public void onSuccess(HttpContext context, ReferenceDataSuperFundsResponse84 response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad request |
| 401 | Unauthorised request |
| 403 | Forbidden |
| 404 | Resource not found |
| 405 | Method not allowed |
| 406 | Not acceptable |
| 415 | Unsupported media type |
| 500 | Server error |
| 502 | Bad gateway |



### <a name="get_reference_data_codesets_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mulesoft.mocksvc.controllers.ReferenceController.getReferenceDataCodesetsGETAsync") getReferenceDataCodesetsGETAsync

> Get reference data


```java
void getReferenceDataCodesetsGETAsync(
        final String codesets,
        final String system,
        final String xTransactionID,
        final String xTrackingID,
        final String xSessionID,
        final DateTime xCreationTime,
        final String xInitialSystem,
        final String xInitialComponent,
        final String xInitialOperation,
        final String xClientID,
        final String xClientSecret,
        final APICallBack<ReferenceDataCodesetsResponse54> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| codesets |  ``` Required ```  | list of comma delimetered codesets to use. |
| system |  ``` Optional ```  | Optional system whos codesets to display. If specified the systems values will be returned along with the enterprise values. If not provided, only enterprise values will be returned. |
| xTransactionID |  ``` Optional ```  | Unique ID for the Integration transaction. Generated by the Integration Platform, not the consumer system. |
| xTrackingID |  ``` Optional ```  | Consumer system's tracking ID for this request (if any).
This is optional and purely for troubleshooting / analysis purposes. |
| xSessionID |  ``` Optional ```  | Consumer system's session ID for this request (if any).
This is opti
onal and purely for troubleshooting / analysis purposes. |
| xCreationTime |  ``` Optional ```  | The time this message was created by the invoking system.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialSystem |  ``` Optional ```  | The system that initiated this transaction.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialComponent |  ``` Optional ```  | The first component that was involved in this transaction.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialOperation |  ``` Optional ```  | The first operation that was involved in this transaction.
This is optional and purely for troubleshooting / analysis purposes.may be tunneled to the provider system for fine-grained access control. |
| xClientID |  ``` Optional ```  | The Client ID of the consumer |
| xClientSecret |  ``` Optional ```  | The Client Secret of the consumer |


#### Example Usage

```java
String codesets = "title, gender";
String system = "portal";
String xTransactionID = "550e8400-e29b-41d4-a716-446655440000";
String xTrackingID = "X-TrackingID";
String xSessionID = "X-SessionID";
DateTime xCreationTime = new Date();
String xInitialSystem = "X-InitialSystem";
String xInitialComponent = "X-InitialComponent";
String xInitialOperation = "X-InitialOperation";
String xClientID = "e5f19124663b428bda269a3b53b722ef";
String xClientSecret = "ea1b8baf121f4612A29C096C8AA0C6D4";
// Invoking the API call with sample inputs
reference.getReferenceDataCodesetsGETAsync(codesets, system, xTransactionID, xTrackingID, xSessionID, xCreationTime, xInitialSystem, xInitialComponent, xInitialOperation, xClientID, xClientSecret, new APICallBack<ReferenceDataCodesetsResponse54>() {
    public void onSuccess(HttpContext context, ReferenceDataCodesetsResponse54 response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad request |
| 401 | Unauthorised request |
| 403 | Forbidden |
| 404 | Resource not found |
| 405 | Method not allowed |
| 406 | Not acceptable |
| 415 | Unsupported media type |
| 500 | Server error |
| 502 | Bad gateway |



### <a name="get_reference_data_life_insurance_default_insurance_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mulesoft.mocksvc.controllers.ReferenceController.getReferenceDataLifeInsuranceDefaultInsuranceGETAsync") getReferenceDataLifeInsuranceDefaultInsuranceGETAsync

> Common error responses returned by an API


```java
void getReferenceDataLifeInsuranceDefaultInsuranceGETAsync(
        final String age,
        final String employmentStatus,
        final String occupationalCategory,
        final String membershipDivision,
        final Boolean applyingForTPD,
        final Boolean illnessDeathWithin24Months,
        final Boolean workingAtLeast15Hours,
        final Boolean offWorkDueToSickOrInjured,
        final Boolean employerCurrentLastSixMonths,
        final String xTransactionID,
        final String xTrackingID,
        final String xSessionID,
        final DateTime xCreationTime,
        final String xInitialSystem,
        final String xInitialComponent,
        final String xInitialOperation,
        final String xClientID,
        final String xClientSecret,
        final APICallBack<DefaultInsurance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| age |  ``` Optional ```  | TODO: Add a parameter description |
| employmentStatus |  ``` Optional ```  | TODO: Add a parameter description |
| occupationalCategory |  ``` Optional ```  | TODO: Add a parameter description |
| membershipDivision |  ``` Optional ```  | TODO: Add a parameter description |
| applyingForTPD |  ``` Optional ```  | Are you applying for, entitled to or been paid a Total and Permanent Disablement (TPD) or Terminal Illness benefit? |
| illnessDeathWithin24Months |  ``` Optional ```  | Have you been diagnosed with an illness that is likely to lead to your death within 24 months of the Date of Diagnosis? |
| workingAtLeast15Hours |  ``` Optional ```  | Are you currently working at least 15 hours a week, an Australian resident, and a full time or part time worker whose work is not an Excluded Occupation |
| offWorkDueToSickOrInjured |  ``` Optional ```  | Are you off work or on restricted duties because you are sick or injured? |
| employerCurrentLastSixMonths |  ``` Optional ```  | Have you started working with your current employer in the last six months? |
| xTransactionID |  ``` Optional ```  | Unique ID for the Integration transaction. Generated by the Integration Platform, not the consumer system. |
| xTrackingID |  ``` Optional ```  | Consumer system's tracking ID for this request (if any).
This is optional and purely for troubleshooting / analysis purposes. |
| xSessionID |  ``` Optional ```  | Consumer system's session ID for this request (if any).
This is opti
onal and purely for troubleshooting / analysis purposes. |
| xCreationTime |  ``` Optional ```  | The time this message was created by the invoking system.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialSystem |  ``` Optional ```  | The system that initiated this transaction.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialComponent |  ``` Optional ```  | The first component that was involved in this transaction.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialOperation |  ``` Optional ```  | The first operation that was involved in this transaction.
This is optional and purely for troubleshooting / analysis purposes.may be tunneled to the provider system for fine-grained access control. |
| xClientID |  ``` Optional ```  | The Client ID of the consumer |
| xClientSecret |  ``` Optional ```  | The Client Secret of the consumer |


#### Example Usage

```java
String age = "age";
String employmentStatus = "employed";
String occupationalCategory = "Manual";
String membershipDivision = "Industry";
Boolean applyingForTPD = false;
Boolean illnessDeathWithin24Months = false;
Boolean workingAtLeast15Hours = false;
Boolean offWorkDueToSickOrInjured = false;
Boolean employerCurrentLastSixMonths = false;
String xTransactionID = "550e8400-e29b-41d4-a716-446655440000";
String xTrackingID = "X-TrackingID";
String xSessionID = "X-SessionID";
DateTime xCreationTime = new Date();
String xInitialSystem = "X-InitialSystem";
String xInitialComponent = "X-InitialComponent";
String xInitialOperation = "X-InitialOperation";
String xClientID = "e5f19124663b428bda269a3b53b722ef";
String xClientSecret = "ea1b8baf121f4612A29C096C8AA0C6D4";
// Invoking the API call with sample inputs
reference.getReferenceDataLifeInsuranceDefaultInsuranceGETAsync(age, employmentStatus, occupationalCategory, membershipDivision, applyingForTPD, illnessDeathWithin24Months, workingAtLeast15Hours, offWorkDueToSickOrInjured, employerCurrentLastSixMonths, xTransactionID, xTrackingID, xSessionID, xCreationTime, xInitialSystem, xInitialComponent, xInitialOperation, xClientID, xClientSecret, new APICallBack<DefaultInsurance>() {
    public void onSuccess(HttpContext context, DefaultInsurance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad request |
| 401 | Unauthorised request |
| 403 | Forbidden |
| 404 | Resource not found |
| 405 | Method not allowed |
| 406 | Not acceptable |
| 415 | Unsupported media type |
| 500 | Server error |
| 502 | Bad gateway |



### <a name="create_reference_data_life_insurance_cal_eligibility_post_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mulesoft.mocksvc.controllers.ReferenceController.createReferenceDataLifeInsuranceCalEligibilityPOSTAsync") createReferenceDataLifeInsuranceCalEligibilityPOSTAsync

> TODO: Add a method description


```java
void createReferenceDataLifeInsuranceCalEligibilityPOSTAsync(
        final CalEligibilityRequest body,
        final APICallBack<CalEligibilityResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String bodyValue = "{  \"age\": \"30\",  \"individual\": {    \"employmentStatus\": \"Employed\",    \"occupationalCategory\": \"MANUAL\",    \"membershipDivision\": \"Industry\"  },  \"eligibility\": {    \"workMinimum30Hours\": true,    \"illnessOrAwayFromWork\": true,    \"beenDeclinedOrHadExclusion\": false  }}";
    CalEligibilityRequest body = mapper.readValue(bodyValue,new TypeReference<CalEligibilityRequest> (){});
    // Invoking the API call with sample inputs
    reference.createReferenceDataLifeInsuranceCalEligibilityPOSTAsync(body, new APICallBack<CalEligibilityResponse>() {
        public void onSuccess(HttpContext context, CalEligibilityResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_reference_data_life_insurance_insurance_cover_get_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mulesoft.mocksvc.controllers.ReferenceController.getReferenceDataLifeInsuranceInsuranceCoverGETAsync") getReferenceDataLifeInsuranceInsuranceCoverGETAsync

> Common error responses returned by an API


```java
void getReferenceDataLifeInsuranceInsuranceCoverGETAsync(
        final String age,
        final String employmentStatus,
        final String occupationalCategory,
        final String membershipDivision,
        final String insuranceType,
        final String xTransactionID,
        final String xTrackingID,
        final String xSessionID,
        final DateTime xCreationTime,
        final String xInitialSystem,
        final String xInitialComponent,
        final String xInitialOperation,
        final String xClientID,
        final String xClientSecret,
        final APICallBack<DefaultInsurance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| age |  ``` Optional ```  | TODO: Add a parameter description |
| employmentStatus |  ``` Optional ```  | TODO: Add a parameter description |
| occupationalCategory |  ``` Optional ```  | TODO: Add a parameter description |
| membershipDivision |  ``` Optional ```  | TODO: Add a parameter description |
| insuranceType |  ``` Optional ```  | list of insurance type comma delimited |
| xTransactionID |  ``` Optional ```  | Unique ID for the Integration transaction. Generated by the Integration Platform, not the consumer system. |
| xTrackingID |  ``` Optional ```  | Consumer system's tracking ID for this request (if any).
This is optional and purely for troubleshooting / analysis purposes. |
| xSessionID |  ``` Optional ```  | Consumer system's session ID for this request (if any).
This is opti
onal and purely for troubleshooting / analysis purposes. |
| xCreationTime |  ``` Optional ```  | The time this message was created by the invoking system.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialSystem |  ``` Optional ```  | The system that initiated this transaction.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialComponent |  ``` Optional ```  | The first component that was involved in this transaction.
This is optional and purely for troubleshooting / analysis purposes. |
| xInitialOperation |  ``` Optional ```  | The first operation that was involved in this transaction.
This is optional and purely for troubleshooting / analysis purposes.may be tunneled to the provider system for fine-grained access control. |
| xClientID |  ``` Optional ```  | The Client ID of the consumer |
| xClientSecret |  ``` Optional ```  | The Client Secret of the consumer |


#### Example Usage

```java
String age = "30";
String employmentStatus = "employed";
String occupationalCategory = "Manual";
String membershipDivision = "Industry";
String insuranceType = "TPD,IP,Death";
String xTransactionID = "550e8400-e29b-41d4-a716-446655440000";
String xTrackingID = "X-TrackingID";
String xSessionID = "X-SessionID";
DateTime xCreationTime = new Date();
String xInitialSystem = "X-InitialSystem";
String xInitialComponent = "X-InitialComponent";
String xInitialOperation = "X-InitialOperation";
String xClientID = "e5f19124663b428bda269a3b53b722ef";
String xClientSecret = "ea1b8baf121f4612A29C096C8AA0C6D4";
// Invoking the API call with sample inputs
reference.getReferenceDataLifeInsuranceInsuranceCoverGETAsync(age, employmentStatus, occupationalCategory, membershipDivision, insuranceType, xTransactionID, xTrackingID, xSessionID, xCreationTime, xInitialSystem, xInitialComponent, xInitialOperation, xClientID, xClientSecret, new APICallBack<DefaultInsurance>() {
    public void onSuccess(HttpContext context, DefaultInsurance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad request |
| 401 | Unauthorised request |
| 403 | Forbidden |
| 404 | Resource not found |
| 405 | Method not allowed |
| 406 | Not acceptable |
| 415 | Unsupported media type |
| 500 | Server error |
| 502 | Bad gateway |



[Back to List of Controllers](#list_of_controllers)



