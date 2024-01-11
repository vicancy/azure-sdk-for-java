// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.security.keyvault.administration.models.KeyVaultRoleScope;
import java.io.IOException;
import java.util.Objects;

/**
 * Role assignment properties with scope.
 */
@Fluent
public final class RoleAssignmentPropertiesWithScope implements JsonSerializable<RoleAssignmentPropertiesWithScope> {
    /*
     * The role scope.
     */
    private KeyVaultRoleScope scope;

    /*
     * The role definition ID.
     */
    private String roleDefinitionId;

    /*
     * The principal ID.
     */
    private String principalId;

    /**
     * Creates an instance of RoleAssignmentPropertiesWithScope class.
     */
    public RoleAssignmentPropertiesWithScope() {
    }

    /**
     * Get the scope property: The role scope.
     * 
     * @return the scope value.
     */
    public KeyVaultRoleScope getScope() {
        return this.scope;
    }

    /**
     * Set the scope property: The role scope.
     * 
     * @param scope the scope value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope setScope(KeyVaultRoleScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID.
     * 
     * @return the roleDefinitionId value.
     */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID.
     * 
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope setRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID.
     * 
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID.
     * 
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scope", Objects.toString(this.scope, null));
        jsonWriter.writeStringField("roleDefinitionId", this.roleDefinitionId);
        jsonWriter.writeStringField("principalId", this.principalId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleAssignmentPropertiesWithScope from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleAssignmentPropertiesWithScope if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleAssignmentPropertiesWithScope.
     */
    public static RoleAssignmentPropertiesWithScope fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleAssignmentPropertiesWithScope deserializedRoleAssignmentPropertiesWithScope
                = new RoleAssignmentPropertiesWithScope();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scope".equals(fieldName)) {
                    deserializedRoleAssignmentPropertiesWithScope.scope
                        = KeyVaultRoleScope.fromString(reader.getString());
                } else if ("roleDefinitionId".equals(fieldName)) {
                    deserializedRoleAssignmentPropertiesWithScope.roleDefinitionId = reader.getString();
                } else if ("principalId".equals(fieldName)) {
                    deserializedRoleAssignmentPropertiesWithScope.principalId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleAssignmentPropertiesWithScope;
        });
    }
}
