package chap5;

interface MobilePhone {
    void sendCall();

    void receiveCall();

    void sendSMS();

    void receiveSMS();
}

interface MP3 {
    void play();

    void stop();
}

class PDA {
    int caculate(int a, int b) {
        return a + b;
    }
}

class SmartPhone extends PDA implements MobilePhone, MP3 {

    @Override
    public void sendCall() {
        System.out.println("전화걸기");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화받기");
    }

    @Override
    public void sendSMS() {
        System.out.println("SMS보내기");
    }

    @Override
    public void receiveSMS() {
        System.out.println("SMS받기");
    }

    @Override
    public void play() {
        System.out.println("음악재생");
    }

    @Override
    public void stop() {
        System.out.println("재생중지");
    }

    void scheduler() {
        System.out.println("일정관리");
    }

    void applicationManager() {
        System.out.println("어플리케이션 삽입/삭제");
    }
}

public class SmartPhoneTest {
    public static void main(String[] args) {
        MobilePhone p = new SmartPhone();
        p.sendCall();
        ((MP3)p).play();
        System.out.println(((PDA) p).caculate(3, 5));
        ((SmartPhone) p).scheduler();

        /*SmartPhone p = new SmartPhone();
        p.sendCall();
        p.play();
        System.out.println(p.caculate(3, 5));
        p.scheduler();*/
    }
}
