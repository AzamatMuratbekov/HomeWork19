public class Car implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Машина закрывается");
    } void drive(){
        System.out.println("Машина журуп баратат");
    }
}
