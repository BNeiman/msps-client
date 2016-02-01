package entities;

public class AddTaskResponse {

	private String workPlanURL;
	private String workPlanGUID;
	private String summaryTaskName;
	private String summaryTaskGUID;
	private short statusCode;
	private String statusMessage;
	private String workPlanName;
	
	// Gets the WorkPlanURL	
	public String getWorkPlanURL() {
		return workPlanURL;
	}
	// Sets the WorkPlanURL	
	public void setWorkPlanURL(String workPlanURL) {
		this.workPlanURL = workPlanURL;
	}
	// Gets the WorkPlanGUID	
	public String getWorkPlanGUID() {
		return workPlanGUID;
	}
	// Sets the WorkPlanGUID	
	public void setWorkPlanGUID(String workPlanGUID) {
		this.workPlanGUID = workPlanGUID;
	}
	// Gets the Summary Task Name	
	public String getSummaryTaskName() {
		return summaryTaskName;
	}
	// Sets the Summary Task Name	
	public void setSummaryTaskName(String summaryTaskName) {
		this.summaryTaskName = summaryTaskName;
	}
	// Gets the Summary Task GUID	
	public String getSummaryTaskGUID() {
		return summaryTaskGUID;
	}
	// Sets the Summary Task GUID	
	public void setSummaryTaskGUID(String summaryTaskGUID) {
		this.summaryTaskGUID = summaryTaskGUID;
	}
	// Gets the Status code	
	public short getStatusCode() {
		return statusCode;
	}
	// Sets the Status code	
	public void setStatusCode(short statusCode) {
		this.statusCode = statusCode;
	}
	// Gets the Status code	
	public String getStatusCodeDesc() {
		String statusCodeDesc;
		switch(statusCode){
			case 0: statusCodeDesc ="Task created and published.";
			break;
			case 1: statusCodeDesc ="The tasks are not created due to a system failure (PSI connection, command timeout, etc.)";
			break;
			case 2: statusCodeDesc ="The work plan is not created. The configuration file is missing.";
			break;
			case 3: statusCodeDesc ="The tasks are not created. One or more required input values are not provided by RTC.";
			break;
			case 4: statusCodeDesc ="The tasks are created and published, but they are not updated due to a system failure (PSI connection, command timeout, queue timeout, etc.). ";
			break;
			case 5: statusCodeDesc ="The tasks are created, but the publishing and update failed due to a system failure PSI connection, command timeout, queue timeout, etc.).";
			break;
			case 6: statusCodeDesc ="The tasks are created and fully or partially updated, but publishing failed due to a system failure PSI connection, command timeout, queue timeout, etc.).";
			break;
			case 9: statusCodeDesc ="The tasks are not created. The work plan with the name composed of data passed by RTC does not exist on PS instance.";
			break;
			case 10: statusCodeDesc ="The tasks are not created. The work plan with the name composed of data passed by RTC is checked out by another user.";
			break;
			default: statusCodeDesc ="MSPS Code Unknown = " + String.valueOf(statusCode); 
			break;
		}
		
		return statusCodeDesc;
	}	
	// Gets the Status message		
	public String getStatusMessage() {
		return statusMessage;
	}
	// Sets the Status message	
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}	
	// Gets the WorkPlan Name	
	public String getWorkPlanName() {
		return workPlanName;
	}
	// Sets the WorkPlan Name	
	public void setWorkPlanName(String workPlanName) {
		this.workPlanName = workPlanName;
	}	

}
