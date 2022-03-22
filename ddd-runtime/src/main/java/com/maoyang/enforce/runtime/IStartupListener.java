/*
 *
 *
 * @author maoyang
 */
package com.maoyang.enforce.runtime;

/**
 * 系统启动监听器.
 */
public interface IStartupListener {

    /**
     * 启动时执行.
     * <p>
     * <p>触发时机：Spring加载完毕后</p>
     */
    void onStartComplete();
}
