package ComparableInterfaceExample;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        VacuumCleaner v1 = new VacuumCleaner(1,"Bosh","Hand-held");
        VacuumCleaner v2 = new VacuumCleaner(4,"LG","Household");
        VacuumCleaner v3 = new VacuumCleaner(5,"Samsung","Household ");
        VacuumCleaner v4 = new VacuumCleaner(3,"Xiaomi","Household ");
        VacuumCleaner v5 = new VacuumCleaner(2,"Apple","Household ");

        VacuumCleaner[] vacuumCleaners = {v1,v2,v3,v4,v5};

        Arrays.sort(vacuumCleaners);

        for(VacuumCleaner vacuumCleaner :vacuumCleaners )
        {
            System.out.println(vacuumCleaner);
        }

    }
}
