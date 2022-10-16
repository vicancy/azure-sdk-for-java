// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.NetworkConnectionListResult;
import org.junit.jupiter.api.Test;

public final class NetworkConnectionListResultTests {
    @Test
    public void testDeserialize() {
        NetworkConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"wkqnyhg\",\"healthCheckStatus\":\"Pending\",\"networkingResourceGroupName\":\"jivfxzsjabib\",\"domainJoinType\":\"AzureADJoin\",\"subnetId\":\"tawfsdjpvkvp\",\"domainName\":\"xbkzbzkdvncj\",\"organizationUnit\":\"udurgkakmokz\",\"domainUsername\":\"jk\",\"domainPassword\":\"fhmouwq\"},\"location\":\"zrfze\",\"tags\":{\"bjbsybb\":\"bizikayuhq\",\"ldgmfpgvmpip\":\"wrv\",\"x\":\"slthaq\"},\"id\":\"smwutwbdsrezpd\",\"name\":\"hneuyowqkd\",\"type\":\"ytisibir\"},{\"properties\":{\"provisioningState\":\"ikpzimejza\",\"healthCheckStatus\":\"Running\",\"networkingResourceGroupName\":\"xi\",\"domainJoinType\":\"HybridAzureADJoin\",\"subnetId\":\"mbzonokix\",\"domainName\":\"q\",\"organizationUnit\":\"rgz\",\"domainUsername\":\"rlazszrnw\",\"domainPassword\":\"indfpwpjyl\"},\"location\":\"tlhflsjcdhszf\",\"tags\":{\"qmqhldvriii\":\"bgofeljag\",\"vtvsexsowueluq\":\"jnalghf\",\"wws\":\"hahhxvrhmzkwpj\",\"qxujxukndxd\":\"ughftqsx\"},\"id\":\"grjguufzd\",\"name\":\"syqtfi\",\"type\":\"whbotzingamv\"},{\"properties\":{\"provisioningState\":\"o\",\"healthCheckStatus\":\"Running\",\"networkingResourceGroupName\":\"udphqamvdkfwyn\",\"domainJoinType\":\"HybridAzureADJoin\",\"subnetId\":\"tbvkayhmtnvyq\",\"domainName\":\"tkzwpcnpwzc\",\"organizationUnit\":\"esgvvsccyaj\",\"domainUsername\":\"qfhwyg\",\"domainPassword\":\"vdnkfxusem\"},\"location\":\"zrmuhapfcqdps\",\"tags\":{\"vezrypqlmfeo\":\"vpsvuoymgcce\",\"edkowepbqpcrfk\":\"erqwkyhkobopg\",\"tn\":\"wccsnjvcdwxlpqek\"},\"id\":\"htjsying\",\"name\":\"fq\",\"type\":\"tmtdhtmdvypgik\"},{\"properties\":{\"provisioningState\":\"zywkb\",\"healthCheckStatus\":\"Unknown\",\"networkingResourceGroupName\":\"uzhlhkjoqrv\",\"domainJoinType\":\"AzureADJoin\",\"subnetId\":\"atjinrvgoupmfiib\",\"domainName\":\"gjio\",\"organizationUnit\":\"vrwxkv\",\"domainUsername\":\"k\",\"domainPassword\":\"lqwjygvjayvblm\"},\"location\":\"k\",\"tags\":{\"opbyrqufegxu\":\"bxvvyhg\",\"bnhlmc\":\"wz\",\"dn\":\"l\",\"ijejvegrhbpn\":\"itvgbmhrixkwm\"},\"id\":\"ixexcc\",\"name\":\"dreaxh\",\"type\":\"exdrrvqahqkg\"}],\"nextLink\":\"pwijnhy\"}")
                .toObject(NetworkConnectionListResult.class);
    }

    @Test
    public void testSerialize() {
        NetworkConnectionListResult model = new NetworkConnectionListResult();
        model = BinaryData.fromObject(model).toObject(NetworkConnectionListResult.class);
    }
}