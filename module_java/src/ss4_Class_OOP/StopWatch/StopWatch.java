package ss4_Class_OOP.StopWatch;

public class StopWatch {
   long startTime,endTime;

   public StopWatch() {
      this.startTime = System.currentTimeMillis();
   }

   //    public long getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(long startTime) {
//        this.startTime = startTime;
//    }
//
//    public long getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(long endTime) {
//        this.endTime = endTime;
//    }
   public void star() {
      this.startTime = System.currentTimeMillis();
   }

   public void end() {
      this.endTime = System.currentTimeMillis();
   }
   public double getElapsedTime() {
      return this.endTime - this.startTime;
   }

}
