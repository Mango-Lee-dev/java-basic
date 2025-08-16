package access;

public class Speaker {
    int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void increaseVolume() {
        if (volume >= 100) {
            System.out.println("최대 음량입니다.");
        } else {
            int prevVolume = volume;
            volume += 10;
            System.out.println("Volume을 " + prevVolume + "에서 " + volume + "으로 올렸습니다.");
        }
    }

    void decreaseVolume() {
        if (volume <= 0) {
            System.out.println("볼륨을 0 이하로 내릴 수 없습니다.");
        } else {
            int prevVolume = volume;
            volume -= 10;
            System.out.println("Volume을 " + prevVolume + "에서" + volume + "으로 낮췄습니다.");
        }
    }

    void showVolume() {
        System.out.println("현재 음량 " + volume);
    }
}
