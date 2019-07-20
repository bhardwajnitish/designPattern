package com.nitish.designPattern.creational;

public class BuilderDesignPatternExample {

	public static void main(String[] args) {
		User user = new User.UserBuilder("Nitish").age(32).address("Delhi").build();
		System.out.println(user);

		user = new User.UserBuilder("Nitish").userId(1).age(32).address("Delhi").build();
		System.out.println(user);
	}

	private static class User {
		private final int userId;
		private final String name;
		private final int age;
		private final String address;

		private User(UserBuilder userBuilder) {
			this.userId = userBuilder.userId;
			this.age = userBuilder.age;
			this.name = userBuilder.name;
			this.address = userBuilder.address;
		}

		public int getUserId() {
			return this.userId;
		}

		public String getName() {
			return this.name;
		}

		public int getAge() {
			return this.age;
		}

		public String getAddress() {
			return this.address;
		}

		@Override
		public String toString() {
			return "User [userId=" + this.userId + ", name=" + this.name + ", age=" + this.age + ", address=" + this.address + "]";
		}

		private static class UserBuilder {
			private int userId;
			private final String name;
			private int age;
			private String address;

			public UserBuilder(String name) {
				this.name = name;
			}

			public UserBuilder userId(int userId) {
				this.userId = userId;
				return this;
			}

			public UserBuilder age(int age) {
				this.age = age;
				return this;
			}

			private UserBuilder address(String address) {
				this.address = address;
				return this;
			}

			public User build() {
				return new User(this);
			}

		}

	}

}
