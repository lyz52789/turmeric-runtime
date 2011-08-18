//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.11 at 04:38:10 AM PDT 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSecurityConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSecurityConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authentication-options" type="{http://www.ebayopensource.org/turmeric/common/config}AuthenticationConfig" minOccurs="0"/>
 *         &lt;element name="authorization-options" type="{http://www.ebayopensource.org/turmeric/common/config}AuthorizationConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSecurityConfig", propOrder = {
    "authenticationOptions",
    "authorizationOptions"
})
public class ServiceSecurityConfig {

    @XmlElement(name = "authentication-options")
    protected AuthenticationConfig authenticationOptions;
    @XmlElement(name = "authorization-options")
    protected AuthorizationConfig authorizationOptions;

    /**
     * Gets the value of the authenticationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationConfig }
     *     
     */
    public AuthenticationConfig getAuthenticationOptions() {
        return authenticationOptions;
    }

    /**
     * Sets the value of the authenticationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationConfig }
     *     
     */
    public void setAuthenticationOptions(AuthenticationConfig value) {
        this.authenticationOptions = value;
    }

    /**
     * Gets the value of the authorizationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationConfig }
     *     
     */
    public AuthorizationConfig getAuthorizationOptions() {
        return authorizationOptions;
    }

    /**
     * Sets the value of the authorizationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationConfig }
     *     
     */
    public void setAuthorizationOptions(AuthorizationConfig value) {
        this.authorizationOptions = value;
    }

}
