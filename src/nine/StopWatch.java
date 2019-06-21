package nine;

import java.util.Date;
public class StopWatch {

    private Date startTime;
    private Date endTime;

    StopWatch(){
        startTime = new Date();
    }
     void strart(){
        startTime = new Date();
    }

    void stop(){
        endTime = new Date();
    }

    public long getElapsedTime(){
       return  endTime.getTime() - startTime.getTime();
    }

}
