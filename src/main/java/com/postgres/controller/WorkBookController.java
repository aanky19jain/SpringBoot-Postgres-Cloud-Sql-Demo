package com.postgres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.exception.ResourceNotFoundException;
import com.postgres.model.WorkBook;
import com.postgres.repository.WorkBookRepository;

@RestController
public class WorkBookController {

	@Autowired
	private WorkBookRepository repository;

	@GetMapping("/v1/workbooks")
	public List<WorkBook> getAllWorkBooks() {
		return repository.findAll();
	}

	@GetMapping("/v1/workbooks/{workbookid}")
	public ResponseEntity<WorkBook> getEmployeeById(@PathVariable String workbookid) throws ResourceNotFoundException {
		WorkBook employee = repository.findById(workbookid).orElseThrow(
				() -> new ResourceNotFoundException("WorkBook not found for the workbookid=" + workbookid));
		return ResponseEntity.ok().body(employee);
	}

}
