package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain500() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemain0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemain999() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemain1001() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemain1500() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemain500JU5() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemain1JU5() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemain0JU5() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemain999JU5() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemain1000JU5() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemain1001JU5() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void testRemain1500JU5() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(actual, expected);
    }
}