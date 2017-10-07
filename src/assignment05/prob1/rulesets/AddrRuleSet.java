package assignment05.prob1.rulesets;

import java.awt.Component;

import assignment05.prob1.AddrWindow;
import assignment05.prob1.RuleSet;

public class AddrRuleSet implements RuleSet {
	
	private String id, street, city, state, zip;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		AddrWindow addr = (AddrWindow) ob;
		
		checkEmptyFields(addr);
		checkNumericId(addr);
		checkZip(addr);
		checkState(addr);
		checkIdZip(addr);
	}

	private void checkIdZip(AddrWindow addr) throws RuleException {
		id = addr.getIdValue();
		zip = addr.getZipValue();
		
		if(id.equals(zip)) {
			throw new RuleException("Id must not equal to zip");
		}
		
	}

	private void checkState(AddrWindow addr) throws RuleException {
		String state = addr.getStateValue();
		Boolean chk = state.matches(".*\\d+.*");
		if(!chk) {
			if(state.length() != 2 || !state.matches(".*[A-Z].*")) {
				throw new RuleException("State must be of two characters");
			}
		} else {
			throw new RuleException("State must not contain numbers");
		}
		
	}

	private void checkZip(AddrWindow addr) throws RuleException {
		String zip = addr.getZipValue();
		try {
			Integer.parseInt(zip);
		} catch(NumberFormatException e) {
			throw new RuleException("Zip must be numeric");
		}
		
		if(zip.length() != 5) {
			throw new RuleException("Zip size must be exactly 5");
		}
	}

	private void checkEmptyFields(AddrWindow addr) throws RuleException {
		id = addr.getIdValue();
		street = addr.getStreetValue();
		city = addr.getCityValue();
		state = addr.getStateValue();
		zip = addr.getZipValue();
		
		if((id.equals("") || id == null) ||
				(street.equals("") || street == null) ||
				(city.equals("") || city == null) ||
				(state.equals("") || state == null) ||
				(zip.equals("") || zip == null)) {

			throw new RuleException(" All fields must be nonempty");
		}
	}
	
	private void checkNumericId(AddrWindow addr) throws RuleException {
		id  = addr.getIdValue();
		try {
			Integer.parseInt(id);
		} catch(NumberFormatException e) {
			throw new RuleException("Id must be numeric");
		}
	}

}
