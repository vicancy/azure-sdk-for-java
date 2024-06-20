// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The PressureTendency model.
 */
@Fluent
public final class PressureTendency implements JsonSerializable<PressureTendency> {

    /*
     * Description of the pressure tendency in specified language
     */
    private String description;

    /*
     * Pressure tendency code regardless of language. One of F=Falling, S=Steady, R=Rising.
     */
    private String code;

    /**
     * Set default PressureTendency constructor to private
     */
    private PressureTendency() {
    }

    /**
     * Get the description property: Description of the pressure tendency in specified language.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the code property: Pressure tendency code regardless of language. One of F=Falling, S=Steady, R=Rising.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("localizedDescription", this.description);
        jsonWriter.writeStringField("code", this.code);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PressureTendency from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PressureTendency if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PressureTendency.
     */
    public static PressureTendency fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PressureTendency deserializedPressureTendency = new PressureTendency();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("localizedDescription".equals(fieldName)) {
                    deserializedPressureTendency.description = reader.getString();
                } else if ("code".equals(fieldName)) {
                    deserializedPressureTendency.code = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedPressureTendency;
        });
    }
}
