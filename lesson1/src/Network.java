import java.util.ArrayList;

public class Network {

    private ArrayList<Phone> peoplePhone = new ArrayList<Phone>();
    private String name;

    Network(String name) {
        this.name = name;
    }

    public void addPhone(Phone phone) {
        boolean isValid = true;
        for (int i = 0; i < peoplePhone.size(); i++) {
            if (peoplePhone.get(i).getNumber().equals(phone.getNumber())) {
                isValid = false;
                System.out.println("Ошибка! Телефон с таким номером уже зарегистрирован в сети!");
            }
        }
        if (isValid) {
            peoplePhone.add(phone);
            System.out.println("Телефон " + phone.getNumber() + " был зарегестрирован в сети " + name);

        }
    }

    public ArrayList<Phone> getPeoplePhone() {
        return peoplePhone;
    }

    public Phone getPhone(int index) {
        return peoplePhone.get(index);
    }

    public void delPhone(String number) {
        for (int i = 0; i < peoplePhone.size(); i++) {
            if (peoplePhone.get(i).getNumber().equals(number)) {
                peoplePhone.remove(i);
                System.out.println("Телефон " + number + " был удален из сети " + name);
            }
        }
    }
}
