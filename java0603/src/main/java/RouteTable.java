import java.util.List;

public class RouteTable {

    int id;
    GateWay gateway;
    List<Subnet> subnets;

    public RouteTable() {}


    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setGateWay(GateWay gateWay) {
        this.gateway = gateway;
    }

    public void setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
    }


    // getter
    public int getId() {
        return id;
    }

    public GateWay getGateWay() {
        return gateway;
    }

    public List<Subnet> getSubnets() {
        return subnets;
    }

    // subnet 추가
    public void addSubnet(Subnet s) {
        subnets.add(s);
    }


}
