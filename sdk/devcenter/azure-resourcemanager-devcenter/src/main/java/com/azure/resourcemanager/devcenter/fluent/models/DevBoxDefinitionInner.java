// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.models.ImageReference;
import com.azure.resourcemanager.devcenter.models.ImageValidationErrorDetails;
import com.azure.resourcemanager.devcenter.models.ImageValidationStatus;
import com.azure.resourcemanager.devcenter.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents a definition for a Developer Machine. */
@Fluent
public final class DevBoxDefinitionInner extends Resource {
    /*
     * Dev Box definition properties
     */
    @JsonProperty(value = "properties")
    private DevBoxDefinitionProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Dev Box definition properties.
     *
     * @return the innerProperties value.
     */
    private DevBoxDefinitionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public DevBoxDefinitionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DevBoxDefinitionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the imageValidationStatus property: Validation status of the configured image.
     *
     * @return the imageValidationStatus value.
     */
    public ImageValidationStatus imageValidationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().imageValidationStatus();
    }

    /**
     * Get the imageValidationErrorDetails property: Details for image validator error. Populated when the image
     * validation is not successful.
     *
     * @return the imageValidationErrorDetails value.
     */
    public ImageValidationErrorDetails imageValidationErrorDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().imageValidationErrorDetails();
    }

    /**
     * Get the activeImageReference property: Image reference information for the currently active image (only populated
     * during updates).
     *
     * @return the activeImageReference value.
     */
    public ImageReference activeImageReference() {
        return this.innerProperties() == null ? null : this.innerProperties().activeImageReference();
    }

    /**
     * Get the imageReference property: Image reference information.
     *
     * @return the imageReference value.
     */
    public ImageReference imageReference() {
        return this.innerProperties() == null ? null : this.innerProperties().imageReference();
    }

    /**
     * Set the imageReference property: Image reference information.
     *
     * @param imageReference the imageReference value to set.
     * @return the DevBoxDefinitionInner object itself.
     */
    public DevBoxDefinitionInner withImageReference(ImageReference imageReference) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DevBoxDefinitionProperties();
        }
        this.innerProperties().withImageReference(imageReference);
        return this;
    }

    /**
     * Get the sku property: The SKU for Dev Boxes created using this definition.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The SKU for Dev Boxes created using this definition.
     *
     * @param sku the sku value to set.
     * @return the DevBoxDefinitionInner object itself.
     */
    public DevBoxDefinitionInner withSku(Sku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DevBoxDefinitionProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the osStorageType property: The storage type used for the Operating System disk of Dev Boxes created using
     * this definition.
     *
     * @return the osStorageType value.
     */
    public String osStorageType() {
        return this.innerProperties() == null ? null : this.innerProperties().osStorageType();
    }

    /**
     * Set the osStorageType property: The storage type used for the Operating System disk of Dev Boxes created using
     * this definition.
     *
     * @param osStorageType the osStorageType value to set.
     * @return the DevBoxDefinitionInner object itself.
     */
    public DevBoxDefinitionInner withOsStorageType(String osStorageType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DevBoxDefinitionProperties();
        }
        this.innerProperties().withOsStorageType(osStorageType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}