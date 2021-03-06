
package businessLayer.webserviceClients.periodicTable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="GetAtomicNumberResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getAtomicNumberResult"
})
@XmlRootElement(name = "GetAtomicNumberResponse")
public class GetAtomicNumberResponse {

    @XmlElement(name = "GetAtomicNumberResult")
    protected String getAtomicNumberResult;

    /**
     * Gets the value of the getAtomicNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAtomicNumberResult() {
        return getAtomicNumberResult;
    }

    /**
     * Sets the value of the getAtomicNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAtomicNumberResult(String value) {
        this.getAtomicNumberResult = value;
    }

}
