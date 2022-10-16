// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.RestResourceDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RestResourceDatasetTests {
    @Test
    public void testDeserialize() {
        RestResourceDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"RestResource\",\"typeProperties\":{},\"description\":\"hgwydyynfsv\",\"linkedServiceName\":{\"referenceName\":\"bvqt\",\"parameters\":{}},\"parameters\":{\"pukhpyrne\":{\"type\":\"Float\"},\"cpeogkhnmgbrou\":{\"type\":\"Float\"},\"bhfhpfpazjzoy\":{\"type\":\"String\"}},\"annotations\":[],\"folder\":{\"name\":\"dulontacn\"},\"\":{}}")
                .toObject(RestResourceDataset.class);
        Assertions.assertEquals("hgwydyynfsv", model.description());
        Assertions.assertEquals("bvqt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("pukhpyrne").type());
        Assertions.assertEquals("dulontacn", model.folder().name());
    }

    @Test
    public void testSerialize() {
        RestResourceDataset model =
            new RestResourceDataset()
                .withDescription("hgwydyynfsv")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("bvqt").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "pukhpyrne",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "cpeogkhnmgbrou",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "bhfhpfpazjzoy",
                        new ParameterSpecification().withType(ParameterType.STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("dulontacn"));
        model = BinaryData.fromObject(model).toObject(RestResourceDataset.class);
        Assertions.assertEquals("hgwydyynfsv", model.description());
        Assertions.assertEquals("bvqt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("pukhpyrne").type());
        Assertions.assertEquals("dulontacn", model.folder().name());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}