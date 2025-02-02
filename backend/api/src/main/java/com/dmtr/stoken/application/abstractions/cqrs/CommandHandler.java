package com.dmtr.stoken.application.abstractions.cqrs;

public interface CommandHandler<C extends Command, R> {
    R handle(C command);
}
