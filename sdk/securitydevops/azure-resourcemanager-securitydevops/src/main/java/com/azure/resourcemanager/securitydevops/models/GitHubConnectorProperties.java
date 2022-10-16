// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the ARM resource for
 * /subscriptions/xxx/resourceGroups/xxx/providers/Microsoft.SecurityDevOps/gitHubConnectors.
 */
@Fluent
public final class GitHubConnectorProperties {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /*
     * Gets or sets one-time OAuth code to exchange for refresh and access tokens.
     */
    @JsonProperty(value = "code")
    private String code;

    /** Creates an instance of GitHubConnectorProperties class. */
    public GitHubConnectorProperties() {
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioningState property.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the GitHubConnectorProperties object itself.
     */
    public GitHubConnectorProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the code property: Gets or sets one-time OAuth code to exchange for refresh and access tokens.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Gets or sets one-time OAuth code to exchange for refresh and access tokens.
     *
     * @param code the code value to set.
     * @return the GitHubConnectorProperties object itself.
     */
    public GitHubConnectorProperties withCode(String code) {
        this.code = code;
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