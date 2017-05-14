package osmparser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Node {

    private long id;
    private double lat;
    private double lon;
    private HashSet<Node> edges;

    public Node(long id, double lat, double lon){
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        this.edges = new HashSet<Node>();
    }

    public void addEdge(Node node){
        edges.add(node);
    }

    public long getId() {
        return id;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public List<Long> getNodeIds(){
        List<Long> nodeIds = new ArrayList<>();
        for (Node node:edges) {
            nodeIds.add(node.getId());
        }
        return nodeIds;
    }
}