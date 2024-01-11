// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Role definition create parameters.
 */
@Immutable
public final class RoleDefinitionCreateParameters implements JsonSerializable<RoleDefinitionCreateParameters> {
    /*
     * Role definition properties.
     */
    private final RoleDefinitionProperties properties;

    /**
     * Creates an instance of RoleDefinitionCreateParameters class.
     * 
     * @param properties the properties value to set.
     */
    public RoleDefinitionCreateParameters(RoleDefinitionProperties properties) {
        this.properties = properties;
    }

    /**
     * Get the properties property: Role definition properties.
     * 
     * @return the properties value.
     */
    public RoleDefinitionProperties getProperties() {
        return this.properties;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleDefinitionCreateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleDefinitionCreateParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RoleDefinitionCreateParameters.
     */
    public static RoleDefinitionCreateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean propertiesFound = false;
            RoleDefinitionProperties properties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    properties = RoleDefinitionProperties.fromJson(reader);
                    propertiesFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (propertiesFound) {
                RoleDefinitionCreateParameters deserializedRoleDefinitionCreateParameters
                    = new RoleDefinitionCreateParameters(properties);

                return deserializedRoleDefinitionCreateParameters;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!propertiesFound) {
                missingProperties.add("properties");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
