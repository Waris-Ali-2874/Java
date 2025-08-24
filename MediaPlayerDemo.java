
class MediaPlayer {
    void play() {
        System.out.println("Playing media...");
    }
}

class AudioPlayer extends MediaPlayer {
    void play() {
        System.out.println("Playing audio...");
    }
}

class VideoPlayer extends MediaPlayer {
    void play() {
        System.out.println("Playing video...");
    }
}

class StreamingPlayer extends MediaPlayer {
    void play() {
        System.out.println("Streaming online...");
    }
}

public class MediaPlayerDemo {
    public static void main(String[] args) {
        MediaPlayer m;  

        m = new AudioPlayer();   
        m.play();

        m = new VideoPlayer();
        m.play();

        m = new StreamingPlayer();
        m.play();
    }
}
