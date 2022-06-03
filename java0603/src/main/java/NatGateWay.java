public class NatGateWay extends GateWay {
    int id;
    Subnet subnet;

    public void send() {
        this.getClass();
    }

    public NatGateWay(Subnet subnet) {
        this.subnet = subnet;
    }
}
