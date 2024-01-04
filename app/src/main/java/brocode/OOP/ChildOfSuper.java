package brocode.OOP;

import brocode.SuperKeyword;

/**
 * ChildOfSuper
 */
public class ChildOfSuper extends SuperKeyword {

	String childVarName;
	int intVarName;

	public ChildOfSuper(String varname, String childVarName, int intVarName) {
		super(varname);
		this.childVarName = childVarName;
		this.intVarName = intVarName;
	}

}
