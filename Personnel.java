import java.util.*;
public class Personnel {

	private ArrayList<PersonObject> personList;

	
	public Personnel() {
		personList = new ArrayList<>();
	}
	
	public void addPersonnel(PersonObject p)
	{
		personList.add(p);
	}
	
	public int size() {
		return personList.size();
	}

    public ArrayList<PersonObject> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<PersonObject> personList) {
        this.personList = personList;
    }


}