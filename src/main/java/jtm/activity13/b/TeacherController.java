package jtm.activity13.b;

import jtm.activity12.Teacher;
import jtm.activity12.TeacherManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

	/*
	 * TODO Add @Component annotation to TeacherManager class in jtm.activity12
	 * package Add @Autowired annotation to manager field below. Spring will
	 * automatically create TeacherManager object and inject object into manager
	 * field
	 */
	@Autowired
	private TeacherManager manager;

	@GetMapping("/teacher/find/byId")
	public Teacher findTeacher(@RequestParam Integer id) {

		/*
		 * TODO Return Teacher object by Id from Teacher table in database
		 */
		return manager.findTeacher(id);
	}

	/*
	 * TODO set get mapping path to /teacher/find/byName
	 */
	public List<Teacher> findTeacher(@RequestParam String firstName, @RequestParam String lastName) {

		return manager.findTeacher(firstName, lastName);
		/*
		 * TODO Return list of Teacher objects by name and last name from Teacher table
		 * in database
		 */
	}

	/*
	 * TODO set get mapping path to /teacher/add
	 */
	@GetMapping("/teacher/add")
	public StatusResponse insertTeacher(@RequestParam(required = false) Integer id, @RequestParam String firstName,
			@RequestParam String lastName) {
		boolean result;
		if (id == null) {
			result = manager.insertTeacher(firstName, lastName);
		} else {
			Teacher teacher = new Teacher(id, firstName, lastName);
			result = manager.updateTeacher(teacher);
		}
		if (result) {

			StatusResponse positive = new StatusResponse(result, "Sucsess");
			return positive;

		} else {
			StatusResponse negative = new StatusResponse(result, "Failure");

			/*
			 * TODO Insert new Teacher object into database, if ID parameter is not passed
			 * to request ID should be auto-generated Return StatusResponse object. If
			 * teacher is inserted set success to true, and message to "Success" otherwise
			 * false and "Failure"
			 * 
			 */
			return negative;
		}
	}

	/*
	 * TODO set get mapping path to /teacher/update
	 */
	@GetMapping("/teacher/update")
	public StatusResponse updateTeacher(@RequestParam Integer id, @RequestParam String firstName,
			@RequestParam String lastName) {
		Teacher teacher = new Teacher(id, firstName, lastName);
		manager.updateTeacher(teacher);
		if (manager.updateTeacher(teacher) == true) {
			StatusResponse positive = new StatusResponse(manager.updateTeacher(teacher), "Sucsess");
			return positive;
		} else {
			StatusResponse negative = new StatusResponse(manager.updateTeacher(teacher), "Failure");
			/*
			 * TODO Update teacher in database by ID Return StatusResponse object. If
			 * teacher is updated set success to true, and message to "Success" otherwise
			 * false and "Failure"
			 */
			return negative;
		}
	}
}
