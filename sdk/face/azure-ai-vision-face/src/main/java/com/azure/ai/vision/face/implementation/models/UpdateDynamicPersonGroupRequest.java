// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UpdateDynamicPersonGroupRequest model.
 */
@Fluent
public final class UpdateDynamicPersonGroupRequest {

    /*
     * User defined name, maximum length is 128.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * Optional user defined data. Length should not exceed 16K.
     */
    @Generated
    @JsonProperty(value = "userData")
    private String userData;

    /**
     * Creates an instance of UpdateDynamicPersonGroupRequest class.
     */
    @Generated
    public UpdateDynamicPersonGroupRequest() {
    }

    /**
     * Get the name property: User defined name, maximum length is 128.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: User defined name, maximum length is 128.
     *
     * @param name the name value to set.
     * @return the UpdateDynamicPersonGroupRequest object itself.
     */
    @Generated
    public UpdateDynamicPersonGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the userData property: Optional user defined data. Length should not exceed 16K.
     *
     * @return the userData value.
     */
    @Generated
    public String getUserData() {
        return this.userData;
    }

    /**
     * Set the userData property: Optional user defined data. Length should not exceed 16K.
     *
     * @param userData the userData value to set.
     * @return the UpdateDynamicPersonGroupRequest object itself.
     */
    @Generated
    public UpdateDynamicPersonGroupRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
}
