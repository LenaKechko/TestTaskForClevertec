package test;

import main.task1.Task1;
import main.task2.Body.InsulatedBody;
import main.task2.Body.RefrigeratedBody;
import main.task2.CarPark;
import main.task2.Fleet.CargoAndPassengerTransport;
import main.task2.Fleet.CargoTransport;
import main.task2.Fleet.PassengerTransport;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    CargoTransport truck = null;
    PassengerTransport bus = null;
    CargoAndPassengerTransport mircotruck = null;
    CarPark park = new CarPark();

    @BeforeEach
    public void setUp() {
        truck = new CargoTransport(2022, "МАЗ", "5440",
                "дизель", 10, 45, new InsulatedBody(5, 12));
        bus = new PassengerTransport(2020, "МАЗ", "18",
                "дизель", 3, 100, 35);
        mircotruck = new CargoAndPassengerTransport(2021, "МАЗ",
                "666", "бензин", 5, 30,
                new RefrigeratedBody(5, 5), 3);
        park.addTransport(truck);
        park.addTransport(bus);
        park.addTransport(mircotruck);
    }

    @Test
    void isRepair(){
        assertEquals("МАЗ 5440 обслужена\n", truck.repair());
        assertEquals("МАЗ 18 обслужена\n", bus.repair());
        assertEquals("МАЗ 666 обслужена\n", mircotruck.repair());
    }

    @Test
    void isDisinfect(){
        assertEquals("Салон МАЗ 18 был продезинфецирован!\n", bus.disinfect());
        assertEquals("Салон МАЗ 666 был продезинфецирован!\n", mircotruck.disinfect());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 8, 3})
    void isFillTank(Integer ints){
        assertEquals("МАЗ 5440 заправлена\n", truck.fillTank(ints));
        assertEquals("МАЗ 18 заправлена\n", bus.fillTank(ints));
        assertEquals("МАЗ 666 заправлена\n", mircotruck.fillTank(ints));
    }

    @Test
    void isNotSealBody(){
        assertEquals("Кузов не опломбирован", truck.checkSealBody());
        assertFalse(truck.getBodyTransport().isSealBody());
        assertEquals("Кузов не опломбирован", mircotruck.checkSealBody());
        assertFalse(mircotruck.getBodyTransport().isSealBody());
    }

    @Test
    void isSealBody(){
        truck.sealAndUnsealBody();
        assertEquals("Кузов опломбирован", truck.checkSealBody());
        assertTrue(truck.getBodyTransport().isSealBody());
        mircotruck.sealAndUnsealBody();
        assertEquals("Кузов опломбирован", mircotruck.checkSealBody());
        assertTrue(mircotruck.getBodyTransport().isSealBody());

    }
}