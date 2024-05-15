// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UpdatePersonGroupPersonFaceRequest model.
 */
@Fluent
public final class UpdatePersonGroupPersonFaceRequest {

    /*
     * User-provided data attached to the face. The length limit is 1K.
     */
    @Generated
    @JsonProperty(value = "userData")
    private String userData;

    /**
     * Creates an instance of UpdatePersonGroupPersonFaceRequest class.
     */
    @Generated
    public UpdatePersonGroupPersonFaceRequest() {
    }

    /**
     * Get the userData property: User-provided data attached to the face. The length limit is 1K.
     *
     * @return the userData value.
     */
    @Generated
    public String getUserData() {
        return this.userData;
    }

    /**
     * Set the userData property: User-provided data attached to the face. The length limit is 1K.
     *
     * @param userData the userData value to set.
     * @return the UpdatePersonGroupPersonFaceRequest object itself.
     */
    @Generated
    public UpdatePersonGroupPersonFaceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
}
