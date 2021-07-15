// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.ScriptExecutionParameter;
import com.azure.resourcemanager.avs.models.ScriptExecutionProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An instance of a script executed by a user - custom or AVS. */
@JsonFlatten
@Fluent
public class ScriptExecutionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScriptExecutionInner.class);

    /*
     * A reference to the script cmdlet resource if user is running a AVS
     * script
     */
    @JsonProperty(value = "properties.scriptCmdletId")
    private String scriptCmdletId;

    /*
     * Parameters the script will accept
     */
    @JsonProperty(value = "properties.parameters")
    private List<ScriptExecutionParameter> parameters;

    /*
     * Parameters that will be hidden/not visible to ARM, such as passwords and
     * credentials
     */
    @JsonProperty(value = "properties.hiddenParameters")
    private List<ScriptExecutionParameter> hiddenParameters;

    /*
     * Error message if the script was able to run, but if the script itself
     * had errors or powershell threw an exception
     */
    @JsonProperty(value = "properties.failureReason")
    private String failureReason;

    /*
     * Time limit for execution
     */
    @JsonProperty(value = "properties.timeout")
    private String timeout;

    /*
     * Time to live for the resource. If not provided, will be available for 60
     * days
     */
    @JsonProperty(value = "properties.retention")
    private String retention;

    /*
     * Time the script execution was submitted
     */
    @JsonProperty(value = "properties.submittedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime submittedAt;

    /*
     * Time the script execution was started
     */
    @JsonProperty(value = "properties.startedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedAt;

    /*
     * Time the script execution was finished
     */
    @JsonProperty(value = "properties.finishedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime finishedAt;

    /*
     * The state of the script execution resource
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ScriptExecutionProvisioningState provisioningState;

    /*
     * Standard output stream from the powershell execution
     */
    @JsonProperty(value = "properties.output")
    private List<String> output;

    /*
     * User-defined dictionary.
     */
    @JsonProperty(value = "properties.namedOutputs")
    private Map<String, Object> namedOutputs;

    /*
     * Standard information out stream from the powershell execution
     */
    @JsonProperty(value = "properties.information", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> information;

    /*
     * Standard warning out stream from the powershell execution
     */
    @JsonProperty(value = "properties.warnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> warnings;

    /*
     * Standard error output stream from the powershell execution
     */
    @JsonProperty(value = "properties.errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> errors;

    /**
     * Get the scriptCmdletId property: A reference to the script cmdlet resource if user is running a AVS script.
     *
     * @return the scriptCmdletId value.
     */
    public String scriptCmdletId() {
        return this.scriptCmdletId;
    }

    /**
     * Set the scriptCmdletId property: A reference to the script cmdlet resource if user is running a AVS script.
     *
     * @param scriptCmdletId the scriptCmdletId value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withScriptCmdletId(String scriptCmdletId) {
        this.scriptCmdletId = scriptCmdletId;
        return this;
    }

    /**
     * Get the parameters property: Parameters the script will accept.
     *
     * @return the parameters value.
     */
    public List<ScriptExecutionParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters the script will accept.
     *
     * @param parameters the parameters value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withParameters(List<ScriptExecutionParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the hiddenParameters property: Parameters that will be hidden/not visible to ARM, such as passwords and
     * credentials.
     *
     * @return the hiddenParameters value.
     */
    public List<ScriptExecutionParameter> hiddenParameters() {
        return this.hiddenParameters;
    }

    /**
     * Set the hiddenParameters property: Parameters that will be hidden/not visible to ARM, such as passwords and
     * credentials.
     *
     * @param hiddenParameters the hiddenParameters value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withHiddenParameters(List<ScriptExecutionParameter> hiddenParameters) {
        this.hiddenParameters = hiddenParameters;
        return this;
    }

    /**
     * Get the failureReason property: Error message if the script was able to run, but if the script itself had errors
     * or powershell threw an exception.
     *
     * @return the failureReason value.
     */
    public String failureReason() {
        return this.failureReason;
    }

    /**
     * Set the failureReason property: Error message if the script was able to run, but if the script itself had errors
     * or powershell threw an exception.
     *
     * @param failureReason the failureReason value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * Get the timeout property: Time limit for execution.
     *
     * @return the timeout value.
     */
    public String timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: Time limit for execution.
     *
     * @param timeout the timeout value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the retention property: Time to live for the resource. If not provided, will be available for 60 days.
     *
     * @return the retention value.
     */
    public String retention() {
        return this.retention;
    }

    /**
     * Set the retention property: Time to live for the resource. If not provided, will be available for 60 days.
     *
     * @param retention the retention value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withRetention(String retention) {
        this.retention = retention;
        return this;
    }

    /**
     * Get the submittedAt property: Time the script execution was submitted.
     *
     * @return the submittedAt value.
     */
    public OffsetDateTime submittedAt() {
        return this.submittedAt;
    }

    /**
     * Get the startedAt property: Time the script execution was started.
     *
     * @return the startedAt value.
     */
    public OffsetDateTime startedAt() {
        return this.startedAt;
    }

    /**
     * Get the finishedAt property: Time the script execution was finished.
     *
     * @return the finishedAt value.
     */
    public OffsetDateTime finishedAt() {
        return this.finishedAt;
    }

    /**
     * Get the provisioningState property: The state of the script execution resource.
     *
     * @return the provisioningState value.
     */
    public ScriptExecutionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the output property: Standard output stream from the powershell execution.
     *
     * @return the output value.
     */
    public List<String> output() {
        return this.output;
    }

    /**
     * Set the output property: Standard output stream from the powershell execution.
     *
     * @param output the output value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withOutput(List<String> output) {
        this.output = output;
        return this;
    }

    /**
     * Get the namedOutputs property: User-defined dictionary.
     *
     * @return the namedOutputs value.
     */
    public Map<String, Object> namedOutputs() {
        return this.namedOutputs;
    }

    /**
     * Set the namedOutputs property: User-defined dictionary.
     *
     * @param namedOutputs the namedOutputs value to set.
     * @return the ScriptExecutionInner object itself.
     */
    public ScriptExecutionInner withNamedOutputs(Map<String, Object> namedOutputs) {
        this.namedOutputs = namedOutputs;
        return this;
    }

    /**
     * Get the information property: Standard information out stream from the powershell execution.
     *
     * @return the information value.
     */
    public List<String> information() {
        return this.information;
    }

    /**
     * Get the warnings property: Standard warning out stream from the powershell execution.
     *
     * @return the warnings value.
     */
    public List<String> warnings() {
        return this.warnings;
    }

    /**
     * Get the errors property: Standard error output stream from the powershell execution.
     *
     * @return the errors value.
     */
    public List<String> errors() {
        return this.errors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
        if (hiddenParameters() != null) {
            hiddenParameters().forEach(e -> e.validate());
        }
    }
}
