package com.test.decorator;


import cn.hutool.core.date.DateUtil;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description: 自定义的inputStream装饰器
 * @author:Xueyu
 * @date: 2022/7/4
 * @copyRight:
 */

public class InputStreamDecorator extends FilterInputStream {

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected InputStreamDecorator(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        System.out.println("调用时间 " + DateUtil.now());
        int read = 0;
        read = in.read();
        System.out.println("结束时间 " + DateUtil.now());
        return read;
    }
}
