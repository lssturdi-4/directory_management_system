public class Person implements PersonObject {
	private String last;
	private String first;
	private String middle;

	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;
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

	@Override
	public void printFirstMiddleLast() {
		System.out.println(first + "  " + middle + "  " + last + "  " + "(Person)");
	}

	@Override
	public void printFirstLastMiddle() {
		System.out.println(first + " ," + last+ " " + middle + "  " + "(Person)");
	}

	@Override
	public void printLastFirstMiddle() {
		System.out.println(last + " ," + first + " " + middle + "  " + "(Person)");
	}
}