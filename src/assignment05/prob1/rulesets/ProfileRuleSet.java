package assignment05.prob1.rulesets;

import java.awt.Component;

import assignment05.prob1.ProfileWindow;
import assignment05.prob1.RuleSet;

public class ProfileRuleSet implements RuleSet {
	
	private String id;
	private String firstName;
	private String lastName;
	private String favoriteMovieField;
	private String favoriteRestaurantField;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		ProfileWindow profile = (ProfileWindow) ob;
		
		checkEmptyFields(profile);
		checkNumericId(profile);
		checkNames(profile);
		checkFav(profile);
	}

	private void checkFav(ProfileWindow profile) throws RuleException {
		// TODO Auto-generated method stub
		favoriteRestaurantField = profile.getFavoriteRestaurantValue();
		favoriteMovieField = profile.getFavoriteMovieValue();
		
		if(favoriteMovieField.equals(favoriteRestaurantField)) {
			throw new RuleException("Favorite restaurant cannot equal favorite movie");
		}
		
	}

	private void checkNames(ProfileWindow profile) throws RuleException {
		// TODO Auto-generated method stub
		firstName = profile.getFirstNameValue();
		lastName = profile.getLastNameValue();
		if(firstName.contains(" ") || 
				lastName.contains(" ") || 
				!firstName.matches("^[a-zA-Z]*$") ||
				!lastName.matches("^[a-zA-Z]*$")) {
			throw new RuleException("firstname and lastname fields may not contain spaces or characters other than a-z, A-Z");
		}
		
	}

	private void checkNumericId(ProfileWindow profile) throws RuleException {
		// TODO Auto-generated method stub
		id  = profile.getIdValue();
		try {
			Integer.parseInt(id);
		} catch(NumberFormatException e) {
			throw new RuleException("Id must be numeric");
		}
	}

	private void checkEmptyFields(ProfileWindow profile) throws RuleException {
		// TODO Auto-generated method stub
		id = profile.getIdValue();
		firstName = profile.getFirstNameValue();
		lastName = profile.getLastNameValue();
		favoriteRestaurantField = profile.getFavoriteRestaurantValue();
		favoriteMovieField = profile.getFavoriteMovieValue();
		
		if(id.isEmpty() || 
				firstName.isEmpty() ||
				lastName.isEmpty() || 
				favoriteMovieField.isEmpty() 
				|| favoriteRestaurantField.isEmpty()) {
			
			throw new RuleException(" All fields must be nonempty");
		}
	}

}
