package com.xueduoduo.xddcyapp.result;

/**
 * Author: D.Yang
 * Email: koyangslash@gmail.com
 * Date: 16/8/31
 * Time: 下午5:50
 * Describe: 封装Json返回信息
 */
public class JsonResult {
    private boolean success;
    private String resultCode;
    private String status;
    private String msg;
    private Object obj;
    private long time;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
    
}
