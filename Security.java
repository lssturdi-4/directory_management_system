import java.util.HashMap;

public class Security implements PersonObject {
	private String last;
	private String first;
	private String middle;
	private int empID;
	private double baseSalary;


	public Security(HashMap<String, String> securityInfo) {
		this.last = securityInfo.get("last");
		this.first = securityInfo.get("first");
		this.middle = securityInfo.get("middle");
		this.baseSalary = Double.parseDouble(securityInfo.get("baseSalary"));
		this.empID = Integer.parseInt(securityInfo.get("empID"));
	}

	public int getID() {
		return empID;
	}

	public double getSalary() {
		return baseSalary;
	}

	public void setID(int id) {
		empID = id;
	}

	public void setSalary(double sal) {
		baseSalary = sal;
	}

    @Override
	public void printFirstMiddleLast() {
		System.out.println(first + "  " + middle + "  " + last + "  " + "(Security)");
	}

	@Override
	public void printFirstLastMiddle() {
		System.out.println(first + " ," + last+ " " + middle + "  " + "(Security)");
	}

	@Override
	public void printLastFirstMiddle() {
		System.out.println(last + " ," + first + " " + middle + "  " + "(Security)");
	}

	@Override
    public String getLast() {
        return last;
    }

    @Override
    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String getFirst() {
        return first;
    }

    @Override
    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String getMiddle() {
        return middle;
    }

	@Override
    public void setMiddle(String middle) {
        this.middle = middle;
    }


}
