package SmartLibrary.ebookaccess.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class EBookAccessResourceComponent implements Resource{
	
	public EBookAccessResourceComponent() { }
 
    public abstract List<HashMap<String,Object>> save(VMJExchange vmjExchange);
    public abstract  create(VMJExchange vmjExchange);
	public abstract  create(VMJExchange vmjExchange, int id);    
	public abstract HashMap<String, Object> update(VMJExchange vmjExchange);
    public abstract HashMap<String, Object> get(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> getAll(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> delete(VMJExchange vmjExchange);

	public abstract void createAccess();
}
