import java.util.Scanner;

public class Email {
	private String FirstName;
	private String LastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapicity=500;
	private int defaultPasswordLength=10;
	private String mailalternative;
	private String copanyName="XyzcompanyName.com";

	
	public Email(String firstName_localString, String lastName_localString) {
		
		this.FirstName = firstName_localString;
		this.LastName = lastName_localString;
		 this.department=setDepartment();
		 this.password=randomPassword(defaultPasswordLength);
		 if(this.department=="") {
			 this.email=this.FirstName.toLowerCase() + this.LastName.toLowerCase() ;
		 }else {
		this.email=this.FirstName.toLowerCase() + this.LastName.toLowerCase()+"@"+this.department +""+ this.copanyName;
				
		 }
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public String randomPassword(int defaultPasswordLength ) {
	String  passwordSet="ABCDEFIJHKLMNOPGQRSTUVWXYZabcdefjhklmnopgqrstuvwxyz0123456789&#{[|^@]";
	char[] password_array=new char[defaultPasswordLength];
	
	for(int i=0;i<defaultPasswordLength;i++) {
		 
		int rand=(int)(Math.random()*passwordSet.length());
		
		password_array[i]=passwordSet.charAt(rand);
		
		
		
	}
	
	
	return new String (password_array);
	}

	public String getDepartment() {
		return department;
	}

	public String setDepartment() {
		
		
	System.out.println("Enter Department   medecale\n1 development\n2  sales\n3  marketing\n4 adverising\n0 for none\reEnter the department Number please ");
	
	Scanner in=new Scanner(System.in);
	int depChoice=in.nextInt();
	System.out.println(depChoice);
	if(depChoice==0) {return"marketing";}
	else if(depChoice==1) {return "medecale";}
	else if(depChoice==2) {return "developement";}
	else if (depChoice==3) {return "sales";}
	else {return "";}}
	
	
	
			

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMailboxCapicity() {
		return mailboxCapicity;
	}

	public void setMailboxCapicity(int mailboxCapicity) {
		this.mailboxCapicity = mailboxCapicity;
	}

	public int getDefaultPasswordLength() {
		return defaultPasswordLength;
	}

	public void setDefaultPasswordLength(int defaultPasswordLength) {
		this.defaultPasswordLength = defaultPasswordLength;
	}

	public String getMailalternative() {
		return mailalternative;
	}

	public void setMailalternative(String mailalternative) {
		this.mailalternative = mailalternative;
	}

	public String getCopanyName() {
		return copanyName;
	}

	public void setCopanyName(String copanyName) {
		this.copanyName = copanyName;
	}

	@Override
	public String toString() {
		return "Email [FirstName=" + FirstName + "\n , LastName=" + LastName + "\n, password=" + password + "\n, department="
				+ department + "\n, email=" + email + "\n, mailboxCapicity=" + mailboxCapicity + "\n, defaultPasswordLength="
				+ defaultPasswordLength + "\n, mailalternative=" + mailalternative + "\n, copanyName=" + copanyName + "]";
	}
	
	

}
