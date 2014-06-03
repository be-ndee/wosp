package probeklausur;

public class ZooCapacityException extends Exception {

 public ZooCapacityException(String msg) {
    super(msg);
	System.out.println("Maximale Anzahl erreicht");

}
}
