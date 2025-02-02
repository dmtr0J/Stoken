package com.dmtr.stoken.application.asset.commands;

import com.dmtr.stoken.domain.entities.AssetStatus;
import com.dmtr.stoken.domain.entities.AssetType;
import com.dmtr.stoken.application.abstractions.cqrs.Command;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class CreateAssetCommand implements Command {

    @NotBlank(message = "Asset name cannot be blank")
    @Size(max = 100, message = "Asset name cannot exceed 100 characters")
    private String name;

    @Size(max = 500, message = "Description cannot exceed 500 characters")
    private String description;

    @NotNull(message = "Owner id is required")
    private String ownerId;

    @NotNull(message = "Valuation is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Valuation must be greater than zero")
    @Digits(integer = 15, fraction = 2, message = "Valuation must have up to 15 digits and 2 decimal places")
    private BigDecimal valuation;

    @NotNull(message = "Asset status is required")
    private AssetStatus status;

    @NotNull(message = "Asset type is required")
    private AssetType type;
}
