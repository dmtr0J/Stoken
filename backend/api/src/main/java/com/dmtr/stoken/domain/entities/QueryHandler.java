package com.dmtr.stoken.domain.entities;

public interface QueryHandler<Q extends Query, R> {
    R handle(Q query);
}
