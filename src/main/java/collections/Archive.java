package collections;

import inheritance.*;

import java.util.*;

public class Archive {

    private Map<String, Automobile> archive;

    public Archive()
    {
        this.archive = new HashMap<>();
    }

    public void record(Automobile automobile)
    {
        this.archive.put(automobile.name, automobile);
    }

}
