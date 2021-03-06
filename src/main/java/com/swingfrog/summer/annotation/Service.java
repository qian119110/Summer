package com.swingfrog.summer.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.swingfrog.summer.annotation.base.AutowiredManager;
import com.swingfrog.summer.annotation.base.ComponentManager;
import com.swingfrog.summer.annotation.base.SynchronizedManager;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@ComponentManager
@AutowiredManager
@SynchronizedManager
public @interface Service {

}
