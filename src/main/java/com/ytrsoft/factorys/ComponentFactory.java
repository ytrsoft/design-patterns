package com.ytrsoft.factorys;

import com.ytrsoft.basic.Component;

public interface ComponentFactory {
    Component getComponent(String name);
}
