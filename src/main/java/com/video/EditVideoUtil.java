package com.video;

import java.util.ArrayList;
import java.util.List;

public class EditVideoUtil {


    /**
     * 视频截取剪辑方法
     *
     */
    public static String editVideo4Windows(FFmpegCommandParamsForm commandParams){
        List<String> convert = new ArrayList<String>();
        convert.add("C:\\Dev_Tools\\TestTools\\EditVideo\\ffmpeg.exe"); // 添加转换工具路径
        convert.add("-ss");//起始时间
        convert.add(commandParams.getStartTime());
        convert.add("-i"); // 添加参数＂-i＂，该参数指定要转换的文件
        convert.add(commandParams.getInfileName()); // 添加要转换格式的视频文件的路径
        convert.add("-to"); //结束时间-截取时长
        convert.add(commandParams.getEndLengthTime());//
        convert.add("-c"); //操作方式
        convert.add("copy");
        convert.add(commandParams.getOutfileName());
        //convert.add("-title");
        //convert.add("标题");
        convert.add("-y"); // 添加参数＂-y＂，该参数指定将覆盖已存在的文件

        ProcessBuilder builder = new ProcessBuilder();
        try {
            builder.command(convert);
            builder.start();
            return commandParams.getOutfileName();
        } catch (Exception e) {
            System.out.println(e);
            return null ;
        }
    }







}
