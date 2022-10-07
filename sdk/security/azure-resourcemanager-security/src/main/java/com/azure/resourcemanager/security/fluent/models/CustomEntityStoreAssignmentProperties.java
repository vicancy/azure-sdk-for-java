// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** describes the custom entity store assignment properties. */
@Fluent
public final class CustomEntityStoreAssignmentProperties {
    /*
     * The principal assigned with entity store. Format of principal is: [AAD type]=[PrincipalObjectId];[TenantId]
     */
    @JsonProperty(value = "principal")
    private String principal;

    /*
     * The link to entity store database.
     */
    @JsonProperty(value = "entityStoreDatabaseLink")
    private String entityStoreDatabaseLink;

    /**
     * Get the principal property: The principal assigned with entity store. Format of principal is: [AAD
     * type]=[PrincipalObjectId];[TenantId].
     *
     * @return the principal value.
     */
    public String principal() {
        return this.principal;
    }

    /**
     * Set the principal property: The principal assigned with entity store. Format of principal is: [AAD
     * type]=[PrincipalObjectId];[TenantId].
     *
     * @param principal the principal value to set.
     * @return the CustomEntityStoreAssignmentProperties object itself.
     */
    public CustomEntityStoreAssignmentProperties withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * Get the entityStoreDatabaseLink property: The link to entity store database.
     *
     * @return the entityStoreDatabaseLink value.
     */
    public String entityStoreDatabaseLink() {
        return this.entityStoreDatabaseLink;
    }

    /**
     * Set the entityStoreDatabaseLink property: The link to entity store database.
     *
     * @param entityStoreDatabaseLink the entityStoreDatabaseLink value to set.
     * @return the CustomEntityStoreAssignmentProperties object itself.
     */
    public CustomEntityStoreAssignmentProperties withEntityStoreDatabaseLink(String entityStoreDatabaseLink) {
        this.entityStoreDatabaseLink = entityStoreDatabaseLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}