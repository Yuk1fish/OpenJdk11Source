package com.test.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:Xueyu
 * @date: 2022/6/30
 * @copyRight:
 */
public class Folder extends Component {
    private String name;
    private List<Component> componentList = new ArrayList<Component>();
    private Integer level;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        if (this.level == null) {
            this.level = 1;
        }
        String prefix = "";
        for (int i = 0; i < this.level; i++) {
            prefix += "\t- ";
        }
        for (Component component : this.componentList) {
            if (component instanceof Folder){
                ((Folder)component).level = this.level + 1;
            }
            System.out.print(prefix);
            component.print();
        }
        this.level = null;
    }
}
