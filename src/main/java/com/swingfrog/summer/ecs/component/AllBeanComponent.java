package com.swingfrog.summer.ecs.component;

import com.swingfrog.summer.ecs.entity.Entity;

import java.util.List;

public interface AllBeanComponent <K, B, E extends Entity<K>> extends Component<K, E> {

    List<B> listBean();
    void addBean(B bean);
    void removeBean(B bean);
    void removeBeanId(K beanId);
    void removeAllBean();
    void saveBean(B bean);

}
