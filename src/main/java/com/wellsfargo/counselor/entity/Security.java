package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "securities")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id")
    private Long id;

    @Column(name = "ticker_symbol", nullable = false, unique = true, length = 10)
    private String tickerSymbol;

    @Column(name = "security_name", nullable = false, length = 100)
    private String securityName;

    @Column(name = "asset_type", length = 30)
    private String assetType;

    @Column(name = "current_price", nullable = false, precision = 12, scale = 2)
    private BigDecimal currentPrice;

    public Security() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTickerSymbol() { return tickerSymbol; }
    public void setTickerSymbol(String tickerSymbol) { this.tickerSymbol = tickerSymbol; }
    public String getSecurityName() { return securityName; }
    public void setSecurityName(String securityName) { this.securityName = securityName; }
    public String getAssetType() { return assetType; }
    public void setAssetType(String assetType) { this.assetType = assetType; }
    public BigDecimal getCurrentPrice() { return currentPrice; }
    public void setCurrentPrice(BigDecimal currentPrice) { this.currentPrice = currentPrice; }
}




