// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalInner;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalListResultInner;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabasePrincipalListResultInnerTests {
    @Test
    public void testDeserialize() {
        DatabasePrincipalListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"role\":\"UnrestrictedViewer\",\"name\":\"lyjpk\",\"type\":\"User\",\"fqn\":\"zyexzn\",\"email\":\"ixhnrztf\",\"appId\":\"hb\",\"tenantName\":\"knalaulppg\"},{\"role\":\"Admin\",\"name\":\"tpnapnyiropuhpig\",\"type\":\"Group\",\"fqn\":\"ylgqgitxmedjvcsl\",\"email\":\"qwwncw\",\"appId\":\"hxg\",\"tenantName\":\"rmgucnap\"}]}")
                .toObject(DatabasePrincipalListResultInner.class);
        Assertions.assertEquals(DatabasePrincipalRole.UNRESTRICTED_VIEWER, model.value().get(0).role());
        Assertions.assertEquals("lyjpk", model.value().get(0).name());
        Assertions.assertEquals(DatabasePrincipalType.USER, model.value().get(0).type());
        Assertions.assertEquals("zyexzn", model.value().get(0).fqn());
        Assertions.assertEquals("ixhnrztf", model.value().get(0).email());
        Assertions.assertEquals("hb", model.value().get(0).appId());
    }

    @Test
    public void testSerialize() {
        DatabasePrincipalListResultInner model =
            new DatabasePrincipalListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.UNRESTRICTED_VIEWER)
                                .withName("lyjpk")
                                .withType(DatabasePrincipalType.USER)
                                .withFqn("zyexzn")
                                .withEmail("ixhnrztf")
                                .withAppId("hb"),
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.ADMIN)
                                .withName("tpnapnyiropuhpig")
                                .withType(DatabasePrincipalType.GROUP)
                                .withFqn("ylgqgitxmedjvcsl")
                                .withEmail("qwwncw")
                                .withAppId("hxg")));
        model = BinaryData.fromObject(model).toObject(DatabasePrincipalListResultInner.class);
        Assertions.assertEquals(DatabasePrincipalRole.UNRESTRICTED_VIEWER, model.value().get(0).role());
        Assertions.assertEquals("lyjpk", model.value().get(0).name());
        Assertions.assertEquals(DatabasePrincipalType.USER, model.value().get(0).type());
        Assertions.assertEquals("zyexzn", model.value().get(0).fqn());
        Assertions.assertEquals("ixhnrztf", model.value().get(0).email());
        Assertions.assertEquals("hb", model.value().get(0).appId());
    }
}