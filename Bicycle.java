public class Bicycle{
private String ownerName;
private String TagNo;		

public Bicycle( ){
ownerName = "Unknown";
TagNo = "Unknown";
}		
public Bicycle(String Name,String Tagno){	
ownerName = Name;	
TagNo= Tagno;	
}
							
public String getownername(){		
return ownerName;	}	
public String getTagNo(){		
return TagNo;	
}	
public void setownername(String name){		
ownerName = name;	
}	
public void setTagNo(String TagNo){		
TagNo = TagNo; 	
}
}
