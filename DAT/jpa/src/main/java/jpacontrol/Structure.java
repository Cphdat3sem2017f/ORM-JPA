package jpacontrol;

import java.util.HashMap;
import javax.persistence.Persistence;

public class Structure {
    public static void main(String[] args)
    {
        
        HashMap puproperties = new HashMap();
        
        puproperties.put("javax.persistence.sql-load-script-source", "scripts/ClearDB.sql");
        Persistence.generateSchema("jpaPU", puproperties);
        
        
        puproperties.remove("javax.persistence.sql-load-script-source");
        Persistence.generateSchema("jpaPU", puproperties);
        
    }
}
