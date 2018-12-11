package io.bobz.springbootquickstart.entry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
	
	@RequestMapping("/entry")
	public String getEntryMessage() {
		return "An successful entry is registered!";
	}
}
