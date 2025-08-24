
class Transport {
    void bookTicket() {
        System.out.println("Booking a generic transport ticket...");
    }
}


class Bus extends Transport {
    void bookTicket() {
        System.out.println("Booking a bus ticket.");
    }
}

class Train extends Transport {
    void bookTicket() {
        System.out.println("Booking a train ticket.");
    }
}

class Flight extends Transport {
    void bookTicket() {
        System.out.println("Booking a flight ticket.");
    }
}


public class TransportSystem {
    
    static void processBooking(Transport t) {
        t.bookTicket(); 
    }

    public static void main(String[] args) {
        Transport t1 = new Bus();
        Transport t2 = new Train();
        Transport t3 = new Flight();

        
        processBooking(t1);
        processBooking(t2);
        processBooking(t3);
    }
}

