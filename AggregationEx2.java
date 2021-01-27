//Java program example for aggregation. Create a class Address having field city, state, pincode.
//create a class Employee having field empno, empname and address of type Address class.

class Address
{
	String city;
	String state;
	int pincode;
}
//creating a class Employee
class Employee
{
	int empno;
	String empname;
	Address address;	//object address of class Address.
	void getdata(int empno,String empname, Address address)
	{
		this.empno=empno;
		this.empname=empname;
		this.address=address;
	}
	void showdata()
	{
		System.out.println("Employee Number: " + empno);
		System.out.println("Employee Name: " + empname);
		System.out.println("Employee City: " + address.city);
		System.out.println("Employee State " + address.state);
		System.out.println("Employee Pincode " + address.pincode);
	}

}

class AggregationEx2
{
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		Address adr = new Address();
		adr.city="Nagpur";
		adr.state="Maharashtra";
		adr.pincode=440007;
		emp.getdata(15,"Mayuri Dhole",adr);
		emp.showdata();
	}
}
