package bioSearcher;

public abstract class BSCollectionStructure {
	private BSDataStructure [] collection;
	
	public BSCollectionStructure(){
		
	}
	
	public abstract String getJSONDescription(int n);
	
	public String getJSONDescription(){
		return getJSONDescription(0);
	}
	
	public abstract void loadSubModules(int y);
	
	public void loadSubModules() {
		loadSubModules(1000);
	}
	
}