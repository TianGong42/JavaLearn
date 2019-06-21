package nine;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    //构造一个默认的TV对象
    public TV(){

    }
    //打开这个电视
    public void turnOn(){
        on = true;
    }
    //关闭这个电视
    public void turnOff(){
        on = false;
    }
    //为这个电视设置一个新频道
    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }
    //为这个TV设置一个新音量
    public void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >= 1 && newVolumeLevel <=7){
            volumeLevel = newVolumeLevel;
        }
    }
    //给频道数+1
    public void channelUp(){
        if(on && channel < 120){
            channel++;
        }
    }
    //给频道数-1
    public void channelDown(){
        if(on && channel > 1){
            channel--;
        }
    }
    //给音量+1
    public void volumeUp(){
        if(on && volumeLevel < 7){
            volumeLevel++;
        }
    }
    //给音量-1
    public void volumeDown(){
        if(on && volumeLevel > 1){
            volumeLevel--;
        }
    }




}
