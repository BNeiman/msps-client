package controller;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.junit.Test;

import entities.AddTaskRequest;
import entities.AddTaskResponse;
import service.AddTaskService;
import java.io.File;

/**
 * @author bruce.a.neiman
 *
 */

public class AddTaskControllerTest {
	
	private static Log log = LogFactory.getLog(AddTaskControllerTest.class);
	private static int returnCode;
	
	
	private static int testAddTask(String TargetName)
	{
		
		log.info("AddTask to Environment........." + TargetName);
		//String TargetName = "ACCMSPS_Delta";
		AddTaskService addTaskService = new AddTaskService();
		
		// Add task request
		AddTaskRequest addTaskRequest = new AddTaskRequest();
		
		String mspsServiceName = "ACNMSPS_RTC_IntegrationService";		
		
		addTaskRequest.setPSInstanceURL("https://adtppmus01ws2013stg.accenture.com/AMT_UAT");
		addTaskRequest.setRtcWorkRequestID("INC700025953478");
		addTaskRequest.setRtcWorkRequestURL("https://itsm.accenture.com/arsys/forms/amrrm6100/SHR:LandingConsole/Default+Administrator+View/?mode=search&amp;F304255500=HPD:Help%20Desk%20Classic&amp;F1000000076=FormOpen&amp;F303647600=SearchTicketWithQual&amp;F304255610=%271000000161%27%3D%22INC700025959667%22");
		addTaskRequest.setRtcWorkRequestType((short) 0);
		addTaskRequest.setSummary("TESTING ONESIE-TWOSIE");
		addTaskRequest.setWorkPlanName("Time by Ticket from ITSM");
		addTaskRequest.setProjectManager("robert.d.rygwalski");
		addTaskRequest.setAssignedTo("robert.d.rygwalski");
		addTaskRequest.setEstimatedStartDate("01/27/2016");
		addTaskRequest.setEstimatedFinishDate("01/27/2016");
		addTaskRequest.setClientName("Accenture");
		addTaskRequest.setBusinessArea("NA");
		addTaskRequest.setApplicationName("NA");
		addTaskRequest.setMSPSServiceName(mspsServiceName);
		addTaskRequest.setRtcWorkRequestRelease("Release 1");
		addTaskRequest.setRtcWorkRequestState((short) 0);
		addTaskRequest.setEstimatedEffort((double) 1);
		
		
		log.info("Forming Add Task Request.........");
		
		AddTaskResponse addTasksResponse = new AddTaskResponse();
		
		try {
			
			addTasksResponse = addTaskService.addTask(addTaskRequest ,TargetName);	
			
			returnCode = addTasksResponse.getStatusCode();
			
		} catch (Exception e) {
			e.printStackTrace();
		}			
		return returnCode;
	}	
	@Test
	public void main() {
				

		//Check if the file used by AddTaskDAOImpl.addTask exists.
		File f = new File("c:\\temp\\rtc-msps.properties");		
		if (f.exists())
		{
			int returnCode = testAddTask("ACCMSPS_ACC_UAT");
			assertEquals(0,returnCode);
		}
		else
		{
			log.error("Config file not found........." + f.getName());
			assertEquals(0,-1);
		}

	}

}
