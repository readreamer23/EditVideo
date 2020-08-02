package com.video;


public class FFmpegCommandParamsForm {
    //源文件绝对路径名称
    private String infileName;
    //输出文件绝对路径名称
    private String outfileName;
    //截取开始时间
    private String startTime;
    //截取长度时间
    private String endLengthTime;

    public FFmpegCommandParamsForm(){}


    public String getInfileName() {
        return infileName;
    }

    public void setInfileName(String infileName) {
        this.infileName = infileName;
    }

    public String getOutfileName() {
        return outfileName;
    }

    public void setOutfileName(String outfileName) {
        this.outfileName = outfileName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndLengthTime() {
        return endLengthTime;
    }

    public void setEndLengthTime(String endLengthTime) {
        this.endLengthTime = endLengthTime;
    }
}
