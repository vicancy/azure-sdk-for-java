// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FactoryIdentity;
import com.azure.resourcemanager.datafactory.models.FactoryIdentityType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FactoryIdentityTests {
    @Test
    public void testDeserialize() {
        FactoryIdentity model =
            BinaryData
                .fromString("{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}}")
                .toObject(FactoryIdentity.class);
        Assertions.assertEquals(FactoryIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    @Test
    public void testSerialize() {
        FactoryIdentity model =
            new FactoryIdentity().withType(FactoryIdentityType.SYSTEM_ASSIGNED).withUserAssignedIdentities(mapOf());
        model = BinaryData.fromObject(model).toObject(FactoryIdentity.class);
        Assertions.assertEquals(FactoryIdentityType.SYSTEM_ASSIGNED, model.type());
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