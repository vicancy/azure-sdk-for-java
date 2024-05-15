// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response body for group face operation.
 */
@Immutable
public final class FaceGroupingResult {

    /*
     * A partition of the original faces based on face similarity. Groups are ranked by number of faces.
     */
    @Generated
    @JsonProperty(value = "groups")
    private final List<List<String>> groups;

    /*
     * Face ids array of faces that cannot find any similar faces from original faces.
     */
    @Generated
    @JsonProperty(value = "messyGroup")
    private final List<String> messyGroup;

    /**
     * Creates an instance of FaceGroupingResult class.
     *
     * @param groups the groups value to set.
     * @param messyGroup the messyGroup value to set.
     */
    @Generated
    @JsonCreator
    private FaceGroupingResult(@JsonProperty(value = "groups") List<List<String>> groups,
        @JsonProperty(value = "messyGroup") List<String> messyGroup) {
        this.groups = groups;
        this.messyGroup = messyGroup;
    }

    /**
     * Get the groups property: A partition of the original faces based on face similarity. Groups are ranked by number
     * of faces.
     *
     * @return the groups value.
     */
    @Generated
    public List<List<String>> getGroups() {
        return this.groups;
    }

    /**
     * Get the messyGroup property: Face ids array of faces that cannot find any similar faces from original faces.
     *
     * @return the messyGroup value.
     */
    @Generated
    public List<String> getMessyGroup() {
        return this.messyGroup;
    }
}
