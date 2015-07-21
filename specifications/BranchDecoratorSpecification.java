package specifications;


public abstract class BranchDecoratorSpecification implements BranchOfTreeSpecification{
	
	public int counter = 0;
	protected BranchOfTreeSpecification decoratedBranch; 
	
	public BranchDecoratorSpecification(BranchOfTreeSpecification branchToDecorate) throws IllegalAccessException{

		counter = branchToDecorate.getCounter() + 1;
		if (counter > MAX_DECORATOR_NUMBER){
			throw new IllegalAccessException("Number of Decorator could not over " + MAX_DECORATOR_NUMBER);
		}
		decoratedBranch= branchToDecorate;
//		System.out.println(counter);
	}
	
	public void animate(){decoratedBranch.animate(); }  
	
	public int getCounter(){
		return counter;
	}
	
	
}
