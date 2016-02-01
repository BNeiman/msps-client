package dao;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Properties;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.soap.AddressingFeature;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import mspsclientcode.ACNMSPSRTCIntegrationService;
import mspsclientcode.ACNServiceResponse;
import mspsclientcode.IACNMSPSRTCIntegrationService;
import entities.AddTaskRequest;
import entities.AddTaskResponse;
import utilities.CommonHandler;
import utilities.NTLMAuthenticator;

public class AddTaskDAOImpl implements IAddTaskDAO {

	private static Log log = LogFactory.getLog(AddTaskDAOImpl.class);
	
	public AddTaskResponse addTask(
			AddTaskRequest addTaskRequest , String projectAreaNameUUID ) {

		// Get auth parameters from properties file
		Properties properties = new Properties();
		AddTaskResponse response = new AddTaskResponse();
		
		try {
			
			log.info("Reading configuration file to connect to MSPS......");
			// projectAreaContextID = projectAreaContextID.replace(" ", "_");
			properties.load(new FileInputStream("c:\\temp\\rtc-msps.properties"));	
			String mspsServiceURL;// = properties.getProperty("msps.url");
			String mspsUsername;//= properties.getProperty("msps.username");
			String mspsPassword;// = properties.getProperty("msps.password");
		    mspsServiceURL = properties.getProperty("msps.url."+projectAreaNameUUID);
			mspsUsername = properties.getProperty("msps.username."+projectAreaNameUUID);
			mspsPassword = properties.getProperty("msps.password."+projectAreaNameUUID);
			 if (
				 mspsServiceURL == null || mspsUsername==null || mspsPassword ==null ){
				 mspsServiceURL = properties.getProperty("msps.url");
				 mspsUsername = properties.getProperty("msps.username");
				 mspsPassword = properties.getProperty("msps.password");
			 }
			//Decode Base 64 Encoded PW
			mspsPassword = CommonHandler.decode(mspsPassword);
			
			log.info("WSDL URL "+mspsServiceURL);
			log.info("WSDL Username "+mspsUsername);
			log.info("WSDL Decoded Password "+mspsPassword);
			
			
			// prepare the parameters to be passed & call the operation
			
			log.info("***********************Forming Add Task Request***********************");					
			
			log.info("ApplicationName........." + addTaskRequest.getApplicationName());
			log.info("AssignedTo........." + addTaskRequest.getAssignedTo());	
			log.info("Summary........." + addTaskRequest.getSummary());				
			log.info("BusinessArea........." + addTaskRequest.getBusinessArea());
			log.info("ClientName........." + addTaskRequest.getClientName());
			log.info("InstanceURL........." + addTaskRequest.getPSInstanceURL());		
			log.info("MSPSServiceName........." + addTaskRequest.getMSPSServiceName());				
			log.info("ProjectManager........." + addTaskRequest.getProjectManager());				
			log.info("EstimatedEffort........." + addTaskRequest.getEstimatedEffort());
			log.info("EstimatedFinishDate........." + addTaskRequest.getEstimatedFinishDate());
			log.info("EstimatedStartDate........." + addTaskRequest.getEstimatedStartDate());			
			log.info("WorkRequestID........." + addTaskRequest.getRtcWorkRequestID());				
			log.info("WorkRequestType........." + addTaskRequest.getRtcWorkRequestType());				
			log.info("WorkRequestURL........." + addTaskRequest.getRtcWorkRequestURL());				
			log.info("WorkPlanName........." + addTaskRequest.getWorkPlanName());				
		
			//========================= BASIC AUTH ======================================================
			String authString = mspsUsername + ":" + mspsPassword;
			log.info("Auth String ........." + authString);
			byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());			
			String authStringEnc = new String(authEncBytes);
			log.info("Auth String Encoded........." + authStringEnc);
			//--------------------------------------------------------------------------------------------
			
			URL url;
			url = new URL(mspsServiceURL);			
			// set up an authenticator to be used
			NTLMAuthenticator myAuth = new NTLMAuthenticator(mspsUsername, mspsPassword);  
			Authenticator.setDefault(myAuth);
			
			//-------------------------------
//			URL test_url = new URL(mspsServiceURL);
//			URLConnection urlConnection = test_url.openConnection();
//			urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
//	        InputStream ins = urlConnection.getInputStream();
//	        BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
//	        String str;
//	        while((str = reader.readLine()) != null)
//	        	log.info(str);
	        //-------------------------------
			
			// create a service
	        QName serviceName = new QName("http://tempuri.org/",addTaskRequest.getMSPSServiceName());
	        
			ACNMSPSRTCIntegrationService service = new ACNMSPSRTCIntegrationService(url, serviceName);			
			// create an addressing feature
			WebServiceFeature[] enabledRequiredwsf = {new AddressingFeature(true, true)};
			// fetch a port type by providing addressing feature
			IACNMSPSRTCIntegrationService portType = service.getWSHttpBindingIACNMSPSRTCIntegrationService(enabledRequiredwsf);
			
			// enable soap action to be used so that addressing feature works
			BindingProvider bp = (BindingProvider)portType;
			
			bp.getRequestContext().put(BindingProvider.SOAPACTION_USE_PROPERTY, true);
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, mspsServiceURL);
			
