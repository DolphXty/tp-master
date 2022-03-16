package tp;

public class IHospitalException extends Exception {
    public IHospitalException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
}
