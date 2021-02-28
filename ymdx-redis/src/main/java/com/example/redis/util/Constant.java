package com.example.redis.util;

public class Constant {

    //报文的开头
    public static final String CPMP_HEAD_HEX = "63200301";
    //心跳的消息类型 DP PD
    public static final String HEART_BEAT_MSG_TYPE = "00";
    //开始充电桩的命令   PD
    public static final String START_CHARGE_CMD_MSG_TYPE = "11";
    //召唤所有充电机当前工作状态   PD
    public static final String CHARGER_STATE_REQ_MSG_TYPE = "21";
    //遥测数据召唤   PD
    public static final String TELEMETRY_REQ_MSG_TYPE = "31";
    //Bms数据召唤   PD
    public static final String BMS_REQ_MSG_TYPE = "35";
    //BMS数据通知.响应   PD
    public static final String BMS_NOTIFY_REQ_COMMANS_MSG_TYPE = "B6";
    //遥测数据通知.响应 PD
    public static final String TELEMETRY_NOTIFY_REQ_MSG_TYPE = "B2";
    //平台侧停止充电指令   PD
    public static final String STOP_CHARGE_CMD_REQ_MSG_TYPE = "13";
    //指定编号订单召唤（0x43）  PD
    public static final String SPECIFIC_BILL_REQ_MSG_TYPE = "43";
    //未被确认所有订单召唤（0x41）   PD
    public static final String BILLS_NOT_CONFIRMED_REQ_MSG_TYPE = "41";
    //订单上传.响应   PD
    public static final String BILL_UPLOAD_ANS_MSG_TYPE = "96";
    //平台侧启动充电应答  PD
    public static final String START_CHARGE_ANS_MSG_TYPE = "90";
    // 平台召唤电表数据.响应   FB
    public static final String METER_CALL_ANS_MSG_TYPE = "FB";


    // 订单消息的topic
    public static final String KAFKA_CPMP_BILL_INFO_TOPIC = "CPMP_BILL_INFO";
    // 桩的启动充电指令的回应的topic
    public static final String KAFKA_START_CHARGER_ANS_TOPIC = "CPMP_START_CHARGER_ANS";
    // 桩的停止充电指令的回应的topic
    public static final String KAFKA_STOP_CHARGER_ANS_TOPIC = "CPMP_STOP_CHARGER_ANS";
    // 桩的BMS数据通知的回应的topic  BmsNotifyReq
    public static final String KAFKA_BMS_NOTIFY_REQ_TOPIC = "CPMP_BMS_NOTIFY_REQ";

    //redis 中充电桩的前缀
    public static final String REDIS_CPMP_PRE = "CPMP";
    //redis桩的状态
    public static final String CHARGER_STATE_REDIS_PRE = "CHARGER_STATE";
    //所有已经上线的充电桩 redis
    public static final String ALL_CHARGER_PRE = "ALL_CHARGER";
    // 桩的遥测数据通知的回应 redis TelemetryNotifyReq
    public static final String REDIS_TELEMETRY_NOTIFY_REQ = "TELEMETRY_NOTIFY_REQ";
    // 桩的BMS数据通知的回应的redis key  BmsNotifyReq
    public static final String REDIS_BMS_NOTIFY_REQ = "BMS_NOTIFY_REQ";
    //订单召唤之后   redis的订单相关信息
    public static final String REDIS_BILL_PRE = "BILL_INFO";
    // 桩的启动充电指令的回应的  redis
    public static final String REDIS_START_CHARGER_ANS = "START_CHARGER_ANS";
    // 桩的停止充电指令的回应的topic
    public static final String REDIS_STOP_CHARGER_ANS = "STOP_CHARGER_ANS";

}
