package excercise1;

public class Account {
	public Account(int i, Person kathy) {
		// TODO Auto-generated constructor stub
	}

	public class Account {
		private double balance;
		private Person accHolder;
		private long accNum=0;
		
		public Account(double balance,Person accHolder)
		{
			this.balance=balance;
			this.accHolder=accHolder;
			this.accNum=accNum+1;
		}
		public long getAccNum() {
			return accNum;
		}
		public void setAccNum(long accNum) {
			this.accNum=accNum;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance=balance;
		}
		public Person getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(Person accHolder)
		{
			this.accHolder=accHolder;
		}
		public void deposit(double amount) {
			/**
			 * to deposit amount in an account and return changed balance
			 */
			double newBalance=this.getBalance()+amount;
			this.setBalance(newBalance);
		}
		public boolean withdraw(double amount) {
			/**
			 * to withdraw amount from the account and return changed balance
			 */
			double newBalance=this.getBalance()-amount;
			this.setBalance(newBalance);
			return true;
		}
	}

}
