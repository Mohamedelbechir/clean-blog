package com.clean.architecture.bechir.blog.core.useCase;

public interface UseCaseInteractor<P, R> {

    public R execute(P params);

}
