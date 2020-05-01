import java.util.Date;
//import java.sql.date;

public class Tasks {
	private long ID;
	private String name;
	private String description;
	private int percentageCompleted = 0;
	private Date expectedStartDate;
	private Date expectedEndDate;
	private int expectedDuration;
	private int expectedEffort;
	private Date actualStartDate;
	private Date actualEndDate;
	private int actualDuration;
	private int actualEffort;
	private int effortCompleted;
	private Tasks [] predeccesors;
	private Tasks [] succesors;
	private String type;
	//private Issues [] issues;
	//private Resource [] resources;
	
	public void createTask(String name,String description,Date expectedStart, Date expectedEnd, int expectedDuration,int expectedEffort,Tasks [] predec, Tasks [] succ,
			String type/*,Issue [] issues, Resource [] resources*/ ) {
		this.name=name;		this.description=description;	this.expectedStartDate = expectedStart;
		this.expectedEndDate = expectedEnd; 	this.expectedDuration = expectedDuration;
		this.expectedEffort=expectedEffort;  	this.predeccesors=predec;	this.succesors=succ;
		if (type.toLowerCase() != "task" || type.toLowerCase() != "summary task" || type.toLowerCase() != "" ) {
			System.out.println("error with type of task");
		}
			
		//this.issues = issues;		this.resourrces= resources;
	}

	
	/**
	 * Not implemented
	 */
	public void GenerateUniqueID () {
	
	}

	// Display Task method;
	
	public void updateName ( String newName) {this.name = newName;}
	
	public void updateDescription(String newDesc) {this.description=newDesc;}
	
	public void  updateExpectedStartDate(Date newDate) {this.expectedStartDate=newDate;}
	
	public void  updateExpectedEndDate(Date newDate) {this.expectedEndDate=newDate;}
	
	public void  updateActualStartDate(Date newDate) {this.actualStartDate=newDate;}
	
	public void  updateActualEndDate(Date newDate) {this.actualEndDate=newDate;}

	public void  updateExpectedEffort(int effort) {this.expectedEffort=effort;}
	
	public void updateActualEffort(int effort) {this.actualEffort=effort;}
	
	public void updateExpectedDuration(int duration) {this.expectedDuration=duration;}
	
	public void updateActualDuration(int duration) {this.actualDuration=duration;}

	public void updatePercentageCompleted(int percent) {
		if (percent>100)
			percent=100;
		if (percent<0)
			percent = 0;
		else
			this.percentageCompleted=percent;
			//this.percentageCompleted++;
	}

	
	/*public void assignResource (Resource resource) {
	 	if (resources list is empty)
	 		return, no resource to assign
	 	else 
	 		this.resources[this.resources.length()-1] = resource;
	 }*/
	
	/*public void assignIssue (Issue issue) {
 	if (issues list is empty)
 		return, no issue to assign
 	else 
 		this.issues[this.issues.length()-1] = issue;
 }*/
	
	

}
