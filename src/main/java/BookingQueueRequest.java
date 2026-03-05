import java.awt.print.Book;
import java.util.LinkedList;
import java.util.Queue;

public class BookingQueueRequest {
    private Queue<Reservation> reqQ;

    public BookingQueueRequest(){
        reqQ = new LinkedList<>();
    }

    public void addRequest(Reservation reservation){
        reqQ.offer(reservation);
    }

    public Reservation getNextRequest(){
        return reqQ.poll();
    }

    public boolean hasBooleanInterest(){
        return !reqQ.isEmpty();
    }
}