			//Override default BindingProvide information
            Map<String, Object> map = bp.getRequestContext();
			
            map.put(BindingProvider.USERNAME_PROPERTY, mspsUsername);
            map.put(BindingProvider.PASSWORD_PROPERTY, mspsPassword); 
			
			
			log.info("Calling MSPS add task service......");		
			
			long start = System.currentTimeMillis();
						
			ACNServiceResponse serviceResponse = portType.acnAddTasksToWorkPlanWithWRState(addTaskRequest.getPSInstanceURL(), addTaskRequest.getRtcWorkRequestID(), addTaskRequest.getRtcWorkRequestURL(), addTaskRequest.getRtcWorkRequestType(), addTaskRequest.getRtcWorkRequestRelease(), addTaskRequest.getRtcWorkRequestState(), addTaskRequest.getSummary(), addTaskRequest.getWorkPlanName(), addTaskRequest.getProjectManager(), addTaskRequest.getAssignedTo(), addTaskRequest.getEstimatedStartDate(), addTaskRequest.getEstimatedFinishDate(), addTaskRequest.getEstimatedEffort(), addTaskRequest.getClientName(), addTaskRequest.getBusinessArea(), addTaskRequest.getApplicationName());

			long end = System.currentTimeMillis();		
			
			log.info("Time taken for add task in s......." + (end-start)/1000);			
			
			//response.setStatusCode(serviceResponse.getStatusCode());
			response.setStatusMessage(serviceResponse.getStatusMessage().getValue());		
			response.setSummaryTaskName(serviceResponse.getSummaryTaskName().getValue());
			response.setSummaryTaskGUID(serviceResponse.getSummaryTaskGuid().getValue());
			response.setWorkPlanGUID(serviceResponse.getWorkPlanGuid().getValue());
			response.setWorkPlanURL(serviceResponse.getWorkPlanUrl().getValue());
			response.setWorkPlanName(serviceResponse.getWorkPlanName().getValue());
			
			log.info("***********************Getting Add Task Response***********************");					
			log.info("StatusCode........." + response.getStatusCode());
			log.info("StatusMessage........." + response.getStatusMessage());
			log.info("StatusCode........." + response.getStatusCodeDesc());
			log.info("WorkPlanGUID........." + response.getWorkPlanGUID());
			log.info("WorkPlanURL........." + response.getWorkPlanURL());
			log.info("WorkPlanName........." + response.getWorkPlanName());
			log.info("SummaryTaskName........." + response.getSummaryTaskName());
			log.info("SummaryTaskUID........." + response.getSummaryTaskGUID());
			
		
		} catch (Exception e) {
			log.info("Error in getting Response : Check the Connectivity for MSPS Service.");
			e.printStackTrace();
		} 	
		
		return response;
	}
}
