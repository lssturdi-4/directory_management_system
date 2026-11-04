public class Person {
	private String last;
	private String first;
	private String middle;


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}

	public void printFirstMiddleLast() {
		System.out.println(first + "  " + middle + "  " + last);
	}

	public void printFirstLastMiddle() {
		System.out.println(first + " ," + last+ " " + middle);
	}

	public void printLastFirstMiddle() {
		System.out.println(last + " ," + first + " " + middle);
	}

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

	



}