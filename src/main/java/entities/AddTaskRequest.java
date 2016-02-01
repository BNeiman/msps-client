package entities;

public class AddTaskRequest {

	private String PSInstanceURL;
	private String rtcWorkRequestID;
	private String rtcWorkRequestURL;
	private Short rtcWorkRequestType;
	private String summary;
	private String rtcWorkRequestRelease;
	private Short rtcWorkRequestState;
	private String workPlanName;
	private String projectManager;
	private String assignedTo;
	private String estimatedStartDate;
	private String estimatedFinishDate;
	private Double estimatedEffort;
	private String clientName;
	private String businessArea;
	private String applicationName;
	private String mspsServiceName;

	// Gets the MSPS Instance URL
	public String getPSInstanceURL() {
		return PSInstanceURL;
	}

	// Sets the MSPS Instance URL
	public void setPSInstanceURL(String pSInstanceURL) {
		PSInstanceURL = pSInstanceURL;
	}

	// Gets the RTC WorkRequestID
	public String getRtcWorkRequestID() {
		return rtcWorkRequestID;
	}

	// Sets the RTC WorkRequestID
	public void setRtcWorkRequestID(String rtcWorkRequestID) {
		this.rtcWorkRequestID = rtcWorkRequestID;
	}

	// Gets the RTC WorkRequest URL
	public String getRtcWorkRequestURL() {
		return rtcWorkRequestURL;
	}

	// Sets the RTC WorkRequest URL
	public void setRtcWorkRequestURL(String rtcWorkRequestURL) {
		this.rtcWorkRequestURL = rtcWorkRequestURL;
	}

	// Gets the RTC WorkRequestType
	public Short getRtcWorkRequestType() {
		return rtcWorkRequestType;
	}

	// Sets the RTC WorkRequestType
	public void setRtcWorkRequestType(Short rtcWorkRequestType) {
		this.rtcWorkRequestType = rtcWorkRequestType;
	}

	// Gets the RTC WorkRequestRelease
	public String getRtcWorkRequestRelease() {
		return rtcWorkRequestRelease;
	}

	// Sets the RTC WorkRequestRelease
	public void setRtcWorkRequestRelease(String rtcWorkRequestRelease) {
		this.rtcWorkRequestRelease = rtcWorkRequestRelease;
	}

	// Gets the RTC WorkRequestState
	public Short getRtcWorkRequestState() {
		return rtcWorkRequestState;
	}

	// Sets the RTC WorkRequestState
	public void setRtcWorkRequestState(Short rtcWorkRequestState) {
		this.rtcWorkRequestState = rtcWorkRequestState;
	}

	// Gets the RTC Summary
	public String getSummary() {
		return summary;
	}

	// Sets the RTC Summary
	public void setSummary(String summary) {
		this.summary = summary;
	}

	// Gets the RTC WorkPlanName
	public String getWorkPlanName() {
		return workPlanName;
	}

	// Sets the RTC WorkPlanName
	public void setWorkPlanName(String workPlanName) {
		this.workPlanName = workPlanName;
	}

	// Gets the Project Manager
	public String getProjectManager() {
		return projectManager;
	}

	// Sets the Project Manager
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	// Gets the Assigned To for the task
	public String getAssignedTo() {
		return assignedTo;
	}

	// Sets the Assigned To for the task
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	// Gets the Estimated Start Date for the task
	public String getEstimatedStartDate() {
		return estimatedStartDate;
	}

	// Sets the Estimated Start Date for the task
	public void setEstimatedStartDate(String estimatedStartDate) {
		this.estimatedStartDate = estimatedStartDate;
	}

	// Gets the Estimated Finish Date for the task
	public String getEstimatedFinishDate() {
		return estimatedFinishDate;
	}

	// Gets the Estimated Finish Date for the task
	public void setEstimatedFinishDate(String estimatedFinishDate) {
		this.estimatedFinishDate = estimatedFinishDate;
	}

	// Gets the Estimated Effort for the task
	public Double getEstimatedEffort() {
		return estimatedEffort;
	}

	// Sets the Estimated Effort for the task
	public void setEstimatedEffort(Double d) {
		this.estimatedEffort = d;
	}

	// Sets the Estimated Effort for the task
	@Deprecated
	public void setEstimatedEffort(Integer d) {
		this.estimatedEffort = d.doubleValue();
	}

	// Gets the Client name
	public String getClientName() {
		return clientName;
	}

	// Sets the Client name
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	// Gets the Business area
	public String getBusinessArea() {
		return businessArea;
	}

	// Sets the Business area
	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	// Gets the Application name
	public String getApplicationName() {
		return applicationName;
	}

	// Sets the Application name
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	// Gets the MSPS service name
	public String getMSPSServiceName() {
		return mspsServiceName;
	}

	// Sets the MSPS service name
	public void setMSPSServiceName(String mspsServiceName) {
		this.mspsServiceName = mspsServiceName;
	}
}
