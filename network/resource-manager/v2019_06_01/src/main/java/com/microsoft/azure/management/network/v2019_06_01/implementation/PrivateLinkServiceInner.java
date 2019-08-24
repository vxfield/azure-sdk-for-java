/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_06_01.PrivateLinkServiceIpConfiguration;
import com.microsoft.azure.management.network.v2019_06_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_06_01.PrivateLinkServicePropertiesVisibility;
import com.microsoft.azure.management.network.v2019_06_01.PrivateLinkServicePropertiesAutoApproval;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Private link service resource.
 */
@JsonFlatten
@SkipParentValidation
public class PrivateLinkServiceInner extends Resource {
    /**
     * An array of references to the load balancer IP configurations.
     */
    @JsonProperty(value = "properties.loadBalancerFrontendIpConfigurations")
    private List<FrontendIPConfigurationInner> loadBalancerFrontendIpConfigurations;

    /**
     * An array of references to the private link service IP configuration.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<PrivateLinkServiceIpConfiguration> ipConfigurations;

    /**
     * Gets an array of references to the network interfaces created for this
     * private link service.
     */
    @JsonProperty(value = "properties.networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceInner> networkInterfaces;

    /**
     * The provisioning state of the private link service. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * An array of list about connections to the private endpoint.
     */
    @JsonProperty(value = "properties.privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * The visibility list of the private link service.
     */
    @JsonProperty(value = "properties.visibility")
    private PrivateLinkServicePropertiesVisibility visibility;

    /**
     * The auto-approval list of the private link service.
     */
    @JsonProperty(value = "properties.autoApproval")
    private PrivateLinkServicePropertiesAutoApproval autoApproval;

    /**
     * The list of Fqdn.
     */
    @JsonProperty(value = "properties.fqdns")
    private List<String> fqdns;

    /**
     * The alias of the private link service.
     */
    @JsonProperty(value = "properties.alias", access = JsonProperty.Access.WRITE_ONLY)
    private String alias;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get an array of references to the load balancer IP configurations.
     *
     * @return the loadBalancerFrontendIpConfigurations value
     */
    public List<FrontendIPConfigurationInner> loadBalancerFrontendIpConfigurations() {
        return this.loadBalancerFrontendIpConfigurations;
    }

    /**
     * Set an array of references to the load balancer IP configurations.
     *
     * @param loadBalancerFrontendIpConfigurations the loadBalancerFrontendIpConfigurations value to set
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withLoadBalancerFrontendIpConfigurations(List<FrontendIPConfigurationInner> loadBalancerFrontendIpConfigurations) {
        this.loadBalancerFrontendIpConfigurations = loadBalancerFrontendIpConfigurations;
        return this;
    }

    /**
     * Get an array of references to the private link service IP configuration.
     *
     * @return the ipConfigurations value
     */
    public List<PrivateLinkServiceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set an array of references to the private link service IP configuration.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withIpConfigurations(List<PrivateLinkServiceIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get gets an array of references to the network interfaces created for this private link service.
     *
     * @return the networkInterfaces value
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get the provisioning state of the private link service. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the private link service. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get an array of list about connections to the private endpoint.
     *
     * @return the privateEndpointConnections value
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set an array of list about connections to the private endpoint.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the visibility list of the private link service.
     *
     * @return the visibility value
     */
    public PrivateLinkServicePropertiesVisibility visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility list of the private link service.
     *
     * @param visibility the visibility value to set
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withVisibility(PrivateLinkServicePropertiesVisibility visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the auto-approval list of the private link service.
     *
     * @return the autoApproval value
     */
    public PrivateLinkServicePropertiesAutoApproval autoApproval() {
        return this.autoApproval;
    }

    /**
     * Set the auto-approval list of the private link service.
     *
     * @param autoApproval the autoApproval value to set
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval) {
        this.autoApproval = autoApproval;
        return this;
    }

    /**
     * Get the list of Fqdn.
     *
     * @return the fqdns value
     */
    public List<String> fqdns() {
        return this.fqdns;
    }

    /**
     * Set the list of Fqdn.
     *
     * @param fqdns the fqdns value to set
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withFqdns(List<String> fqdns) {
        this.fqdns = fqdns;
        return this;
    }

    /**
     * Get the alias of the private link service.
     *
     * @return the alias value
     */
    public String alias() {
        return this.alias;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the PrivateLinkServiceInner object itself.
     */
    public PrivateLinkServiceInner withId(String id) {
        this.id = id;
        return this;
    }

}
