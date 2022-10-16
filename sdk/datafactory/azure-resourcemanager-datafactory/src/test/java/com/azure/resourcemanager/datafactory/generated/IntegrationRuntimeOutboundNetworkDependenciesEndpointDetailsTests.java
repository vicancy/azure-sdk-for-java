// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IntegrationRuntimeOutboundNetworkDependenciesEndpointDetailsTests {
    @Test
    public void testDeserialize() {
        IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails model =
            BinaryData
                .fromString("{\"port\":1233826604}")
                .toObject(IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails.class);
        Assertions.assertEquals(1233826604, model.port());
    }

    @Test
    public void testSerialize() {
        IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails model =
            new IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails().withPort(1233826604);
        model =
            BinaryData.fromObject(model).toObject(IntegrationRuntimeOutboundNetworkDependenciesEndpointDetails.class);
        Assertions.assertEquals(1233826604, model.port());
    }
}