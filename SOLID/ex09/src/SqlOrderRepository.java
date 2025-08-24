public class SqlOrderRepository implements DBQuery {
    public void save(String id){ 
        System.out.println("Saved order " + id + " to SQL"); 
    }
}
