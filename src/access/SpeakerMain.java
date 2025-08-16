package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.increaseVolume();
        speaker.showVolume();
        speaker.increaseVolume();

        speaker.decreaseVolume();

        speaker.showVolume();

        //  필드에 직접 접근
        System.out.println("Volumn 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
