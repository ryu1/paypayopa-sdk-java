package jp.ne.paypay.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * QRCode
 */

public class QRCode {

  @SerializedName("merchantPaymentId")
  private String merchantPaymentId = null;
  
  @SerializedName("amount")
  private MoneyAmount amount = null;
  
  @SerializedName("orderDescription")
  private String orderDescription = null;
  
  @SerializedName("orderItems")
  private List<MerchantOrderItem> orderItems = null;
  
  @SerializedName("metadata")
  private Object metadata = null;
  
  @SerializedName("codeType")
  private String codeType = null;
  
  @SerializedName("storeInfo")
  private String storeInfo = null;
  
  @SerializedName("storeId")
  private String storeId = null;
  
  @SerializedName("terminalId")
  private String terminalId = null;
  
  @SerializedName("requestedAt")
  private Long requestedAt = Instant.now().getEpochSecond();
  
  @SerializedName("isAuthorization")
  private Boolean isAuthorization = null;
  
  @SerializedName("authorizationExpiry")
  private Long authorizationExpiry = null;
  
  @SerializedName("redirectUrl")
  private String redirectUrl = null;
  
  /**
   * The type of redirect url
   */
  @JsonAdapter(RedirectTypeEnum.Adapter.class)
  public enum RedirectTypeEnum {
    
    WEB_LINK("WEB_LINK"),
    APP_DEEP_LINK("APP_DEEP_LINK");

    private String value;

    RedirectTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static RedirectTypeEnum fromValue(String text) {
      for (RedirectTypeEnum b : RedirectTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<RedirectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RedirectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RedirectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RedirectTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("redirectType")
  private RedirectTypeEnum redirectType = null;
  
  @SerializedName("userAgent")
  private String userAgent = null;
  
  public QRCode merchantPaymentId(String merchantPaymentId) {
    this.merchantPaymentId = merchantPaymentId;
    return this;
  }

  
  /**
  * Get merchantPaymentId
  * @return merchantPaymentId
  **/
  @ApiModelProperty(value = "")
  public String getMerchantPaymentId() {
    return merchantPaymentId;
  }
  public void setMerchantPaymentId(String merchantPaymentId) {
    this.merchantPaymentId = merchantPaymentId;
  }
  
  public QRCode amount(MoneyAmount amount) {
    this.amount = amount;
    return this;
  }

  
  /**
  * Get amount
  * @return amount
  **/
  @ApiModelProperty(value = "")
  public MoneyAmount getAmount() {
    return amount;
  }
  public void setAmount(MoneyAmount amount) {
    this.amount = amount;
  }
  
  public QRCode orderDescription(String orderDescription) {
    this.orderDescription = orderDescription;
    return this;
  }

  
  /**
  * Description of the order
  * @return orderDescription
  **/
  @ApiModelProperty(value = "Description of the order")
  public String getOrderDescription() {
    return orderDescription;
  }
  public void setOrderDescription(String orderDescription) {
    this.orderDescription = orderDescription;
  }
  
  public QRCode orderItems(List<MerchantOrderItem> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public QRCode addOrderItemsItem(MerchantOrderItem orderItemsItem) {
    
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<MerchantOrderItem>();
    }
    
    this.orderItems.add(orderItemsItem);
    return this;
  }
  
  /**
  * Get orderItems
  * @return orderItems
  **/
  @ApiModelProperty(value = "")
  public List<MerchantOrderItem> getOrderItems() {
    return orderItems;
  }
  public void setOrderItems(List<MerchantOrderItem> orderItems) {
    this.orderItems = orderItems;
  }
  
  public QRCode metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  /**
  * Extra information the merchant want to add
  * @return metadata
  **/
  @ApiModelProperty(value = "Extra information the merchant want to add")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }
  
  public QRCode codeType(String codeType) {
    this.codeType = codeType;
    return this;
  }

  
  /**
  * Please pass the fixed string ORDER_QR
  * @return codeType
  **/
  @ApiModelProperty(value = "Please pass the fixed string ORDER_QR")
  public String getCodeType() {
    return codeType;
  }
  public void setCodeType(String codeType) {
    this.codeType = codeType;
  }
  
  public QRCode storeInfo(String storeInfo) {
    this.storeInfo = storeInfo;
    return this;
  }

  
  /**
  * Store info for the merchant
  * @return storeInfo
  **/
  @ApiModelProperty(value = "Store info for the merchant")
  public String getStoreInfo() {
    return storeInfo;
  }
  public void setStoreInfo(String storeInfo) {
    this.storeInfo = storeInfo;
  }
  
  public QRCode storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  
  /**
  * Id to identify store under merchant
  * @return storeId
  **/
  @ApiModelProperty(value = "Id to identify store under merchant")
  public String getStoreId() {
    return storeId;
  }
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }
  
  public QRCode terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

  
  /**
  * Id to identify terminal device under store
  * @return terminalId
  **/
  @ApiModelProperty(value = "Id to identify terminal device under store")
  public String getTerminalId() {
    return terminalId;
  }
  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }
  
