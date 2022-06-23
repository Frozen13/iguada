package life.iGuaDa.community.exception;

/**
 * Created by codedrinker on 2019/5/28.
 * 自定义的错误码
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001, "你找到问题不在了，要不要换个试试？"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何问题或评论进行回复"),
    NO_LOGIN(2003, "当前操作需要登录，请登陆后重试"),
    SYS_ERROR(2004, "服务冒烟了，要不然你稍后再试试！！！"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006, "回复的评论不存在了，要不要换个试试？"),
    CONTENT_IS_EMPTY(2007, "输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008, "兄弟你这是读别人的信息呢？"),
    NOTIFICATION_NOT_FOUND(2009, "消息莫非是不翼而飞了？"),
    FILE_UPLOAD_FAIL(2010, "图片上传失败"),
    INVALID_INPUT(2011, "非法输入"),
    INVALID_OPERATION(2012, "兄弟，是不是走错房间了？"),
    USER_DISABLE(2013, "操作被禁用，如有疑问请联系管理员"),
    RATE_LIMIT(2014, "操作太快了，请稍后重试"),
    ID_OCCUPIED(2015, "ID已被占用，请更换ID注册"),
    USER_NOT_FOUND(2016,"用户不存在"),
    PERMISSION_DENIED(2017,"权限不足"),
    LOGIN_FAIL(2018, "用户名或密码错误，请重试"),

    REPORT_QUESTION_NOT_FOUND(2019,"举报的问题不存在"),
    REASON_IS_EMPTY(2020,"举报原因不能为空")
    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
