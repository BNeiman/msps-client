//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.25 at 12:19:24 PM EST 
//


package mspsclientcode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="psInstanceURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtcWorkRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtcWorkRequestURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtcWorkRequestType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="rtcWorkRequestRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rtcWorkRequestState" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedFinishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedEffort" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "psInstanceURL",
    "rtcWorkRequestID",
    "rtcWorkRequestURL",
    "rtcWorkRequestType",
    "rtcWorkRequestRelease",
    "rtcWorkRequestState",
    "summary",
    "templateName",
    "projectManager",
    "estimatedStartDate",
    "estimatedFinishDate",
    "estimatedEffort",
    "clientName",
    "businessArea",
    "applicationName"
})
@XmlRootElement(name = "ACNCreateWorkPlanFromTemplateWithWRState")
public class ACNCreateWorkPlanFromTemplateWithWRState {

    @XmlElementRef(name = "psInstanceURL", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> psInstanceURL;
    @XmlElementRef(name = "rtcWorkRequestID", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtcWorkRequestID;
    @XmlElementRef(name = "rtcWorkRequestURL", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtcWorkRequestURL;
    @XmlSchemaType(name = "unsignedByte")
    protected Short rtcWorkRequestType;
    @XmlElementRef(name = "rtcWorkRequestRelease", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtcWorkRequestRelease;
    @XmlSchemaType(name = "unsignedByte")
    protected Short rtcWorkRequestState;
    @XmlElementRef(name = "summary", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summary;
    @XmlElementRef(name = "templateName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> templateName;
    @XmlElementRef(name = "projectManager", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectManager;
    @XmlElementRef(name = "estimatedStartDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estimatedStartDate;
    @XmlElementRef(name = "estimatedFinishDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estimatedFinishDate;
    protected Double estimatedEffort;
    @XmlElementRef(name = "clientName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientName;
    @XmlElementRef(name = "businessArea", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessArea;
    @XmlElementRef(name = "applicationName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationName;

    /**
     * Gets the value of the psInstanceURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPsInstanceURL() {
        return psInstanceURL;
    }

    /**
     * Sets the value of the psInstanceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPsInstanceURL(JAXBElement<String> value) {
        this.psInstanceURL = value;
    }

    /**
     * Gets the value of the rtcWorkRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRtcWorkRequestID() {
        return rtcWorkRequestID;
    }

    /**
     * Sets the value of the rtcWorkRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRtcWorkRequestID(JAXBElement<String> value) {
        this.rtcWorkRequestID = value;
    }

    /**
     * Gets the value of the rtcWorkRequestURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRtcWorkRequestURL() {
        return rtcWorkRequestURL;
    }

    /**
     * Sets the value of the rtcWorkRequestURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRtcWorkRequestURL(JAXBElement<String> value) {
        this.rtcWorkRequestURL = value;
    }

    /**
     * Gets the value of the rtcWorkRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRtcWorkRequestType() {
        return rtcWorkRequestType;
    }

    /**
     * Sets the value of the rtcWorkRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRtcWorkRequestType(Short value) {
        this.rtcWorkRequestType = value;
    }

    /**
     * Gets the value of the rtcWorkRequestRelease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRtcWorkRequestRelease() {
        return rtcWorkRequestRelease;
    }

    /**
     * Sets the value of the rtcWorkRequestRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRtcWorkRequestRelease(JAXBElement<String> value) {
        this.rtcWorkRequestRelease = value;
    }

    /**
     * Gets the value of the rtcWorkRequestState property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRtcWorkRequestState() {
        return rtcWorkRequestState;
    }

    /**
     * Sets the value of the rtcWorkRequestState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRtcWorkRequestState(Short value) {
        this.rtcWorkRequestState = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummary(JAXBElement<String> value) {
        this.summary = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemplateName(JAXBElement<String> value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the projectManager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectManager() {
        return projectManager;
    }

    /**
     * Sets the value of the projectManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectManager(JAXBElement<String> value) {
        this.projectManager = value;
    }

    /**
     * Gets the value of the estimatedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstimatedStartDate() {
        return estimatedStartDate;
    }

    /**
     * Sets the value of the estimatedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstimatedStartDate(JAXBElement<String> value) {
        this.estimatedStartDate = value;
    }

    /**
     * Gets the value of the estimatedFinishDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstimatedFinishDate() {
        return estimatedFinishDate;
    }

    /**
     * Sets the value of the estimatedFinishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstimatedFinishDate(JAXBElement<String> value) {
        this.estimatedFinishDate = value;
    }

    /**
     * Gets the value of the estimatedEffort property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedEffort() {
        return estimatedEffort;
    }

    /**
     * Sets the value of the estimatedEffort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedEffort(Double value) {
        this.estimatedEffort = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientName(JAXBElement<String> value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the businessArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessArea() {
        return businessArea;
    }

    /**
     * Sets the value of the businessArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessArea(JAXBElement<String> value) {
        this.businessArea = value;
    }

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationName(JAXBElement<String> value) {
        this.applicationName = value;
    }

}
