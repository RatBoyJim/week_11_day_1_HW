import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void setUp() {
        printer = new Printer(20);
    }

    @Test
    public void printerHasSheetsLeft() {
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void printerCanPrint() {
        printer.printDocument(2, 5);
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void printerCannotPrint() {
        printer.printDocument(2, 100);
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void printerHasToner() {
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void tonerIsReduced() {
        printer.printDocument(2, 5);
        assertEquals(90, printer.getTonerVolume());
    }
}
