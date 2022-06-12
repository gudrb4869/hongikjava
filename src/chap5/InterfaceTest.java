package chap5;

interface Connectable {
    public static final String name = "연결 방법: USB, ";
    public abstract void connect();
}

abstract class Device {
    public abstract void print();
}

class HPPrinter extends Device implements Connectable {
    @Override
    public void connect() {
        System.out.println(name + "HP 프린터를 연결합니다.");
    }

    @Override
    public void print() {
        System.out.println("HP 프린터입니다.");
    }
}

class USBMemory extends Device implements Connectable {
    @Override
    public void connect() {
        System.out.println(name + "USB 메모리를 연결합니다.");
    }

    @Override
    public void print() {
        System.out.println("삼성 USB 메모리입니다.");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        /*HPPrinter hpPrinter = new HPPrinter();
        USBMemory usbMemory = new USBMemory();

        hpPrinter.print();
        usbMemory.print();

        hpPrinter.connect();
        usbMemory.connect();*/

        Device pdev01 = new HPPrinter();
        Device pdev02 = new USBMemory();
        pdev01.print();
        pdev02.print();
        ((Connectable)pdev01).connect();
        // pdev01.connect() 불가능
        ((Connectable)pdev02).connect();
        // pdev02.connect() 불가능
    }
}
