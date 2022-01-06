package com.melloware.jintellitype;

public class PlayThread extends Thread{

    public static PlayThread playThread = new PlayThread();

    @Override
    public void run(){
        try {
            GlobalKeyListener.playFlag = false;
            playThread = new PlayThread();
            Mymusic.playmusic(GlobalKeyListener.filename);
            GlobalKeyListener.playFlag = true;
        } catch (Exception e) {
            System.out.println("播放失败");
        }
    }
}
