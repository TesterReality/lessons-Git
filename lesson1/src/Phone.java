public class Phone {

    private String number;
    private Network network;

    Phone(String number) {
        this.number = number;
    }

    public void call(String friendsNum) {

        boolean isValid = false;

        for (int i = 0; i < network.getPeoplePhone().size(); i++) {

            if (network.getPhone(i).getNumber().equals(friendsNum)) {
                isValid = true;
                System.out.println("Телефон " + number + ": вызывает " + friendsNum);
                break;
            }

        }
        if(!isValid)
        {
            System.out.println("На данный момент абонент "+ friendsNum + " не может принять вызов.");
        }
    }

    public void registrationNetwork(Network network) {
        if(this.network !=null)
        {
            this.network.delPhone(number);
        }
        this.network = network;
        network.addPhone(this);
    }

    public String getNumber() {
        return number;
    }
}
