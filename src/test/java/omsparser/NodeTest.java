package omsparser;

import org.junit.*;
import osmparser.Node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NodeTest {

    private static final double DELTA = 1e-15;

    public NodeTest(){

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void rightIdAndLatAndLon(){
        for (int i = 0; i < 10000; i++) {
            Node node = new Node(123123 + i,62.2344 * (i * 0.00001), 12.2999 * (i * 0.00001));
            assertEquals(123123 + i, node.getId());
            assertEquals(62.2344 * (i * 0.00001),node.getLat(),DELTA);
            assertEquals(12.2999 * (i * 0.00001),node.getLon(),DELTA);
        }
    }

    @Test
    public void twoSameNodesHasSameHashCode(){
        for (int i = 0; i < 10000; i++) {
            Node node = new Node(1231231 + i,12.22 * 0.120 * i, 12.43 * 0.00012 * i);
            Node node2 = new Node(1231231 + i,12.22 * 0.120 * i, 12.43 * 0.00012 * i);
            assertEquals(node.hashCode(), node2.hashCode());
        }
    }

    @Test
    public void ifDifferentObjectOrNullIsNotEquals(){
        Node node = new Node(1231231,12.22 * 0.12, 12.43 * 0.00012);
        assertEquals(false, node.equals("asdfasdf"));
        assertEquals(false, node.equals(null));
    }

    @Test
    public void equalsIfSame(){
        for (int i = 0; i < 10000; i++) {
            Node node = new Node(12313213 + i, 12.11 * i * 0.002, 12.11 * i * 0.002);
            Node nodeTwo = new Node(12313213 + i, 12.11 * i * 0.002, 12.11 * i * 0.002);
            assertEquals(node,nodeTwo);
        }
    }
}
