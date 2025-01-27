package com.dmtr.stoken.features.asset.handlers;

import com.dmtr.stoken.domain.entities.Command;
import com.dmtr.stoken.domain.entities.CommandHandler;
import com.dmtr.stoken.features.asset.commands.CreateAssetCommand;

public class CreateAssetHandler implements CommandHandler<CreateAssetCommand, String> {
    
    @Override
    public String handle(CreateAssetCommand command) {
        return null;
    }
}
