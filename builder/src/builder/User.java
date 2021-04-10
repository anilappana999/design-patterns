package builder;

public class User {

	private String firstname;//required
	private String lastname;//required
	private int age;//optional
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		if(age==0) {
			return "User [firstName=" + firstname + ", lastName=" + lastname + "]";	
		}
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	public User(UserBuilder user) {
		super();
		this.firstname = user.firstname;
		this.lastname = user.lastname;
		this.age = user.age;
	}
	
	public static class UserBuilder{
		private String firstname;//req
		private String lastname;//req
		private int age;//opt
		public UserBuilder(String firstname, String lastname) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
		}
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		public User build() {
			User user = new  User(this);
			return user;
		}
	}
	
}
