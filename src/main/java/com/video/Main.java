package com.video;

public class Main {

    public static void main(String[] args){
        String inFileName="C:\\Dev_Tools\\TestTools\\EditVideo\\videos\\牧马人.mkv";
        String outFileName="C:\\Dev_Tools\\TestTools\\EditVideo\\videos\\牧马人_"+"1"+".mkv";
        String startTime="01:37:00";    //开始时间点
        String endTime="01:38:20";      //结束时间点
        String endLengthTime=DateUtil.getDisTime(startTime,endTime);  //截取视频总时长
        System.out.println("----endLengthTime="+endLengthTime);
        FFmpegCommandParamsForm paramsForm=new FFmpegCommandParamsForm();
        paramsForm.setInfileName(inFileName);
        paramsForm.setOutfileName(outFileName);
        paramsForm.setStartTime(startTime);
        paramsForm.setEndLengthTime(endLengthTime);
        String result=EditVideoUtil.editVideo4Windows(paramsForm);

        System.out.println("----截取视频后保存位置: "+result);
        System.out.println("----截取视频结束");
    }


}
