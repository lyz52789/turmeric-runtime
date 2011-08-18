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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CachePolicyConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CachePolicyConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cache-provider-class-name" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="disable-cache-on-local" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="skip-cache-on-error" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CachePolicyConfig", propOrder = {
    "cacheProviderClassName",
    "disableCacheOnLocal",
    "skipCacheOnError"
})
public class CachePolicyConfig {

    @XmlElement(name = "cache-provider-class-name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cacheProviderClassName;
    @XmlElement(name = "disable-cache-on-local")
    protected Boolean disableCacheOnLocal;
    @XmlElement(name = "skip-cache-on-error")
    protected Boolean skipCacheOnError;

    /**
     * Gets the value of the cacheProviderClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheProviderClassName() {
        return cacheProviderClassName;
    }

    /**
     * Sets the value of the cacheProviderClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheProviderClassName(String value) {
        this.cacheProviderClassName = value;
    }

    /**
     * Gets the value of the disableCacheOnLocal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableCacheOnLocal() {
        return disableCacheOnLocal;
    }

    /**
     * Sets the value of the disableCacheOnLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableCacheOnLocal(Boolean value) {
        this.disableCacheOnLocal = value;
    }

    /**
     * Gets the value of the skipCacheOnError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipCacheOnError() {
        return skipCacheOnError;
    }

    /**
     * Sets the value of the skipCacheOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipCacheOnError(Boolean value) {
        this.skipCacheOnError = value;
    }

}
