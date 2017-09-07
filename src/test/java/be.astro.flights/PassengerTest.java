package be.astro.flights;

import static org.junit.Assert.*;
import org.junit.Test;

public class PassengerTest {

    @Test
    public void passengerHasFirstName() {

        Passenger p = new Passenger("Jim", "Jones");

        assertEquals("Jim", p.getFirstName());

    }

    @Test
    public void passengerHasCorrectFullName() {

        Passenger p = new Passenger("Jim", "Jones");
        assertEquals("Jim Jones", p.fullname());

    }

}
