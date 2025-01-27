package com.dmtr.stoken.features.asset.controllers;

import com.dmtr.stoken.features.asset.commands.CreateAssetCommand;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/asset")
public class AssetCommandController {

    @PostMapping("/create")
    private ResponseEntity<?> createAsset(CreateAssetCommand createAssetCommand) {
        return ResponseEntity.ok().build();
    }
}
