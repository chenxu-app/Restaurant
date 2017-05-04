package com.cx.mmj.common;

import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategy;

import java.util.concurrent.Callable;

/**
 * Created by cx on 2017/5/4.
 */
public class MDCHystrixConcurrencyStrategy extends HystrixConcurrencyStrategy {

    @Override
    public <T> Callable<T> wrapCallable(Callable<T> callable) {
        return new MDCConcurrentCallable<>(callable);
    }
}
