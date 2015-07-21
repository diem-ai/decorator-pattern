package models;

import specifications.BranchOfTreeSpecification;

public class UndecoratedBranch implements BranchOfTreeSpecification{
	
	public void animate(){}  
	
	public String getDecorations(){
		return "";
	}

	@Override
	public int getCounter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
