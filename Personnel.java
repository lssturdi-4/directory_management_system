import java.util.*;
public class Personnel {

	private ArrayList<Person> personList;

	
	public Personnel() {
		personList = new ArrayList<>();
	}
	
	public void addPersonnel(Person p)
	{
		personList.add(p);
	}
	
	public int size() {
		return personList.size();
	}

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }


}