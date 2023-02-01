package com.prospecta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prospecta.Exceptions.CategoryException;
import com.prospecta.Service.Services;
import com.prospecta.model.Entry;
import com.prospecta.model.FinalDTO;

@RestController
public class GlobalController {
	@Autowired
	private Services serve;
	
	@GetMapping("/entries/{category}")
	public ResponseEntity<List<FinalDTO>> getTitle(@PathVariable String category) throws CategoryException{
		
		List<FinalDTO> list=serve.getTitleAndDescription(category);
		
		return new ResponseEntity<List<FinalDTO>>(list, HttpStatus.OK);
	}
	@PostMapping("/entries")
	public ResponseEntity<List<Entry>> saveEntry(@RequestBody Entry entry){
		
		List<Entry> list=serve.savingEntry(entry);
		
		return new ResponseEntity<List<Entry>>(list, HttpStatus.CREATED);
	}
}
