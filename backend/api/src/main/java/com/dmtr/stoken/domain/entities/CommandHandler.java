package com.dmtr.stoken.domain.entities;

public interface CommandHandler<C extends Command, R> {
    R handle(C command);
}