  public QRCode requestedAt(Long requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  
  /**
  * Get requestedAt
  * @return requestedAt
  **/
  @ApiModelProperty(value = "")
  public Long getRequestedAt() {
    return requestedAt;
  }
  public void setRequestedAt(Long requestedAt) {
    this.requestedAt = requestedAt;
  }
  
  public QRCode isAuthorization(Boolean isAuthorization) {
    this.isAuthorization = isAuthorization;
    return this;
  }

  
  /**
  * By default it will be false, please set true if the amount will be captured later
  * @return isAuthorization
  **/
  @ApiModelProperty(value = "By default it will be false, please set true if the amount will be captured later")
  public Boolean isIsAuthorization() {
    return isAuthorization;
  }
  public void setIsAuthorization(Boolean isAuthorization) {
    this.isAuthorization = isAuthorization;
  }
  
  public QRCode authorizationExpiry(Long authorizationExpiry) {
    this.authorizationExpiry = authorizationExpiry;
    return this;
  }

  
  /**
  * Epoch timestamp in seconds, expiry duration must be less then the expiry granted to the merchant
  * @return authorizationExpiry
  **/
  @ApiModelProperty(value = "Epoch timestamp in seconds, expiry duration must be less then the expiry granted to the merchant")
  public Long getAuthorizationExpiry() {
    return authorizationExpiry;
  }
  public void setAuthorizationExpiry(Long authorizationExpiry) {
    this.authorizationExpiry = authorizationExpiry;
  }
  
  public QRCode redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  
  /**
  * The url of the page/app to open after the payment is complete
  * @return redirectUrl
  **/
  @ApiModelProperty(value = "The url of the page/app to open after the payment is complete")
  public String getRedirectUrl() {
    return redirectUrl;
  }
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }
  
  public QRCode redirectType(RedirectTypeEnum redirectType) {
    this.redirectType = redirectType;
    return this;
  }

  
  /**
  * The type of redirect url
  * @return redirectType
  **/
  @ApiModelProperty(value = "The type of redirect url")
  public RedirectTypeEnum getRedirectType() {
    return redirectType;
  }
  public void setRedirectType(RedirectTypeEnum redirectType) {
    this.redirectType = redirectType;
  }
  
  public QRCode userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  
  /**
  * The User agent of the web browser. When this parameter is provided, on mobile devices PayPay tries to open the browser that the merchant website is using. This can be found by using the javascript function navigator.userAgent
  * @return userAgent
  **/
  @ApiModelProperty(value = "The User agent of the web browser. When this parameter is provided, on mobile devices PayPay tries to open the browser that the merchant website is using. This can be found by using the javascript function navigator.userAgent")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QRCode qrCode = (QRCode) o;
    return Objects.equals(this.merchantPaymentId, qrCode.merchantPaymentId) &&
        Objects.equals(this.amount, qrCode.amount) &&
        Objects.equals(this.orderDescription, qrCode.orderDescription) &&
        Objects.equals(this.orderItems, qrCode.orderItems) &&
        Objects.equals(this.metadata, qrCode.metadata) &&
        Objects.equals(this.codeType, qrCode.codeType) &&
        Objects.equals(this.storeInfo, qrCode.storeInfo) &&
        Objects.equals(this.storeId, qrCode.storeId) &&
        Objects.equals(this.terminalId, qrCode.terminalId) &&
        Objects.equals(this.requestedAt, qrCode.requestedAt) &&
        Objects.equals(this.isAuthorization, qrCode.isAuthorization) &&
        Objects.equals(this.authorizationExpiry, qrCode.authorizationExpiry) &&
        Objects.equals(this.redirectUrl, qrCode.redirectUrl) &&
        Objects.equals(this.redirectType, qrCode.redirectType) &&
        Objects.equals(this.userAgent, qrCode.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantPaymentId, amount, orderDescription, orderItems, metadata, codeType, storeInfo, storeId, terminalId, requestedAt, isAuthorization, authorizationExpiry, redirectUrl, redirectType, userAgent);
  }

  @Override
  public String toString() {
    return "QRCode{" + "merchantPaymentId='" + merchantPaymentId + '\'' + ", amount=" + amount + ", orderDescription='"
            + orderDescription + '\'' + ", orderItems=" + orderItems + ", metadata=" + metadata + ", codeType='"
            + codeType + '\'' + ", storeInfo='" + storeInfo + '\'' + ", storeId='" + storeId + '\'' + ", terminalId='"
            + terminalId + '\'' + ", requestedAt=" + requestedAt + ", isAuthorization=" + isAuthorization
            + ", authorizationExpiry=" + authorizationExpiry + ", redirectUrl='" + redirectUrl + '\''
            + ", redirectType=" + redirectType + ", userAgent='" + userAgent + '\'' + '}';
  }
  
}



