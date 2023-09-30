package work04;

public class Person {
    
    // 4.1
    private int id;

    public Person(int id) {
        this.id = id;
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    @Override
    public String toString() {
        return "Person{" + "id=" + id + '}';
    }
    
}
