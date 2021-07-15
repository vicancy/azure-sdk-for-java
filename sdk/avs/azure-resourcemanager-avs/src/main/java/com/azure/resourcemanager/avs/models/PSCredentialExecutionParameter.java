// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** a powershell credential object. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Credential")
@Fluent
public final class PSCredentialExecutionParameter extends ScriptExecutionParameter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PSCredentialExecutionParameter.class);

    /*
     * username for login
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * password for login
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the username property: username for login.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: username for login.
     *
     * @param username the username value to set.
     * @return the PSCredentialExecutionParameter object itself.
     */
    public PSCredentialExecutionParameter withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: password for login.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: password for login.
     *
     * @param password the password value to set.
     * @return the PSCredentialExecutionParameter object itself.
     */
    public PSCredentialExecutionParameter withPassword(String password) {
        this.password = password;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PSCredentialExecutionParameter withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
