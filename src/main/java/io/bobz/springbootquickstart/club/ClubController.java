package io.bobz.springbootquickstart.club;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClubController {
	
	@Autowired
	private ClubService clubService;
	
	@RequestMapping("/clubs")
	public List<Club> getAllClubs() {
		return clubService.getAllClubs();
	}
	
	@RequestMapping("/clubs/{id}")
	public Club getClubByID(@PathVariable String id) {
		return clubService.getClubById(id);
	}
	
	@RequestMapping("/clubs/name/{name}")
	public Club getClubByName(@PathVariable String name) {
		return clubService.getClubByName(name);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/clubs")
	public void addClub(@RequestBody Club club) {
		clubService.addClub(club);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/clubs/{id}")
	public void editClub(@RequestBody Club club, @PathVariable String id) {
		clubService.editClub(club, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/clubs/{id}")
	public void deleteClub(@PathVariable String id) {
		clubService.deleteClub(id);
	}
}
