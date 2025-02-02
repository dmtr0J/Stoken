package com.dmtr.stoken.application.abstractions.cqrs;

public interface QueryHandler<Q extends Query, R> {
    R handle(Q query);
}
