//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.11 at 04:38:10 AM PDT 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ServiceTypeMappingConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceTypeMappingConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="package-map" type="{http://www.ebayopensource.org/turmeric/common/config}PackageMapConfig"/>
 *         &lt;element name="operation-list" type="{http://www.ebayopensource.org/turmeric/common/config}OperationListConfig"/>
 *         &lt;element name="java-type-list" type="{http://www.ebayopensource.org/turmeric/common/config}JavaTypeListConfig"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="enable-namespace-folding" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTypeMappingConfig", propOrder = {
    "packageMap",
    "operationList",
    "javaTypeList"
})
public class ServiceTypeMappingConfig {

    @XmlElement(name = "package-map", required = true)
    protected PackageMapConfig packageMap;
    @XmlElement(name = "operation-list", required = true)
    protected OperationListConfig operationList;
    @XmlElement(name = "java-type-list", required = true)
    protected JavaTypeListConfig javaTypeList;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlAttribute(name = "enable-namespace-folding")
    protected Boolean enableNamespaceFolding;

    /**
     * Gets the value of the packageMap property.
     * 
     * @return
     *     possible object is
     *     {@link PackageMapConfig }
     *     
     */
    public PackageMapConfig getPackageMap() {
        return packageMap;
    }

    /**
     * Sets the value of the packageMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageMapConfig }
     *     
     */
    public void setPackageMap(PackageMapConfig value) {
        this.packageMap = value;
    }

    /**
     * Gets the value of the operationList property.
     * 
     * @return
     *     possible object is
     *     {@link OperationListConfig }
     *     
     */
    public OperationListConfig getOperationList() {
        return operationList;
    }

    /**
     * Sets the value of the operationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationListConfig }
     *     
     */
    public void setOperationList(OperationListConfig value) {
        this.operationList = value;
    }

    /**
     * Gets the value of the javaTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link JavaTypeListConfig }
     *     
     */
    public JavaTypeListConfig getJavaTypeList() {
        return javaTypeList;
    }

    /**
     * Sets the value of the javaTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JavaTypeListConfig }
     *     
     */
    public void setJavaTypeList(JavaTypeListConfig value) {
        this.javaTypeList = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the enableNamespaceFolding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableNamespaceFolding() {
        return enableNamespaceFolding;
    }

    /**
     * Sets the value of the enableNamespaceFolding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableNamespaceFolding(Boolean value) {
        this.enableNamespaceFolding = value;
    }

}
