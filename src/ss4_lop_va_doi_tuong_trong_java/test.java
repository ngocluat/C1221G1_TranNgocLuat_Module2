package ss4_lop_va_doi_tuong_trong_java;

public class test {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOff();
        tv.setChannel(50);
        System.out.println();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        System.out.println("tăng kênh");
        System.out.println(tv.channel);
        // volume
        int a = tv.setVolume(5);
        tv.volumeDown();
        tv.volumeDown();
        tv.volumeDown();
        tv.volumeDown();
        System.out.println(" giàm volum");
        System.out.println(tv.volumeLevel);
    }
}

class TV {
    int channel = 0;
    int volumeLevel = 0;
    boolean on = false;

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    public int setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
        return newVolumeLevel;
    }

    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }

    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }

    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
