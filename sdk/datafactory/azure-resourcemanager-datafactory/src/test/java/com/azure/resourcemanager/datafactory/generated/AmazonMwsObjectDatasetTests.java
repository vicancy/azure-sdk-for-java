// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonMwsObjectDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AmazonMwsObjectDatasetTests {
    @Test
    public void testDeserialize() {
        AmazonMwsObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"AmazonMWSObject\",\"typeProperties\":{},\"description\":\"bqnbl\",\"linkedServiceName\":{\"referenceName\":\"aclgschorimk\",\"parameters\":{}},\"parameters\":{\"cso\":{\"type\":\"SecureString\"},\"puviyfcaabe\":{\"type\":\"Bool\"},\"bh\":{\"type\":\"Object\"},\"mxuq\":{\"type\":\"Bool\"}},\"annotations\":[],\"folder\":{\"name\":\"kcudfbsfarfsiowl\"},\"\":{}}")
                .toObject(AmazonMwsObjectDataset.class);
        Assertions.assertEquals("bqnbl", model.description());
        Assertions.assertEquals("aclgschorimk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("cso").type());
        Assertions.assertEquals("kcudfbsfarfsiowl", model.folder().name());
    }

    @Test
    public void testSerialize() {
        AmazonMwsObjectDataset model =
            new AmazonMwsObjectDataset()
                .withDescription("bqnbl")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("aclgschorimk").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "cso",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                        "puviyfcaabe",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "bh",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "mxuq",
                        new ParameterSpecification().withType(ParameterType.BOOL)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("kcudfbsfarfsiowl"));
        model = BinaryData.fromObject(model).toObject(AmazonMwsObjectDataset.class);
        Assertions.assertEquals("bqnbl", model.description());
        Assertions.assertEquals("aclgschorimk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("cso").type());
        Assertions.assertEquals("kcudfbsfarfsiowl", model.folder().name());
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