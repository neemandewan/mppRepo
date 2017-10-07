package assignment05.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import assignment05.prob1.AddrWindow;
import assignment05.prob1.ProfileWindow;
import assignment05.prob1.RuleSet;

final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(AddrWindow.class, new AddrRuleSet());
		map.put(ProfileWindow.class, new ProfileRuleSet());
	}
	
	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> cl = c.getClass();
		if(!map.containsKey(cl)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
}
