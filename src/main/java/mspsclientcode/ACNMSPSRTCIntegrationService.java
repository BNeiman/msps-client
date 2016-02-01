package mspsclientcode;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "ACNMSPS_RTC_IntegrationService", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://adtppmintgpt01.accenture.com/ACN_MSPS-RTC_Integration/ACNMSPS_RTC_IntegrationService.svc?wsdl")
public class ACNMSPSRTCIntegrationService
    extends Service
{

    private final static URL ACNMSPSRTCINTEGRATIONSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(mspsclientcode.ACNMSPSRTCIntegrationService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = mspsclientcode.ACNMSPSRTCIntegrationService.class.getResource(".");
            url = new URL(baseUrl, "https://adtppmintgpt01.accenture.com/ACN_MSPS-RTC_Integration/ACNMSPS_RTC_IntegrationService.svc?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://adtppmintgpt01.accenture.com/ACN_MSPS-RTC_Integration/ACNMSPS_RTC_IntegrationService.svc?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ACNMSPSRTCINTEGRATIONSERVICE_WSDL_LOCATION = url;
    }

    public ACNMSPSRTCIntegrationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ACNMSPSRTCIntegrationService() {
        super(ACNMSPSRTCINTEGRATIONSERVICE_WSDL_LOCATION, new QName("http://tempuri.org/", "ACNMSPS_RTC_IntegrationService"));
    }

    /**
     * 
     * @return
     *     returns IACNMSPSRTCIntegrationService
     */
    @WebEndpoint(name = "WSHttpBinding_IACNMSPS_RTC_IntegrationService")
    public IACNMSPSRTCIntegrationService getWSHttpBindingIACNMSPSRTCIntegrationService() {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_IACNMSPS_RTC_IntegrationService"), IACNMSPSRTCIntegrationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IACNMSPSRTCIntegrationService
     */
    @WebEndpoint(name = "WSHttpBinding_IACNMSPS_RTC_IntegrationService")
    public IACNMSPSRTCIntegrationService getWSHttpBindingIACNMSPSRTCIntegrationService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "WSHttpBinding_IACNMSPS_RTC_IntegrationService"), IACNMSPSRTCIntegrationService.class, features);
    }

}
