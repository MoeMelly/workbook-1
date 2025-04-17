public class CellPhoneService { {


    }


    public long serialNumber;
    public String model;
    public String carrier;
    public long phoneNumber;
    public String owner;



    public void CellPhoneService() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = 0;
        owner = "";
        System.out.println("A new Cell Phone Service object has been created");

    }



        public long getSerialNumber() {
            return serialNumber;

        }

        public void setSerialNumber(long serialNumber) {
            this.serialNumber = serialNumber;


        }

        public String getModel() {
            return model;

        }

    public void setModel(String model) {
        this.model = model;

    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;

    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String phoneNumberToCall) {
        System.out.println(owner + " 's phone is calling " + phoneNumberToCall);


    }
}































