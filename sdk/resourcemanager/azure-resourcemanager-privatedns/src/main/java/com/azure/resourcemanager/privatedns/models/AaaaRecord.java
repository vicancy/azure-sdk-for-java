// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An AAAA record. */
@Fluent
public final class AaaaRecord {
    /*
     * The IPv6 address of this AAAA record.
     */
    @JsonProperty(value = "ipv6Address")
    private String ipv6Address;

    /** Creates an instance of AaaaRecord class. */
    public AaaaRecord() {
    }

    /**
     * Get the ipv6Address property: The IPv6 address of this AAAA record.
     *
     * @return the ipv6Address value.
     */
    public String ipv6Address() {
        return this.ipv6Address;
    }

    /**
     * Set the ipv6Address property: The IPv6 address of this AAAA record.
     *
     * @param ipv6Address the ipv6Address value to set.
     * @return the AaaaRecord object itself.
     */
    public AaaaRecord withIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
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
