package mspsclientcode;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
//import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "IACNMSPS_RTC_IntegrationService", targetNamespace = "http://tempuri.org/")
//@XmlSeeAlso({
//    ObjectFactory.class
//})
public interface IACNMSPSRTCIntegrationService {


    /**
     * 
     * @param templateName
     * @param summary
     * @param estimatedEffort
     * @param businessArea
     * @param rtcWorkRequestURL
     * @param projectManager
     * @param estimatedStartDate
     * @param clientName
     * @param psInstanceURL
     * @param rtcWorkRequestType
     * @param rtcWorkRequestID
     * @param applicationName
     * @param estimatedFinishDate
     * @return
     *     returns ACNServiceResponse
     */
    @WebMethod(operationName = "ACNCreateWorkPlanFromTemplate", action = "http://tempuri.org/IACNMSPS_RTC_IntegrationService/ACNCreateWorkPlanFromTemplate")
    @WebResult(name = "ACNCreateWorkPlanFromTemplateResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ACNCreateWorkPlanFromTemplate", targetNamespace = "http://tempuri.org/", className= "mspsclientcode.ACNCreateWorkPlanFromTemplate")
    @ResponseWrapper(localName = "ACNCreateWorkPlanFromTemplateResponse", targetNamespace = "http://tempuri.org/", className = "mspsclientcode.ACNCreateWorkPlanFromTemplateResponse")
    public ACNServiceResponse acnCreateWorkPlanFromTemplate(
        @WebParam(name = "psInstanceURL", targetNamespace = "http://tempuri.org/")
        String psInstanceURL,
        @WebParam(name = "rtcWorkRequestID", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestID,
        @WebParam(name = "rtcWorkRequestURL", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestURL,
        @WebParam(name = "rtcWorkRequestType", targetNamespace = "http://tempuri.org/")
        Short rtcWorkRequestType,
        @WebParam(name = "summary", targetNamespace = "http://tempuri.org/")
        String summary,
        @WebParam(name = "templateName", targetNamespace = "http://tempuri.org/")
        String templateName,
        @WebParam(name = "projectManager", targetNamespace = "http://tempuri.org/")
        String projectManager,
        @WebParam(name = "estimatedStartDate", targetNamespace = "http://tempuri.org/")
        String estimatedStartDate,
        @WebParam(name = "estimatedFinishDate", targetNamespace = "http://tempuri.org/")
        String estimatedFinishDate,
        @WebParam(name = "estimatedEffort", targetNamespace = "http://tempuri.org/")
        Double estimatedEffort,
        @WebParam(name = "clientName", targetNamespace = "http://tempuri.org/")
        String clientName,
        @WebParam(name = "businessArea", targetNamespace = "http://tempuri.org/")
        String businessArea,
        @WebParam(name = "applicationName", targetNamespace = "http://tempuri.org/")
        String applicationName);

    /**
     * 
     * @param templateName
     * @param summary
     * @param estimatedEffort
     * @param rtcWorkRequestRelease
     * @param businessArea
     * @param rtcWorkRequestURL
     * @param rtcWorkRequestState
     * @param projectManager
     * @param estimatedStartDate
     * @param clientName
     * @param psInstanceURL
     * @param rtcWorkRequestType
     * @param rtcWorkRequestID
     * @param applicationName
     * @param estimatedFinishDate
     * @return
     *     returns ACNServiceResponse
     */
    @WebMethod(operationName = "ACNCreateWorkPlanFromTemplateWithWRState", action = "http://tempuri.org/IACNMSPS_RTC_IntegrationService/ACNCreateWorkPlanFromTemplateWithWRState")
    @WebResult(name = "ACNCreateWorkPlanFromTemplateWithWRStateResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ACNCreateWorkPlanFromTemplateWithWRState", targetNamespace = "http://tempuri.org/", className = "mspsclientcode.ACNCreateWorkPlanFromTemplateWithWRState")
    @ResponseWrapper(localName = "ACNCreateWorkPlanFromTemplateWithWRStateResponse", targetNamespace = "http://tempuri.org/", className = "mspsclientcode.ACNCreateWorkPlanFromTemplateWithWRStateResponse")
    public ACNServiceResponse acnCreateWorkPlanFromTemplateWithWRState(
        @WebParam(name = "psInstanceURL", targetNamespace = "http://tempuri.org/")
        String psInstanceURL,
        @WebParam(name = "rtcWorkRequestID", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestID,
        @WebParam(name = "rtcWorkRequestURL", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestURL,
        @WebParam(name = "rtcWorkRequestType", targetNamespace = "http://tempuri.org/")
        Short rtcWorkRequestType,
        @WebParam(name = "rtcWorkRequestRelease", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestRelease,
        @WebParam(name = "rtcWorkRequestState", targetNamespace = "http://tempuri.org/")
        Short rtcWorkRequestState,
        @WebParam(name = "summary", targetNamespace = "http://tempuri.org/")
        String summary,
        @WebParam(name = "templateName", targetNamespace = "http://tempuri.org/")
        String templateName,
        @WebParam(name = "projectManager", targetNamespace = "http://tempuri.org/")
        String projectManager,
        @WebParam(name = "estimatedStartDate", targetNamespace = "http://tempuri.org/")
        String estimatedStartDate,
        @WebParam(name = "estimatedFinishDate", targetNamespace = "http://tempuri.org/")
        String estimatedFinishDate,
        @WebParam(name = "estimatedEffort", targetNamespace = "http://tempuri.org/")
        Double estimatedEffort,
        @WebParam(name = "clientName", targetNamespace = "http://tempuri.org/")
        String clientName,
        @WebParam(name = "businessArea", targetNamespace = "http://tempuri.org/")
        String businessArea,
        @WebParam(name = "applicationName", targetNamespace = "http://tempuri.org/")
        String applicationName);

    /**
     * 
     * @param workPlanName
     * @param summary
     * @param estimatedEffort
     * @param assignedTo
     * @param businessArea
     * @param rtcWorkRequestURL
     * @param projectManager
     * @param estimatedStartDate
     * @param clientName
     * @param psInstanceURL
     * @param rtcWorkRequestType
     * @param rtcWorkRequestID
     * @param applicationName
     * @param estimatedFinishDate
     * @return
     *     returns ACNServiceResponse
     */
    @WebMethod(operationName = "ACNAddTasksToWorkPlan", action = "http://tempuri.org/IACNMSPS_RTC_IntegrationService/ACNAddTasksToWorkPlan")
    @WebResult(name = "ACNAddTasksToWorkPlanResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ACNAddTasksToWorkPlan", targetNamespace = "http://tempuri.org/", className = "mspsclientcode.ACNAddTasksToWorkPlan")
    @ResponseWrapper(localName = "ACNAddTasksToWorkPlanResponse", targetNamespace = "http://tempuri.org/", className = "mspsclientcode.ACNAddTasksToWorkPlanResponse")
    public ACNServiceResponse acnAddTasksToWorkPlan(
        @WebParam(name = "PSInstanceURL", targetNamespace = "http://tempuri.org/")
        String psInstanceURL,
        @WebParam(name = "rtcWorkRequestID", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestID,
        @WebParam(name = "rtcWorkRequestURL", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestURL,
        @WebParam(name = "rtcWorkRequestType", targetNamespace = "http://tempuri.org/")
        Short rtcWorkRequestType,
        @WebParam(name = "summary", targetNamespace = "http://tempuri.org/")
        String summary,
        @WebParam(name = "workPlanName", targetNamespace = "http://tempuri.org/")
        String workPlanName,
        @WebParam(name = "projectManager", targetNamespace = "http://tempuri.org/")
        String projectManager,
        @WebParam(name = "assignedTo", targetNamespace = "http://tempuri.org/")
        String assignedTo,
        @WebParam(name = "estimatedStartDate", targetNamespace = "http://tempuri.org/")
        String estimatedStartDate,
        @WebParam(name = "estimatedFinishDate", targetNamespace = "http://tempuri.org/")
        String estimatedFinishDate,
        @WebParam(name = "estimatedEffort", targetNamespace = "http://tempuri.org/")
        Double estimatedEffort,
        @WebParam(name = "clientName", targetNamespace = "http://tempuri.org/")
        String clientName,
        @WebParam(name = "businessArea", targetNamespace = "http://tempuri.org/")
        String businessArea,
        @WebParam(name = "applicationName", targetNamespace = "http://tempuri.org/")
        String applicationName);

    /**
     * 
     * @param workPlanName
     * @param summary
     * @param estimatedEffort
     * @param assignedTo
     * @param rtcWorkRequestRelease
     * @param businessArea
     * @param rtcWorkRequestURL
     * @param rtcWorkRequestState
     * @param projectManager
     * @param estimatedStartDate
     * @param clientName
     * @param psInstanceURL
     * @param rtcWorkRequestType
     * @param rtcWorkRequestID
     * @param applicationName
     * @param estimatedFinishDate
     * @return
     *     returns ACNServiceResponse
     */
    @WebMethod(operationName = "ACNAddTasksToWorkPlanWithWRState", action = "http://tempuri.org/IACNMSPS_RTC_IntegrationService/ACNAddTasksToWorkPlanWithWRState")
    @WebResult(name = "ACNAddTasksToWorkPlanWithWRStateResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ACNAddTasksToWorkPlanWithWRState", targetNamespace = "http://tempuri.org/", className = "mspsclientcode.ACNAddTasksToWorkPlanWithWRState")
    @ResponseWrapper(localName = "ACNAddTasksToWorkPlanWithWRStateResponse", targetNamespace = "http://tempuri.org/", className = "mspsclientcode.ACNAddTasksToWorkPlanWithWRStateResponse")
    public ACNServiceResponse acnAddTasksToWorkPlanWithWRState(
        @WebParam(name = "PSInstanceURL", targetNamespace = "http://tempuri.org/")
        String psInstanceURL,
        @WebParam(name = "rtcWorkRequestID", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestID,
        @WebParam(name = "rtcWorkRequestURL", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestURL,
        @WebParam(name = "rtcWorkRequestType", targetNamespace = "http://tempuri.org/")
        Short rtcWorkRequestType,
        @WebParam(name = "rtcWorkRequestRelease", targetNamespace = "http://tempuri.org/")
        String rtcWorkRequestRelease,
        @WebParam(name = "rtcWorkRequestState", targetNamespace = "http://tempuri.org/")
        Short rtcWorkRequestState,
        @WebParam(name = "summary", targetNamespace = "http://tempuri.org/")
        String summary,
        @WebParam(name = "workPlanName", targetNamespace = "http://tempuri.org/")
        String workPlanName,
        @WebParam(name = "projectManager", targetNamespace = "http://tempuri.org/")
        String projectManager,
        @WebParam(name = "assignedTo", targetNamespace = "http://tempuri.org/")
        String assignedTo,
        @WebParam(name = "estimatedStartDate", targetNamespace = "http://tempuri.org/")
        String estimatedStartDate,
        @WebParam(name = "estimatedFinishDate", targetNamespace = "http://tempuri.org/")
        String estimatedFinishDate,
        @WebParam(name = "estimatedEffort", targetNamespace = "http://tempuri.org/")
        Double estimatedEffort,
        @WebParam(name = "clientName", targetNamespace = "http://tempuri.org/")
        String clientName,
        @WebParam(name = "businessArea", targetNamespace = "http://tempuri.org/")
        String businessArea,
        @WebParam(name = "applicationName", targetNamespace = "http://tempuri.org/")
        String applicationName);

    /**
     * 
     * @param requestURL
     * @param requestState
     * @param priority
     * @param workPlanName
     * @param templateName
     * @param summary
     * @param estimatedEffort
     * @param requestType
     * @param requestID
     * @param businessArea
     * @param projectManager
     * @param estimatedStartDate
     * @param clientName
     * @param psInstanceURL
     * @param requestRelease
     * @param applicationName
     * @param estimatedFinishDate
     * @return
     *     returns ACNServiceResponse
     */
    @WebMethod(operationName = "ACNAddWBSToWorkPlan", action = "http://tempuri.org/IACNMSPS_RTC_IntegrationService/ACNAddWBSToWorkPlan")
    @WebResult(name = "ACNAddWBSToWorkPlanResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ACNAddWBSToWorkPlan", targetNamespace = "http://tempuri.org/", className = "mspsclientcode.ACNAddWBSToWorkPlan")
    @ResponseWrapper(localName = "ACNAddWBSToWorkPlanResponse", targetNamespace = "http://tempuri.org/", className = "mspsclientcode.ACNAddWBSToWorkPlanResponse")
    public ACNServiceResponse acnAddWBSToWorkPlan(
        @WebParam(name = "PSInstanceURL", targetNamespace = "http://tempuri.org/")
        String psInstanceURL,
        @WebParam(name = "requestID", targetNamespace = "http://tempuri.org/")
        String requestID,
        @WebParam(name = "requestURL", targetNamespace = "http://tempuri.org/")
        String requestURL,
        @WebParam(name = "requestType", targetNamespace = "http://tempuri.org/")
        Short requestType,
        @WebParam(name = "requestRelease", targetNamespace = "http://tempuri.org/")
        String requestRelease,
        @WebParam(name = "requestState", targetNamespace = "http://tempuri.org/")
        Byte requestState,
        @WebParam(name = "summary", targetNamespace = "http://tempuri.org/")
        String summary,
        @WebParam(name = "workPlanName", targetNamespace = "http://tempuri.org/")
        String workPlanName,
        @WebParam(name = "templateName", targetNamespace = "http://tempuri.org/")
        String templateName,
        @WebParam(name = "projectManager", targetNamespace = "http://tempuri.org/")
        String projectManager,
        @WebParam(name = "estimatedStartDate", targetNamespace = "http://tempuri.org/")
        String estimatedStartDate,
        @WebParam(name = "estimatedFinishDate", targetNamespace = "http://tempuri.org/")
        String estimatedFinishDate,
        @WebParam(name = "estimatedEffort", targetNamespace = "http://tempuri.org/")
        Double estimatedEffort,
        @WebParam(name = "clientName", targetNamespace = "http://tempuri.org/")
        String clientName,
        @WebParam(name = "businessArea", targetNamespace = "http://tempuri.org/")
        String businessArea,
        @WebParam(name = "applicationName", targetNamespace = "http://tempuri.org/")
        String applicationName,
        @WebParam(name = "priority", targetNamespace = "http://tempuri.org/")
        String priority);

}
