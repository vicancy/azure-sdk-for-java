// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class WorkflowRunCancelTests extends PurviewWorkflowClientTestBase {
    @Disabled
    @Test
    public void testWorkflowRunCancelTests() {
        BinaryData runCancelReply = BinaryData.fromString("{\"comment\":\"Thanks!\"}");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                purviewWorkflowClient.cancelWorkflowRunWithResponse(
                        "41b1feae-1f90-4b35-835f-037f39d8ef67", runCancelReply, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
