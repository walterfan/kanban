package com.github.walterfan.kanban.rest;


import com.github.walterfan.kanban.domain.Task;
import com.github.walterfan.kanban.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/")
public class TaskController {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TaskService taskService;
	
	
	@RequestMapping(value = "/tasks", method = RequestMethod.POST)
    public ResponseEntity<Task> saveTask(@RequestBody Task Task) {
        logger.info("got post request: " + Task.toString());
        
        return new ResponseEntity<Task>(Task, HttpStatus.OK);
    }
}
