public class MyCar {
    private String model;
    private int modelYear;
    private long licensePlate;
    private String trim;

    public MyCar(String model, int modelYear, long licensePlate, String trim) {
        this.model = model;
        this.modelYear = modelYear;
        this.licensePlate = licensePlate;
        this.trim = trim;
    }


        public String getModel() {
            return this.model;
        }


            public int getModelYear() {
                return this.modelYear;
            }


            public long getLicensePlate() {
                return this.licensePlate;
            }


            public String getTrim() {
                return this.trim;

            }

    public void setModel(String model) {
        this.model = model;
    }
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setLicensePlate(long licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setTrim(String trim) {
        this.trim = trim;

    }

    }














