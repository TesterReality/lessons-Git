import java.util.Calendar;

public class SanStation {

    private String organizationName;

    public SanStation(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void cehck(ISanitaryStation s)
    {
        if(s.getExpiryDate()< Calendar.getInstance().get(Calendar.YEAR))
        {
            System.out.println("Санитарная служба нашла просроченный товар!");
        }else
        {
            System.out.println("Фух, санитарная служба говорит что все хорошо!");
        }
    }
}
