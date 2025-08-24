public class Demo09 {
    public static void main(String[] args) {
        DBQuery db = new SqlOrderRepository();
        new OrderController(db).create("ORD-1");
    }
}
