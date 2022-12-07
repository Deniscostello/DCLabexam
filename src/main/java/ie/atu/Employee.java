package ie.atu;

public class Employee {
    private String name;
    private String ppsid;

    public Employee(String name, String ppsid) {
        setName(name);
        setPpsid(ppsid);
    }

    public void setName(String name) {
        if(name.length() > 4 && name.length() < 23) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name provided is not valid");
        }
    }

    public String getName()
    {
        return name;
    }

    public String getPpsid() {
        return ppsid;
    }

    public void setPpsid(String ppsid) {
        if(ppsid.length() == 6) {
            this.ppsid = ppsid;
        }
        else{
            throw new IllegalArgumentException("Employee PPS should be 6 characters");
        }
    }
}


