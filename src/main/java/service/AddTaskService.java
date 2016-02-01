package service;

import dao.AddTaskDAOImpl;
import dao.IAddTaskDAO;
import entities.AddTaskRequest;
import entities.AddTaskResponse;
public class AddTaskService {

	IAddTaskDAO createTaskDAO;
	
	/**
	 * @return the createTaskDAO
	 */
	public IAddTaskDAO getCreateTaskDAO() {
		return createTaskDAO;
	}

	/**
	 * @param createTaskDAO the createTaskDAO to set
	 */
	public void setCreateTaskDAO(
			IAddTaskDAO createTaskDAO) {
		this.createTaskDAO = createTaskDAO;
	}
	
	// Service to call create workplan web service
	public AddTaskResponse addTask(AddTaskRequest addTaskRequest , String projectAreaNameUUID){
		
		AddTaskDAOImpl addTaskDAO = new AddTaskDAOImpl();
		
		AddTaskResponse addTaskResponse = addTaskDAO.addTask(addTaskRequest,projectAreaNameUUID);
				
		return addTaskResponse;
	}
}
