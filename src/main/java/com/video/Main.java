package com.video;

public class Main {

    public static void main(String[] args){
        String inFileName="C:\\Dev_Tools\\TestTools\\EditVideoUtil\\videos\\Video.mkv";
        String outFileName="C:\\Dev_Tools\\TestTools\\EditVideoUtil\\videos\\video1"+".mkv";
        String startTime="00:27:23";    //开始时间点
        String endTime="00:31:04";      //结束时间点
        String endLengthTime=DateUtil.getDisTime(startTime,endTime);
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
