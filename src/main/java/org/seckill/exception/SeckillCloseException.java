package org.seckill.exception;

/**
 * 秒杀关闭异常
 * 
 * @author yun
 */
public class SeckillCloseException extends SeckillException {

	public SeckillCloseException(String message) {
		super(message);
	}

	public SeckillCloseException(String message, Throwable cause) {
		super(message, cause);
	}

}
