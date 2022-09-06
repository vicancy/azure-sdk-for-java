// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.implementation;

import com.azure.resourcemanager.alertsmanagement.fluent.models.OperationInner;
import com.azure.resourcemanager.alertsmanagement.models.Operation;
import com.azure.resourcemanager.alertsmanagement.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.alertsmanagement.AlertsManagementManager serviceManager;

    OperationImpl(
        OperationInner innerObject, com.azure.resourcemanager.alertsmanagement.AlertsManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.alertsmanagement.AlertsManagementManager manager() {
        return this.serviceManager;
    }
}