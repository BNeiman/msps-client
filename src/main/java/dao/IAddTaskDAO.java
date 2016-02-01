package dao;
import entities.AddTaskRequest;
import entities.AddTaskResponse;

public interface IAddTaskDAO {
	// method to call add task web service
	public AddTaskResponse addTask(AddTaskRequest addTaskRequest, String projectAreaName);

}
