package roosevelt.claims.xml.claim;
 
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "NameType", namespace = "http://www.example.com/v2")
public class ClaimXML {
 
    public ClaimXML() {
    }
 
    public void buildElement() {

        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
 
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.example.com/v2", "name"));

        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
 
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
    }
}
