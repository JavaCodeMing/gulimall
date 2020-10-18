package com.atguigu.common.exception;

/**
 * 错误码和错误信息定义类
 * 1. 错误码定义规则为5为数字
 * 2. 前两位表示业务场景，最后三位表示错误码。例如：100001。10:通用 001:系统未知异常
 * 3. 维护错误码后需要维护错误描述，将他们定义为枚举形式
 * 错误码列表：
 *  10: 通用
 *      001：参数格式校验
 *  11: 商品
 *  12: 订单
 *  13: 购物车
 *  14: 物流
 *
 * @author dengzhiming
 * @date 2020/10/11 21:05
 */
public enum BizCodeEnume {
    /*参数交易异常*/
    VAILD_EXCEPTION(10001,"参数格式校验失败"),
    /*未知参数异常*/
    UNKNOW_EXCEPTION(10000,"系统未知异常");

    /** 响应码 */
    private int code;
    /** 响应消息 */
    private String message;

    BizCodeEnume(int code,String msg){
        this.code = code;
        this.message = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
