package com.test.composite;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/6/30
 * @copyRight:
 */
public class File extends Component {
    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.getName());
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
