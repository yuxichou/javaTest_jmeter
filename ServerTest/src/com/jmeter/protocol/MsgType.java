package com.jmeter.protocol;

/**
 * Created by zhouzhangyin on 16/3/31.
 */
public enum  MsgType {

        LOGIN,
        LINK,
        NOTIFACATION;



    public static  int getIntByMsgtype(MsgType msgType){

        int type=0;

        switch (msgType){


            case LOGIN:

                break;

            case LINK:

                type=4;

                break;

            case NOTIFACATION:

                type=2;

                break;

            default:

        }

        return type;
    }





}
