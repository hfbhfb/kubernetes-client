
package io.fabric8.kubernetes.api.model.internal.apiserver.v1alpha1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiServerID",
    "decodableVersions",
    "encodingVersion",
    "servedVersions"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class ServerStorageVersion implements Editable<ServerStorageVersionBuilder> , KubernetesResource
{

    @JsonProperty("apiServerID")
    private String apiServerID;
    @JsonProperty("decodableVersions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> decodableVersions = new ArrayList<>();
    @JsonProperty("encodingVersion")
    private String encodingVersion;
    @JsonProperty("servedVersions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> servedVersions = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServerStorageVersion() {
    }

    public ServerStorageVersion(String apiServerID, List<String> decodableVersions, String encodingVersion, List<String> servedVersions) {
        super();
        this.apiServerID = apiServerID;
        this.decodableVersions = decodableVersions;
        this.encodingVersion = encodingVersion;
        this.servedVersions = servedVersions;
    }

    @JsonProperty("apiServerID")
    public String getApiServerID() {
        return apiServerID;
    }

    @JsonProperty("apiServerID")
    public void setApiServerID(String apiServerID) {
        this.apiServerID = apiServerID;
    }

    @JsonProperty("decodableVersions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getDecodableVersions() {
        return decodableVersions;
    }

    @JsonProperty("decodableVersions")
    public void setDecodableVersions(List<String> decodableVersions) {
        this.decodableVersions = decodableVersions;
    }

    @JsonProperty("encodingVersion")
    public String getEncodingVersion() {
        return encodingVersion;
    }

    @JsonProperty("encodingVersion")
    public void setEncodingVersion(String encodingVersion) {
        this.encodingVersion = encodingVersion;
    }

    @JsonProperty("servedVersions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getServedVersions() {
        return servedVersions;
    }

    @JsonProperty("servedVersions")
    public void setServedVersions(List<String> servedVersions) {
        this.servedVersions = servedVersions;
    }

    @JsonIgnore
    public ServerStorageVersionBuilder edit() {
        return new ServerStorageVersionBuilder(this);
    }

    @JsonIgnore
    public ServerStorageVersionBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
