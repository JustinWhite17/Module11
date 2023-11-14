public class PowerAdapterExample {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPlug();
        PowerAdapter powerAdapter = new PowerAdapter(americanPlug);
        Device device = new Device();
        device.usePower(powerAdapter);
    }
}
