package com.melloware.jintellitype;

import cn.slimsmart.test.jna.MouseHook;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GlobalKeyListener {
    private Robot robot;
    private HotkeyListener hotkeyListener;
    public static Opacity opacity;
    static GlobalKeyListener globalKeyListener;
    public static String filename;
    public static boolean playFlag = true;
    boolean flag1 = true;
    boolean flag2 = true;
    boolean flag3 = true;
    boolean flag4 = true;
    boolean flag5 = true;
    boolean flag6 = true;

    public GlobalKeyListener() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        this.addKey();
        this.addKeyEvent();
    }

    public void addKey() {
        JIntellitype.getInstance().registerHotKey(1, 0, 'W');
        JIntellitype.getInstance().registerHotKey(2, 0, 'A');
        JIntellitype.getInstance().registerHotKey(3, 0, 'S');
        JIntellitype.getInstance().registerHotKey(4, 0, 'D');
        JIntellitype.getInstance().registerHotKey(5, 0, 'Q');
        JIntellitype.getInstance().registerHotKey(6, 0, 'E');
    }

    public void clearKey() {
        JIntellitype.getInstance().unregisterHotKey(1);
        JIntellitype.getInstance().unregisterHotKey(2);
        JIntellitype.getInstance().unregisterHotKey(3);
        JIntellitype.getInstance().unregisterHotKey(4);
        JIntellitype.getInstance().unregisterHotKey(5);
        JIntellitype.getInstance().unregisterHotKey(6);
    }

    public void clearKeyEvent() {
        JIntellitype.getInstance().removeHotKeyListener(hotkeyListener);
    }

    public void addKeyEvent() {
        hotkeyListener = new HotkeyListener() {
            public void onHotKey(int code) {
                switch (code) {
                    case 1: {
                        //先注销热键
                        clearKey();
                        //模拟按键原本功能
                        robot.keyPress(KeyEvent.VK_W);
                        //robot.delay(50);
                        //robot.keyRelease(KeyEvent.VK_W);
                        //这里写其他事件
                        if (flag1) {
                            if (playFlag) {
                                opacity.setContent("그리고 geuligo 和，并");
                                filename = "audio/1.mp3";
                                PlayThread.playThread.start();
                                flag1 = false;
                            }
                        } else {
                            if (playFlag) {
                                opacity.setContent("네 ne 是");
                                filename = "audio/2.mp3";
                                PlayThread.playThread.start();
                                flag1 = true;
                            }
                        }
                        //再重新注册热键
                        addKey();
                        break;
                    }
                    case 2: {
                        //先注销热键
                        clearKey();
                        //模拟按键原本功能
                        robot.keyPress(KeyEvent.VK_A);
                        //robot.delay(50);
                        //robot.keyRelease(KeyEvent.VK_A);
                        //这里写其他事件
                        if (flag2) {
                            if (playFlag) {
                                opacity.setContent("선생님 seonsaengnim 老师");
                                filename = "audio/3.mp3";
                                PlayThread.playThread.start();
                                flag2 = false;
                            }
                        } else {
                            if (playFlag) {
                                opacity.setContent("성 seong 姓");
                                filename = "audio/4.mp3";
                                PlayThread.playThread.start();
                                flag2 = true;
                            }
                        }
                        //再重新注册热键
                        addKey();
                        break;
                    }
                    case 3: {
                        //先注销热键
                        clearKey();
                        //模拟按键原本功能
                        robot.keyPress(KeyEvent.VK_S);
                        //robot.delay(50);
                        //robot.keyRelease(KeyEvent.VK_S);
                        //这里写其他事件
                        if (flag3) {
                            if (playFlag) {
                                opacity.setContent("씨 ssi 小姐，先生");
                                filename = "audio/5.mp3";
                                PlayThread.playThread.start();
                                flag3 = false;
                            }
                        } else {
                            if (playFlag) {
                                opacity.setContent("안녕하십니까 annyeonghasibnikka 你好");
                                filename = "audio/6.mp3";
                                PlayThread.playThread.start();
                                flag3 = true;
                            }
                        }
                        //再重新注册热键
                        addKey();
                        break;
                    }
                    case 4: {
                        //先注销热键
                        clearKey();
                        //模拟按键原本功能
                        robot.keyPress(KeyEvent.VK_D);
                        //robot.delay(50);
                        //robot.keyRelease(KeyEvent.VK_D);
                        //这里写其他事件
                        if (flag4) {
                            if (playFlag) {
                                opacity.setContent("이름 ileum 姓名");
                                filename = "audio/7.mp3";
                                PlayThread.playThread.start();
                                flag4 = false;
                            }
                        } else {
                            if (playFlag) {
                                opacity.setContent("인도 사람 indo salam 印度人");
                                filename = "audio/8.mp3";
                                PlayThread.playThread.start();
                                flag4 = true;
                            }
                        }
                        //再重新注册热键
                        addKey();
                        break;
                    }
                    case 5: {
                        //先注销热键
                        clearKey();
                        //模拟按键原本功能
                        robot.keyPress(KeyEvent.VK_Q);
                        //robot.delay(50);
                        //robot.keyRelease(KeyEvent.VK_Q);
                        //这里写其他事件
                        if (flag5) {
                            if (playFlag) {
                                opacity.setContent("제 je 我的");
                                filename = "audio/9.mp3";
                                PlayThread.playThread.start();
                                flag5 = false;
                            }
                        } else {
                            if (playFlag) {
                                opacity.setContent("중국 jung-gug 中国");
                                filename = "audio/10.mp3";
                                PlayThread.playThread.start();
                                flag5 = true;
                            }
                        }
                        //再重新注册热键
                        addKey();
                        break;
                    }
                    case 6: {
                        //先注销热键
                        clearKey();
                        //模拟按键原本功能
                        robot.keyPress(KeyEvent.VK_E);
                        //robot.delay(50);
                        //robot.keyRelease(KeyEvent.VK_E);
                        //这里写其他事件
                        if (flag6) {
                            if (playFlag) {
                                opacity.setContent("친구 chingu 朋友");
                                filename = "audio/11.mp3";
                                PlayThread.playThread.start();
                                flag6 = false;
                            }
                        } else {
                            if (playFlag) {
                                opacity.setContent("저 jeo 我");
                                filename = "audio/12.mp3";
                                PlayThread.playThread.start();
                                flag6 = true;
                            }
                        }
                        //再重新注册热键
                        addKey();
                        break;
                    }
                }
            }
        };
        JIntellitype.getInstance().addHotKeyListener(hotkeyListener);
    }

    public static void main(String[] args) {
        opacity = new Opacity();
        GlobalKeyListener l = new GlobalKeyListener();//不需要键盘监听可以将这里注释掉
        MouseHook.main(args);//不需要鼠标监听可以将这里注释掉
    }
}