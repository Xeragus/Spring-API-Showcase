package io.bobz.springbootquickstart.club;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClubService {
	
	private List<Club> clubs = new ArrayList<>(Arrays.asList(
			new Club(1, "Arsenal", 1886, "Unai Emery"),
			new Club(2, "Liverpool", 1876, "Jurgen Klopp"),
			new Club(3, "Chelsea", 1867, "Maurizio Sarri"),
			new Club(4, "West Ham", 1855, "Emanuel Pelegrini")
			));
	
	public List<Club> getAllClubs() {
		return clubs;
	}
	
	public Club getClubById(String id) {
		return clubs.stream()
				.filter(club -> club.getId().equals(id)).findFirst().get();
	}
	
	public Club getClubByName(String name) {
		String formattedName = name.toLowerCase().replace(' ', '-');
		
		return clubs.stream()
				.filter(club -> club.getFormattedName().toLowerCase().equals(formattedName)).findFirst().get();
	}
	
	public void addClub(Club club) {
		clubs.add(club);
	}
	
	public void editClub(Club club, String id) {
		for(int i = 0; i < clubs.size(); i++) {
			if(clubs.get(i).getId().equals(id)) {
				clubs.set(i, club);
				return;
			}
			
		}
	}
	
	public void deleteClub(String id) {
		clubs.removeIf(club -> club.getId().equals(id));
	}
	
}
