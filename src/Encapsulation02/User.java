package Encapsulation02;

public class User {

	// username, password, active (boolean), signedIn (boolean)

	String id;
	
	String username;

	String password;

	boolean active=true;

	boolean signedIn=false;

	public User() {

	}

	public User(String id,String username, String password, boolean active, boolean signedIn) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.active = active;
		this.signedIn = signedIn;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		UserMain obj=new UserMain();
		if (password.length()<6) {
			System.out.println("Lutfen yeniden kullanici girisi yapiniz");
			obj.ekleme();
		}
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isSignedIn() {
		return signedIn;
	}

	public void setSignedIn(boolean signedIn) {
		this.signedIn = signedIn;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", active=" + active
				+ ", signedIn=" + signedIn + "]";
	}

}
