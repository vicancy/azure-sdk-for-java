// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.IpAllocationMethod;
import com.azure.resourcemanager.hybridnetwork.models.IpVersion;
import com.azure.resourcemanager.hybridnetwork.models.NetworkInterface;
import com.azure.resourcemanager.hybridnetwork.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.VMSwitchType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NetworkInterfaceTests {
    @Test
    public void testDeserialize() {
        NetworkInterface model =
            BinaryData
                .fromString(
                    "{\"networkInterfaceName\":\"ifsqesaagdfmg\",\"macAddress\":\"lhjxr\",\"ipConfigurations\":[{\"ipAllocationMethod\":\"Unknown\",\"ipAddress\":\"vktsizntocipao\",\"subnet\":\"jpsq\",\"gateway\":\"mpoyfd\",\"ipVersion\":\"IPv4\",\"dnsServers\":[\"nygj\",\"fjddeqs\",\"deupewnwrei\"]}],\"vmSwitchType\":\"Unknown\"}")
                .toObject(NetworkInterface.class);
        Assertions.assertEquals("ifsqesaagdfmg", model.networkInterfaceName());
        Assertions.assertEquals("lhjxr", model.macAddress());
        Assertions.assertEquals(IpAllocationMethod.UNKNOWN, model.ipConfigurations().get(0).ipAllocationMethod());
        Assertions.assertEquals("vktsizntocipao", model.ipConfigurations().get(0).ipAddress());
        Assertions.assertEquals("jpsq", model.ipConfigurations().get(0).subnet());
        Assertions.assertEquals("mpoyfd", model.ipConfigurations().get(0).gateway());
        Assertions.assertEquals(IpVersion.IPV4, model.ipConfigurations().get(0).ipVersion());
        Assertions.assertEquals("nygj", model.ipConfigurations().get(0).dnsServers().get(0));
        Assertions.assertEquals(VMSwitchType.UNKNOWN, model.vmSwitchType());
    }

    @Test
    public void testSerialize() {
        NetworkInterface model =
            new NetworkInterface()
                .withNetworkInterfaceName("ifsqesaagdfmg")
                .withMacAddress("lhjxr")
                .withIpConfigurations(
                    Arrays
                        .asList(
                            new NetworkInterfaceIpConfiguration()
                                .withIpAllocationMethod(IpAllocationMethod.UNKNOWN)
                                .withIpAddress("vktsizntocipao")
                                .withSubnet("jpsq")
                                .withGateway("mpoyfd")
                                .withIpVersion(IpVersion.IPV4)
                                .withDnsServers(Arrays.asList("nygj", "fjddeqs", "deupewnwrei"))))
                .withVmSwitchType(VMSwitchType.UNKNOWN);
        model = BinaryData.fromObject(model).toObject(NetworkInterface.class);
        Assertions.assertEquals("ifsqesaagdfmg", model.networkInterfaceName());
        Assertions.assertEquals("lhjxr", model.macAddress());
        Assertions.assertEquals(IpAllocationMethod.UNKNOWN, model.ipConfigurations().get(0).ipAllocationMethod());
        Assertions.assertEquals("vktsizntocipao", model.ipConfigurations().get(0).ipAddress());
        Assertions.assertEquals("jpsq", model.ipConfigurations().get(0).subnet());
        Assertions.assertEquals("mpoyfd", model.ipConfigurations().get(0).gateway());
        Assertions.assertEquals(IpVersion.IPV4, model.ipConfigurations().get(0).ipVersion());
        Assertions.assertEquals("nygj", model.ipConfigurations().get(0).dnsServers().get(0));
        Assertions.assertEquals(VMSwitchType.UNKNOWN, model.vmSwitchType());
    }
}