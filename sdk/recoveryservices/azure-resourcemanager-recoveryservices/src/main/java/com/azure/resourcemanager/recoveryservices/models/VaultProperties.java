// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the vault. */
@Fluent
public final class VaultProperties {
    /*
     * Provisioning State.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Details for upgrading vault.
     */
    @JsonProperty(value = "upgradeDetails")
    private UpgradeDetails upgradeDetails;

    /*
     * List of private endpoint connection.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionVaultProperties> privateEndpointConnections;

    /*
     * Private endpoint state for backup.
     */
    @JsonProperty(value = "privateEndpointStateForBackup", access = JsonProperty.Access.WRITE_ONLY)
    private VaultPrivateEndpointState privateEndpointStateForBackup;

    /*
     * Private endpoint state for site recovery.
     */
    @JsonProperty(value = "privateEndpointStateForSiteRecovery", access = JsonProperty.Access.WRITE_ONLY)
    private VaultPrivateEndpointState privateEndpointStateForSiteRecovery;

    /*
     * Customer Managed Key details of the resource.
     */
    @JsonProperty(value = "encryption")
    private VaultPropertiesEncryption encryption;

    /*
     * The details of the latest move operation performed on the Azure Resource
     */
    @JsonProperty(value = "moveDetails")
    private VaultPropertiesMoveDetails moveDetails;

    /*
     * The State of the Resource after the move operation
     */
    @JsonProperty(value = "moveState", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceMoveState moveState;

    /*
     * Backup storage version
     */
    @JsonProperty(value = "backupStorageVersion", access = JsonProperty.Access.WRITE_ONLY)
    private BackupStorageVersion backupStorageVersion;

    /*
     * property to enable or disable resource provider inbound network traffic from public clients
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Monitoring Settings of the vault
     */
    @JsonProperty(value = "monitoringSettings")
    private MonitoringSettings monitoringSettings;

    /*
     * Restore Settings of the vault
     */
    @JsonProperty(value = "restoreSettings")
    private RestoreSettings restoreSettings;

    /*
     * The redundancy Settings of a Vault
     */
    @JsonProperty(value = "redundancySettings")
    private VaultPropertiesRedundancySettings redundancySettings;

    /*
     * Security Settings of the vault
     */
    @JsonProperty(value = "securitySettings")
    private SecuritySettings securitySettings;

    /** Creates an instance of VaultProperties class. */
    public VaultProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning State.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the upgradeDetails property: Details for upgrading vault.
     *
     * @return the upgradeDetails value.
     */
    public UpgradeDetails upgradeDetails() {
        return this.upgradeDetails;
    }

    /**
     * Set the upgradeDetails property: Details for upgrading vault.
     *
     * @param upgradeDetails the upgradeDetails value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withUpgradeDetails(UpgradeDetails upgradeDetails) {
        this.upgradeDetails = upgradeDetails;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionVaultProperties> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the privateEndpointStateForBackup property: Private endpoint state for backup.
     *
     * @return the privateEndpointStateForBackup value.
     */
    public VaultPrivateEndpointState privateEndpointStateForBackup() {
        return this.privateEndpointStateForBackup;
    }

    /**
     * Get the privateEndpointStateForSiteRecovery property: Private endpoint state for site recovery.
     *
     * @return the privateEndpointStateForSiteRecovery value.
     */
    public VaultPrivateEndpointState privateEndpointStateForSiteRecovery() {
        return this.privateEndpointStateForSiteRecovery;
    }

    /**
     * Get the encryption property: Customer Managed Key details of the resource.
     *
     * @return the encryption value.
     */
    public VaultPropertiesEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Customer Managed Key details of the resource.
     *
     * @param encryption the encryption value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEncryption(VaultPropertiesEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the moveDetails property: The details of the latest move operation performed on the Azure Resource.
     *
     * @return the moveDetails value.
     */
    public VaultPropertiesMoveDetails moveDetails() {
        return this.moveDetails;
    }

    /**
     * Set the moveDetails property: The details of the latest move operation performed on the Azure Resource.
     *
     * @param moveDetails the moveDetails value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withMoveDetails(VaultPropertiesMoveDetails moveDetails) {
        this.moveDetails = moveDetails;
        return this;
    }

    /**
     * Get the moveState property: The State of the Resource after the move operation.
     *
     * @return the moveState value.
     */
    public ResourceMoveState moveState() {
        return this.moveState;
    }

    /**
     * Get the backupStorageVersion property: Backup storage version.
     *
     * @return the backupStorageVersion value.
     */
    public BackupStorageVersion backupStorageVersion() {
        return this.backupStorageVersion;
    }

    /**
     * Get the publicNetworkAccess property: property to enable or disable resource provider inbound network traffic
     * from public clients.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: property to enable or disable resource provider inbound network traffic
     * from public clients.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the monitoringSettings property: Monitoring Settings of the vault.
     *
     * @return the monitoringSettings value.
     */
    public MonitoringSettings monitoringSettings() {
        return this.monitoringSettings;
    }

    /**
     * Set the monitoringSettings property: Monitoring Settings of the vault.
     *
     * @param monitoringSettings the monitoringSettings value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withMonitoringSettings(MonitoringSettings monitoringSettings) {
        this.monitoringSettings = monitoringSettings;
        return this;
    }

    /**
     * Get the restoreSettings property: Restore Settings of the vault.
     *
     * @return the restoreSettings value.
     */
    public RestoreSettings restoreSettings() {
        return this.restoreSettings;
    }

    /**
     * Set the restoreSettings property: Restore Settings of the vault.
     *
     * @param restoreSettings the restoreSettings value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withRestoreSettings(RestoreSettings restoreSettings) {
        this.restoreSettings = restoreSettings;
        return this;
    }

    /**
     * Get the redundancySettings property: The redundancy Settings of a Vault.
     *
     * @return the redundancySettings value.
     */
    public VaultPropertiesRedundancySettings redundancySettings() {
        return this.redundancySettings;
    }

    /**
     * Set the redundancySettings property: The redundancy Settings of a Vault.
     *
     * @param redundancySettings the redundancySettings value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withRedundancySettings(VaultPropertiesRedundancySettings redundancySettings) {
        this.redundancySettings = redundancySettings;
        return this;
    }

    /**
     * Get the securitySettings property: Security Settings of the vault.
     *
     * @return the securitySettings value.
     */
    public SecuritySettings securitySettings() {
        return this.securitySettings;
    }

    /**
     * Set the securitySettings property: Security Settings of the vault.
     *
     * @param securitySettings the securitySettings value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withSecuritySettings(SecuritySettings securitySettings) {
        this.securitySettings = securitySettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgradeDetails() != null) {
            upgradeDetails().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (moveDetails() != null) {
            moveDetails().validate();
        }
        if (monitoringSettings() != null) {
            monitoringSettings().validate();
        }
        if (restoreSettings() != null) {
            restoreSettings().validate();
        }
        if (redundancySettings() != null) {
            redundancySettings().validate();
        }
        if (securitySettings() != null) {
            securitySettings().validate();
        }
    }
}
