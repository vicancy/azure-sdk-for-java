// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Face attributes for the detected face.
 */
@Immutable
public final class FaceAttributes {

    /*
     * Age in years.
     */
    @Generated
    @JsonProperty(value = "age")
    private Double age;

    /*
     * Smile intensity, a number between [0,1].
     */
    @Generated
    @JsonProperty(value = "smile")
    private Double smile;

    /*
     * Properties describing facial hair attributes.
     */
    @Generated
    @JsonProperty(value = "facialHair")
    private FacialHair facialHair;

    /*
     * Glasses type if any of the face.
     */
    @Generated
    @JsonProperty(value = "glasses")
    private GlassesType glasses;

    /*
     * 3-D roll/yaw/pitch angles for face direction.
     */
    @Generated
    @JsonProperty(value = "headPose")
    private HeadPose headPose;

    /*
     * Properties describing hair attributes.
     */
    @Generated
    @JsonProperty(value = "hair")
    private HairProperties hair;

    /*
     * Properties describing occlusions on a given face.
     */
    @Generated
    @JsonProperty(value = "occlusion")
    private OcclusionProperties occlusion;

    /*
     * Properties describing any accessories on a given face.
     */
    @Generated
    @JsonProperty(value = "accessories")
    private List<AccessoryItem> accessories;

    /*
     * Properties describing any presence of blur within the image.
     */
    @Generated
    @JsonProperty(value = "blur")
    private BlurProperties blur;

    /*
     * Properties describing exposure level of the image.
     */
    @Generated
    @JsonProperty(value = "exposure")
    private ExposureProperties exposure;

    /*
     * Properties describing noise level of the image.
     */
    @Generated
    @JsonProperty(value = "noise")
    private NoiseProperties noise;

    /*
     * Properties describing the presence of a mask on a given face.
     */
    @Generated
    @JsonProperty(value = "mask")
    private MaskProperties mask;

    /*
     * Properties describing the overall image quality regarding whether the image being used in the detection is of sufficient quality to attempt face recognition on.
     */
    @Generated
    @JsonProperty(value = "qualityForRecognition")
    private QualityForRecognition qualityForRecognition;

    /**
     * Creates an instance of FaceAttributes class.
     */
    @Generated
    private FaceAttributes() {
    }

    /**
     * Get the age property: Age in years.
     *
     * @return the age value.
     */
    @Generated
    public Double getAge() {
        return this.age;
    }

    /**
     * Get the smile property: Smile intensity, a number between [0,1].
     *
     * @return the smile value.
     */
    @Generated
    public Double getSmile() {
        return this.smile;
    }

    /**
     * Get the facialHair property: Properties describing facial hair attributes.
     *
     * @return the facialHair value.
     */
    @Generated
    public FacialHair getFacialHair() {
        return this.facialHair;
    }

    /**
     * Get the glasses property: Glasses type if any of the face.
     *
     * @return the glasses value.
     */
    @Generated
    public GlassesType getGlasses() {
        return this.glasses;
    }

    /**
     * Get the headPose property: 3-D roll/yaw/pitch angles for face direction.
     *
     * @return the headPose value.
     */
    @Generated
    public HeadPose getHeadPose() {
        return this.headPose;
    }

    /**
     * Get the hair property: Properties describing hair attributes.
     *
     * @return the hair value.
     */
    @Generated
    public HairProperties getHair() {
        return this.hair;
    }

    /**
     * Get the occlusion property: Properties describing occlusions on a given face.
     *
     * @return the occlusion value.
     */
    @Generated
    public OcclusionProperties getOcclusion() {
        return this.occlusion;
    }

    /**
     * Get the accessories property: Properties describing any accessories on a given face.
     *
     * @return the accessories value.
     */
    @Generated
    public List<AccessoryItem> getAccessories() {
        return this.accessories;
    }

    /**
     * Get the blur property: Properties describing any presence of blur within the image.
     *
     * @return the blur value.
     */
    @Generated
    public BlurProperties getBlur() {
        return this.blur;
    }

    /**
     * Get the exposure property: Properties describing exposure level of the image.
     *
     * @return the exposure value.
     */
    @Generated
    public ExposureProperties getExposure() {
        return this.exposure;
    }

    /**
     * Get the noise property: Properties describing noise level of the image.
     *
     * @return the noise value.
     */
    @Generated
    public NoiseProperties getNoise() {
        return this.noise;
    }

    /**
     * Get the mask property: Properties describing the presence of a mask on a given face.
     *
     * @return the mask value.
     */
    @Generated
    public MaskProperties getMask() {
        return this.mask;
    }

    /**
     * Get the qualityForRecognition property: Properties describing the overall image quality regarding whether the
     * image being used in the detection is of sufficient quality to attempt face recognition on.
     *
     * @return the qualityForRecognition value.
     */
    @Generated
    public QualityForRecognition getQualityForRecognition() {
        return this.qualityForRecognition;
    }
}
