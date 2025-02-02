package com.dmtr.stoken.application.asset.handlers;

import com.dmtr.stoken.application.abstractions.cqrs.CommandHandler;
import com.dmtr.stoken.application.asset.commands.CreateAssetCommand;

public class CreateAssetHandler implements CommandHandler<CreateAssetCommand, String> {
    
    @Override
    public String handle(CreateAssetCommand command) {
        return null;
    }
}
