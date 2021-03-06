/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Whitelist rule
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputWhitelistRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputWhitelistRule implements Serializable, Cloneable, StructuredPojo {

    /** The IPv4 CIDR that's whitelisted. */
    private String cidr;

    /**
     * The IPv4 CIDR that's whitelisted.
     * 
     * @param cidr
     *        The IPv4 CIDR that's whitelisted.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * The IPv4 CIDR that's whitelisted.
     * 
     * @return The IPv4 CIDR that's whitelisted.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * The IPv4 CIDR that's whitelisted.
     * 
     * @param cidr
     *        The IPv4 CIDR that's whitelisted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputWhitelistRule withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputWhitelistRule == false)
            return false;
        InputWhitelistRule other = (InputWhitelistRule) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public InputWhitelistRule clone() {
        try {
            return (InputWhitelistRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputWhitelistRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
