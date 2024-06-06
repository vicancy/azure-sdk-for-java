// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The function name that will be used, if using the `function` tool.
 */
@Immutable
public final class FunctionName implements JsonSerializable<FunctionName> {

    /*
     * The name of the function to call
     */
    @Generated
    private final String name;

    /**
     * Creates an instance of FunctionName class.
     *
     * @param name the name value to set.
     */
    @Generated
    public FunctionName(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the function to call.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FunctionName from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of FunctionName if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FunctionName.
     */
    @Generated
    public static FunctionName fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new FunctionName(name);
        });
    }
}
