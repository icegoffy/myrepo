/*
 * ReferenceDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mulesoft.mocksvc.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CalEligibilityRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8815651187068371739L;
    private String age;
    private IndividualBaseType individual;
    private EligibilityBaseType eligibility;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("age")
    public String getAge ( ) { 
        return this.age;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("age")
    public void setAge (String value) { 
        this.age = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("individual")
    public IndividualBaseType getIndividual ( ) { 
        return this.individual;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("individual")
    public void setIndividual (IndividualBaseType value) { 
        this.individual = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("eligibility")
    public EligibilityBaseType getEligibility ( ) { 
        return this.eligibility;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("eligibility")
    public void setEligibility (EligibilityBaseType value) { 
        this.eligibility = value;
    }
 
}
 