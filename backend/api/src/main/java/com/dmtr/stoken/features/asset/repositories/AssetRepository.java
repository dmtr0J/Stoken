package com.dmtr.stoken.features.asset.repositories;

import com.dmtr.stoken.domain.aggregates.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssetRepository extends JpaRepository<Asset, UUID> {
}
