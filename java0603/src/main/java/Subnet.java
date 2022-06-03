public class Subnet {
    int id;
    String ip;
    String region;
    RouteTable routeTable;

    public Subnet(int id, String ip, String region) {
        this.id = id;
        this.ip = ip;
        this.region = region;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRouteTable(RouteTable routeTable) {
        this.routeTable = routeTable;
    }

    // getter


    public int getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public String getRegion() {
        return region;
    }

    public RouteTable getRouteTable() {
        return routeTable;
    }

    public void transfer(String msg) {
        System.out.println(msg);
    }
}