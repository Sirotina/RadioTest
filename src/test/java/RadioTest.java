import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RadioTest {

    @Test
    public void ShouldSetSixStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetTenStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetNineStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetNullStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetOneStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetTwoStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetThreeStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);

        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetNextStationIfSix() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    // NEXT 0 1 2 8 9 10


    @Test
    public void ShouldSetNextStationIfEight() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetNextStationIfNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetNextStationIfNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetNextStationIfOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetPrevStationIfOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetPrevStationIfTwo() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetPrevStationIfNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetPrevStationIfTen() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetPrevStationIfEight() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetPrevStationIfNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ShouldSet100CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);


        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSet56CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);

        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetOneCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }



}
