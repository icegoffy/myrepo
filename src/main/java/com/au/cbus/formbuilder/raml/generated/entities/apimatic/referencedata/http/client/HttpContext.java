/*
 * ReferenceDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.au.cbus.formbuilder.raml.generated.entities.apimatic.referencedata.http.client;

import com.au.cbus.formbuilder.raml.generated.entities.apimatic.referencedata.http.request.HttpRequest;
import com.au.cbus.formbuilder.raml.generated.entities.apimatic.referencedata.http.response.HttpResponse;

public class HttpContext {
    private HttpRequest _request;
    private HttpResponse _response;

    public HttpContext(HttpRequest request, HttpResponse response) {
        _request = request;
        _response = response;
    }

    /**
     * Getter for the Http Request
     * @return HttpRequest request
     */
    public HttpRequest getRequest() {
        return _request;
    }

    /**
     * Getter for the Http Response
     * @return HttpResponse response
     */
    public HttpResponse getResponse() {
        return _response;
    }
}