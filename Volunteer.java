import java.util.HashMap;

public class Volunteer implements PersonObject {
	private String last;
	private String first;
	private String middle;
	private int empID;
	private double baseSalary;


	public Volunteer(HashMap<String, String> volunteerInfo) {
		this.last = volunteerInfo.get("last");
		this.first = volunteerInfo.get("first");
		this.middle = volunteerInfo.get("middle");
		this.baseSalary = Double.parseDouble(volunteerInfo.get("baseSalary"));
		this.empID = Integer.parseInt(volunteerInfo.get("empID"));
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
		System.out.println(first + "  " + middle + "  " + last + "  " + "(Volunteer)");
	}

	@Override
	public void printFirstLastMiddle() {
		System.out.println(first + " ," + last+ " " + middle + "  " + "(Volunteer)");
	}

	@Override
	public void printLastFirstMiddle() {
		System.out.println(last + " ," + first + " " + middle + "  " + "(Volunteer)");
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
