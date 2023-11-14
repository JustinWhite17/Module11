interface EuropeanSocket {
    void powerOn();
}

class AmericanPlug {
    void connect() {
        System.out.println("Connected to American socket");
    }
}

class PowerAdapter implements EuropeanSocket {
    private AmericanPlug americanPlug;

    PowerAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void powerOn() {
        System.out.println("Powering from American to European standard");
        americanPlug.connect();
    }
}

class Device {
    void usePower(EuropeanSocket socket) {
        System.out.println("Device is using power");
        socket.powerOn();
    }
}

