public class OrderController {
    private DBQuery db;
    public OrderController(DBQuery db){
        this.db = db;
    }
    void create(String id){
        // SqlOrderRepository repo = new SqlOrderRepository(); // hard dependency
        db.save(id);
        System.out.println("Created order: " + id);
    }
}