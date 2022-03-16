package com.te.learn.objectClass;


	public class Human {
		private String humanName;
		private int humanAge;
		private int humanHeight;
		private double humanWeight;
		
		public Human() {
			super();
		}

		public Human(String humanName, int humanAge, int humanHeight, double humanWeight) {
			super();
			this.humanName = humanName;
			this.humanAge = humanAge;
			this.humanHeight = humanHeight;
			this.humanWeight = humanWeight;
		}

		public String getHumanName() {
			return humanName;
		}

		public void setHumanName(String humanName) {
			this.humanName = humanName;
		}

		public int getHumanAge() {
			return humanAge;
		}

		public void setHumanAge(int humanAge) {
			if (humanAge < 0) {
				System.out.println("Enter invalid age");
			} else {
				this.humanAge = humanAge;
			}
		}

		public int getHumanHeight() {
			
				return humanHeight;
			
		}

		public void setHumanHeight(int humanHeight) {
			if(humanHeight<30) {
				System.out.println("Enter valid height");
			}
			else {
				this.humanHeight = humanHeight;
			}
			
		}

		public double getHumanWeight() {
			return humanWeight;
		}

		public void setHumanWeight(double humanWeight) {
			if(humanWeight<5) {
				System.out.println("Enter valid weight");
			}
			else
			{
				this.humanWeight = humanWeight;
			}
		}
		public String toString() {
			return "Human [humanname "+ humanName + "humanweight" + humanWeight ;
		}
		
		public boolean equals(Object arg0) {
			Human human = (Human) arg0;
		} 

		
	}


