package com.dmtr.stoken.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Asset {

    @Id
    private UUID id;

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

    private boolean isTokenized;

    @PositiveOrZero(message = "Total tokens must be zero or a positive value")
    private long totalTokens;
}
